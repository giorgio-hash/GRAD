package view.utils;

import org.jfree.chart.renderer.category.GanttRenderer;

import java.awt.*;
import java.util.Map;

/**
 * Specializzazione di <i>{@link GanttRenderer}</i>.
 * <br>Personalizza la visualizzazione delle task in <i>GanttFrame</i> ed altri elementi grafici. In particolare, effettua l'override dei metodi ereditati.
 */
public class TaskRenderer extends GanttRenderer {
    private static final long serialVersionUID = 1L;
    private static Map<Integer, Color> colormap; //mappa rigaTask->colore

    /**
     * Costruttore con mappa dei colori per le task.
     * @param colormap mappa dei colori per le task
     */
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