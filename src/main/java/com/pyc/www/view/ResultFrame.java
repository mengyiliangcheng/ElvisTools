package com.pyc.www.view;

import javax.swing.*;
import java.awt.*;

/**
 * @author pengyicheng
 * @version 1.0, 06/05/2018
 * @since 1.0.0
 */
public class ResultFrame extends JPanel {
    public ResultFrame(){
        super();

        setLayout(new BorderLayout());
        JTextArea text = new TextArea();
        text.setMargin(new Insets(5, 5, 5, 5));
        JScrollPane show_pane = new JScrollPane(text, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        add(show_pane);


    }
}
