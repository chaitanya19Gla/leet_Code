//import java.util.*;
//public class House_robber {
//    public static int rob(int[]num){
//        int count1 = 0;
//        int count2 = 0;
//        int ans = 0;
//        for(int i = 0 ; i<num.length-2 ; i+=2) {
//            for (int j = 1; j < num.length; j += 2) {
//                count1 = count1 + i;
//                count2 = count2 + j;
//
//                if(count2>count1){
//                    return count2;
//                }
//                else {
//                    return count1
//                }
//
//
//            }
//        }
//
//
//    }
//
//    public static void main(String[] args) {
//        int[]house = {1,2,3,1};
//        //rob(house);
//        System.out.println(rob(house));
//
//    }
//}
