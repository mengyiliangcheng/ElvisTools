package com.pyc.www.view;

import com.pyc.www.controller.InitialConfig;
import com.pyc.www.model.DefaultFont;
import com.pyc.www.model.SysConfigure;
import com.pyc.www.utils.Str;

import java.awt.*;

/**
 * @author pengyicheng
 * @version 1.0, 06/05/2018
 * @since 1.0.0
 */
public class SysFont extends Font {
    private static SysFont font = null;
    private static DefaultFont config = InitialConfig.getResource().getDefaultFont();

    private SysFont(){
        super(config.getSystemFont(), Font.PLAIN,config.getSystemFontSize());
    }

    private SysFont(String name, int style, int size ){
        super(name,style,size);
    }

    public static  SysFont getInstance(){
        if(null == font){
            font = new SysFont();
        }
        return font;
    }
    public static SysFont setFont(String name, int style, int size ){
        if(null == font) {
            font = new SysFont(name, style, size);
        }else{
            font.name = name;
            font.style = style;
            font.size = size;
        }
        return font;
    }
    public static SysFont setFont(String name){
        if(null == font) {
            font = new SysFont(name, Font.PLAIN, config.getSystemFontSize());
        }else{
            font.name = name;
        }
        return font;
    }
}
