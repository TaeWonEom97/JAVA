package layout;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowlayoutTest1 extends JFrame {
	public FlowlayoutTest1() {
		setTitle("FlowLayout 테스트");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container= getContentPane();
		container.setLayout(new FlowLayout());
		
//		JPanel panel = new JPanel();
//		setContentPane(panel);
		
		JButton btn1 = new JButton("버튼1");
		add(btn1);
		JButton btn2 = new JButton("버튼2");
		add(btn2);
		JButton btn3 = new JButton("버튼3");
		add(btn3);
		JButton btn4 = new JButton("버튼4");
		add(btn4);
		JButton btn5 = new JButton("버튼5");
		add(btn5);
		
		setVisible(true);
	}
	public static void main(String[] args) {

	}

}
