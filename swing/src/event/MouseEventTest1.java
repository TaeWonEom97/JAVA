package event;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MouseEventTest1 extends JFrame implements MouseListener,MouseMotionListener{
	private JTextField textfield;
	
	public MouseEventTest1() {
		setTitle("마우스 이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("클릭");
		btn.addMouseListener(this);
		btn.addMouseMotionListener(this);
		add(btn,BorderLayout.NORTH);
		
		JTextArea textarea = new JTextArea();
		textarea.addMouseListener(this);
		textarea.addMouseMotionListener(this);
		add(textarea,BorderLayout.CENTER);
		
		textfield = new JTextField();
		textfield.addMouseListener(this);
		textfield.addMouseMotionListener(this);
		add(textfield,BorderLayout.SOUTH);
		
		setSize(100,100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseEventTest1();
	}

	@Override
	public void mouseClicked(MouseEvent e) {	
		System.out.println("MouseClicked");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("MousePressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("MouseReleased");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("MouseEntered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("MouseExited");
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("MouseDragged");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("MouseMoved");
	}

}
