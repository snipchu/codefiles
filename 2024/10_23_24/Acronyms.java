import java.util.*;
import java.io.*;
import java.lang.Integer;

public class Histogram1 {
	public static void main(String[] args) throws IOException {
		// make file scanner and map
		Scanner input = new Scanner(new File("input.txt"));
		Map<String, String> mymap = new HashMap<String, String>();
		
		// iterate over acronyms
		int numOfAcros = Integer.valueOf(input.nextLine());
		for (int i=0; i<numOfAcros; i++) {
			// add acronyms to map
			String[] currentline = input.nextLine().split(" - ");
			mymap.put(currentline[0], currentline[1]);
		}
		// print map contents
		System.out.println("====\tMAP CONTENTS\t====\n");
		System.out.println(mymap.toString().replaceAll(", ","\n"));

		System.out.println("\n\n====\tREAD LINES\t====\n");
		// print output
		while (input.hasNextLine()) {
			String myline = input.nextLine();
			// replace acronyms
			for (String yay:mymap.keySet()) {
				myline = myline.replaceAll(yay,mymap.get(yay));
			}
			System.out.println(myline);
		}

	}
}

