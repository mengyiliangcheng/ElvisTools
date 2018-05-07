package com.pyc.www.view;

import com.pyc.www.controller.LayoutConfig;
import com.pyc.www.model.LayoutItemModel;
import com.pyc.www.model.LayoutModel;
import com.pyc.www.utils.FileSystemClassLoader;
import com.pyc.www.utils.FileUtils;
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
            LayoutItemModel layoutItemModel = it.next();
            if(layoutItemModel.getEnable() == 1) {
                JButton button = new JButton(layoutItemModel.getName());

                /**reflect to find action listener*/
                FileSystemClassLoader fileSystemClassLoader = new FileSystemClassLoader(rootPath);
                try{
                    Class<?> class1 = fileSystemClassLoader.loadClass(layoutItemModel.getClassName());
                    Object obj1 = class1.newInstance();
                    button.addActionListener((ActionListener)obj1);
                }catch (Exception e){
                    e.printStackTrace();
                }

                /**set icon*/
                if(layoutItemModel.getIcon() != null && layoutItemModel.getIcon().length() > 1){
                    FileUtils fileUtils = new FileUtils();
                    ImageIcon icon = new ImageIcon(fileUtils.readFromBinaryResource("icons/"+layoutItemModel.getIcon()));
                    if(icon != null) {
                        logger.info("set icon");
                        button.setIcon(icon);
                        button.setBounds(900, 380, 380, 270);
                        button.setHorizontalTextPosition(SwingConstants.CENTER);

                        button.setContentAreaFilled(true);//设置图片填满按钮所在的区域
                        button.setMargin(new Insets(0, 0, 0, 0));//设置按钮边框和标签文字之间的距离
                        button.setFocusPainted(false);//设置这个按钮是不是获得焦点

                    }
                }

                /**set others*/
                button.setFont(SysFont.getInstance());
                button.setToolTipText(layoutItemModel.getDescription());
                //button.setOpaque(false);//设置控件是否透明，true为不透明，false为透明
                button.setBackground(Color.darkGray);
                button.setForeground(Color.WHITE);
                button.setBorderPainted(false);//设置是否绘制边框
                add(button);
            }
        }
    }

    public void SetLayoutItems(List<LayoutItemModel> layoutItemModels){
        layouts = layoutItemModels;
    }
}
