public class randomNumber {
   public static void main(String[] args) {
      for (int a = 0; a < 15; a++) {
         int random = (int) Math.round(Math.random() * 9);
         System.out.println(random);
      }
   }
}
