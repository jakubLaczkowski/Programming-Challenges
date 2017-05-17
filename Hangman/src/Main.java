import java.util.Scanner;
import java.util.Random;
public class Main {

    private static int count = 1;
    public static void main(String[] args) {
        String word;
        String guessWord;
        String censoredWord;
        String[] usedLetters = new String[30];
        boolean winner = false;
        int index = 0;
        String[] words = {"kamien", "omnadren", "pies", "kot", "rower", "koniowal", "hulajnoga", "kapec", "testosteron", "borowka"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        word = words[random.nextInt(words.length)];
        censoredWord  = censorWord(word);
        while(!winner){
            System.out.print("Guess a letter in a word: ");
            System.out.println(censoredWord);
            guessWord = scanner.nextLine();
            if(!checkIfUsed(guessWord, usedLetters)) {
                usedLetters[index] = guessWord;
                index++;
                censoredWord = censorWord(word, guessWord, censoredWord);
                if (!censoredWord.contains("*")) {
                    System.out.println("Congratulations! You won!");
                    winner = true;
                }
            }
        }
        scanner.close();
    }

    private static String censorWord(String word){
        StringBuilder sb = new StringBuilder(15);
        for(int i = 0; i < word.length(); i++){
            sb.append("*");
        }
        return sb.toString();
    }

    private static String censorWord(String word, String guess, String censoredWord){
        StringBuilder sb = new StringBuilder(25);
        sb.append(censoredWord);
        if(word.contains(guess)){
            System.out.println("Yes, the word contains '" + guess + "'");
            while(word.contains(guess)) {
                sb.replace(word.indexOf(guess), word.indexOf(guess)+1, guess);
                word = word.replaceFirst(guess, "-");
            }
            System.out.println(sb);
            return sb.toString();
        }
        else{
            System.out.println("You guessed wrong");
            drawHangMan(count);
            count++;
            return sb.toString();
        }
    }

    private static boolean checkIfUsed(String guessWord, String[] usedLetters){
        for(int i = 0; i < usedLetters.length; i++){
            try {
                if (usedLetters[i].equals(guessWord)) {
                    System.out.println("You already used that letter.");
                    return true;
                }
            }catch(NullPointerException e){
                return false;
            }
        }
        return false;
    }

    private static void drawHangMan(int count){
        switch(count){
            case 1:
                System.out.println("-------");
                break;
            case 2:
                System.out.println(
                        "   |\n" +
                                "   |\n" +
                                "   |\n" +
                                "   |\n" +
                                "   |\n" +
                                "-------");
                break;
            case 3:
                System.out.println(
                        "    ________\n" +
                                "   |\n" +
                                "   |\n" +
                                "   |\n" +
                                "   |\n" +
                                "   |\n" +
                                "-------");
                break;
            case 4:
                System.out.println(
                        "    ________\n" +
                                "   |        |\n" +
                                "   |\n" +
                                "   |\n" +
                                "   |\n" +
                                "   |\n" +
                                "-------");
                break;
            case 5:
                System.out.println(
                        "    ________\n" +
                                "   |        |\n" +
                                "   |        o\n" +
                                "   |\n" +
                                "   |\n" +
                                "   |\n" +
                                "-------");
                break;
            case 6:
                System.out.println(
                        "    ________\n" +
                                "   |        |\n" +
                                "   |        o\n" +
                                "   |        |\n" +
                                "   |\n" +
                                "   |\n" +
                                "-------");
                break;
            case 7:
                System.out.println(
                        "    ________\n" +
                                "   |        |\n" +
                                "   |        o\n" +
                                "   |        |\n" +
                                "   |       /\n" +
                                "   |\n" +
                                "-------");
                break;
            case 8:
                System.out.println(
                        "    ________\n" +
                                "   |        |\n" +
                                "   |        o\n" +
                                "   |        |\n" +
                                "   |       / |\n" +
                                "   |\n" +
                                "-------");
                break;
            case 9:
                System.out.println(
                        "    ________\n" +
                                "   |        |\n" +
                                "   |        o\n" +
                                "   |       /|\n" +
                                "   |       / |\n" +
                                "   |\n" +
                                "-------");
                break;
            case 10:
                System.out.println(
                        "    ________\n" +
                                "   |        |\n" +
                                "   |        o\n" +
                                "   |       /||\n" +
                                "   |       / |\n" +
                                "   |\n" +
                                "-------");
                System.out.println("You lost!");
                System.exit(0);
                break;
        }
    }
}
