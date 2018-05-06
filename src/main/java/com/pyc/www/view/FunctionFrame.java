package com.pyc.www.view;

import javax.swing.*;
import java.awt.*;

/**
 * @author pengyicheng
 * @version 1.0, 06/05/2018
 * @since 1.0.0
 */
public class FunctionFrame extends JPanel {

    public FunctionFrame(){
        super();

        setLayout(new BorderLayout());
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 4, 4, 4));
        for(int i =0;i < 10;i ++){
            buttonPanel.add(new Button("button"));
        }

        JPanel buttonPane2 = new JPanel();
        buttonPane2.setLayout(new GridLayout(3, 4, 4, 4));
        for(int i =0;i < 10;i ++){
            buttonPane2.add(new Button("button"));
        }

        JPanel buttonPane3 = new JPanel();
        buttonPane3.setLayout(new GridLayout(3, 4, 4, 4));
        for(int i =0;i < 10;i ++){
            buttonPane3.add(new Button("button"));
        }

        add(buttonPanel);
        add(buttonPane2);
        add(buttonPane3);
    }
}
