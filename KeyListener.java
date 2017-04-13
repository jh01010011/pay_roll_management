/*import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test_Key2 {
  //public static void main(String args[]) throws Exception {
    //JFrame frame = new JFrame();
    //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	int keyCode;
    //JTextField nameTextField = new JTextField();
    //frame.add(nameTextField, BorderLayout.NORTH);
	
	public KeyListener(){
   // KeyListener keyListener = new KeyListener() {
      public void keyPressed(KeyEvent keyEvent) {
        printIt("Pressed", keyEvent);
      }

      public void keyReleased(KeyEvent keyEvent) {
        //printIt("Released", keyEvent);
      }

      public void keyTyped(KeyEvent keyEvent) {
        //printIt("Typed", keyEvent);
      }

      private void printIt(String title, KeyEvent keyEvent) {
        keyCode = keyEvent.getKeyCode();
        //String keyText = KeyEvent.getKeyText(keyCode);
       // System.out.println(title + " : " + keyText + " / " + keyEvent.getKeyChar());
      }
   // };
	}
	int return_Char_value(){
		return keyCode;
	}
	//return keyCode;
  // }

//   nameTextField.addKeyListener(keyListener);


    //frame.setSize(250, 100);
    //frame.setVisible(true);
  //}
}