package com.pyc.www.model;

import java.util.List;

/**
 * @author pengyicheng
 * @version 1.0, 06/05/2018
 * @since 1.0.0
 */
public class LayoutModel {
    private List<LayoutItemModel> basic;
    private List<LayoutItemModel> algorithm;
    private List<LayoutItemModel> convertion;

    public List<LayoutItemModel> getBasic() {
        return basic;
    }

    public void setBasic(List<LayoutItemModel> basic) {
        this.basic = basic;
    }

    public List<LayoutItemModel> getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(List<LayoutItemModel> algorithm) {
        this.algorithm = algorithm;
    }

    public List<LayoutItemModel> getConvertion() {
        return convertion;
    }

    public void setConvertion(List<LayoutItemModel> convertion) {
        this.convertion = convertion;
    }

    @Override
    public String toString() {
        return "LayoutModel{" +
                "basic=" + basic +
                ", algorithm=" + algorithm +
                ", convertion=" + convertion +
                '}';
    }
}
