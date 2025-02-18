package model.tiles;

import java.time.LocalDate;
import java.util.Comparator;

/**
 * Utility <i>{@link Comparator}</i> per ordinare in maniera crescente un insieme di <i>GanttTile</i> secondo la data di fine (attributo <i>end</i>).
 * <br>Se due <i>GanttTile</i> hanno la stessa fine, li ordina in maniera crescente per data di inizio (attributo <tt>start</tt>).
 */
public class DeadlineComparator implements Comparator<GanttTile> {

    @Override
    public int compare(GanttTile o1, GanttTile o2) {

        LocalDate d1 = o1.getEnd();
        LocalDate d2 = o2.getEnd();
        if(d1.getYear() != d2.getYear())
            return d1.getYear()-d2.getYear();
        else if (d1.getMonth() != d2.getMonth())
            return d1.getMonth().getValue()-d2.getMonth().getValue();
        else if (d1.getDayOfMonth() !=d2.getDayOfMonth())
            return d1.getDayOfMonth()-d2.getDayOfMonth();
        else
        {
            d1 = o1.getStart();
            d2 = o2.getStart();
            if(d1.getYear() != d2.getYear())
                return d2.getYear()-d1.getYear();
            else if (d1.getMonth() != d2.getMonth())
                return d2.getMonth().getValue()-d1.getMonth().getValue();
            else if (d1.getDayOfMonth() !=d2.getDayOfMonth())
                return d2.getDayOfMonth()-d1.getDayOfMonth();
        }
        return 1;
    }
}