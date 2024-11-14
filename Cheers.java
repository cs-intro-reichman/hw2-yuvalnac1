// Prints a crowd cheering output.
public class Cheers {
    public static void main(String[] args) {
        String cheerWord = args[0].toUpperCase();
        int cheerCount = Integer.parseInt(args[1]);
        String anLetters = "AEFHILMNORSX";
        char letter;
        String aOrAn;
        
        for (int i = 0; i < cheerWord.length(); i++) {
            aOrAn = "a ";
            letter = cheerWord.charAt(i);
            if (anLetters.indexOf(letter) != -1) {
                aOrAn = "an";
            }
            System.out.println("Give me " + aOrAn + " " + letter + ": " + letter + "!");
        }
        
        System.out.println("What does that spell?");
        for (int j = 0; j < cheerCount; j++) {
            System.out.println(cheerWord + "!!!");
        }
    }
}
