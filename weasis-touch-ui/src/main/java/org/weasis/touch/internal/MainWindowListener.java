package org.weasis.touch.internal;

import java.beans.PropertyChangeListener;

import org.weasis.dicom.explorer.DicomModel;
import org.weasis.touch.gui.WeasisWin;

public interface MainWindowListener extends PropertyChangeListener {

    void setMainWindow(WeasisWin mainWindow);

    WeasisWin getMainWindow();

    DicomModel getModel();
}
