package controller;

import model.tiles.GanttTile;
import model.tiles.YearTile;

import java.util.ArrayList;

/**
 * Classe per gestire creazione, organizzazione ed ordinamento sia gerarchico che sequenziale degli elementi <i>Tile</i>, definiti per astrarre l'aggregazione e disposizione delle componenti grafiche nel Gantt.
 * <br>Questa classe stessa è un <i>GanttTile</i> e costituisce la radice di una gerarchia di aggregazioni, così definita:<br>
 *  <i>TileManager</i><br>
 *  &nbsp;&nbsp;&#9492;&#9472;<i>YearTile</i><br>
 *  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&#9500;&#9472;<i>ExamTile</i><br>
 *  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&#9492;&#9472;<i>MilestoneTile</i><br>
 *  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&#9492;&#9472;<i>ExamTile</i><br>
 */
public class TileManager extends GanttTile {
    /**
     * Lista ordinata di oggetti <i>{@link YearTile}</i>, rispettando l'ordine dei corrispondenti <i>Year</i> in <i>{@link Degree}</i>
     */
    private ArrayList<YearTile> tiles;

    /**
     * Costruttore del <i>TileManager</i>. Innesca la creazione della gerarchia dei <i>Tile</i>.
     */
    public TileManager(){
        tiles = new ArrayList<YearTile>();
        for(int i=0; i< Degree.getDegree().getYears().size(); i++)
        {
            tiles.add(new YearTile(i+1));
            if(i == 0)
            {
                super.setStart(tiles.get(i).getStart());
                super.setEnd(tiles.get(i).getEnd());
            }
            else
            {
                if(super.getStart().isAfter(tiles.get(i).getStart()))
                {
                    super.setStart(tiles.get(i).getStart());
                }

                if(super.getEnd().isBefore(tiles.get(i).getEnd()))
                {
                    super.setEnd(tiles.get(i).getEnd());
                }
            }
        }
    }

    /**
     * Restituisce la lista degli <i>YearTile</i>.
     * @return <i>ArrayList</i> di elementi <i>YearTile</i>
     */
    public ArrayList<YearTile> getYearTiles(){
        return tiles;
    }
}
