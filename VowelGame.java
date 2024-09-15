public class VowelGame {

        public boolean doesAliceWin(String s) {
            boolean a = false;
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println(a);
                    return a = true;
                }
            }
            
            return a= false;
        }


    public static void main(String[] args) {
        VowelGame u = new VowelGame();
        u.doesAliceWin("leetcoder");

    }
}
