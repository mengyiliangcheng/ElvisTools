package com.pyc.www.view;

import com.pyc.www.controller.InitialConfig;
import com.pyc.www.model.DefaultFont;
import com.pyc.www.utils.Str;

import java.awt.*;

/**
 * @author pengyicheng
 * @version 1.0, 06/05/2018
 * @since 1.0.0
 */
public class TextFont extends Font {
    private static TextFont textFont = null;
    private static DefaultFont config = InitialConfig.getResource().getDefaultFont();

    private TextFont(){
        super(config.getTextFont(), Font.PLAIN,config.getTextFontSize());
    }

    private TextFont(String name,int style,int size){
        super(name,style,size);
    }

    public static TextFont getInstance(){
        if(null == textFont){
            textFont = new TextFont();
        }
        return textFont;
    }
    public TextFont setFont(String name,int style,int size){
        if(null == textFont){
            textFont = new TextFont(name,style,size);
        }else{
            textFont.name = name;
            textFont.style = style;
            textFont.size = size;
        }
        return textFont;
    }
    public TextFont setFont(String name){
        if(null == textFont){
            textFont = new TextFont(name, Font.PLAIN, config.getTextFontSize());
        }else{
            textFont.name = name;
        }
        return textFont;
    }
}
