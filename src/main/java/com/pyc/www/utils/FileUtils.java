package com.pyc.www.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author pengyicheng
 * @version 1.0, 07/05/2018
 * @since 1.0.0
 */
public class FileUtils {

    public FileUtils(){
    }
    public byte[] readFromBinaryResource(String path){
        if(path == null){
            return null;
        }
        InputStream in = getClass().getClassLoader().getResourceAsStream(path);

        byte[] txt = null;
        try {
            txt = new byte[in.available()];
            in.read(txt);
            in.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return txt;
    }

    public String readFromResource(String path){
        if(path == null){
            return path;
        }
        InputStream in = getClass().getClassLoader().getResourceAsStream(path);

        String txt = "";
        try {
            InputStreamReader reader = new InputStreamReader(in,"utf-8");
            BufferedReader br = new BufferedReader(reader);

            String tmp;
            while ((tmp = br.readLine()) != null) {
                txt = txt + tmp;
            }
            reader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return txt;
    }
}
