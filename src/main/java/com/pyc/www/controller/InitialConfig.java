package com.pyc.www.controller;


import com.alibaba.fastjson.JSON;
import com.pyc.www.model.SysConfigure;
import com.pyc.www.utils.Str;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/**
 * @author pengyicheng
 * @version 1.0, 06/05/2018
 * @since 1.0.0
 */
public class InitialConfig {
    private final static Logger logger = LoggerFactory.getLogger(InitialConfig.class);
    private static String  ConfigPath = System.getProperty("user.dir") + File.separator + "resource" + File.separator + "configure.json";
    private static InitialConfig initialConfig = null;
    private static SysConfigure sysConfigure = null;

    private InitialConfig(){
        logger.info(ConfigPath);
        File file = new File(ConfigPath);
        if(!file.exists() || !file.isFile()){
            logger.error("configure.json not exist!");

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
        sysConfigure = JSON.parseObject(txt,SysConfigure.class);
        logger.info("sysConfigure:" + sysConfigure);
        if(null != sysConfigure){
            if(sysConfigure.getDefaultFont().getSystemFontSize() == null){
                sysConfigure.getDefaultFont().setSystemFontSize(Str.DEFAULT_FONT_SIZE);
            }
            if(sysConfigure.getDefaultFont().getSystemFont() == null){
                sysConfigure.getDefaultFont().setSystemFont(Str.DEFAULT_FONT);
            }
            if(sysConfigure.getDefaultFont().getTextFontSize() == null){
                sysConfigure.getDefaultFont().setTextFontSize(Str.DEFAULT_FONT_SIZE);
            }
            if(sysConfigure.getDefaultFont().getTextFont() == null){
                sysConfigure.getDefaultFont().setTextFont(Str.DEFAULT_FONT);
            }
        }
    }

    public static InitialConfig getInstance(){
        if(null == initialConfig){
            initialConfig = new InitialConfig();
        }
        return initialConfig;
    }

    public static SysConfigure getResource(){
        if(null == initialConfig){
            initialConfig = new InitialConfig();
        }
        return sysConfigure;
    }


    public static void update(){
        if(null == initialConfig || null == sysConfigure){
            return;
        }
        String str = JSON.toJSONString(sysConfigure);
        File file = new File(ConfigPath);
        if(file.exists()){
            if(!file.delete()){
                logger.error("delete file error");
            }
        }
        try {
            FileOutputStream out = new FileOutputStream(ConfigPath);
            out.write(str.getBytes());
        }catch(Exception e){
            logger.error(e.getMessage());
        }

    }
}
