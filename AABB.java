public class AABB {

        public String strWithout3a3b(int a, int b) {
            StringBuilder s = new StringBuilder();
            StringBuilder a1 = new StringBuilder();
            StringBuilder b1 = new StringBuilder();
            StringBuilder c1 = new StringBuilder();
            a1= new StringBuilder("a");
            b1=new StringBuilder("b");
            c1=new StringBuilder("ab");
            if (a==b){
                for (int i = 0 ; i<b ; i++){
                   s=s.append(c1);
                }
                System.out.println(s);
            }
            if (a>=1&&b!=1){
                for (int i=1 ; i<=b ; i++){
                    s = s.append(b1);
                }
                    s.insert((s.length()/2),a1);
                System.out.println(s);

            }
            if (b >=1&&a!=1){
                for (int i=1;i<=a;i++){
                    s = s.append(a1);
                }

                s.insert((s.length()/2),b1);
                System.out.println(s);
            }
            return String.valueOf(s);

        }

    public static void main(String[] args) {
        AABB a=new AABB();
        a.strWithout3a3b(2,3);
    }

}
