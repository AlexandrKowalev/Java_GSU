import by.gsu.pms.BusinessTrip;

public class Runner {

	public static void main(String[] args) {
		BusinessTrip[] businessTrips = {
                new BusinessTrip("Kovalev Alex", 8925, 5),
                new BusinessTrip("Gavrik Dmitriy", 4500, 6),
                null,
                new BusinessTrip("Kravchenko Vladimir", 10600, 10),
                new BusinessTrip("Ageev Evgeniy", 15600, 15),
                new BusinessTrip("Krasti Krab", 600, 2),
                new BusinessTrip()
                
        };
        for (BusinessTrip businessTrip: businessTrips){
            if (businessTrip !=null){
                businessTrip.show();
            }
        }
        businessTrips[businessTrips.length-1].setTransport(900);
        for (BusinessTrip businessTrip: businessTrips ){
            System.out.println(businessTrip);
            
        }
        

    }


	}


