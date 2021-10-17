package projectt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JRadioButtonMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Shoeconv {

	private JFrame frame;
	private JTextField t1;
	
	private JTextField t2;
	private JTextField ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Shoeconv window = new Shoeconv();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Shoeconv() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(255, 255, 204));
		frame.setBounds(100, 100, 712, 593);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CALCULATOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(261, 11, 250, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER VALUES");
		lblNewLabel_1.setForeground(new Color(153, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(10, 60, 237, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBounds(53, 114, 205, 64);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton ba = new JButton("ADD");
		ba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 float num1,num2,add;
				 
				try {
					num1 = Float.parseFloat(t1.getText());
					num2 = Float.parseFloat(t2.getText());
					add = num1+num2;
					ans.setText(Float.toString(add));					
				}
				catch(Exception ex){
					JOptionPane.showMessageDialog(null,"Please enter a valid number");
				}
				
			}
			
		});
		ba.setForeground(new Color(0, 102, 51));
		ba.setBounds(28, 249, 121, 72);
		frame.getContentPane().add(ba);
		
		t2 = new JTextField();
		t2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		t2.setBounds(385, 114, 196, 64);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JButton bs = new JButton("SUBTRACT");
		bs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 float num1,num2,sub;
				 
					try {
						num1 = Float.parseFloat(t1.getText());
						num2 = Float.parseFloat(t2.getText());
						sub = num1-num2;
						ans.setText(Float.toString(sub));					
					}
					catch(Exception ex){
						JOptionPane.showMessageDialog(null,"Please enter a valid number");
					}
			}
		});
		bs.setForeground(new Color(0, 102, 0));
		bs.setBounds(194, 249, 111, 72);
		frame.getContentPane().add(bs);
		
		JButton bm = new JButton("MULTIPLY");
		bm.setForeground(new Color(0, 102, 0));
		bm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 float num1,num2,mul;
				 
					try {
						num1 = Float.parseFloat(t1.getText());
						num2 = Float.parseFloat(t2.getText());
						mul = num1*num2;
						ans.setText(Float.toString(mul));					
					}
					catch(Exception ex){
						JOptionPane.showMessageDialog(null,"Please enter a valid number");
					}
			}
		});
		bm.setBounds(351, 249, 111, 72);
		frame.getContentPane().add(bm);
		
		JButton bd = new JButton("DIVIDE");
		bd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 float num1,num2,div;
				 
					try {
						num1 = Float.parseFloat(t1.getText());
						num2 = Float.parseFloat(t2.getText());
						div = num1/num2;
						ans.setText(Float.toString(div));					
					}
					catch(Exception ex){
						JOptionPane.showMessageDialog(null,"Please enter a valid number");
					}
			}
		});
		bd.setForeground(new Color(0, 102, 0));
		bd.setBounds(519, 249, 111, 72);
		frame.getContentPane().add(bd);
		
		JButton br = new JButton("REMAINDER");
		br.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 float num1,num2,r;
				 
					try {
						num1 = Float.parseFloat(t1.getText());
						num2 = Float.parseFloat(t2.getText());
						r = num1%num2;
						ans.setText(Float.toString(r));					
					}
					catch(Exception ex){
						JOptionPane.showMessageDialog(null,"Please enter a valid number");
					}
			}
		});
		br.setForeground(new Color(0, 102, 0));
		br.setBounds(28, 366, 121, 72);
		frame.getContentPane().add(br);
		
		JButton bsr = new JButton("SQUARE ROOT");
		bsr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				 float num1,sqr=0;
				 JOptionPane.showMessageDialog(null,"Please use one textfield i.e. first one only");
					try {
		
						num1 = Float.parseFloat(t1.getText());
						sqr = (float) Math.sqrt(num1);
						ans.setText(Float.toString(sqr));
						if(t2.getText()!=null) {
							
						}
		
						
					}
				
					catch(Exception ex){
						JOptionPane.showMessageDialog(null,"Please enter a valid number");
						
					}
			}
			
		});
		bsr.setForeground(new Color(0, 102, 0));
		bsr.setBounds(194, 366, 121, 72);
		frame.getContentPane().add(bsr);
		
		JButton bcr = new JButton("CUBE ROOT");
		bcr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 float num1,cr=0;
				 JOptionPane.showMessageDialog(null,"Please use one textfield only i.e. first one only");
					try {
						num1 = Float.parseFloat(t1.getText());	
						cr= (float) Math.cbrt(num1);
				
						ans.setText(Float.toString(cr));	
					}
					catch(Exception ex){
						JOptionPane.showMessageDialog(null,"Please enter a valid number");
						
					}
			}
		});
		bcr.setForeground(new Color(0, 102, 0));
		bcr.setFont(new Font("Tahoma", Font.BOLD, 11));
		bcr.setBounds(351, 366, 111, 72);
		frame.getContentPane().add(bcr);
		
		JButton bf = new JButton("FACTORIAL");
		bf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int num1;
				
				 int i, fact=1;
				 JOptionPane.showMessageDialog(null,"Please use one textfield i.e the first one only");
					try {
						num1= Integer.parseInt(t1.getText());
						if(num1<0)
						{
							JOptionPane.showMessageDialog(null,"Please enter a positive number");
						}
						if(num1%1==0)
						{
							for(i=1;i<=num1;i++)
							{ fact=fact*i; }
						ans.setText(Float.toString(fact));}						
						}
					
					catch(Exception ex){
						JOptionPane.showMessageDialog(null,"Please enter a valid number");
						
					}
				
			}
		});
		bf.setForeground(new Color(0, 102, 0));
		bf.setBounds(519, 366, 111, 72);
		frame.getContentPane().add(bf);
		
		ans = new JTextField();
		ans.setEditable(false);
		ans.setBounds(402, 487, 121, 42);
		frame.getContentPane().add(ans);
		ans.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("THE ANSWER IS");
		lblNewLabel_2.setForeground(new Color(102, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2.setBounds(150, 496, 222, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("1st number");
		lblNewLabel_3.setBounds(126, 189, 88, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("2nd number");
		lblNewLabel_4.setBounds(462, 189, 71, 14);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
