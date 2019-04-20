/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.awt.PopupMenu;
import javax.swing.JFrame;
import javax.swing.JButton;
        public class FirstSwingDemo {
            public static final int WIDTH=300;
            public static final int HEIGHT=200;
    private static Object endButtton;
            public static void main(String[] args)
            {
                JFrame firstWindow=new JFrame();
                firstWinbdow.setSize(WIDTH,HEIGHT);
                firstWindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                EndingListener buttonEar=new EndingListener();
                endButtton.addActionListener(buttonEar);
                firstWindow.add(endButton);
                firstWindow.setVisible(true);
            }
    
}
