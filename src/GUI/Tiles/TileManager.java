package GUI.Tiles;

import myCompilerPackage.util.Degree;
import myCompilerPackage.util.Year;

import java.util.ArrayList;

public class TileManager extends GanttTile{
    private ArrayList<GanttTile> tiles;
    public TileManager(){
        tiles = new ArrayList<GanttTile>();
        for(int i=0; i< Degree.getDegree().getYears().size(); i++)
        {
            tiles.add(new YearTile(i+1));
        }
    }
}
