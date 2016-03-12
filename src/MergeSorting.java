import java.util.Arrays;

/**
 * 
 * @author Bhavin
 * @since 12/03/2016; 17:11
 */

public class MergeSorting {

	public static int[] merge(int[] leftArray, int[] rigthArray, int[] finalArray){
		int lLength = leftArray.length;
		int rLength = rigthArray.length;
		int i = 0; // to trace left array
		int j = 0; // to trace right array
		int k = 0; // to trace main array;
		
		while(i < lLength && j <rLength){
			if (leftArray[i] < rigthArray[j]){
				finalArray[k] = leftArray[i];
				i++;
			}
			else{
				finalArray[k] = rigthArray[j];
				j++;
			}
			k++;
		}
		
		while (i < lLength){
			finalArray[k] = leftArray[i];
			i++;
			k++;
		}
		
		while (j < rLength){
			finalArray[k] = rigthArray[j];
			j++;
			k++;
		}
		leftArray = null;
		rigthArray = null;
		return finalArray;
	}
	
	
	public static int[] mergeSort(int[] arr){
		int mid = arr.length/2;	
		int[] leftArray = Arrays.copyOfRange(arr, 0, mid);
		int[] rigthArray = Arrays.copyOfRange(arr, mid, arr.length);
		
		if (mid < 1){
			return arr;
		}
		else{
			leftArray = mergeSort(leftArray);
			rigthArray = mergeSort(rigthArray);
			arr = merge(leftArray, rigthArray, arr);
		}
		
		return arr;
	}
	
}
