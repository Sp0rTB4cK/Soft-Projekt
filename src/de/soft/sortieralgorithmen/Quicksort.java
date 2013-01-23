package de.soft.sortieralgorithmen;
/** 
 * Die Klasse Quicksort sortiert den uebergebenen Zahlenarray.
 * 
 * @author michaelhahn
 *
 */
public class Quicksort {
	
	private long sortTime;
	private int[] data;
	
	public Quicksort(int[] array) {
		if(array != null) {
			long start = System.currentTimeMillis();
			
			data = array;
			quicksort(0, data.length -1);
			
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
	
	private void quicksort(int low, int high) {
	    int i = low, j = high;
	    // Ermittle Pivotelement (mitte)
	    int pivot = data[low + (high-low)/2];

	    // Teilung
	    while (i <= j) {
	      while (data[i] < pivot) {
	        i++;
	      }
	      while (data[j] > pivot) {
	        j--;
	      }
	      if (i <= j) {
	        tausche(i, j);
	        i++;
	        j--;
	      }
	    }
	    // Rekursion
	    if (low < j)
	      quicksort(low, j);
	    if (i < high)
	      quicksort(i, high);
	  }

	  private void tausche(int i, int j) {
	    int temp = data[i];
	    data[i] = data[j];
	    data[j] = temp;
	  }
}
