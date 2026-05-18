package pekan7_2511532015;

public class BubleSort_2511532015 {
	public static void bubbleSort (int[] arr) {
		int n_2015 = arr.length;
		for (int i_2015 = 0; i_2015 < n_2015; i_2015++) {
			for (int j_2015 = 0; j_2015 < n_2015 - i_2015 - 1; j_2015++) {
				if (arr[j_2015] > arr[j_2015+ 1]) {
					int temp = arr [j_2015];
					arr[j_2015] = arr[j_2015+1];
					arr[j_2015+ 1]= temp;
				//System.out.println ("data:"+ arr[j]+" "+arr[j+1];
				}
			}
		}
	}
	public static void main (String[] args) {
		int arr[] = {23, 78, 45, 8, 32, 56, 1};
		int n_2015 = arr.length;
		System.out.print ("Array yang belum terurut: \n");
		for (int i_2015 = 0; i_2015 < n_2015; i_2015++)
			System.out.print (arr[i_2015] + " ");
		System.out.println ("");
		//minMaxSelectionSort (arr, n);
		
		bubbleSort(arr);
		System.out.print ("Array yang terurut menggunakan BubleSort: \n");
		for (int i_2015 = 0; i_2015 < n_2015; i_2015++)
			System.out.print (arr[i_2015] + " ");
		System.out.println ("");
	}
}
