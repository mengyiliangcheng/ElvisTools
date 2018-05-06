package com.pyc.www.model;

import java.util.List;

/**
 * @author pengyicheng
 * @version 1.0, 07/05/2018
 * @since 1.0.0
 */
public class MidLayoutModel {
    private List<LayoutItemModel> middle;

    public List<LayoutItemModel> getMiddle() {
        return middle;
    }

    public void setMiddle(List<LayoutItemModel> middle) {
        this.middle = middle;
    }

    @Override
    public String toString() {
        return "MidLayoutModel{" +
                "middle=" + middle +
                '}';
    }
}
