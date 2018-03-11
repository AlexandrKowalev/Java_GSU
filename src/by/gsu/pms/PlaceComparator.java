package by.gsu.pms;
import java.util.Comparator;

public class PlaceComparator implements Comparator<Ward>
{
    public int compare(Ward o1, Ward o2)
    {
        return o1.getAllPlace()-o2.getAllPlace();
    }
}