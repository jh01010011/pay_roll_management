import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Test_Key extends JFrame {
  public Test_Key() throws HeadlessException {
    setSize(200, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout(FlowLayout.LEFT));

    JLabel usernameLabel = new JLabel("Username: ");
    JTextField usernameTextField = new JTextField();
    usernameTextField.setPreferredSize(new Dimension(100, 20));
    add(usernameLabel);
    add(usernameTextField);
	KeyListener k;
	usernameTextField.addKeyListener(k=new Test_Key2());
		{
			
		}
    
	
	/*usernameTextField.addKeyListener(new KeyAdapter() {
      public void keyReleased(KeyEvent e) {
        JTextField textField = (JTextField) e.getSource();
        String text = textField.getText();
        textField.setText(text.toUpperCase());
      }

      public void keyTyped(KeyEvent e) {
      }

      public void keyPressed(KeyEvent e) {
      }
    }); */
  }

  public static void main(String[] args) {
    new Test_Key().setVisible(true);
  }
}