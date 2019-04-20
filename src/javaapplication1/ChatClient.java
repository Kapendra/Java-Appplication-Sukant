/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;
import java.awt.*;
import static java.awt.BorderLayout.SOUTH;
import java.awt.event.*;
import javax.Swing.*;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



public class ChatClient {
    String ServerAddress;
    Scanner in;
    PrintWriter out;
    JFrame frame=new JFrame("Chatter");
    JTextField textField=new JTextField(50);
    JTextArea MessageArea =new JTextArea(16,50);
     
    public ChatClient(String ServerAddress)
    {
        this.ServerAddress=ServerAddress;
        textField.setEditable(false);
        MessageArea.setEditable(false);
        frame.getContentPane().add((TextField,BorderLayout{
            return (TextField,BorderLayout;
        }.SOUTH,new JScrollPane(MessageArea));
    }   
}
