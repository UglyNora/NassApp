package com.search_engine.nassapp;

//A standalone GUI search engine app- stub user interface.
//Written by Mac Wiener, Valrico FL, 2019


import java.awt.*;
import javax.swing.*;


public class NassApp extends JFrame
{

    public NassApp()
    {
        JFrame frame = new JFrame ("NASS Engine");
        Container container = frame.getContentPane();
        container.setLayout(new FlowLayout());

        JLabel label = new JLabel ("NASS");
        JTextField textfield = new JTextField();
        JButton button = new JButton ();

        container.add (label);
        container.add (textfield);
        container.add (button);

        frame.setSize (500, 500);
        frame.setVisible (true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }




}
class HouseKeeping{
    public static void main ( String args[])
    {
        //open file/database to be searched.

        NassApp obj = new NassApp();

        //close file/database, add or delete files.


    }
}
