package com.pyc.www.model;

/**
 * @author pengyicheng
 * @version 1.0, 06/05/2018
 * @since 1.0.0
 */
public class LayoutItemModel {
    private String  name;
    private Integer enable;
    private String  className;
    private String icon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "LayoutItemModel{" +
                "name='" + name + '\'' +
                ", enable=" + enable +
                ", className='" + className + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
}
