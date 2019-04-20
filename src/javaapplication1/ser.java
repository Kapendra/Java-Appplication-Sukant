/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.*;
import java.util.*;
import java.net.*;

public class ser {
    public static void main(String[] args) throws Exception
    {
        ServerSocket ss =new ServerSocket(3636);
        System.out.println("Server is ready...");
        Socket s =ss.accept();
        Scanner sc=new Scanner(s.getInputStream());
        int num=sc.nextInt();
        System.out.println("Number received is :"+num);
        //calculate square
        int result=num*num;
        System.out.println("Square of the number is :"+result);
        //pass the result to client
        PrintStream P=new PrintStream(s.getOutputStream());
        P.println(result);
        
    }
    
}
