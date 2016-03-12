import java.util.*;

/**
 * 
 * @author Bhavin Tandel
 * @since 12/03/2016; 13:15
 */

public class MergeSortMainEx {
	
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
		return finalArray;
	}
	
	public static int[] mergeSort(int[] arr){
		
	
		return arr;
	}
	
	public static void main(String[] args){
		int[] arr = {2,1,5,3,5,3,2,3};
		
		arr = mergeSort(arr);
	

	}


}

