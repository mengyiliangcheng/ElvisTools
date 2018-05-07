package com.pyc.www.utils;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author pengyicheng
 * @version 1.0, 07/05/2018
 * @since 1.0.0
 */
public class FileUtilsTest {

    @Test
    public void readResourceTest(){
        FileUtils fileUtils = new FileUtils();
        String str = fileUtils.readFromResource("configure.json");
        System.out.println(str);
        Assert.assertTrue(str != null);
    }

}