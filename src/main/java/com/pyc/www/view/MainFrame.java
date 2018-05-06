package com.pyc.www.view;

import com.pyc.www.utils.Str;

import javax.swing.*;
import java.awt.*;

/**
 * @author pengyicheng
 * @version 1.0, 05/05/2018
 * @since 1.0.0
 */
public class MainFrame extends JFrame {
    private final int WIDTH = 1200;
    private final int HEIGHT = 800;

    public MainFrame(){
        super();
        setTitle(Str.AUTHOR + Str.VERSION);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setResizable(true);
        setLayout(new GridLayout(1,2));

        JMenuBar menu = new MainMenu();
        setJMenuBar(menu);

        add(new ResultFrame());
        add(new OperationFrame());
        pack();
    }
}
