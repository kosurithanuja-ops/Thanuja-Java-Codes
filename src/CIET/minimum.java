package CIET;
public class minimum { 
    static int findMin(int[] arr) {
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];

            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] a = {5, 2, 9, 7, 100};
        System.out.println(findMin(a));
    }
}