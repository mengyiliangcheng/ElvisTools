package com.pyc.www.controller;

import com.alibaba.fastjson.JSON;
import com.pyc.www.model.LayoutModel;
import com.pyc.www.utils.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author pengyicheng
 * @version 1.0, 06/05/2018
 * @since 1.0.0
 */
public class LayoutConfig {

    private final static Logger logger = LoggerFactory.getLogger(InitialConfig.class);
    private static String  ConfigPath = null;
    private static LayoutModel layoutModel = null;
    private static LayoutConfig layoutConfig = null;

    private LayoutConfig(){

        FileUtils fileUtils = new FileUtils();
        String txt = fileUtils.readFromResource("function_layout.json");
        layoutModel = JSON.parseObject(txt,LayoutModel.class);
        logger.info("sysConfigure:" + layoutModel);
    }

    public static LayoutConfig getInstance(){
        if(layoutConfig == null){
            layoutConfig = new LayoutConfig();
        }
        return layoutConfig;
    }

    public static LayoutModel getResource(){
        if(layoutConfig == null || layoutModel == null){
            layoutConfig = new LayoutConfig();
        }
        return layoutModel;
    }
}







