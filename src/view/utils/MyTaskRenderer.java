package view.utils;

import view.GanttFrame;
import org.jfree.chart.renderer.category.GanttRenderer;

import java.awt.*;

public class MyTaskRenderer extends GanttRenderer {
    private static final long serialVersionUID = 1L;

    public MyTaskRenderer() {
        super();
    }

    @Override
    public Paint getItemPaint(int row, int col) {
        if (!GanttFrame.colormap.isEmpty()) {
            return GanttFrame.colormap.get(col);
        }else
            return super.getItemPaint(row, col);
    }
}