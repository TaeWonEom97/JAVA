package container;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameTest3 extends JFrame{
	public FrameTest3() {
		setTitle("MyFrame");
		setSize(300, 300);
		setVisible(true);
		
		JButton btn1 = new JButton("버튼1");
		add(btn1,BorderLayout.EAST);
		JButton btn2 = new JButton("버튼2");
		add(btn2,BorderLayout.SOUTH);
		JButton btn3 = new JButton("버튼3");
		add(btn3,BorderLayout.WEST);
		JButton btn4 = new JButton("버튼4");
		add(btn4,BorderLayout.NORTH);
		JButton btn5 = new JButton("버튼3");
		add(btn5,BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		FrameTest3 f = new FrameTest3();
	}

}
