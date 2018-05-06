package com.pyc.www.view;

import com.pyc.www.controller.LayoutConfig;
import com.pyc.www.model.LayoutItemModel;
import com.pyc.www.model.LayoutModel;
import com.pyc.www.utils.FileSystemClassLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;

/**
 * @author pengyicheng
 * @version 1.0, 06/05/2018
 * @since 1.0.0
 */
public class FunctionFrameItem extends JPanel {
    private final static Logger logger = LoggerFactory.getLogger(FunctionFrame.class);
    private LayoutModel layoutModel = LayoutConfig.getResource();
    private static String  rootPath = System.getProperty("user.dir");
    List<LayoutItemModel> layouts = null;

    public FunctionFrameItem(){
        super();
    }

    public FunctionFrameItem(List<LayoutItemModel> layoutItemModels){
        super();

        if(null == layoutItemModels){
            return ;
        }
        SetLayoutItems(layoutItemModels);

        setLayout(new GridLayout(3, 4, 4, 4));

        List<LayoutItemModel> lists = layouts;
        Iterator<LayoutItemModel> it = lists.iterator();
        while(it.hasNext()){
            LayoutItemModel layoutItemModel = (LayoutItemModel)it.next();
            if(layoutItemModel.getEnable() == 1) {
                Button button = new Button(layoutItemModel.getName());

                /**reflect to find action listener*/
                FileSystemClassLoader fileSystemClassLoader = new FileSystemClassLoader(rootPath);
                try{
                    Class<?> class1 = fileSystemClassLoader.loadClass(layoutItemModel.getClassName());
                    Object obj1 = class1.newInstance();
                    button.addActionListener((ActionListener)obj1);
                }catch (Exception e){
                    e.printStackTrace();
                }
                add(button);
            }
        }
    }

    public void SetLayoutItems(List<LayoutItemModel> layoutItemModels){
        layouts = layoutItemModels;
    }
}
