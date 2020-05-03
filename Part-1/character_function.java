import java.io.*;

public class character_function {
   public static void main(String Args[]) throws IOException {
      InputStreamReader read = new InputStreamReader(System.in);
      BufferedReader in = new BufferedReader(read);
      System.out.println("Enter a character:");
      char a = (char) (in.read());
      if (Character.isDigit(a) == true) {
         System.out.println("Character is a digit.");
      } else {
         System.out.println("Character is not a digit.");
      }
      if (Character.isLetter(a) == true) {
         System.out.println("Character is a letter.");
      } else {
         System.out.println("Character is not a letter.");
      }
      if (Character.isLetterOrDigit(a) == true) {
         System.out.println("Character is a LetterOrDigit.");
      } else {
         System.out.println("Character is not a LetterOrDigit.");
      }
      if (Character.isUpperCase(a) == true) {
         System.out.println("Character is a Uppercase.");
      } else {
         System.out.println("Character is not a Uppercase.");
      }
      if (Character.isLowerCase(a) == true) {
         System.out.println("Character is a Lowercase.");
      } else {
         System.out.println("Character is not a Lowercase.");
      }
      if (Character.isWhitespace(a) == true) {
         System.out.println("Character is a Whitespace.");
      } else {
         System.out.println("Character is not a Whitespace.");
      }
      System.out.println("Character in lowercase is " + Character.toLowerCase(a));
      System.out.println("Character in Uppercase is " + Character.toUpperCase(a));
   }
}
