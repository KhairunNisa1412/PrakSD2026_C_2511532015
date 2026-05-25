package pekan8_2511532015;

public class MergeSort_2511532015 {

    void merge_2015(int arr[], int l_2015, int m_2015, int r_2015) {

        // Find sizes of two subarrays to be merged
        int n1_2015 = m_2015 - l_2015 + 1;
        int n2_2015 = r_2015 - m_2015;

        /* Create temp arrays */
        int L_2015[] = new int[n1_2015];
        int R_2015[] = new int[n2_2015];

        /* Copy data to temp arrays */
        for (int i_2015 = 0; i_2015 < n1_2015; ++i_2015)
            L_2015[i_2015] = arr[l_2015 + i_2015];

        for (int j_2015 = 0; j_2015 < n2_2015; ++j_2015)
            R_2015[j_2015] = arr[m_2015 + 1 + j_2015];

        int i_2015 = 0, j_2015 = 0;

        // Initial index of merged subarray array
        int k_2015 = l_2015;

        while (i_2015 < n1_2015 && j_2015 < n2_2015) {
            if (L_2015[i_2015] <= R_2015[j_2015]) {
                arr[k_2015] = L_2015[i_2015];
                i_2015++;
            } else {
                arr[k_2015] = R_2015[j_2015];
                j_2015++;
            }
            k_2015++;
        }

        /* Copy remaining elements of L[] if any */
        while (i_2015 < n1_2015) {
            arr[k_2015] = L_2015[i_2015];
            i_2015++;
            k_2015++;
        }

        /* Copy remaining elements of R[] if any */
        while (j_2015 < n2_2015) {
            arr[k_2015] = R_2015[j_2015];
            j_2015++;
            k_2015++;
        }
    }
    
    void sort_2015(int arr[], int l_2015, int r_2015) {
        if (l_2015 < r_2015) {

            // Find the middle point
            int m_2015 = (l_2015 + r_2015) / 2;

            // Sort first and second halves
            sort_2015(arr, l_2015, m_2015);
            sort_2015(arr, m_2015 + 1, r_2015);

            // Merge the sorted halves
            merge_2015(arr, l_2015, m_2015, r_2015);
        }
    }

    /* A utility function to print array of size n */
    static void printArray_2015(int arr[]) {
        int n_2015 = arr.length;

        for (int i_2015 = 0; i_2015 < n_2015; ++i_2015)
            System.out.print(arr[i_2015] + " ");

        System.out.println();
    }

    public static void main(String args[]) {

        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Sebelum terurut");
        printArray_2015(arr);

        MergeSort_2511532015 ob_2015 = new MergeSort_2511532015();
        ob_2015.sort_2015(arr, 0, arr.length - 1);

        System.out.println("\nSesudah Terurut menggunakan merge Sort");
        printArray_2015(arr);
    }
}