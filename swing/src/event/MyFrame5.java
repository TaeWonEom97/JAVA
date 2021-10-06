package event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame5 extends JFrame implements ActionListener  {

	private Container container;
	private JTextField jtf1, jtf2, jtf3;
	

	public MyFrame5() {
		setTitle("덧셈계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel top = new JPanel();
		
		
		jtf1 = new JTextField(10);
		top.add(jtf1);

		JLabel jbl1 = new JLabel("+");
		top.add(jbl1);

		jtf2 = new JTextField(10);
		top.add(jtf2);

		JLabel jbl2 = new JLabel("=");
		top.add(jbl2);

		jtf3 = new JTextField(10);
		top.add(jtf3);
		
		add(top,BorderLayout.NORTH);
		
		JPanel bottom=new JPanel();
		add(bottom,BorderLayout.CENTER);

		JButton btn1 = new JButton("확인");
		btn1.addActionListener(this);
		bottom.add(btn1);

		JButton btn2 = new JButton("취소");
		btn2.addActionListener(this);
		bottom.add(btn2);

		setBounds(200, 100, 400, 200);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e){
		String cmd = e.getActionCommand();
		try {
			if (cmd.equals("확인")) {
				
				int a=Integer.parseInt(jtf1.getText());
				int b=Integer.parseInt(jtf2.getText());
				int total=a+b;
				jtf3.setText(total+"");
			} else {
				jtf1.setText(null);
				jtf2.setText(null);
				jtf3.setText(null);
			}
		} catch (Exception e2) {
			System.out.println("다시 입력하세요");
		}
		
	}

	public static void main(String[] args) {
		new MyFrame5();
	}

}
