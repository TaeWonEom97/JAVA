package component;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RockScissorPaper extends JFrame implements ActionListener {
	private JTextField textfield;
	private JButton btnRock, btnPaper, btnScissor;
	static final int rock=0;
	static final int paper=1;
	static final int scissor=2;
	
	public RockScissorPaper() {
		setTitle("가위바위보 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();

		JLabel label = new JLabel("아래의 버튼 중에서 하나를 클릭하시오.");
		label.setFont(new Font("굴림", Font.BOLD, 18));
		add(label, BorderLayout.NORTH);

		JPanel center = new JPanel();
		center.setLayout(new GridLayout(0,3));
		
		btnRock = new JButton();
		btnRock.setIcon(new ImageIcon(RockScissorPaper.class.getResource("/component/rock.png")));
		btnRock.setActionCommand("rock");
		btnRock.addActionListener(this);
		center.add(btnRock);
		
		btnPaper = new JButton();
		btnPaper.setIcon(new ImageIcon(RockScissorPaper.class.getResource("/component/paper.png")));
		btnPaper.setActionCommand("paper");
		btnPaper.addActionListener(this);
		center.add(btnPaper);
		
		btnScissor = new JButton();
		btnScissor.setIcon(new ImageIcon(RockScissorPaper.class.getResource("/component/scissor.png")));
		btnScissor.setActionCommand("scissor");
		btnScissor.addActionListener(this);
		center.add(btnScissor);
		
		contentPane.add(center,BorderLayout.CENTER);
		textfield = new JTextField();
		textfield.setFont(new Font("굴림", Font.BOLD, 18));
		add(textfield, BorderLayout.SOUTH);

		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new RockScissorPaper();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		int random=(int)((Math.random())*3);
	
		if(cmd.equals("rock")) {
			
			if(scissor==random) {
				textfield.setText("내가 이겼습니다.");
			}else if(rock==random) {
				textfield.setText("비겼습니다.");
			}else if(paper==random) {
				textfield.setText("컴퓨터가 이겼습니다.");
			}
			
		}else if(cmd.equals("paper")) {
			if(rock==random) {
				textfield.setText("내가 이겼습니다.");
			}else if(paper==random) {
				textfield.setText("비겼습니다.");
			}else if(scissor==random) {
				textfield.setText("컴퓨터가 이겼습니다.");
			}
			
		}else if(cmd.equals("scissor")) {
			if(paper==random) {
				textfield.setText("내가 이겼습니다.");
			}else if(scissor==random) {
				textfield.setText("비겼습니다.");
			}else if(rock==random) {
				textfield.setText("컴퓨터가 이겼습니다.");
			}
		}
		
		
	}

}
