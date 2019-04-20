/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JButton;




public class FirstWindow extends JFrame
{

    public static final int HEIGHT = 200;
    public static final int WIDTH = 300;

    /**
     * Constructor for objects of class FirstWindow. 
     */
    public FirstWindow()
    {
       super();
       setSize(WIDTH, HEIGHT);
       setTitle("The First Window");
       
       // Exist the program when we press the Close button
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       // Create button, add 
       JButton endButton = new JButton("Click to end program.");
       eventHandler(endButton);
       add(endButton);
       
       // Make everything visible
       setVisible(true);
    }
    
    /**
     * This method implements and attached an action listener
     */
    public void eventHandler(JButton myButton)
    {
        myButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
    }
        public static void main(String[] args){
            
        }
}
