import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;


public class Employee
{
	private String f_name;
	private String l_name;
	private String dob;
	private String gender; 
	private String id;
	private String designation;
	private String join_date;
	
	private String contact_number;
	private String address;
	
	JLabel[] label= new JLabel[9];
	JTextField[] f =new JTextField[18];
	JPanel[] panel =new JPanel[12];
	JButton next;

	public Employee()
	{
		label[0]=new JLabel("First Name: ");
		//label.setSize()
		label[1]=new JLabel("Last Name: ");
		label[2]=new JLabel("Date of Birth: ");
		label[3]=new JLabel("Gender: ");
		label[4]=new JLabel("Employee ID: ");
		label[5]=new JLabel("Designation: ");
		label[6]=new JLabel("Joining Date: ");
		label[7]=new JLabel("Contact Number: ");
		label[8]=new JLabel("Address: ");

		JRadioButton mButton = new JRadioButton("Male");

       		JRadioButton fButton = new JRadioButton("Female");
   
		ButtonGroup group = new ButtonGroup();
    		group.add(mButton);
    		group.add(fButton);


		for(int i=0; i<12; i++)
			{
				if(i<12)
				{
					panel[i] = new JPanel();
      					panel[i].setLayout(new FlowLayout());
					f[i]=new JTextField(20);
				}
				else
				{
					//f[i]=new JTextField(5);
				}
			}
		next = new JButton("Next");	
		next.setPreferredSize(new Dimension(120, 40));	
		JFrame emp_frame =new JFrame("Add Employee");
		emp_frame.setLayout(new GridLayout(10,1));
		emp_frame.setSize(600,800);
		emp_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for(int i=0; i<9; i++)
			{	
				
				if(i==3)
				{
					panel[i].add(label[i]);
					panel[i].add(mButton);
					panel[i].add(fButton);				
				}
				else
				{
				panel[i].add(label[i]);
				panel[i].add(f[i]);
				}
			}

				for(int i=0; i<9; i++)
			{	
				emp_frame.add(panel[i]);
			}

		next.addActionListener(new ActionListener() {
         		public void actionPerformed(ActionEvent ae) {
				
				MainMenu.mainframe.setVisible(false);
				new EmployeeScale();
			}
     		 });
		panel[9].add(next);
		emp_frame.add(panel[9]);
		emp_frame.setVisible(true);
		
		
	}
	
	public static void main(String[] args)
		{
			SwingUtilities.invokeLater(new Runnable() {
        		 public void run() {
           		 new Employee();
			System.out.println("Main Function");
         		}
      		    });
		System.out.println("Main Function_2");
		}

}
