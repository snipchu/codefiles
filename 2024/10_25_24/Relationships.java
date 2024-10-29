import java.util.*;
import java.io.*;
import java.lang.Integer;

public class Relationships {
	public static void main(String[] args) throws IOException {
		// make file scanner and map
		Scanner input = new Scanner(new File("input.txt"));
		Map<String, ArrayList<String>> mymap = new TreeMap<String, ArrayList<String>>();
		
		// iterate over acronyms
		int numOfAcros = Integer.valueOf(input.nextLine());

		for (int i=0; i<numOfAcros; i++) {
			// add acronyms to map
			String[] currentline = input.nextLine().split(" ");
			if (!mymap.containsKey(currentline[0])) {
				// add new key
				mymap.put(currentline[0], new ArrayList<String>());
			}
      mymap.get(currentline[0]).add(currentline[1]);
      Collections.sort(mymap.get(currentline[0]));
		}

		// print output
		for (String i: mymap.keySet()) {
			System.out.println(i+" is related to "+mymap.get(i).toString().replaceAll(",","").substring(1).replace("]",""));
		}
	}
}

