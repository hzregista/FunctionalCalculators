import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.text.DecimalFormat;



public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private double number1 = 0;
	private double number2 = 0; 
	private double result  = 0;
	private String op = " ";
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void control() {
		if(textField.getText().equals("INCALCULABLE")) {
			textField.setText("0");
			number2 = 0;
			result = 0;
			op = " ";
		}
	}
	public void resultcontrol() {
		if(result>= 2100000000 || result<=-2100000000) {
			textField.setText("INCALCULABLE");
			number1 = 0;
			number2 = 0;
			result = 0;
			op = " ";
		}
	}
	public void zerocontrol() {
		if(textField.getText().equals("0")) {
			textField.setText("");
		}
	}
	public Calculator() {
		setResizable(false);
		setBackground(Color.BLACK);
		setTitle("TWOVALUE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 422, 526);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setFont(new Font("Book Antiqua", Font.PLAIN, 25));
		textField.setBackground(Color.WHITE);
		textField.setBounds(5, 11, 395, 62);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(5, 93, 395, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				control();
				zerocontrol();
				textField.setText(textField.getText() + e.getActionCommand());
				
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(5, 400, 66, 33);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				control();
				zerocontrol();
				textField.setText(textField.getText() + e.getActionCommand());
				
			}
		});
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBounds(81, 400, 66, 33);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				control();
				zerocontrol();
				textField.setText(textField.getText() + e.getActionCommand());
				
			}
		});
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setBounds(157, 400, 66, 33);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				control();
				zerocontrol();
				textField.setText(textField.getText() + e.getActionCommand());
		
			}
		});
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setBounds(5, 356, 66, 33);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				control();
				zerocontrol();
				textField.setText(textField.getText() + e.getActionCommand());
				
			}
		});
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_4.setForeground(Color.BLACK);
		btnNewButton_4.setBounds(81, 356, 66, 33);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				control();
				zerocontrol();
				textField.setText(textField.getText() + e.getActionCommand());
				
			}
		});
		btnNewButton_5.setBackground(Color.WHITE);
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_5.setForeground(Color.BLACK);
		btnNewButton_5.setBounds(157, 356, 66, 33);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				control();
				zerocontrol();
				textField.setText(textField.getText() + e.getActionCommand());
				
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_6.setForeground(Color.BLACK);
		btnNewButton_6.setBackground(Color.WHITE);
		btnNewButton_6.setBounds(5, 312, 66, 33);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				control();
				zerocontrol();
				textField.setText(textField.getText() + e.getActionCommand());
				
			}
		});
		btnNewButton_7.setBackground(Color.WHITE);
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_7.setForeground(Color.BLACK);
		btnNewButton_7.setBounds(81, 312, 66, 33);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				control();
				zerocontrol();
				textField.setText(textField.getText() + e.getActionCommand());
				
			}
		});
		btnNewButton_8.setBackground(Color.WHITE);
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_8.setForeground(Color.BLACK);
		btnNewButton_8.setBounds(157, 312, 66, 33);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				control();
				zerocontrol();
				textField.setText(textField.getText() + e.getActionCommand());
				
			}
		});
		btnNewButton_9.setBackground(Color.WHITE);
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_9.setForeground(Color.BLACK);
		btnNewButton_9.setBounds(81, 444, 66, 33);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton(".");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				if(textField.getText().equals("") || textField.getText().equals("INCALCULABLE")) {
					control();
				}else {
					textField.setText(textField.getText()+".");
				}				
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_10.setForeground(Color.BLACK);
		btnNewButton_10.setBackground(Color.WHITE);
		btnNewButton_10.setBounds(157, 444, 66, 33);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("+/-");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("") || textField.getText().equals("INCALCULABLE")) {
					control();
				}else {
					if(textField.getText().equals("0")){}
					else {
						double ng = Double.parseDouble(textField.getText());
						ng *= -1;
						textField.setText(Double.toString(ng));
						}
				}
				
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_11.setForeground(Color.BLACK);
		btnNewButton_11.setBackground(Color.WHITE);
		btnNewButton_11.setBounds(5, 444, 66, 33);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("=");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("") || textField.getText().equals("INCALCULABLE")) {
					control();
					//if(number2==0 || ) {}
				}else {					
				lblNewLabel.setText("");
				number2 = Double.parseDouble(textField.getText());
				switch (op) {
				case "+":					
					result = number1+number2;
					lblNewLabel.setText(Double.toString(number1) +" + "+ Double.toString(number2) +" = "+ Double.toString(result));
					op=" ";
				break;
				case "-":
					result = number1-number2;
					lblNewLabel.setText(Double.toString(number1) +" - "+ Double.toString(number2) +" = "+ Double.toString(result));
					op=" ";
				break;
				case "*":
					result = number1*number2;
					lblNewLabel.setText(Double.toString(number1) +" * "+ Double.toString(number2) +" = "+ Double.toString(result));
					op=" ";
				break;
				case "/":
					result = number1/number2;
					lblNewLabel.setText(Double.toString(number1) +" / "+ Double.toString(number2) +" = "+ Double.toString(result));
					op=" ";					
				break;
				case "%":
					result = number1%number2;
					lblNewLabel.setText(Double.toString(number1) +" % "+ Double.toString(number2) +" = "+ Double.toString(result));
					op=" ";
					break;
				case "m":
					result = (number1+number2)/2;
					lblNewLabel.setText(Double.toString(number1) +" m "+ Double.toString(number2) +" = "+ Double.toString(result));
					op=" ";
					break;
				case "^":
					result = Math.pow(number1, number2);
					lblNewLabel.setText(Double.toString(number1) +" ^ "+ Double.toString(number2) +" = "+ Double.toString(result));
					op=" ";
					break;
				case " ":
					
					break;
				}
				textField.setText(new DecimalFormat("##.##").format(result));
				resultcontrol();
					}				
			}
		});
				
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_12.setBackground(Color.WHITE);
		btnNewButton_12.setBounds(245, 444, 155, 33);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_6_1 = new JButton("\u221A");
		btnNewButton_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				if(textField.getText().equals("") || textField.getText().equals("INCALCULABLE")) {
					control();
				}else {
				double sqr = Double.parseDouble(textField.getText());	
				double screen = sqr;
				textField.setText(Double.toString(Math.sqrt(sqr)));
				lblNewLabel.setText("Square Root Of "+Double.toString(screen) +" = " + textField.getText());
				textField.setText(new DecimalFormat("##.##").format((Math.sqrt(sqr))));		
				}
				
			}
		});
		btnNewButton_6_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_6_1.setBackground(Color.WHITE);
		btnNewButton_6_1.setBounds(5, 168, 66, 33);
		contentPane.add(btnNewButton_6_1);
		
		JButton btnNewButton_6_2 = new JButton("^");
		btnNewButton_6_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_6_2.setBackground(Color.WHITE);
		btnNewButton_6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("") || textField.getText().equals("INCALCULABLE")) {
					control();
				}else {
				number1 = Double.parseDouble(textField.getText());
				textField.setText("0");
				lblNewLabel.setText(Double.toString(number1) +" ^");
				op="^";				
				}
			}
		});
		btnNewButton_6_2.setBounds(5, 212, 66, 33);
		contentPane.add(btnNewButton_6_2);
		
		JButton btnNewButton_6_3 = new JButton("!");
		btnNewButton_6_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().equals("") || textField.getText().equals("INCALCULABLE")) {
					control();
				}				
				else {
					double fak = Double.parseDouble(textField.getText());
					double screen = fak;
					if(fak==0) {textField.setText("1");}
					else if(fak<0) {textField.setText("");}
					else {
					double i=1;
					while(fak>0) {
						i*=fak;
						fak--;
					}
					textField.setText(new DecimalFormat("##.##").format(i));
					lblNewLabel.setText(Double.toString(screen) +"! " + textField.getText());
					}
				}
			}
		});
		btnNewButton_6_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_6_3.setBackground(Color.WHITE);
		btnNewButton_6_3.setForeground(Color.DARK_GRAY);
		btnNewButton_6_3.setBounds(5, 124, 66, 33);
		contentPane.add(btnNewButton_6_3);
		
		JButton btnNewButton_12_1 =  new JButton("CE");
		btnNewButton_12_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				if(number1 ==0) {
					textField.setText("0");
					lblNewLabel.setText("");
					number1=0;
				}
				else if(number1 !=0) {
					if(result!=0) {
						textField.setText("0");
						lblNewLabel.setText("");
						number1=0;
						number2=0;
						result=0;
						op=" ";
					}else {
					textField.setText("0");
					lblNewLabel.setText(Double.toString(number1) +" "+ op +"");
					number2=0;
					}
				}
			}
		});
		btnNewButton_12_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_12_1.setBackground(Color.WHITE);
		btnNewButton_12_1.setForeground(Color.BLACK);
		btnNewButton_12_1.setBounds(81, 255, 142, 33);
		contentPane.add(btnNewButton_12_1);
		
		JButton btnNewButton_5_3 = new JButton("C");
		btnNewButton_5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
				lblNewLabel.setText("");
				number1=0;
				number2=0;
				result=0;
				op=" ";
			}
		});
		btnNewButton_5_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_5_3.setBackground(Color.WHITE);
		btnNewButton_5_3.setForeground(Color.BLACK);
		btnNewButton_5_3.setBounds(287, 255, 66, 33);
		contentPane.add(btnNewButton_5_3);
		
		JButton btnNewButton_5_4 = new JButton("ARRAY >>>");
		btnNewButton_5_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
				lblNewLabel.setText("");
				number1=0;
				number2=0;
				result=0;
				op=" ";
				CalculatorPlus cplus= new CalculatorPlus();
				cplus.setVisible(true);	
				dispose();
			}
		});
		btnNewButton_5_4.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton_5_4.setBackground(Color.WHITE);
		btnNewButton_5_4.setBounds(254, 169, 142, 33);
		contentPane.add(btnNewButton_5_4);

		JButton btnNewButton_8_1 = new JButton("+");
		btnNewButton_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
				if(textField.getText().equals("") || textField.getText().equals("INCALCULABLE")) {
					control();
				}				
				if(number1==0) {number1 = Double.parseDouble(textField.getText());}	
				    op="+";
					lblNewLabel.setText(Double.toString(number1) + " "+op);
					textField.setText("0");							
			}
		});
		btnNewButton_8_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_8_1.setBackground(Color.WHITE);
		btnNewButton_8_1.setBounds(246, 312, 66, 33);
		contentPane.add(btnNewButton_8_1);
		
		JButton btnNewButton_8_2 = new JButton("-");
		btnNewButton_8_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("") || textField.getText().equals("INCALCULABLE")) {
					control();
				}				
				if(number1==0) {number1 = Double.parseDouble(textField.getText());}	
				    op="-";
					lblNewLabel.setText(Double.toString(number1) + " "+op);
					textField.setText("0");					
			}
		});
		btnNewButton_8_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_8_2.setBackground(Color.WHITE);
		btnNewButton_8_2.setBounds(330, 312, 66, 33);
		contentPane.add(btnNewButton_8_2);
		
		JButton btnNewButton_8_3 = new JButton("*");
		btnNewButton_8_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("") || textField.getText().equals("INCALCULABLE")) {
					control();
				}				
				if(number1==0) {number1 = Double.parseDouble(textField.getText());}	
				    op="*";
					lblNewLabel.setText(Double.toString(number1) + " "+op);
					textField.setText("0");	
					
			}
		});
		btnNewButton_8_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_8_3.setBackground(Color.WHITE);
		btnNewButton_8_3.setBounds(246, 356, 66, 33);
		contentPane.add(btnNewButton_8_3);
		
		JButton btnNewButton_8_4 = new JButton("/");
		btnNewButton_8_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("") || textField.getText().equals("INCALCULABLE")) {
					control();
				}				
				if(number1==0) {number1 = Double.parseDouble(textField.getText());}	
				    op="/";
					lblNewLabel.setText(Double.toString(number1) + " "+op);
					textField.setText("0");			
					
			}
		});
		btnNewButton_8_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_8_4.setBackground(Color.WHITE);
		btnNewButton_8_4.setBounds(330, 356, 66, 33);
		contentPane.add(btnNewButton_8_4);
		
		JButton btnNewButton_8_5 = new JButton("%");
		btnNewButton_8_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().equals("") || textField.getText().equals("INCALCULABLE")) {
					control();
				}				
				if(number1==0) {number1 = Double.parseDouble(textField.getText());}	
				    op="%";
					lblNewLabel.setText(Double.toString(number1) + " "+op);
					textField.setText("0");	
				
			}
		});
		btnNewButton_8_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_8_5.setBackground(Color.WHITE);
		btnNewButton_8_5.setBounds(287, 400, 66, 33);
		contentPane.add(btnNewButton_8_5);
		
		JButton btnNewButton_5_2_1 = new JButton("MEAN");
		btnNewButton_5_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().equals("") || textField.getText().equals("INCALCULABLE")) {
					control();
				}				
				if(number1==0) {number1 = Double.parseDouble(textField.getText());}						
					op="m";
					textField.setText("0");
					lblNewLabel.setText(Double.toString(number1) +" "+op);			
					
			}
		});
		btnNewButton_5_2_1.setBackground(Color.WHITE);
		btnNewButton_5_2_1.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton_5_2_1.setBounds(5, 256, 66, 33);
		contentPane.add(btnNewButton_5_2_1);
		
	}
}