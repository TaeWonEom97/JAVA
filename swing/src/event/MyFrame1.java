package event;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame1 extends JFrame {
	public MyFrame1() {
		setTitle("�׼��̺�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn1 = new JButton("click");
		btn1.addActionListener(new MyListener1());
		add(btn1);
		
		JLabel lb1 = new JLabel("��ư�� ��������");
		add(lb1);
		
		
		setLayout(new FlowLayout());
		setBounds(100, 100, 300, 200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new MyFrame1();
	}
}
