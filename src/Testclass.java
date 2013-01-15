
public class Testclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = new int[300000];
		
		int j = 0;
		for(int i = values.length-1; i >= 0; i--) {
			values[i] = j;
			j++;
		}
		/*
		for(int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}*/
		
		Insertionsort is = new Insertionsort(values);
		
		System.out.println(is.getSortTime());
		/*
		for(int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		*/
	}

}
