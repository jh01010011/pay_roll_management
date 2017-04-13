import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class PaySlip{
	
	
	Date sys_date = new Date();	
	String[] list ={"Jan", "Feb", "Mar", "Apr", "May", "Jun","Jul","Aug","Sep","Oct", "Nov","Dec"};
	String[] year ={"2020","2021","2022","2023","2024","2025","2026","2027", "2028","2029","2030"};
	JLabel emp_id = new JLabel("Employee ID");
	JTextField f_id= new JTextField(20);
	JLabel mon =  new JLabel("For the Month: ");
	JComboBox mon_list= new JComboBox(list);
	JComboBox year_list= new JComboBox(year);
	JLabel en =new JLabel("Employee Name: "); 
	JTextField f_n= new JTextField(20);
	JTextField l_n= new JTextField(20);
	JLabel deg=new JLabel("Designation");
	JTextField deg_f=new JTextField(20);
	
	JButton gnr= new JButton("Generate");

		JLabel title=new JLabel("ABC CORPORATION");
		JLabel date=new JLabel("Date: ");
		JTextField date_f= new JTextField(20);
		JLabel s_s=new JLabel("Salary Slip: ");
		JTextField s_s_f= new JTextField(20);
		JLabel bp=new JLabel("Basic Pay: ");
		JTextField bp_f= new JTextField(20);
		JLabel title2=new JLabel("********ALLOWANCE**********");
		JLabel da=new JLabel("DA: ");
		JTextField da_f= new JTextField(20);
		JLabel hra=new JLabel("HRA: ");
		JTextField hra_f= new JTextField(20);
		JLabel wa=new JLabel("WA: ");
		JTextField wa_f= new JTextField(20);
		JLabel ta=new JLabel("Total ALLOWANCE: ");
		JTextField ta_f= new JTextField(20);
		JLabel title3=new JLabel("**********DEDUCTION*******");
		JLabel gpf=new JLabel("GPF: ");
		JTextField gpf_f= new JTextField(20);
		JLabel it=new JLabel("IT: ");
		JTextField it_f= new JTextField(20);
		JLabel gis=new JLabel("GIS: ");
		JTextField gis_f= new JTextField(20);
		JLabel td=new JLabel("Total Deduction: ");
		JTextField td_f= new JTextField(20);
		JLabel ns=new JLabel("Net Salary: ");
		JTextField ns_f= new JTextField(20);

		JFrame p_frame=new JFrame("PaySlip");
		

		JPanel[] panel= new JPanel[20];
	
	void generator(){
			
		panel[4].add(title);
		panel[5].add(date);
		panel[5].add(date_f);
		panel[6].add(s_s);
		panel[6].add(s_s_f);
		panel[7].add(bp);
		panel[7].add(bp_f);
		panel[8].add(title2);
		//panel[5].add(date_f);
		panel[9].add(da);
		panel[9].add(da_f);
		panel[10].add(hra);
		panel[10].add(hra_f);
		panel[11].add(wa);
		panel[11].add(wa_f);
		panel[12].add(ta);
		panel[12].add(ta_f);
		panel[13].add(title3);
		//panel[13].add(date_f);
		panel[14].add(gpf);
		panel[14].add(gpf_f);
		panel[15].add(it);
		panel[15].add(it_f);
		panel[16].add(gis);
		panel[16].add(gis_f);
		panel[17].add(td);
		panel[17].add(td_f);
		panel[18].add(ns);
		panel[18].add(ns_f);		
		p_frame.setSize(600,800);
		p_frame.setLayout(new GridLayout(19,1));
		for(int i=4; i<=18;i++)
			{
				p_frame.add(panel[i]);			
			}
		p_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
	}
	public PaySlip()
		{
			for(int i=0; i<20;i++){
				panel[i]= new JPanel(new FlowLayout());
				}
			panel[0].add(emp_id);
			panel[0].add(f_id);
			panel[0].add(mon);
			panel[0].add(mon_list);
			panel[0].add(year_list);
			//panel[1]= new JPanel(new FlowLayout());
			panel[1].add(en);
			panel[1].add(f_n);
			panel[1].add(l_n);
			//panel[2]= new JPanel(new FlowLayout());
			panel[2].add(deg);
			panel[2].add(deg_f);
			//panel[3]= new JPanel(new FlowLayout());
			panel[3].add(gnr);

			gnr.addActionListener(new ActionListener() {
         		public void actionPerformed(ActionEvent ae) {
				generator();
         		     }
                      });
			
			//panel[2].add(deg_f);
			
			
			

			p_frame.setSize(600,200);
			p_frame.setLayout(new GridLayout(4,1));
			p_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			p_frame.add(panel[0]);
			p_frame.add(panel[1]);
			p_frame.add(panel[2]);
			p_frame.add(panel[3]);
			p_frame.setVisible(true);
					
		}
		
		/*public static void main(String[] args)
		{
			SwingUtilities.invokeLater(new Runnable() {
        		 public void run() {
           		 new PaySlip();
			//System.out.println("Main Function");
         		}
      		    });
		//System.out.println("Main Function_2");
		}  */
}	
