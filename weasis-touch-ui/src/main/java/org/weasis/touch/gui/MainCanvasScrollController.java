package org.weasis.touch.gui;

public class MainCanvasScrollController {
    private MainCanvas mainCanvas;

    public MainCanvasScrollController(MainCanvas mainCanvas) {
        this.mainCanvas = mainCanvas;
    }

    /*****************************************************************
     * SCROLL (DICOM) *
     *****************************************************************/
    public void setScroll(int value) {
        mainCanvas.scroll(value);
    }
}
