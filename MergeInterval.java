import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeInterval {

        public int[][] merge(int[][] intervals) {
            if (intervals.length <=1){
                return intervals;
            }
            Arrays.sort(intervals , Comparator.comparingInt(i -> i[0]));
            List<int []> result = new ArrayList<>();
            int[]NewInterval = intervals[0];
            result.add(NewInterval);
            for (int[]interval:intervals){
                if (interval[0]<=NewInterval[1]){
                    NewInterval[1] = Math.max(NewInterval[1],interval[1]);
                }
                else {
                    NewInterval=interval;
                    result.add(NewInterval);
                }
            }

            return result.toArray(new int[result.size()][]);
        }


    public static void main(String[] args) {
        int [][]intervals = {{1,3},{2,6},{8,10},{15,18}};
        MergeInterval m = new MergeInterval();
        m.merge(intervals);


    }
}
