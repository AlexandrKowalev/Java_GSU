import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import by.gsu.pms.Serializator;
import by.gsu.pms.Ward;

public class Runner  {

	public static void main(String[] args)  {
		final String FILE_NAME = "src\\in.txt";
		int countNumberOfSeats=0;
		int freeChambers=0;
		
		try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))){
			System.out.println("Array size: ");
			int size = Integer.parseInt(in.readLine());
			Ward[] inWard = new Ward[size];
			
			for (int i = 0; i < size; i++) {
				String[] values = in.readLine().split(";");
				String doctorName = values[0];
				int numberOfSeats = Integer.parseInt(values[1]);
                countNumberOfSeats+=numberOfSeats;
				boolean freePlaces = Boolean.parseBoolean(values[2]);
				if (freePlaces){
				    freeChambers++;
                }
				inWard[i] = new Ward(doctorName,numberOfSeats,freePlaces);
			}
			System.out.println("Input array: ");
			printArray(inWard);
			Serializator.serialize(inWard, FILE_NAME);
			Ward[] outPatient = Serializator.deserialize(FILE_NAME);
			System.out.println("Output array: ");
			printArray(outPatient);
            System.out.println("Count: "+countNumberOfSeats);
            System.out.println("Free chambers: "+freeChambers);
		} catch (IOException e) {
		}
	}
	
	private static <T> void printArray(T[] array) {
		for (T value : array) {
			System.out.println(value);
		}
	}

}
