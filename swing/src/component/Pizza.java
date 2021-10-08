package component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;


import javax.swing.border.LineBorder;

public class Pizza extends JFrame implements ItemListener, ActionListener {

	private JPanel contentPane;
	private int rs;
	private int a;
	private int b;
	private int c;
	private JLabel lblNewLabel_1;
	private ButtonGroup group;
	private ButtonGroup group1;
	private ButtonGroup group2;
	private String kind,topping,size;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pizza frame = new Pizza();
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
	public Pizza() {
		setTitle("\uD53C\uC790\uC8FC\uBB38");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Pizza.class.getResource("/component/pizza1.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.setBackground(Color.white);

		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel(
				"\uC790\uBC14 \uD53C\uC790\uC5D0 \uC624\uC2E0 \uAC83\uC744 \uD658\uC601\uD569\uB2C8\uB2E4.");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 19));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(1, 0, 0, 0));

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "\uC885\uB958", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\uCF64\uBCF4");
		rdbtnNewRadioButton_1.addItemListener(this);
		panel_2.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("\uD3EC\uD14C\uC774\uD1A0");
		rdbtnNewRadioButton_2.addItemListener(this);
		panel_2.add(rdbtnNewRadioButton_2);

		JRadioButton rdbtnNewRadioButton_0 = new JRadioButton("\uBD88\uACE0\uAE30");
		rdbtnNewRadioButton_0.addItemListener(this);
		panel_2.add(rdbtnNewRadioButton_0);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "\uCD94\uAC00 \uD1A0\uD551",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));

		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("\uD53C\uB9DD");
		rdbtnNewRadioButton_4.addItemListener(this);
		panel_3.add(rdbtnNewRadioButton_4);

		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("\uCE58\uC988");
		rdbtnNewRadioButton_5.addItemListener(this);
		panel_3.add(rdbtnNewRadioButton_5);

		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("\uD398\uD37C\uB85C\uB2C8");
		rdbtnNewRadioButton_6.addItemListener(this);
		panel_3.add(rdbtnNewRadioButton_6);

		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("\uBCA0\uC774\uCEE8");
		rdbtnNewRadioButton_3.addItemListener(this);
		panel_3.add(rdbtnNewRadioButton_3);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "\uD06C\uAE30", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));

		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("small");
		rdbtnNewRadioButton_8.addItemListener(this);
		panel_4.add(rdbtnNewRadioButton_8);

		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("medium");
		rdbtnNewRadioButton_7.addItemListener(this);
		panel_4.add(rdbtnNewRadioButton_7);

		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("large");
		rdbtnNewRadioButton_9.addItemListener(this);
		panel_4.add(rdbtnNewRadioButton_9);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);

		JButton btnNewButton = new JButton("\uC8FC\uBB38");
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String cmd = e.getActionCommand();
				if (cmd.equals("주문")) {
					String orderList = "주문내역\n";
					orderList+="종류 "+kind+"\n";
					orderList+="토핑 "+topping+"\n";
					orderList+="사이즈 "+size+"\n";
					orderList+="주문하시겠습니까?";
					int result=JOptionPane.showConfirmDialog(getParent(), orderList,"주문완료",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
					if(result==0) {
						JOptionPane.showMessageDialog(getParent(), "주문이 완료되었습니다.");
						clear();
					}else {
						clear();
					}
				}
			}
		});
		panel_1.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\uCDE8\uC18C");
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 12));
		btnNewButton_1.addActionListener(this);
		panel_1.add(btnNewButton_1);

		lblNewLabel_1 = new JLabel("\uAE08\uC561 :");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 12));
		panel_1.add(lblNewLabel_1);

		group = new ButtonGroup();
		group.add(rdbtnNewRadioButton_0);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);

		group1 = new ButtonGroup();
		group1.add(rdbtnNewRadioButton_3);
		group1.add(rdbtnNewRadioButton_4);
		group1.add(rdbtnNewRadioButton_5);
		group1.add(rdbtnNewRadioButton_6);

		group2 = new ButtonGroup();
		group2.add(rdbtnNewRadioButton_7);
		group2.add(rdbtnNewRadioButton_8);
		group2.add(rdbtnNewRadioButton_9);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("취소")) {
			clear();
		}

	}
	
	
	
	private void clear() {
		group.clearSelection();
		group1.clearSelection();
		group2.clearSelection();
		rs = 0;
		
		kind="";
		topping="";
		size="";
		
		a=0;
		b=0;
		c=0;
		lblNewLabel_1.setText("금액 : ");
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		JRadioButton radio = (JRadioButton) e.getItem();
		if (radio.getText().equals("콤보")) {
			a = 0;
			a = a + 10000;
			rs = a + b + c;
			kind=radio.getText();
			lblNewLabel_1.setText("금액 : " + rs);
		} else if (radio.getText().equals("포테이토")) {
			a = 0;
			a = a + 12000;
			rs = a + b + c;
			kind=radio.getText();
			lblNewLabel_1.setText("금액 : " + rs);
		} else if (radio.getText().equals("불고기")) {
			a = 0;
			a = a + 13000;
			rs = a + b + c;
			kind=radio.getText();
			lblNewLabel_1.setText("금액 : " + rs);
		} else if (radio.getText().equals("피망")) {
			b = 0;
			b = b + 2000;
			rs = a + b + c;
			topping=radio.getText();
			lblNewLabel_1.setText("금액 : " + rs);
		} else if (radio.getText().equals("치즈")) {
			b = 0;
			b = b + 2000;
			rs = a + b + c;
			topping=radio.getText();
			lblNewLabel_1.setText("금액 : " + rs);
		} else if (radio.getText().equals("페퍼로니")) {
			b = 0;
			b = b + 1000;
			rs = a + b + c;
			topping=radio.getText();
			lblNewLabel_1.setText("금액 : " + rs);
		} else if (radio.getText().equals("베이컨")) {
			b = 0;
			b = b + 3000;
			rs = a + b + c;
			topping=radio.getText();
			lblNewLabel_1.setText("금액 : " + rs);
		} else if (radio.getText().equals("small")) {
			c = 0;
			c = c + 1000;
			rs = a + b + c;
			size=radio.getText();
			lblNewLabel_1.setText("금액 : " + rs);
		} else if (radio.getText().equals("medium")) {
			c = 0;
			c = c + 2000;
			rs = a + b + c;
			size=radio.getText();
			lblNewLabel_1.setText("금액 : " + rs);
		} else if (radio.getText().equals("large")) {
			c = 0;
			c = c + 3000;
			rs = a + b + c;
			size=radio.getText();
			lblNewLabel_1.setText("금액 : " + rs);
		}

	}

}
