import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class EmployeeScale{
	
	String[] type ={"Manager","Accountant", "Clerk", "Programmer", "Designer", "Peon"};

	JLabel[] label= new JLabel[50];
	JTextField[] f = new JTextField[20];
	JCheckBox[] c= new JCheckBox[10];
	JPanel[] panel = new JPanel[20];
	JComboBox com_list =new JComboBox(type);
	public EmployeeScale()
		{
			label[0]=new JLabel("Employee ID: ");
			label[1]=new JLabel("Employee Type: ");
			label[2]=new JLabel("Basic Salary: ");
			label[3]=new JLabel("Check for %  ");
			label[4]=new JLabel("Allowance  ");
			label[5]=new JLabel("   Allowance value");
			label[6]=new JLabel("DA Allowance:  ");
			c[0] = new JCheckBox("DA    ");
			label[7]=new JLabel("HRA Allowance: ");
			c[1] = new JCheckBox("HRA   ");
			label[8]=new JLabel("WA ALLowance: ");
			c[2] = new JCheckBox("WA   ");
			label[9]=new JLabel("Check for % ");
			label[10]=new JLabel("Deduction");
			label[11]=new JLabel("Deduction Value ");
			label[12]=new JLabel("GPF Deduction: ");
			c[3] = new JCheckBox("GPF   ");
			label[13]=new JLabel("IT Deduction: ");
			c[4] = new JCheckBox("IT   ");
			label[14]=new JLabel("PF Deduction: ");
			c[5] = new JCheckBox("PF   ");
			for(int i=0; i<20; i++)
				{
					f[i] = new JTextField(10);
					panel[i] = new JPanel();
      					panel[i].setLayout(new FlowLayout());
					//panel[i].add(com)
				}
		JButton con = new JButton("Confirm");	
		con.setPreferredSize(new Dimension(120, 40));	
		JFrame scale_frame =new JFrame("Add Employee");
		scale_frame.setLayout(new GridLayout(11,1));
		scale_frame.setSize(800,800);
		scale_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		panel[0].add(label[1]);
		panel[0].add(com_list);
		panel[0].add(label[0]);
		panel[0].add(f[0]);
		scale_frame.add(panel[0]);

		panel[1].add(label[2]);
		panel[1].add(f[1]);
		scale_frame.add(panel[1]);

		panel[2].add(label[3]); panel[2].add(label[4]); panel[2].add(label[5]);
		scale_frame.add(panel[2]);

		panel[3].add(label[6]); panel[3].add(c[0]); panel[3].add(f[2]);
		scale_frame.add(panel[3]);

		panel[4].add(label[7]); panel[4].add(c[1]); panel[4].add(f[3]);
		scale_frame.add(panel[4]);

		panel[5].add(label[8]); panel[5].add(c[2]); panel[5].add(f[4]);
		scale_frame.add(panel[5]);

		panel[6].add(label[9]); panel[6].add(label[10]); panel[6].add(label[11]);
		scale_frame.add(panel[6]);

		panel[7].add(label[12]); panel[7].add(c[3]); panel[7].add(f[5]);
		scale_frame.add(panel[7]);

		panel[8].add(label[13]); panel[8].add(c[4]); panel[8].add(f[6]);
		scale_frame.add(panel[8]);

		panel[9].add(label[14]); panel[9].add(c[5]); panel[9].add(f[7]);
		scale_frame.add(panel[9]);
		
		
		panel[10].add(con);
		scale_frame.add(panel[10]);
		scale_frame.setVisible(true);
		
			
		}

		/*public static void main(String[] args)
		{
			SwingUtilities.invokeLater(new Runnable() {
        		 public void run() {
           		 new EmployeeScale();
			System.out.println("Main Function");
         		}
      		    });
		System.out.println("Main Function_2");
		}*/
} 
