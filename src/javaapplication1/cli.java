/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.*;
import java.util.*;
import java.net.*;
public class cli {
    public static void main(String[] args) throws Exception{
        //enter any number from users
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number:");
        num=sc.nextInt();
        //creates socket object and send the num to server
        Socket s = new Socket("127.0.0.1",3636);
        System.out.println("Connected to Server :");
        PrintStream p=new PrintStream(s.getOutputStream());
        p.println(num);
        Scanner sc1 = new Scanner (s.getInputStream());
        int result=sc1.nextInt();
        System.out.println("Square of the number is :" + result);
        
              
    }
    
}
