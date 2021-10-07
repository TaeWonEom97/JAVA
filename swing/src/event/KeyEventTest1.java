package event;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KeyEventTest1 extends JFrame implements KeyListener {
	private JPanel panel;
	private JTextField textfield;
	private JTextArea textarea;
	
	
	public KeyEventTest1() {
		panel = new JPanel();
		panel.setLayout(new GridLayout());
		
		panel.add(new JLabel("���ڸ� �Է��ϼ���"));
		
		textfield = new JTextField();
		textfield.addKeyListener(this);
		panel.add(textfield);
		
		textarea = new JTextArea(3,30);
		getContentPane().add(panel,BorderLayout.NORTH);
		getContentPane().add(textarea,BorderLayout.SOUTH);
		
		setTitle("Ű �̺�Ʈ");
		setSize(400,200);
		setVisible(true);
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		display(e,"keyTyped");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		display(e,"keyPressed : ");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		display(e,"keyReleased : ");
	}
	
	protected void display(KeyEvent e, String str) {
		char keyChar = e.getKeyChar();//���� ������ Ű ���ڰ�
		int keyCode = e.getKeyCode(); //���� ������ Ű �ڵ尪
		
		String modifiers = "Alt :"+e.isShiftDown()+" Ctrl : "+e.isControlDown()
		+" Shift : "+e.isShiftDown();
		textarea.append(str+" ���� : "+keyChar+" (�ڵ� :"+keyCode+")"+modifiers+"\n");
	}

	public static void main(String[] args) {
		new KeyEventTest1();
	}

}
