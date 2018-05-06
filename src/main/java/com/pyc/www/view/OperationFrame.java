package com.pyc.www.view;

import javax.swing.*;
import java.awt.*;

/**
 * @author pengyicheng
 * @version 1.0, 06/05/2018
 * @since 1.0.0
 */
public class OperationFrame extends JPanel {

    public OperationFrame(){
        super();

        setLayout(new GridLayout(3,1,4,4));

        add(new InputFrame());
        add(new MidFrame());
        add(FunctionFrame.getInstance());
    }
}
