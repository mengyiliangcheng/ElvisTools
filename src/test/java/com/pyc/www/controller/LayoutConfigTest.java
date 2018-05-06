package com.pyc.www.controller;

import com.pyc.www.model.LayoutModel;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author pengyicheng
 * @version 1.0, 06/05/2018
 * @since 1.0.0
 */
public class LayoutConfigTest {

    @Test
    public void layoutTest(){
        LayoutConfig layoutConfig = LayoutConfig.getInstance();
        LayoutModel layoutModel = LayoutConfig.getResource();
    }
}