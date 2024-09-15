public class toSum {

    public static int[] twoSum(int[] arr, int target){
        int []a;
        for (int i = 0 ; i<arr.length ; i++){
            for (int j = i+1 ; j<arr.length ; j++){
                if (arr[i] + arr[j] == target){
                    a = new int[]{i, j};
                    return a;
                }

            }
        }
        return null;


    }
    public static void main(String[] args) {
        int []arr = {3};
        int target = 3 ;
        twoSum(arr,target);

    }
}
