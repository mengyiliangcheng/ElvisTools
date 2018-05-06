package com.pyc.www.model;

/**
 * @author pengyicheng
 * @version 1.0, 06/05/2018
 * @since 1.0.0
 */
public class DefaultFont {
    private String SystemFont = null;
    private Integer SystemFontSize = null;
    private String TextFont = null;
    private Integer TextFontSize = null;

    public String getSystemFont() {
        return SystemFont;
    }

    public void setSystemFont(String systemFont) {
        SystemFont = systemFont;
    }

    public Integer getSystemFontSize() {
        return SystemFontSize;
    }

    public void setSystemFontSize(Integer systemFontSize) {
        SystemFontSize = systemFontSize;
    }

    public String getTextFont() {
        return TextFont;
    }

    public void setTextFont(String textFont) {
        TextFont = textFont;
    }

    public Integer getTextFontSize() {
        return TextFontSize;
    }

    public void setTextFontSize(Integer textFontSize) {
        TextFontSize = textFontSize;
    }

    @Override
    public String toString() {
        return "DefaultFont{" +
                "SystemFont='" + SystemFont + '\'' +
                ", SystemFontSize=" + SystemFontSize +
                ", TextFont='" + TextFont + '\'' +
                ", TextFontSize=" + TextFontSize +
                '}';
    }
}
