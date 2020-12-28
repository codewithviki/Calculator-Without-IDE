import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Calculator extends JFrame implements ActionListener{ 
	JTextField t1;
	JLabel l1,l2;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,add,sub,mul,div,eq,dot,reset;
	JRadioButton r1,r2;
	ButtonGroup g;
	double num,ans;
	int cal;
	Calculator(){
		super("Calculator");
		t1=new JTextField();
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		b0=new JButton("0");
		add=new JButton("+");
		sub=new JButton("-");
		mul=new JButton("*");
		div=new JButton("/");
		eq=new JButton("=");
		dot=new JButton(".");
		reset=new JButton("Reset");
		l1=new JLabel("");
		l1.setBackground(Color.red);
		ImageIcon icon=new ImageIcon("Images/tex.jpg");
		l2=new JLabel(icon);
		r1=new JRadioButton("on");
		r2=new JRadioButton("off");
		g=new ButtonGroup();
		
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		b5.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		b6.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		b7.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		b8.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		b9.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		b0.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		dot.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		eq.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		add.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		mul.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		div.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		sub.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		t1.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		
		t1.setForeground(Color.GREEN);
		t1.setBackground(Color.GRAY);
		
		l2.setBounds(0,0,300,430);
		t1.setBounds(40,10,200,40);
		
		l1.setBounds(50,50,200,30);
		r1.setBounds(100,50,40,30);
		r2.setBounds(150,50,40,30);
		
		b1.setBounds(40,80,45,45);
		b2.setBounds(90,80,45,45);
		b3.setBounds(140,80,45,45);
		b4.setBounds(190,80,45,45);
		
		b5.setBounds(40,140,45,45);
		b6.setBounds(90,140,45,45);
		b7.setBounds(140,140,45,45);
		b8.setBounds(190,140,45,45);
		
		b9.setBounds(40,200,45,45);
		b0.setBounds(90,200,45,45);
		dot.setBounds(140,200,45,45);
		add.setBounds(190,200,45,45);
		
		sub.setBounds(40,260,45,45);
		mul.setBounds(90,260,45,45);
		div.setBounds(140,260,45,45);
		eq.setBounds(190,260,45,45);
		
		reset.setBounds(40,320,200,45);
		setLayout(null);
		add(t1);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b0);
		add(dot);
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(eq);
		add(l1);
		add(reset);
		add(r1);
		add(r2);
		//add(g);
		g.add(r1);
		g.add(r2);
		add(l2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		dot.addActionListener(this);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		eq.addActionListener(this);
		reset.addActionListener(this);
		r1.addActionListener(this);
		r2.addActionListener(this);
		
		setVisible(true);
		setResizable(false);
		setSize(300,430);
		setLocation(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
  public void arithmatic_cal(){
      switch(cal){
          case 1://Addition 
              ans=num + Double.parseDouble(t1.getText());
              t1.setText(Double.toString(ans));
              break;
              
          case 2://Subtraction
              ans=num - Double.parseDouble(t1.getText());
              t1.setText(Double.toString(ans));
              break;
          case 3://Multiplication
              ans=num * Double.parseDouble(t1.getText());
              t1.setText(Double.toString(ans));
              break;
          case 4://Division
              
              ans=num / Double.parseDouble(t1.getText());
              t1.setText(Double.toString(ans));
              break;
              
          
      }
    
    }
	public void enable(){
		t1.setEditable(true);
		r1.setEnabled(false);
		r2.setEnabled(true);
		b1.setEnabled(true);
		b2.setEnabled(true);
		b3.setEnabled(true);
		b4.setEnabled(true);
		b5.setEnabled(true);
		b6.setEnabled(true);
		b7.setEnabled(true);
		b8.setEnabled(true);
		b9.setEnabled(true);
		b0.setEnabled(true);
		dot.setEnabled(true);
		add.setEnabled(true);
		sub.setEnabled(true);
		mul.setEnabled(true);
		div.setEnabled(true);
		reset.setEnabled(true);
		eq.setEnabled(true);
	}
	public void disable(){
		t1.setEditable(false);
		r1.setEnabled(true);
		r2.setEnabled(false);
		b1.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		b4.setEnabled(false);
		b5.setEnabled(false);
		b6.setEnabled(false);
		b7.setEnabled(false);
		b8.setEnabled(false);
		b9.setEnabled(false);
		b0.setEnabled(false);
		dot.setEnabled(false);
		add.setEnabled(false);
		sub.setEnabled(false);
		mul.setEnabled(false);
		div.setEnabled(false);
		reset.setEnabled(false);
		eq.setEnabled(false);
	}

public void actionPerformed(ActionEvent e){
	if(e.getSource()==b1){
		t1.setText(t1.getText()+"1");
	}else if(e.getSource()==b2){
		t1.setText(t1.getText()+"2");
	}else if(e.getSource()==b3){
		t1.setText(t1.getText()+"3");
	}else if(e.getSource()==b4){
		t1.setText(t1.getText()+"4");
	}else if(e.getSource()==b5){
		t1.setText(t1.getText()+"5");
	}else if(e.getSource()==b6){
		t1.setText(t1.getText()+"6");
	}else if(e.getSource()==b7){
		t1.setText(t1.getText()+"7");
	}else if(e.getSource()==b8){
		t1.setText(t1.getText()+"8");
	}else if(e.getSource()==b9){
		t1.setText(t1.getText()+"9");
	}else if(e.getSource()==b0){
		t1.setText(t1.getText()+"0");
	}else if(e.getSource()==dot){
		t1.setText(t1.getText()+".");
	}
	else if(e.getSource()==add){
		num= Double.parseDouble(t1.getText());
         cal=1;
        t1.setText("");
        l1.setText(num+"+");
	}else if(e.getSource()==sub){
		num= Double.parseDouble(t1.getText());
         cal=2;
        t1.setText("");
        l1.setText(num+"-");
	}else if(e.getSource()==mul){
		num= Double.parseDouble(t1.getText());
         cal=3;
        t1.setText("");
        l1.setText(num+"*");
	}else if(e.getSource()==div){
		num= Double.parseDouble(t1.getText());
         cal=4;
        t1.setText("");
        l1.setText(num+"/");
	}
	else if(e.getSource()==eq){
		arithmatic_cal();
		l1.setText("");
	}
	else if(e.getSource()==reset){
		t1.setText("");
	}
	else if(e.getSource()==r1){
		enable();
	}
	else if(e.getSource()==r2){
		disable();
	}
	
}
public static void main(String args[]){
	new Calculator();
}
}