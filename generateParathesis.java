import java.util.*;

public class generateParathesis {

    public static List genString(int n) {
        List<String> result = new ArrayList<>();

        if (n>1) ;
        String s1 = "(";
        String s2 = ")";
        String res = s1.repeat(n) + s2.repeat(n);
        result.add(0, res);
        //System.out.println(res);
        if (n > 2) ;
        String middle = "(" + ")";
        String s3 = s1 + middle.repeat(n - 1) + s2;
        result.add(1, s3);
        //System.out.println(s3);

        if (n > 2) ;
        String ls = "(" + ")";
        String r = s1.repeat(n - 1) + s2.repeat(n - 1) + ls;
        result.add(2, r);
        //  System.out.println(r);

        if (n > 2) ;
        String r1 = ls + s1.repeat(n - 1) + s2.repeat(n - 1);
        result.add(3, r1);
        //System.out.println(r1);

        if (n ==1) {
            String r2 = "()".repeat(n);
            result.add(r2);
            while (result.size()>1) {
                int i = result.size()-1;
                result.remove(result.remove(i));
            }
        }
        //System.out.println(r2.repeat(n));



        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i)+",");
        }
        return result;
    }
    public static void main(String[] args) {
        genString(2);


    }
}
