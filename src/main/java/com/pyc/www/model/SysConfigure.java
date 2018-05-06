package com.pyc.www.model;

/**
 * @author pengyicheng
 * @version 1.0, 06/05/2018
 * @since 1.0.0
 */
public class SysConfigure {
    private String AppName = null;
    private String AppVersion = null;
    private DefaultFont defaultFont = null;

    public String getAppName() {
        return AppName;
    }

    public void setAppName(String appName) {
        AppName = appName;
    }

    public String getAppVersion() {
        return AppVersion;
    }

    public void setAppVersion(String appVersion) {
        AppVersion = appVersion;
    }

    public DefaultFont getDefaultFont() {
        return defaultFont;
    }

    public void setDefaultFont(DefaultFont defaultFont) {
        this.defaultFont = defaultFont;
    }

    @Override
    public String toString() {
        return "SysConfigure{" +
                "AppName='" + AppName + '\'' +
                ", AppVersion='" + AppVersion + '\'' +
                ", defaultFont=" + defaultFont +
                '}';
    }
}
