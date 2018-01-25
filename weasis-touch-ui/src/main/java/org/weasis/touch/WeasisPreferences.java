package org.weasis.touch;

public class WeasisPreferences {
    public static final WeasisPreferences FULL_SCREEN = new WeasisPreferences("fullScreen", false);
    public static final WeasisPreferences WINDOW_SENSITIVITY = new WeasisPreferences("windowSensitivity", 50);
    public static final WeasisPreferences LEVEL_SENSITIVITY = new WeasisPreferences("levelSensitivity", 50);
    public static final WeasisPreferences WINDOW_ORIENTATION = new WeasisPreferences("windowOrientation", false);
    public static final WeasisPreferences LEVEL_ORIENTATION = new WeasisPreferences("levelOrientation", false);
    public static final WeasisPreferences HIDE_SHOW_SCROLL = new WeasisPreferences("hideShowScroll", true);
    public static final WeasisPreferences HIDE_THUMBNAIL = new WeasisPreferences("hideThumbnail", false);
    public static final WeasisPreferences LANGUAGE = new WeasisPreferences("language", "English");
    public static final WeasisPreferences SHOW_TUTO = new WeasisPreferences("showTuto", true);
    public static final WeasisPreferences ASK_RESET = new WeasisPreferences("askReset", true);
    public static final WeasisPreferences ASK_EXIT = new WeasisPreferences("askExit", true);
    public static final WeasisPreferences SHOW_NOTIFICATIONS = new WeasisPreferences("showNotifications", true);

    // TODO temp
    public static final String[] lstLanguage = { "Francais", "Deutsch", "English" };

    private String name;
    private Object defaultValue;

    WeasisPreferences(String name, Object defaultValue) {
        this.name = name;
        this.defaultValue = defaultValue;
    }

    public String name() {
        return this.name;
    }

    public Object defaultValue() {
        return this.defaultValue;
    }
}
