import java.text.*;
import java.io.*;
import java.util.*;

public class HashTreeTests{



	public static void main(String[] args) {

		int testNumber = 100000000;

		Random ranGen = new Random();

		HashMap hashmap = new HashMap();
		TreeMap treemap = new TreeMap();

		long before = System.currentTimeMillis();


		////hashmap test
		////Putting

		//for (;testNumber > 0; testNumber--){
			//hashmap.put(ranGen.nextInt(99999), ranGen.nextInt(9999999));
		//}
		//long after = System.currentTimeMillis();

		////Treemap tests
		////Putting
		//for (;testNumber > 0; testNumber--){
		//	treemap.put(ranGen.nextInt(99999), ranGen.nextInt(9999999));
		//}
//

		
		long after = System.currentTimeMillis();
		System.out.println(after - before);


	}
}