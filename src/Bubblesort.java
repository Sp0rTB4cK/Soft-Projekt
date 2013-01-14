/**
 * Die Klasse Bubblesort erhaelt ein unsortiertes Array und sortiert es nach dem Bubblesort Verfahren.
 * 
 * @author michaelhahn
 *
 */
public class Bubblesort {
	
	private long sortTime;
	private int[] data;

	public Bubblesort(int[] array) {
		if(array != null) {
			long start = System.currentTimeMillis();
			
			data = array;
			bubblesort();
			
			sortTime = System.currentTimeMillis() - start;
			
		} else {
			//Default Werte
			sortTime = 0;
			data = new int[] {0};
		}
	}
	
	public int[] getData() {
		assert(data != null);
		return data;
	}
	
	public long getSortTime() {
		assert(sortTime <= 0);
		return sortTime;
	}
	
	private void bubblesort() {
		for(int i = 0; i < data.length-1; i++) {
			for(int x = 0; x < data.length-1; x++) {
				if(data[x] > data[x+1]) {
					int t=data[x];
					data[x]=data[x+1];
					data[x+1]=t;
				}
			}
		}
	}
}
