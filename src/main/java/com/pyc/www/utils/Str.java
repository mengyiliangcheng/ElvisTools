package com.pyc.www.utils;

import com.pyc.www.view.SysFont;

/**
 * @author pengyicheng
 * @version 1.0, 05/05/2018
 * @since 1.0.0
 */
public class Str {

    private static Str str = null;
    public static String AUTHOR  = "PengYiCheng";
    public static String VERSION = "1.0";
    public static int DEFAULT_FONT_SIZE = 20;
    public static String DEFAULT_FONT = "Andale Mono";

    private Str(){

    }
    public static Str getInstance(){
        if(str == null){
            str = new Str();
        }
        return str;
    }

}
