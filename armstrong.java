public class armstrong {
    public boolean isarmstrong(int x) {
        boolean a=false;
        int count=0;
        String s = String.valueOf(x);
        for (int i = 0 ; i<s.length();i++){

            count= count+1;
        }

        int temp = x;
        int sum=0;
        while (x>0) {
            int remainder=x%10;

            sum+= (Math.pow(remainder,count));

            x=x/10;
        }
        System.out.println(sum);
        if (sum==temp){
            System.out.println(a=true);
            return a=true;
        }
        else {
            System.out.println(a=false);
            return a=false;
        }

    }

    public static void main(String[] args) {
        armstrong a = new armstrong();
        a.isarmstrong(153);
    }
}
