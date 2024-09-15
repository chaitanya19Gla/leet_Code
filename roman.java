public class roman {

  public String intRoman(int num){
      int []values = {1000 ,900, 500,400 , 100,90 , 50,40 , 10,9 , 5,4 , 1};
      String []romanVal = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
      int i = 0;

      StringBuilder sb = new StringBuilder();

      while (num > 0){
          if (num>=values[i]){
              sb.append(romanVal[i]);
              num-=values[i];
          }
          else {
              i++;
          }

      }
      return sb.toString();

  }

    public static void main(String[] args) {
        roman r = new roman();

        System.out.println(r.intRoman(40));

    }
}
