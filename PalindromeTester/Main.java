public class Main {

    public static void main(String[] args) {

        String word = new String();
        String reverse = new String();
        String forward = new String();
        word = "Doc, Note: I Dissent. A fast never prevents a fatness. I diet on cod.";

        int len = word.length();

        for (int i = len-1; i >= 0; i--) {
            char letter = word.charAt(i);
            int position = (int)letter;
            if ((position >= 65) && (position <= 90) || (position >= 97) && (position <= 122)) {
                forward = letter + forward;
                reverse = reverse + letter;
            }

        }
        boolean palindrome = forward.equalsIgnoreCase(reverse);
        if(palindrome){
            System.out.print(word + " is a palindrome");
        }else{
            System.out.print(word + " isn't a palindrome");
        }
    }
}
