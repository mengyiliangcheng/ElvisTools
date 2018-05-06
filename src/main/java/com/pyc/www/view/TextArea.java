package com.pyc.www.view;

import javax.swing.*;
import java.awt.*;

/**
 * @author pengyicheng
 * @version 1.0, 06/05/2018
 * @since 1.0.0
 */
public class TextArea extends JTextArea {
    public TextArea(){
        super();
        Font mfont = SysFont.getInstance();
        setFont(mfont);
        setFont(mfont);
    }
    public TextArea(int rows, int columns){
        super(rows,columns);
        Font mfont = SysFont.getInstance();
        setFont(mfont);
        setFont(mfont);
    }
}
