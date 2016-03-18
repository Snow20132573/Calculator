import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class exp extends JFrame{
	private static final int Width=500;
	private static final int Height=500;
	
	private static JTextArea InputArea=new JTextArea();
	private static JTextArea OutputArea=new JTextArea();
	private static JButton zero=new JButton("0");
	private static JButton one = new JButton("1");
	private static JButton two = new JButton("2");
	private static JButton three = new JButton("3");
	private static JButton four = new JButton("4");
	private static JButton five = new JButton("5");
	private static JButton six = new JButton("6");
	private static JButton seven = new JButton("7");
	private static JButton eight = new JButton("8");
	private static JButton nine = new JButton("9");
	
	private static JButton add = new JButton("+");
	private static JButton subtract = new JButton("-");
	private static JButton multiply = new JButton("×");
	private static JButton divide = new JButton("÷");
	private static JButton equal = new JButton("=");
	private static JButton kh1 = new JButton("(");
	private static JButton kh2 = new JButton(")");
	//private static JButton percent = new JButton("%");
	private static JButton prety=new JButton("亲认真输入合法的语句哦！");
	
	private static boolean Isresult=false;//开始不是结果
	
	private char m[],n[];
	public exp(){
		/*构建界面*/
		setSize(Width,Height);
		setResizable(false);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("表达式");
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension screenDimension=tk.getScreenSize();
		int x=(int)((screenDimension.getWidth()-Width)/2);
		int y=(int)((screenDimension.getHeight()-Height)/2);
		Point local=new Point(x,y);
		setLocation(local);

		InputArea.setBounds(0,0,500,50);
		InputArea.setBorder(new EtchedBorder(EtchedBorder.RAISED));
		InputArea.setEditable(false);
		add(InputArea);
		
		zero.setBounds(0,55, 100, 100);
		add(zero);
		
		one.setBounds(100,55, 100, 100);
		add(one);
		
		two.setBounds(200,55, 100, 100);
		add(two);
		
		three.setBounds(300,55, 100, 100);
		add(three);
		
		four.setBounds(400,55, 100, 100);
		add(four);
		
		five.setBounds(0,155, 100, 100);
		add(five);
		
		six.setBounds(100,155, 100, 100);
		add(six);
		
		seven.setBounds(200,155, 100, 100);
		add(seven);
		
		eight.setBounds(300,155, 100, 100);
		add(eight);
		
		nine.setBounds(400,155, 100, 100);
		add(nine);
		
		add.setBounds(0, 255, 100, 100);
		add(add);
		
		subtract.setBounds(0, 355, 100, 100);
		add(subtract);
		
		multiply.setBounds(100, 255, 100, 100);
		add(multiply);
		
		equal.setBounds(200, 255, 100, 100);
		add(equal);
		
		kh1.setBounds(300, 255, 100, 100);
		add(kh1);
		
		kh2.setBounds(400, 255, 100, 100);
		add(kh2);
		
		//percent.setBounds(100, 355, 100, 100);
		//add(percent);
		
		divide.setBounds(100, 355, 100, 100);
		add(divide);
		
		prety.setBounds(200, 355, 300,100);
		add(prety);
		
		/*开始事件*/
		zero.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(Isresult){
					InputArea.setText("0");
					Isresult=false;
				}	
				else{
					InputArea.setText(InputArea.getText()+"0");
				}
			}
		});
		
		one.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(Isresult){
					InputArea.setText("1");
					Isresult=false;
				}
				else
					InputArea.setText(InputArea.getText()+"1");	
			}
		});
		
		
		two.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(Isresult){
					InputArea.setText("2");
					Isresult=false;
				}
				else
					InputArea.setText(InputArea.getText()+"2" +
							"");	
			}
		});
		
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Isresult) {
					InputArea.setText("3");
					Isresult = false;
				}else {
					InputArea.setText(InputArea.getText() + "3");
				}
			}
		});
		
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Isresult) {
					InputArea.setText("4");
					Isresult = false;
				}else {
					InputArea.setText(InputArea.getText() + "4");
				}
			}
		});
		
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Isresult) {
					InputArea.setText("5");
					Isresult = false;
				}else {
					InputArea.setText(InputArea.getText() + "5");
				}
			}
		});
		
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Isresult) {
					InputArea.setText("6");
					Isresult = false;
				}else {
					InputArea.setText(InputArea.getText() + "6");
				}
			}
		});
		
		seven.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Isresult) {
					InputArea.setText("7");
					Isresult = false;
				}else {
					InputArea.setText(InputArea.getText() + "7");
				}
			}
		});
		
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if( Isresult) {
					InputArea.setText("8");
					Isresult = false;
				}else {
					InputArea.setText(InputArea.getText() + "8");
				}
			}
		});
		
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Isresult) {
					InputArea.setText("9");
					Isresult = false;
				}else {
					InputArea.setText(InputArea.getText() + "9");
				}
			}
		});
		/*
		percent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//%的功能就是取余
				InputArea.setText(InputArea.getText() + "%");
			}
		});
		*/
		
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InputArea.setText(InputArea.getText()+"+");
			}
		});
		
		subtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InputArea.setText(InputArea.getText()+"-");
			}
		});
		
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InputArea.setText(InputArea.getText()+"*");
			}
		});
		
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InputArea.setText(InputArea.getText()+"/");
			}
		});
		
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					InputArea.setText(InputArea.getText()+"=");
					Isresult = true;
					String s=InputArea.getText();
					System.out.println(s);
					File f=new File("E://word.txt");//写入信息的文件
					
					try{
						if(!f.exists()){
							f.createNewFile();
						}
						FileWriter fw=new FileWriter(f);
						fw.write(s, 0, s.length());
						fw.close();
					}catch(Exception m){
						m.printStackTrace();
					}
					
					try {
						File file = new File("F:/新建文件夹/数据结构/20132573王雪数据结构大实验/实验/expression/Libs/expresion.exe");
						Process p = Runtime.getRuntime().exec(file.getAbsolutePath(), null, new File(file.getAbsolutePath().replace(file.getName(), "")));
						BufferedReader bf = new BufferedReader(new InputStreamReader(p.getInputStream()));
						String str = "";
						String temp = "";
						int index = 0;
						while((str = bf.readLine()) != null) {
							System.out.println(str);
							index++;
							if(str != null) {
								temp = str;
							}
						}
						System.out.println(temp);
						InputArea.setText(temp);
						bf.close();
					}catch(Exception e1) {
						e1.printStackTrace();
					}
					
				}
		});
		
		kh1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					InputArea.setText(InputArea.getText()+"(");
					Isresult = false;
				}
		});
		
		
		kh2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					InputArea.setText(InputArea.getText()+")");
					Isresult = false;
				}
		});
		
		
		setVisible(true);
		
	}
//	public static char procede(char theta1,char theta2){
////		int i,row = -1,col;
//		int i = 0;
//		int row = -1;
//		int col = -1;
//		String ch="+-*/()#";
//		//R[][]={{">><<<>>"},{">><<<>>"},{">>>><>>"},{">>>><>>"},{"<<<<<=/"},{">>>>/>>"},{"<<<<</="}};
//		char c[]=ch.toCharArray();
//		//char d[][]=R.toCharArray();
//		char[][] R;
//		R=new char[7][];
//		for(i=0;i<7;i++){
//			if(i==0)	ch=">><<<>>";
//			else if(i==1) ch=">><<<>>";
//			else if(i==2)	ch=">>>><>>";
//			else if(i==3)	ch=">>>><>>";
//			else if(i==4)	ch="<<<<<=/";
//			else if(i==5)	ch=">>>>/>>";
//			else 	ch="<<<<</=";
//			R[i]=ch.toCharArray();
//		}
//		
//		for(i=0;i<7;i++){
//			for(int j=0;j<7;j++){
//				System.out.println(R[i][j]);
//			}
//		}
//		for(i=0;i<7;i++)
//			if(c[i]==theta1){
//				row=i;
//				break;
//			}
//		for(i=0;i<7;i++)
//			if(c[i]==theta2){
//				col=i;
//				break;
//			}
//		if(row<7&&col<7)
//			return R[row][col];
//		else 
//			return '/';
//	}
//	
//	public static int Isnum(char c){
//		if(c>='0'&&c<='9')
//			return 1;
//		else
//			return 0;
//	}
//	
//	public void infix_exp_value(char[] infixexp,char[] postfixexp ){
//		Stack<String> s;
//	}
//	public static void function(){
//		String s=InputArea.getText();
//		System.out.println(s);
//		File f=new File("E://word.txt");//写入信息的文件
//		
//		try{
//			if(!f.exists()){
//				f.createNewFile();
//			}
//			FileWriter fw=new FileWriter(f);
//			fw.write(s, 0, s.length());
//			fw.close();
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//	}
	
	public static void main(String[]args){
		do{
			new exp();
//			 String cmd = exeFileName + " " + para ;
//			  //System.out.println("cmd:"+cmd);
//			  //执行exe文件
//			   final Process proc = Runtime.getRuntime().exec(cmd);
//			   //读取exe文件在exe控制台的输出结果
//			   BufferedReader stdout = new BufferedReader(new InputStreamReader(proc.getInputStream()));
//			   String l;
//			   l = stdout.readLine();//读取一行
		}while(Isresult);
			
		
	}
	
}
