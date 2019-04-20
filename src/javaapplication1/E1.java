/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;

public class E1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x,y,div;
        
        try
                {
                  System.out.println("Enter the first Number: ");
                  x=sc.nextInt();
                  System.out.println("Enter the second number : ");
                  y=sc.nextInt();
                  div=x/y;
                  System.out.println("Divison:"+div);
                  
                         
                
        
        
    }
       
        catch(Exception e ) {
            System.out.println("You cannot use zero for second number.");
        }
        finally{
            System.out.println("It is right answer.");
        }
    

    }

  
    }
