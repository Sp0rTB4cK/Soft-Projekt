
public class Testclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = new int[3000000];
		
		int j = 0;
		for(int i = values.length-1; i >= 0; i--) {
			values[i] = j;
			j++;
		}
		/*
		for(int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}*/
		
		//Insertionsort is = new Insertionsort(values);
		//Mergesort ms = new Mergesort(values);
		Quicksort qs = new Quicksort(values);
		
		System.out.println(qs.getSortTime());
		/*
		for(int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}*/
		
	}

}
