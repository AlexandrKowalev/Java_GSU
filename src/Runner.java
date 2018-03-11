

import java.util.Arrays;

import by.gsu.pms.NameComparator;
import by.gsu.pms.PlaceComparator;
import by.gsu.pms.Ward;



public class Runner {

	public static void main(String[] args) {
		Ward[] ward = {
                new Ward("Kovalev Alex",10, 5),
                new Ward("Gavrik Dmitriy",6, 6),
                new Ward("Ivanov", 5, 2),
                new Ward("Kravchenko", 9, 5),
                new Ward("Kravchenko Vladimir", 10, 1),
                new Ward("Alexseev", 5, 5),
                new Ward("Kravchenko Vladimir", 9, 0),
                new Ward("Gogalev", 12, 2),
                new Ward("Kravchenko Vladimir", 15, 3),
                new Ward("Golovin", 17, 9),
            
        };
		 int allPlace=0;
	        int freePlace=0;
	        System.out.println("Not Sort: ");
	        for (int i=0;i<ward.length;i++)
	        {
	            System.out.println(ward[i]);
	            freePlace+=ward[i].getFreePlace();
	            allPlace+=ward[i].getAllPlace();
	          
	         }
	        Arrays.sort(ward, new NameComparator());
	        System.out.println("==================================");
	        System.out.println("Sort by Name: ");
	        for (int i=0;i<ward.length;i++)
	        {
	            System.out.println(ward[i]);
	        }
	        Arrays.sort(ward, new PlaceComparator());
	        System.out.println("==================================");;
	        System.out.println("Sort by all place: ");
	        for (int i=0;i<ward.length;i++)
	        {
	            System.out.println(ward[i]);
	        }
	        System.out.println("==================================");
	        System.out.println("Free place= "+freePlace);
	        System.out.println("All place= "+allPlace);
	        System.out.println("==================================");
	        
}
}
