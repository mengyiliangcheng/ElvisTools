package com.pyc.www.Listener;

import com.pyc.www.view.FunctionFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author pengyicheng
 * @version 1.0, 06/05/2018
 * @since 1.0.0
 */
public class SwitchRightPanel implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        FunctionFrame functionFrame = FunctionFrame.getInstance();
        functionFrame.SwitchPanel(false);
    }
}
