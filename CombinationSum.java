import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<Integer> combinationSum(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        int i = 0 ;
        while (target!=0){
            if (candidates[i]<=target){
                target=candidates[i]-target;
                list.add(candidates[i]);
                i++;
            }

        }
        combinationSum(candidates,target);
        System.out.println(list);
        return list;

    }

    public static void main(String[] args) {
        int []candidates={2,3,6,7};
        CombinationSum combinationSum = new CombinationSum();
        combinationSum.combinationSum(candidates,7);
    }
}
