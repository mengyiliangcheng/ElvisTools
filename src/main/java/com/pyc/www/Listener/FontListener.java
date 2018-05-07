package com.pyc.www.Listener;

import com.pyc.www.controller.InitialConfig;
import com.pyc.www.model.DefaultFont;
import com.pyc.www.view.TextFont;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author pengyicheng
 * @version 1.0, 06/05/2018
 * @since 1.0.0
 */
public class FontListener implements ActionListener {
    private static DefaultFont config = InitialConfig.getResource().getDefaultFont();

    public void actionPerformed(ActionEvent e) {
        dealAction(e);
    }

    public void dealAction(ActionEvent e) {
        JMenuItem j = (JMenuItem) e.getSource();
        System.out.println(j.getText());
        TextFont font = TextFont.getInstance();
        font.setFont(j.getText());
        config.setTextFont(j.getText());
        InitialConfig.update();
    }
}