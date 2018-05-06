package com.pyc.www.view;

import ch.qos.logback.core.Layout;
import com.pyc.www.controller.InitialConfig;
import com.pyc.www.controller.LayoutConfig;
import com.pyc.www.model.LayoutItemModel;
import com.pyc.www.model.LayoutModel;
import com.pyc.www.utils.FileSystemClassLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/**
 * @author pengyicheng
 * @version 1.0, 06/05/2018
 * @since 1.0.0
 */
public class FunctionFrame extends JPanel {
    private final static Logger logger = LoggerFactory.getLogger(FunctionFrame.class);
    private LayoutModel layoutModel = LayoutConfig.getResource();
    private static FunctionFrame functionFrame = null;
    private  Integer currentLayouts = 0;
    private  FunctionFrameItem currentItem = null;

    private FunctionFrame(){
        super();

        if(layoutModel == null){
            return;
        }
        setLayout(new BorderLayout());
        FunctionFrameItem item = new FunctionFrameItem(layoutModel.getBasic());
        currentLayouts = 0;
        currentItem = item;
        add(item);
    }

    public static FunctionFrame getInstance(){
        if(null == functionFrame){
            functionFrame = new FunctionFrame();
        }
        return functionFrame;
    }

    public void SwitchPanel(boolean left){
        if(!left){
            if(currentLayouts == 0){
                remove(currentItem);
                FunctionFrameItem item = new FunctionFrameItem(layoutModel.getAlgorithm());
                currentLayouts = 1;
                currentItem = item;
                add(item);
            }else if(currentLayouts == 1){
                remove(currentItem);
                FunctionFrameItem item = new FunctionFrameItem(layoutModel.getConvertion());
                currentLayouts = 2;
                currentItem = item;
                add(item);
            }else if(currentLayouts == 2){
                remove(currentItem);
                FunctionFrameItem item = new FunctionFrameItem(layoutModel.getBasic());
                currentLayouts = 0;
                currentItem = item;
                add(item);
            }else{
                return;
            }
        }else{
            if(currentLayouts == 1){
                remove(currentItem);
                FunctionFrameItem item = new FunctionFrameItem(layoutModel.getBasic());
                currentLayouts = 0;
                currentItem = item;
                add(item);
            }else if(currentLayouts == 2){
                remove(currentItem);
                FunctionFrameItem item = new FunctionFrameItem(layoutModel.getAlgorithm());
                currentLayouts = 1;
                currentItem = item;
                add(item);
            }else if(currentLayouts == 0){
                remove(currentItem);
                FunctionFrameItem item = new FunctionFrameItem(layoutModel.getConvertion());
                currentLayouts = 2;
                currentItem = item;
                add(item);
            }else{
                return;
            }
        }
        updateUI();
    }
}
