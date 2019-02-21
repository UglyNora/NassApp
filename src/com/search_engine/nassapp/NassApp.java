
package com.search_engine.nassapp;

//A standalone GUI search engine app- stub user interface.
//Written by Mac Wiener, Valrico FL, 2019


import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//import java.awt.font;

public class NassApp extends JFrame implements ActionListener//User's View
{

    public NassApp()
    {
        JFrame frame = new JFrame ("NASS Engine");
        Container container = frame.getContentPane();
        container.setLayout(new FlowLayout());
        JLabel label = new JLabel ("NASS");
        JTextField textfield = new JTextField( 28);
        JButton button = new JButton ("Search");
        JRadioButton radiobutton = new JRadioButton();
        JLabel label2 = new JLabel ("All Search Values");
        JRadioButton radiobutton2 = new JRadioButton();
        JLabel label3 = new JLabel ("Any Search Values");
        JRadioButton radiobutton3 = new JRadioButton();
        JLabel label4 = new JLabel ("Exact Match");
        JButton button2 = new JButton ("Maintenance...");
        JButton button3 = new JButton ("About...");

        button2.addActionListener(this);
        button3.addActionListener(this);

        container.add (label);
        container.add (textfield);
        container.add (button);
        container.add (radiobutton);
        container.add (label2);
        container.add (radiobutton2);
        container.add (label3);
        container.add (radiobutton3);
        container.add (label4);
        container.add (button2);
        container.add (button3);


        label.setFont (new Font("Futura", Font.BOLD,30));
        button.setFont (new Font("Futura",Font.BOLD, 15));
        frame.setSize (550, 200);
        frame.setVisible (true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


     public void actionPerformed(ActionEvent e) {
         if (e.getActionCommand().equals("Maintenance...")) {
             JFrame frame = new JFrame ("NASS Engine Admin");
             Container container2 = frame.getContentPane();
             container2.setLayout(new FlowLayout());
             JLabel label = new JLabel ("NASS Admin");
             JTextField textfield = new JTextField( 550);
             JLabel label2 = new JLabel ("File Name");
             JLabel label3 = new JLabel ("Status");
             JButton button = new JButton ("Add File...");
             JButton button2 = new JButton ("Rebuild Out-of-Date");
             JButton button3 = new JButton ("Remove Selected Files");
             JButton button4 = new JButton ("Reset Windows");
             JLabel label4 = new JLabel ("Number of files indexed: 0");
             JLabel label5 = new JLabel ("Nass Engine version 1.1");


             container2.add (label);
             container2.add (textfield);
             container2.add (label2);
             container2.add (label3);
             container2.add (button);
             container2.add (button2);
             container2.add (button3);
             container2.add (button4);
             container2.add (label4);
             container2.add (label5);

             label.setFont (new Font("Futura", Font.BOLD,30));
             frame.setSize (550, 200);
             frame.setVisible (true);
             frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


         }
         else if (e.getActionCommand().equals("About...")) {
           JLabel label = new JLabel("     NASS Engine triumphs over GOOGLE!" );
           JFrame frame = new JFrame ("NASS Engine");
           Container container3 = frame.getContentPane();
           container3.add (label);
           label.setFont (new Font("Futura", Font.BOLD,20));
           frame.setSize (550, 200);
           frame.setVisible (true);
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         }

     }
         public static void main (String args[])
         {
             //open file/database to be searched.

             NassApp obj = new NassApp();

             //close file/database, add or delete files.


         }
     }
