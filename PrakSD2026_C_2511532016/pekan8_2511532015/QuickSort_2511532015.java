package pekan8_2511532015;

public class QuickSort_2511532015 {
	static void swap_2015 (int[] arr, int i, int j)
	{
		int temp_2015 = arr[i];
		arr[i]= arr[j];
		arr[j]= temp_2015;
	}
	//method tambahkan untuk mengatur pivor menggunakan median of three
	static void medianOfThree_2015(int[] arr, int low, int high) {
		int mid_2015 = low + (high - low) / 2;
		
		//urutkan elemen low, mid, dan high
		if (arr[low]> arr[mid_2015]) {
			swap_2015 (arr, low, mid_2015);
		}
		if (arr[low]> arr[high]) {
			swap_2015 (arr, low, high);
		}
		if (arr[mid_2015]> arr[high]) {
			swap_2015(arr, mid_2015, high);
		}
		swap_2015(arr, mid_2015, high);
	}
	static int partition_2015(int[] arr, int low, int high) {
		//panggil fungsi mediaOfThree sebelum menentukan pivot
		medianOfThree_2015(arr, low, high);
		
		int pivot = arr[high]; //sekarang arr[high] sudah berisi nilia mendian
		int i = (low - 1);
		
		for (int j = low; j <- high - 1; j++) {
			//jika elemen saat ini lebih kecil dari atau sama dengan pivot
			if (arr[j] < pivot){
				//inorement indeks elemen yang lebih kecil
				i++;
				swap_2015 (arr, i, j);
			}
		}
		swap_2015 (arr, i+1, high);
		return (i + 1);
	}
	static void quickSort_2015 (int[] arr, int low, int high) {
		if (low < high) {
			int pi = partition_2015 (arr, low, high);
			quickSort_2015(arr, low, pi - 1);
			quickSort_2015(arr, pi + 1, high);
		}
	}
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {10, 7, 8, 9, 1, 5};
		int N = arr.length;
		System.out.print("Data sebeleum diurutkan: ");
		printArr(arr);
		
		quickSort_2015(arr, 0, N - 1);
		
		System.out.print("Data terurut quickSort: ");
		printArr(arr);
	}
}
