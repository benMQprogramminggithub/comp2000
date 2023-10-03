import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.*;

public class GridIterator implements Iterator{
        Cell[][] cells;
        ArrayList<Cell> list; 
        int point = 0;

        public GridIterator(Cell[][] c) {
                cells = c;
                list = new ArrayList<>();
                for (int i = 0; i < cells.length; i++) {
                        for (int j = 0;  j < cells[i].length; j++) {
                                list.add(cells[i][j]);
                        }
                }
        }

        public boolean hasNext() {
                if (point >= list.size() || list.get(point) == null) {
                        return false;
                }
                else {
                        return true;
                }
        }

        public Cell next() {
                Cell cell = list.get(point);
                point++;
                return cell;
        }


}
