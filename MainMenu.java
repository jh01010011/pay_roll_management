import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class MainMenu{
	JButton button_1, button_2, button_3, button_4;
	JButton[] button = new JButton[4];
	static JFrame mainframe= new JFrame("Main Menu");
	public MainMenu()
	{
		System.out.println("Main Menu");
		button[0]=new JButton("Add Employee");
		button[1]=new JButton("Edit Employee");
		button[2]=new JButton("Delete Employee");
		button[3]=new JButton("Print PaySlip");

		JPanel[] panel=new JPanel[10];
		JFrame mainframe= new JFrame("Main Menu");
		mainframe.setLayout(new GridLayout(4,1));
		mainframe.setSize(500,300);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for(int i=0;i<4;i++)
			{
			panel[i]= new JPanel(new FlowLayout());
			button[i].setPreferredSize(new Dimension(150, 50));
			panel[i].add(button[i]);
			mainframe.add(panel[i]);
			}
		mainframe.setVisible(true);
		System.out.println("Aftervisible");
		button[0].addActionListener(new ActionListener() {
         		public void actionPerformed(ActionEvent ae) {
				
				MainMenu.mainframe.setVisible(false);
				new Employee();
			}
     		 });

		button[1].addActionListener(new ActionListener() {
         		public void actionPerformed(ActionEvent ae) {
				
				//MainMenu.mainframe.setVisible(false);
				//new Employee();
			}
     		 });

		button[2].addActionListener(new ActionListener() {
         		public void actionPerformed(ActionEvent ae) {
				
				//MainMenu.mainframe.setVisible(false);
				//new Employee();
			}
     		 });

		button[3].addActionListener(new ActionListener() {
         		public void actionPerformed(ActionEvent ae) {
				
				MainMenu.mainframe.setVisible(false);
				new PaySlip();
			}
     		 });

      		
		
	}
	
	public static void main(String[] args)
		{
			SwingUtilities.invokeLater(new Runnable() {
        		 public void run() {
           		 new MainMenu();
			System.out.println("Main Function");
         		}
      		    });
		System.out.println("Main Function_2");
		}
}
