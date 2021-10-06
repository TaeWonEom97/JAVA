package layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import container.FrameTest4;

public class BorderLayoutTest1 extends JFrame{
	public BorderLayoutTest1() {
		setTitle("BorderLayout 테스트");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		JButton btn1 = new JButton("버튼1");
		add(btn1,BorderLayout.EAST);
		JButton btn2 = new JButton("버튼2");
		add(btn2,BorderLayout.WEST);
		JButton btn3 = new JButton("버튼3");
		add(btn3,BorderLayout.SOUTH);
		JButton btn4 = new JButton("버튼4");
		add(btn4,BorderLayout.NORTH);
		JButton btn5 = new JButton("버튼5");
		add(btn5,BorderLayout.CENTER);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		BorderLayoutTest1 f = new BorderLayoutTest1();
			
	}

}
