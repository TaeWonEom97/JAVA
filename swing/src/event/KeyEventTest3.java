package event;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyEventTest3 extends JFrame {

	private JLabel lbl= new JLabel("Hello");
	
	public KeyEventTest3() {
		setTitle("텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(null);
		
		lbl.setLocation(50,50);
		lbl.addKeyListener(new MyKeyAdapter());
		lbl.setSize(100,20);
		add(lbl);
		
		Container contentPane = getContentPane();
		contentPane.addKeyListener(new MyKeyAdapter());
		contentPane.setFocusable(true);
		contentPane.requestFocus();
		
		setSize(200, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new KeyEventTest3();
	}
	
	class MyKeyAdapter extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			
			switch (keyCode) {
			case KeyEvent.VK_UP: {
				lbl.setLocation(lbl.getX(),lbl.getY()-10);
				break;
			}
			case KeyEvent.VK_DOWN: {
				lbl.setLocation(lbl.getX(),lbl.getY()+10);
				break;
			}
			case KeyEvent.VK_LEFT: {
				lbl.setLocation(lbl.getX()-10,lbl.getY());
				break;
			}
			case KeyEvent.VK_RIGHT: {
				lbl.setLocation(lbl.getX()+10,lbl.getY());
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + keyCode);
			}
		}
	}

}
