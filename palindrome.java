import com.sun.source.tree.BreakTree;

public class palindrome {
    public boolean isPalindrome(int x) {
        boolean a = false;
        int temp, sum = 0;
        temp = x;
        while (x > 0) {
            int remainder = x % 10;
            sum = (sum * 10) + remainder;
            x = x / 10;
        }
        if (sum == temp) {
            System.out.println(a=true);
        return a=true;
    }
        if (temp==10){
            System.out.println(a=false);
            return a=false;
        }

        if (temp<0){
            System.out.println(a=false);
            return a=false;
        }
        System.out.println(a);
        return a;
    }


    public static void main(String[] args) {
        palindrome p = new palindrome();
        p.isPalindrome(100);
    }
}
