package com.pyc.www;

import com.pyc.www.view.MainFrame;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        MainFrame mainFrame = new MainFrame();

        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }
}
