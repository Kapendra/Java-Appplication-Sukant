/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Mywindow1 extends JFrame implements ActionListener  {
    private JLabel lblUser,lblpass;
    private JTextField txtUser,txtpass;
    private JButton btnLogin,btnExit;
    private JPanel p;
    private Object lbl;
    
    public Mywindow1(){
    setTitle("My Login windoow");
    setIconImage(Toolkit.getDefaultToolkit().getImage("i4.jpg"));
    p=new JPanel();
    p.setBackground(Color.lightGray);
    p.setLayout(null);
    lblUser=new JLabel("User ID");
    lblUser.setForeground(Color.BLUE);
    lblUser.setBounds(40,50,100,24);
    lblpass=new JLabel("password");
    lblpass.setForeground(new Color (51,51,255));
    lblpass.setBounds(40,90,100,24);
    txtUser=new JTextField(15);
    txtUser.setBounds(150,90,190,30);
    txtpass=new JTextField(15);
    txtpass.setBounds(150,90,190,30);
    btnLogin=new JButton("Login");
    btnLogin.setForeground(new Color(100,140,140));
    btnLogin.setBounds(150,136,70,30);
    btnExit=new JButton("Exit");
    btnExit.setForeground(Color.RED);
    btnExit.setBounds(230,136,70,30);
    
    btnLogin.addActionListener(this);
    btnExit.addActionListener(this);

    p.add(btnLogin);
    p.add(btnExit);
    p.add(lblUser);
    p.add(lblpass);
    p.add(txtUser);
    p.add(txtpass);
    
    add(p);
    setSize(450,250);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    }
        public static void main(String[] args){
        
            new Mywindow1();
	
}
   
      public void actionPerformed(ActionEvent e){
       
           String str=e.getActionCommand();
           if(str .equals("Login"))
   JOptionPane.showMessageDialog(null,"welcome to my system");
    else if(str.equals("exit"))
    System.exit(0); 

}
}        
        
        

     
    
    

    






      

    
        
        

     
    
    

    


