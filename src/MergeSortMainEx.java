import java.util.Random;

/**
 * 
 * @author Bhavin Tandel
 * @since 12/03/2016; 13:15
 */


public class MergeSortMainEx extends MergeSorting {
		
	public static void main(String[] args){
		int length = 1000000;
		int[] arr = new int[length];
		Random rnd = new Random();
		
		for(int i = 0; i < length; i++){
			arr[i] = rnd.nextInt(Integer.MAX_VALUE);
		}
		long startTime = System.currentTimeMillis();
		arr = mergeSort(arr);
		long stopTime = System.currentTimeMillis();
		
		
	
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
		
		System.out.println("Total run time : " +( stopTime - startTime));

	}


}

