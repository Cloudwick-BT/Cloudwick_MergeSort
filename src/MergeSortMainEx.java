/**
 * 
 * @author Bhavin Tandel
 * @since 12/03/2016; 13:15
 */

public class MergeSortMainEx extends MergeSorting {
		
	public static void main(String[] args){
		int[] arr = {8,9,10,2,1,5,3,5,3,2,3};
		
		arr = mergeSort(arr);
	
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}

	}


}

