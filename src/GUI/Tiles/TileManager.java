package GUI.Tiles;

import myCompilerPackage.util.Degree;
import myCompilerPackage.util.Year;

import java.util.ArrayList;

public class TileManager extends GanttTile{
    private ArrayList<YearTile> tiles;
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

    public ArrayList<YearTile> getYearTiles(){
        return tiles;
    }
}
