package ds;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraList {

	public static void main(String[] args) {

		ArrayList<Integer> aL = new ArrayList<>();
		aL.add(1);
		aL.add(10);
		aL.add(9);
		aL.add(1);
		aL.add(1);
		aL.add(1);
		aL.add(1);
		aL.add(1);
		
		aL.add(1);
		aL.add(1);
		
		Arrays.sort(aL.toArray());
		
		System.out.println(aL);
		

	}

}
