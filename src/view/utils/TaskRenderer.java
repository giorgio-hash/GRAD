package view.utils;

import view.GanttFrame;
import org.jfree.chart.renderer.category.GanttRenderer;

import java.awt.*;
import java.util.Map;

public class TaskRenderer extends GanttRenderer {
    private static final long serialVersionUID = 1L;
    private static Map<Integer, Color> colormap;

    public TaskRenderer(Map<Integer, Color> colormap) {
        super();
        this.colormap = colormap;
    }

    @Override
    public Paint getItemPaint(int row, int col) {
        if (!colormap.isEmpty()) {
            return colormap.get(col);
        }else
            return super.getItemPaint(row, col);
    }
}