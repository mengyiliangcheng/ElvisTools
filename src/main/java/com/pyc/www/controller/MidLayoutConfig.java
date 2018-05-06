package com.pyc.www.controller;

import com.alibaba.fastjson.JSON;
import com.pyc.www.model.LayoutModel;
import com.pyc.www.model.MidLayoutModel;
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
public class MidLayoutConfig {

    private final static Logger logger = LoggerFactory.getLogger(InitialConfig.class);
    private static String  ConfigPath = System.getProperty("user.dir") + File.separator + "resource" + File.separator + "middle_layout.json";
    private static MidLayoutModel layoutModel = null;
    private static MidLayoutConfig layoutConfig = null;

    private MidLayoutConfig(){
        logger.info(ConfigPath);
        File file = new File(ConfigPath);
        if(!file.exists() || !file.isFile()){
            logger.error("function_layout.json not exist!");
        }
        String txt = "";
        try {
            InputStreamReader reader = new InputStreamReader(new FileInputStream(file), "utf-8");
            BufferedReader br = new BufferedReader(reader);

            String tmp;
            while((tmp = br.readLine()) != null){
                txt = txt + tmp;
            }
            reader.close();
        }catch (Exception e){
            logger.error(e.getMessage());
            return ;
        }
        layoutModel = JSON.parseObject(txt,MidLayoutModel.class);
        logger.info("sysConfigure:" + layoutModel);
    }

    public static MidLayoutConfig getInstance(){
        if(layoutConfig == null){
            layoutConfig = new MidLayoutConfig();
        }
        return layoutConfig;
    }

    public static MidLayoutModel getResource(){
        if(layoutConfig == null || layoutModel == null){
            layoutConfig = new MidLayoutConfig();
        }
        return layoutModel;
    }
}







