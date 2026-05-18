package pekan7_2511532015;

public class SelectionSort_2511532015 {
	public static void selectionSort (int[] arr) {
		int n_2015 = arr.length;
		for (int i_2015= 0; i_2015 < n_2015; i_2015++) {
			int minIndex = i_2015;
			for (int j = i_2015 + 1; j < n_2015; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[i_2015];
			arr[i_2015] = arr[minIndex];
			arr[minIndex]= temp;
		}
	}
	public static void main (String[] args) {
		int arr[] = {23, 78, 45, 8, 32, 56, 1};
		int n_2015 = arr.length;
		System.out.printf ("Array yang belum terurut: \n");
		for (int i_2015 = 0; i_2015 < n_2015; i_2015++)
			System.out.print (arr[i_2015] + " ");
		System.out.println ("");
		selectionSort(arr);
		System.out.printf ("Array yang terurut: \n");
		for (int i_2015 = 0; i_2015 < n_2015; i_2015++)
			System.out.print (arr[i_2015] + " ");
		System.out.println ("");
	}
}
