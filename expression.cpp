#include<iostream>
#include<cstdio>
#include<cstdlib>
#include<stack>
#include<cmath>
#include<fstream>
#include<cstring>
using namespace std;
char *m,n[100];
int Isnum(char c)
{
    if(c>='0'&&c<='9')
        return 1;
    else
        return 0;
}
char procede(char theta1,char theta2)//�Ƚ��ַ������ȼ�
{
    int row,col;
    static char ch[8]="+-*/()#",R[7][8]={{">><<<>>"},{">><<<>>"},{">>>><>>"},{">>>><>>"},{"<<<<<=/"},{">>>>/>>"},{"<<<<</="}};
    for(int i=0;i<7;i++)
        if(ch[i]==theta1)
        {
            row=i;
            break;
        }
    for(int i=0;i<7;i++)
        if(ch[i]==theta2)
        {
            col=i;
            break;
        }
    if(row<7&&col<7)
        return R[row][col];
    else
        return '/';
}
void infix_exp_value(char*infixexp,char*postfixexp)//��׺���ʽת���ɺ�׺���ʽ
{
    stack<char> s;
    char w,topelement;
    int i=0,j=0;
    s.push('#');
    w=infixexp[i];
    while(!s.empty())
    {
        if(Isnum(w))
        {
            postfixexp[j++]=w;
            w=infixexp[++i];
            if(!Isnum(w))
                postfixexp[j++]=' ';//����֮���ǽ�ÿ�������ַ������ÿո������
        }
        else
        {
            topelement=s.top();
            switch(procede(topelement,w))
            {
                case '>':s.pop();
                         postfixexp[j++]=topelement;
                         break;
                case '=':s.pop();
                         w=infixexp[++i];
                         break;
                case '<':s.push(w);
                         w=infixexp[++i];
                         break;
                default:cout<<"��׺���ʽ�Ƿ�"<<endl;
            }

        }
    }
    postfixexp[j]='#';
    //cout<<postfixexp<<endl;
}
double postfix_exp(char *A)//�����׺���ʽ
{
    stack<double> s;
    stack<double> k;//����ת����λ��
    double result,a,b,c;
    char ch;
    int i=0;
    ch=A[i++];
    while(ch!='#')
    {
        if(Isnum(ch))//����λ����ջ
            k.push(ch-'0');
        else if(ch==' ')//���ַ���λ��ת��������
        {
            double q=0,sum=0;
                while(!k.empty())
                {
                    double x=k.top();
                    sum+=x*pow(10,q);
                    q++;
                    k.pop();
                }
                s.push(sum);
        }
        else
        {
            b=s.top();
            s.pop();
            a=s.top();
            s.pop();
            switch(ch)
            {
                case '+':c=a+b;break;
                case '-':c=a-b;break;
                case '*':c=a*b;break;
                case '/':c=a/b;break;
                case '%':c=(double)((int)a%(int)b);break;
            }
            s.push(c);
        }
        ch=A[i++];
    }
    result=s.top();
    s.pop();
    return result;
}
void init()
{
    string text;
    ifstream fin("E://word.txt");
    if(!fin)
    {
        cout<<"����\n";
        return;
    }

    while(fin>>text);
    char *pStr = NULL;
    pStr = (char*)malloc(text.length() + 1);
    strcpy(pStr,text.c_str());
    //cout<<pStr<<endl;
    m=pStr;
//    char ch;
//    int i=0;
//    ch=getchar();
//    while(ch!='=')
//    {
//        m[i++]=ch;
//        ch=getchar();
//    }
    m[text.length()-1]='#';
}
int main()
{

    init();
    infix_exp_value(m,n);
    double result=postfix_exp(n);
    cout<<result<<endl;
    return 0;
}
