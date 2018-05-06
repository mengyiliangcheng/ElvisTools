package com.pyc.www.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import com.pyc.www.controller.*;

/**
 * @author pengyicheng
 * @version 1.0, 05/05/2018
 * @since 1.0.0
 */
public class MainMenu extends JMenuBar {

    public MainMenu(){
        super();

        setPreferredSize(new Dimension(30,30));

        Font mfont = new Font(null, Font.PLAIN,20);
        setFont(mfont);

        JMenu fileMenu = new Menu("file");
        JMenu helpMenu = new Menu("help");
        helpMenu.setFont(mfont);
        add(fileMenu);
        add(helpMenu);

        JMenu fontMenu = new Menu("font");

        ArrayList<String> fonts = new ArrayList<>();
        fonts.add("Andale Mono");
        fonts.add("consolas");
        fonts.add("宋体");
        fonts.add("Courier New");
        for(String font : fonts){
            JMenuItem fontm = new MenuItem(font);
            fontm.addActionListener(new FontListener());
            fontMenu.add(fontm);
        }

        fileMenu.add(new MenuItem("new"));
        fileMenu.add(new MenuItem("open"));
        fileMenu.addSeparator();
        fileMenu.add(fontMenu);
        fileMenu.add(new MenuItem("exit"));

        JMenu versionMenu = new Menu("version");
        JMenu hardwareMenu = new Menu("hardware");
        helpMenu.add(versionMenu);
        helpMenu.add(hardwareMenu);
    }
}

class Menu extends JMenu{
    public Menu(){
        super();
        Font mfont = SysFont.getInstance();
        setFont(mfont);
        setFont(mfont);
    }
    public Menu(String text){
        super(text);
        Font mfont = SysFont.getInstance();
        setFont(mfont);
        setFont(mfont);
    }
}

class MenuItem extends JMenuItem{
    public MenuItem(){
        super();
        Font mfont = SysFont.getInstance();
        setFont(mfont);
        setFont(mfont);
    }
    public MenuItem(String text){
        super(text);
        Font mfont = SysFont.getInstance();
        setFont(mfont);
        setFont(mfont);
    }
}