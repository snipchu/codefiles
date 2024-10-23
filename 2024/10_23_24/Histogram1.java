import java.util.*;
import java.io.*;
import java.lang.Integer;

public class Histogram1 {
	public static void main(String[] args) throws IOException {
		// make file scanner and map
		Scanner input = new Scanner(new File("input.txt"));
		Map<String, Integer> mymap = new HashMap<String, Integer>();

		// iterate over each line in file
		for (int i=0; i<4; i++) {
			String inputs = input.nextLine();
			System.out.println(inputs);
			
			// iterate over each char in line
			for (String key:inputs.split(" ")) {
				// add key to map
				if (!mymap.containsKey(key)) {
					mymap.put(key, 0);
				}
				// increase value of key
				mymap.replace(key,mymap.get(key)+1);
			}
			// print all values
			for (String j:mymap.keySet()) {
				System.out.println(j+" count = "+mymap.get(j));
			}
			System.out.println();
			mymap.clear();

		}
	}
}

