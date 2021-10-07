package component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;

public class KeyPad extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private String rs;
	private JButton btnNewButton,btnNewButton_1,btnNewButton_2,btnNewButton_3,btnNewButton_4,btnNewButton_5,btnNewButton_6
	,btnNewButton_7,btnNewButton_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KeyPad frame = new KeyPad();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public KeyPad() {
		setTitle("Å°ÆÐµå");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		btnNewButton = new JButton("1");
		btnNewButton.addActionListener(this);
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(this);
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(this);
		panel.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(this);
		panel.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(this);
		panel.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(this);
		panel.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("7");
		btnNewButton_6.addActionListener(this);
		panel.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("8");
		btnNewButton_7.addActionListener(this);
		panel.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(this);
		panel.add(btnNewButton_8);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd =e.getActionCommand();
		textField.setText(textField.getText()+cmd);
		
	}

}
