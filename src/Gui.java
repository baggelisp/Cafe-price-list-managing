import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Gui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
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
	public Gui() {
		setResizable(false);
		setTitle("Cafe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 789, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("\u039C\u03BF\u03BD\u03CC\u03C2 \u0395\u03BB\u03BB\u03B7\u03BD\u03B9\u03BA\u03CC\u03C2");
		
		JLabel label_1 = new JLabel("\u0394\u03B9\u03C0\u03BB\u03CC\u03C2 \u0395\u03BB\u03BB\u03B7\u03BD\u03B9\u03BA\u03CC\u03C2");
		
		JLabel lblEspresso = new JLabel("\u039C\u03BF\u03BD\u03CC\u03C2 Espresso");
		
		JLabel lblEspresso_1 = new JLabel("\u0394\u03B9\u03C0\u03BB\u03CC\u03C2 Espresso");
		
		JLabel lblEspresso_2 = new JLabel("\u03A6\u03C1\u03AD\u03BD\u03C4\u03BF Espresso");
		
		JLabel lblCapucino = new JLabel("\u039A\u03B1\u03C0\u03BF\u03C5\u03C4\u03C3\u03AF\u03BD\u03BF \u039C\u03BF\u03BD\u03CC");
		
		JLabel lblCapucino_1 = new JLabel("\u039A\u03B1\u03C0\u03BF\u03C5\u03C4\u03C3\u03AF\u03BD\u03BF \u0394\u03B9\u03C0\u03BB\u03CC");
		
		JLabel label_2 = new JLabel("\u03A6\u03C1\u03AD\u03BD\u03C4\u03BF \u03BA\u03B1\u03C0\u03BF\u03C5\u03C4\u03C3\u03AF\u03BD\u03BF");
		
		JLabel label_3 = new JLabel("\u0393\u03B1\u03BB\u03BB\u03B9\u03BA\u03CC\u03C2");
		
		JLabel label_4 = new JLabel("\u03A3\u03BF\u03BA\u03BF\u03BB\u03AC\u03C4\u03B1");
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setText("1.50");
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setText("2.00");
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_2.setText("1.50");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setText("2.00");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_4.setText("2.50");
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_5.setText("2.50");
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_6.setText("3.00");
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setText("3.00");
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_8.setText("2.50");
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_9.setText("3.00");
		textField_9.setColumns(10);
		
		JLabel lblX = new JLabel("x");
		
		JLabel lblX_1 = new JLabel("x");
		
		JLabel lblX_2 = new JLabel("x");
		
		JLabel lblX_3 = new JLabel("x");
		
		JLabel lblX_4 = new JLabel("x");
		
		JLabel lblX_5 = new JLabel("x");
		
		JLabel lblX_6 = new JLabel("x");
		
		JLabel lblX_7 = new JLabel("x");
		
		JLabel lblX_8 = new JLabel("x");
		
		JLabel lblX_9 = new JLabel("x");
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setText("0");
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setText("0");
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setText("0");
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setText("0");
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setText("0");
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setText("0");
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setText("0");
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setText("0");
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setText("0");
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setText("0");
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setColumns(10);
		
		JLabel label_6 = new JLabel("=0.0");
		
		JLabel label_7 = new JLabel("=0.0");
		
		JLabel label_8 = new JLabel("=0.0");
		
		JLabel label_9 = new JLabel("=0.0");
		
		JLabel label_10 = new JLabel("=0.0");
		
		JLabel label_11 = new JLabel("=0.0");
		
		JLabel label_12 = new JLabel("=0.0");
		
		JLabel label_13 = new JLabel("=0.0");
		
		JLabel label_14 = new JLabel("=0.0");
		
		JLabel label_15 = new JLabel("=0.0");
		
		JButton button = new JButton("\u03A3\u03CD\u03BD\u03BF\u03BB\u03BF");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				double a1=Double.parseDouble(textField.getText())*Double.parseDouble(textField_10.getText());
				label_6.setText("=" + String.valueOf(a1));
				double a2=Double.parseDouble(textField_1.getText())*Double.parseDouble(textField_11.getText());
				label_7.setText("=" + String.valueOf(a2));
				double a3=Double.parseDouble(textField_2.getText())*Double.parseDouble(textField_12.getText());
				label_8.setText("=" + String.valueOf(a3));
				double a4=Double.parseDouble(textField_3.getText())*Double.parseDouble(textField_13.getText());
				label_9.setText("=" + String.valueOf(a4));
				double a5=Double.parseDouble(textField_4.getText())*Double.parseDouble(textField_14.getText());
				label_10.setText("=" + String.valueOf(a5));
				double a6=Double.parseDouble(textField_5.getText())*Double.parseDouble(textField_15.getText());
				label_11.setText("=" + String.valueOf(a6));
				double a7=Double.parseDouble(textField_6.getText())*Double.parseDouble(textField_16.getText());
				label_12.setText("=" + String.valueOf(a7));
				double a8=Double.parseDouble(textField_7.getText())*Double.parseDouble(textField_17.getText());
				label_13.setText("=" + String.valueOf(a8));
				double a9=Double.parseDouble(textField_8.getText())*Double.parseDouble(textField_18.getText());
				label_14.setText("=" + String.valueOf(a9));
				double a10=Double.parseDouble(textField_9.getText())*Double.parseDouble(textField_19.getText());
				label_15.setText("=" + String.valueOf(a10));
				
				double sum=a1+a2+a3+a4+a5+a6+a7+a8+a9+a10;
				
				textField_20.setText(String.valueOf(sum));
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_20 = new JTextField();
		textField_20.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_20.setEditable(false);
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setText("0.0");
		textField_20.setColumns(10);
		
		JLabel label_5 = new JLabel("\u03A0\u03BF\u03C3\u03CC\u03C4\u03B7\u03C4\u03B1");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel label_16 = new JLabel("\u03A4\u03B9\u03BC\u03AE");
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(49)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(label_4)
						.addComponent(label_3)
						.addComponent(label_2)
						.addComponent(lblCapucino_1)
						.addComponent(lblEspresso_2)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addComponent(lblEspresso_1)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblEspresso)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(label_1)
										.addComponent(label))
									.addGap(1))))
						.addComponent(lblCapucino))
					.addGap(128)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(label_16)
							.addGap(152)
							.addComponent(label_5)
							.addGap(271))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(textField_9, 0, 0, Short.MAX_VALUE)
								.addComponent(textField_8, 0, 0, Short.MAX_VALUE)
								.addComponent(textField_7, 0, 0, Short.MAX_VALUE)
								.addComponent(textField_6, 0, 0, Short.MAX_VALUE)
								.addComponent(textField_5, 0, 0, Short.MAX_VALUE)
								.addComponent(textField_4, 0, 0, Short.MAX_VALUE)
								.addComponent(textField_3, 0, 0, Short.MAX_VALUE)
								.addComponent(textField_2, 0, 0, Short.MAX_VALUE)
								.addComponent(textField_1, 0, 0, Short.MAX_VALUE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
							.addGap(74)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblX)
								.addComponent(lblX_1)
								.addComponent(lblX_2)
								.addComponent(lblX_3)
								.addComponent(lblX_4)
								.addComponent(lblX_5)
								.addComponent(lblX_6)
								.addComponent(lblX_7)
								.addComponent(lblX_8)
								.addComponent(lblX_9))
							.addGap(73)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(label_15))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(label_14))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(label_13))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(label_12))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(label_11))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(label_10))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(label_9))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(label_8))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(label_7))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
									.addGap(72)
									.addComponent(label_6)))
							.addPreferredGap(ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(textField_20, 0, 0, Short.MAX_VALUE)
								.addComponent(button, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(20))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(label_16)
						.addComponent(label_5))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label)
								.addComponent(lblX)
								.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_6))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblX_1)
								.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_7)
								.addComponent(label_1))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblEspresso)
								.addComponent(lblX_2)
								.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_8))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblEspresso_1)
										.addComponent(lblX_3))
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblEspresso_2)
										.addComponent(lblX_4)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_9))
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_10))))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCapucino)
								.addComponent(lblX_5)
								.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_11))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCapucino_1)
								.addComponent(lblX_6)
								.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_12))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_2)
								.addComponent(lblX_7)
								.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_13))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_3)
								.addComponent(lblX_8)
								.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_14))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_4)
								.addComponent(lblX_9)
								.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_15))
							.addGap(12))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(button)
							.addGap(18)
							.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(109))))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
