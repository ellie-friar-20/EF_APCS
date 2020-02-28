import java.util.Scanner;
public class AbecedarianWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your word: ");
        String word = scan.nextLine();
        for(int i = 0; i < word.length()-1; i++) {
            String oneLetter = word.substring(i);
            String twoLetter = word.substring(i + 1);
            int nextLetter = oneLetter.compareToIgnoreCase(secondLetter);
            if(next > 0) {
                System.out.println()
        }
    }
}