package pekan8_2511532015;

public class ShellSort_2511532015 {
	public static void ShellSort_2511532015(int[] A) {
		int n_2015 = A.length;
		int gap = n_2015 / 2;
		while (gap > 0) {
			for (int i_2015 = gap; i_2015 < n_2015; i_2015++) {
				int temp = A[i_2015];
				int j_2015 = i_2015;
				while (j_2015 >= gap && A [j_2015 - gap] > temp) {
					A[j_2015] = A[j_2015 - gap];
					j_2015 = j_2015 - gap;
				}
				A[j_2015] = temp;
			}
			gap = gap / 2;
		}
	}
	
	public static void main(String[] args) {
		int[] data_2015 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		System.out.print("Sebelum : ");
		printArray(data_2015);
		ShellSort_2511532015(data_2015);
		
		System.out.print("Sesudah (Shell Short) : ");
		printArray(data_2015);
	}
	public static void printArray(int[] arr) {
		for (int i_2015 : arr) System.out.print(i_2015 + " ");
		System.out.println();
	}
}