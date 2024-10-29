import java.util.*;
import java.io.*;
import java.lang.Integer;

public class SpEng {
	public static void main(String[] args) throws IOException {
		// make file scanner and map
		Scanner input = new Scanner(new File("input.txt"));
		Map<String, String> mymap = new TreeMap<String, String>();
		
		// iterate over acronyms
		int numOfAcros = Integer.valueOf(input.nextLine());

		for (int i=0; i<numOfAcros; i++) {
			// add acronyms to map
			String[] currentline = input.nextLine().split(" ");
			mymap.put(currentline[0], currentline[1]);
		}

		// print map contents
		System.out.println("====\tMAP CONTENTS\t====\n");
		System.out.println(mymap.toString().replaceAll(", ","\n"));

		System.out.println("\n\n====\tREAD LINES\t====\n");
		// print output
		while (input.hasNextLine()) {
			String[] myline = input.nextLine().split(" ");
			// replace acronyms
			for (int i=0; i<myline.length; i++) {
				if (mymap.containsKey(myline[i])) {
					myline[i] = mymap.get(myline[i]);
				}
			}

			// print out acronyms
			for (String i:myline) { System.out.print(i+" "); }
			System.out.println();
		}

	}
}

