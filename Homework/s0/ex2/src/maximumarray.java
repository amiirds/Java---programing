public class maximumarray {
    public static void main(String[] args) {
        int arr []  = {1, 5, 7, 543, 2231, 65, 764};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);

    }
}
