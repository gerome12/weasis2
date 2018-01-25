package org.weasis.touch.gui;

import java.util.List;

import javafx.beans.property.BooleanProperty;
import javafx.geometry.Point2D;
import javafx.scene.paint.Color;

public interface Mesure {

    public static final Integer LINE = 1;
    public static final Integer RECTANGLE = 2;
    public static final Color DEFAULT_COLOR = Color.rgb(0xb3, 0x47, 0x11);
    public static final Integer FINGER_TARGET = 50;

    public Integer addPoint(Point2D point);

    public Boolean isComplet();

    public List<Point2D> getPoints();

    public void draw();

    public int getScroll();

    public void temporaryPoint(Point2D point);

    public void setEditModeProperty(BooleanProperty editModeProperty);

    public Boolean isPoint(double x, double y);

    public Boolean isLine(double x, double y);

    public void moveMeasure(double x, double y);

    public void clearMeasureToModify();

    public void setIsEdited(Boolean isEdited);
}
