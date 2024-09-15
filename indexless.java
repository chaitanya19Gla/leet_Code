import java.util.*;
public class indexless {
    public void searchInsert(int[] nums, int target){
        for (int i = 0 ; i<nums.length ; i++){
            if (target == nums[i]){
                System.out.println(i);
            }
            else {
                while (target!=nums[i]){
                    int min = nums[target]-nums[i];
                    System.out.println(Math.min(min , 0));
                    System.out.println(nums[min]);
                }
            }
        }
    }
    public static void main(String[] args) {
        indexless i = new indexless();
        i.searchInsert(new int[]{1, 3, 5, 6}, 5);

    }
}
