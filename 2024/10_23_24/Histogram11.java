import java.util.*;
import java.io.*;
import java.lang.Integer;

public class Histogram11 {
	public static void main(String[] args) throws IOException {
		// make file scanner and map
		Scanner input = new Scanner(new File("input.txt"));
		Map<String, Integer> mymap = new HashMap<String, Integer>();

		// iterate over each line in file
		for (int i=0; i<4; i++) {
			String[] inputs = input.nextLine().split(" ");
			
			// iterate over each char in line
			for (String key:inputs) {
				// add key to map
				if (!mymap.containsKey(key)) {
					mymap.put(key, 0);
				}
				// increase value of key
				mymap.replace(key,mymap.get(key)+1);
			}
			// print all values
			System.out.println("char\t1---5----01---5");
			for (String j:mymap.keySet()) {
				System.out.print(j+"\t");
				for (int k=0; k<mymap.get(j); k++) {System.out.print("*");}
				System.out.println();
			}
			System.out.println();
			mymap.clear();

		}
	}
}

