public class letter {
    public static void main(String Args[]) {
        char p = 'a' + 't' + 't' + 'r' + 'i' + 'b' + 'u' + 't' + 'e';
        if (Character.isLetter(p)) {
            System.out.println("Given Character is letter");
        } else {
            System.out.println("Given Character is not a letter");
        }
    }
}