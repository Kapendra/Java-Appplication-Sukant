/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Kapendra
 */
import javax.swing.*;
import java.awt.*;

public class BrowserSample {
    private static Object browser;
    private static Object borderLayout;
    public static void main(String[] args){
        Browser broswer=new Browser();
        BrowserView browserView=new browserView(browser);
        JFrame frame=new JFrame("JxBrowser");
        frame.add(browserView, borderLayout.CENTER);
        frame.setSize(700,500);
        frame.setVisible(true);
        browser.loadURL("http://www.google.com");
    }
    
    
}
