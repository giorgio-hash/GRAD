package GUI.Utils;

import GUI.GanttFrame;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.GanttRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.gantt.GanttCategoryDataset;

import java.awt.*;
import java.awt.geom.Rectangle2D;

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