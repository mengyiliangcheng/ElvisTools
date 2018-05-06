package com.pyc.www.view;

import com.pyc.www.Listener.SwitchLeftPanel;
import com.pyc.www.controller.LayoutConfig;
import com.pyc.www.controller.MidLayoutConfig;
import com.pyc.www.model.LayoutItemModel;
import com.pyc.www.model.LayoutModel;
import com.pyc.www.model.MidLayoutModel;
import com.pyc.www.utils.FileSystemClassLoader;

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
public class MidFrame extends JPanel {
    private MidLayoutModel layoutModel = MidLayoutConfig.getResource();
    private static String  rootPath = System.getProperty("user.dir");

    public MidFrame(){
        super();

        setLayout(new GridLayout(3,1,1,1));
        //Button button = new Button("switch");
        //button.addActionListener(new SwitchLeftPanel());
        //add(button);
        //add(new Button("xxx"));
        //add(new Button("mmmm"));

        List<LayoutItemModel> lists = layoutModel.getMiddle();
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
}
