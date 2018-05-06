package com.pyc.www.view;

import javax.swing.*;
import java.awt.*;

/**
 * @author pengyicheng
 * @version 1.0, 06/05/2018
 * @since 1.0.0
 */
public class MidFrame extends JPanel {
    public MidFrame(){
        super();

        setLayout(new GridLayout(3,1,1,1));
        add(new Button("xxxx"));
        add(new Button("xxx"));
        add(new Button("mmmm"));
    }
}
