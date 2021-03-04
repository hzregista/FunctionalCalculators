import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.WindowConstants;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.DropMode;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;
import java.util.Arrays;
public class CalculatorPlus extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;

	DefaultTableModel model = new DefaultTableModel();
	
	private int count=0;
    private double value[] = new double[999];
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
		

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorPlus frame = new CalculatorPlus();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		public void reset()
		{
			textField.setText("");
			textField_1.setText("");
			textField_2.setText("");
			textField_3.setText("");
			textField_4.setText("");
			textField_5.setText("");
			textField_6.setText("");
		}	
		public void sort()
		{
			double a;
			for(int i = 0; i < count-1; i++)
	        {
	            for(int j = i+1; j < count; j++)
	            {
	                if(value[j] < value[i]) {
	                    a = value[i];
	                    value[i] = value[j];
	                    value[j] = a;
	                }
	            }
	        }
		}
		public CalculatorPlus() {
		setResizable(false);
		setTitle("ARRAY");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 422, 526);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField.setEnabled(false);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(91, 28, 72, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("<<< TWOVALUE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculator c= new Calculator();
				c.setVisible(true);	
				dispose();
			}
		});		
		
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton.setBounds(10, 197, 142, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Please enter value you want add:");
		lblNewLabel.setBounds(10, 280, 207, 14);
		contentPane.add(lblNewLabel);
	
		JLabel lblNewLabel_1_1 = new JLabel("S.Devition:");
		lblNewLabel_1_1.setBounds(10, 32, 71, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNumberOfEmployees_1 = new JLabel("0");
		lblNumberOfEmployees_1.setBounds(361, 389, 34, 14);
		contentPane.add(lblNumberOfEmployees_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(253, 175, 142, 203);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBounds(145, 137, 108, 146);
		scrollPane.setViewportView(table);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBounds(10, 305, 142, 40);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.setRowCount(0);
				reset();
				lblNumberOfEmployees_1.setText("0");
				count=0;	
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnClear.setBackground(Color.WHITE);
		btnClear.setBounds(10, 420, 142, 33);
		contentPane.add(btnClear);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setEnabled(false);
		textField_2.setColumns(10);
		textField_2.setBounds(91, 94, 72, 22);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Median:");
		lblNewLabel_1_1_1.setBounds(10, 98, 71, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setEnabled(false);
		textField_3.setColumns(10);
		textField_3.setBounds(323, 94, 72, 22);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("A. Mean:");
		lblNewLabel_1_1_2.setBounds(242, 98, 71, 14);
		contentPane.add(lblNewLabel_1_1_2);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setEnabled(false);
		textField_4.setColumns(10);
		textField_4.setBounds(91, 130, 72, 22);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Mod:");
		lblNewLabel_1_1_3.setBounds(10, 134, 71, 14);
		contentPane.add(lblNewLabel_1_1_3);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setEnabled(false);
		textField_5.setColumns(10);
		textField_5.setBounds(323, 28, 72, 22);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("G. Mean:");
		lblNewLabel_1_1_4.setBounds(242, 32, 71, 14);
		contentPane.add(lblNewLabel_1_1_4);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setEnabled(false);
		textField_6.setColumns(10);
		textField_6.setBounds(323, 61, 72, 22);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_1_1_5 = new JLabel("H. Mean:");
		lblNewLabel_1_1_5.setBounds(242, 65, 71, 14);
		contentPane.add(lblNewLabel_1_1_5);
		
		JLabel lblNumberOfEmployees = new JLabel("Number of Values:");
		lblNumberOfEmployees.setBounds(253, 389, 109, 14);
		contentPane.add(lblNumberOfEmployees);

		
		JButton btnAdd = new JButton("ADD");		
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				try {
					if(count==1000)
					{
						JOptionPane.showMessageDialog(null, "You cannot enter more value");
					}
					else {
				value[count] = Double.parseDouble(textField_1.getText());
				model.setRowCount(count+1);
				model.setColumnCount(1);
				table.setModel(model);
				model.setValueAt(value[count], count, 0);
				count++;
				lblNumberOfEmployees_1.setText(Integer.toString(count));	
					}
				}
				catch(Exception exc)
				{
					JOptionPane.showMessageDialog(null, "You've entered invalid character");
				}		
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setBounds(10, 356, 142, 22);
		contentPane.add(btnAdd);
		
		JButton btnCalculate = new JButton("CALCULATE!");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 reset();		 
			 double nov = Double.parseDouble(lblNumberOfEmployees_1.getText());
			 if(nov==0 || nov==1) {JOptionPane.showMessageDialog(null, "Please enter 2 character at least.");}
			 else {
		 
			double amn = 0;
			double gmn = 1;
			double hmn = 0;
			for (int i=0; i<nov; i++)
			{
				amn+=value[i];
				gmn*=value[i];
				hmn+=1/value[i];	
        	}
			amn /= nov;	
			textField_3.setText(new DecimalFormat("####.####").format(amn));
			gmn = Math.pow(gmn,(1/nov));			
			textField_5.setText(new DecimalFormat("####.####").format(gmn));
			hmn = nov/hmn;
			textField_6.setText(new DecimalFormat("####.####").format(hmn));
			
			double std[] = new double[value.length];
			double stdv = 0;
			for (int i=0; i<nov; i++)
			{
				std[i] = amn - value[i];
				std[i] = std[i] * std[i];
				stdv += std[i];				
        	}
			stdv /= (nov-1);
			double stdev = Math.sqrt(stdv);
			textField_7.setText(new DecimalFormat("####.####").format(stdev*stdev));
			textField.setText(new DecimalFormat("####.####").format(stdev));
		    
			double index= nov/2;
		    sort();
			if (nov%2==0)
			{
				if(value[(int)index-1]==(int)index) {
					textField_2.setText(new DecimalFormat("####.####").format(value[(int)index]));
				}else {
			textField_2.setText(new DecimalFormat("####.####").format(value[(int)index-1])+" and "+new DecimalFormat("####.####").format(value[(int)index]));}				
			}else { 
			index -= 0.5; 	
			textField_2.setText(new DecimalFormat("####.####").format(value[(int)index]));	
			}
			
			double mod = 0;
			double frc = 0;
			double rpt= 1;
			for(int i=0; i<=count-1; i++)
			{
				if(value[i] == value[i+1]) {
					rpt++;
				}
				if(i==count-2 || value[i] != value[i+1]){
					if (rpt > frc)
					{
						frc=rpt;
						mod=value[i];
					}
					rpt=1;
				}
			}
			if (frc == 1) {
			textField_4.setText("No Mod");	
			textField_8.setText("No Frequency");}
			else {
			textField_4.setText(Double.toString(mod));
			textField_8.setText(Double.toString(frc));
			}
			}
			}
		});
		btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnCalculate.setBackground(Color.WHITE);
		btnCalculate.setBounds(253, 420, 142, 33);
		contentPane.add(btnCalculate);							
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("Variance:");
		lblNewLabel_1_1_3_1.setBounds(10, 65, 71, 14);
		contentPane.add(lblNewLabel_1_1_3_1);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setEnabled(false);
		textField_7.setColumns(10);
		textField_7.setBounds(91, 61, 72, 22);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_1_1_3_1_1 = new JLabel("Frequency: ");
		lblNewLabel_1_1_3_1_1.setBounds(242, 133, 71, 14);
		contentPane.add(lblNewLabel_1_1_3_1_1);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setEnabled(false);
		textField_8.setColumns(10);
		textField_8.setBounds(323, 130, 72, 22);
		contentPane.add(textField_8);
		}
	}