package by.gsu.pms;
import java.util.Comparator;

public class NameComparator implements Comparator<Ward>
{
    public int compare(Ward o1, Ward o2)
    {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}