import java.util.Scanner;
import java.util.Random;


public class hangingman{


    static String word = "";

    static String category  ="";
    static String displayWord = "";
    static String userGuess = "";
    static char guess = '\0';
    static int lives = 7;
    String[] Letters={};

    public static boolean gameIsWon(){
        if (displayWord.equals(word)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void loseDisplay(){
        System.out.println("you lode the word was"+word);
        System.out.println("¯|_(ツ)_/¯");
    }

    public static void winDisplay(){
        System.out.println("you won noob the word was"+word);
        System.out.println("you have "+lives+" lives left");
        }
    public static void createDisplayWord(){
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == ' '){
                displayWord = displayWord + " ";
            }
            else{
                displayWord = displayWord + "-";
            }
        }
    }

    public static boolean gameIsOn(){
        if (lives > 0 && !displayWord.equalsIgnoreCase(word)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void drawImage(){
        if (lives == 7) {
            System.out.println(" ______");
            System.out.println(" |    | ");
            System.out.println(" | ");
            System.out.println(" | ");
            System.out.println(" | ");
            System.out.println(" | ");
            return;
        }
        if (lives == 6) {
            System.out.println(" ______");
            System.out.println(" |    | ");
            System.out.println(" |    o");
            System.out.println(" | ");
            System.out.println(" | ");
            System.out.println(" | ");
            return;
        }
        if (lives == 5) {
            System.out.println(" ______");
            System.out.println(" |    | ");
            System.out.println(" |    o");
            System.out.println(" |    |");
            System.out.println(" | ");
            System.out.println(" | ");
            return;
        }
        if (lives == 4) {
            System.out.println(" ______");
            System.out.println(" |    | ");
            System.out.println(" |    o");
            System.out.println(" |   <|");
            System.out.println(" | ");
            System.out.println(" | ");
            return;
        }
        if (lives == 3) {
            System.out.println(" ______");
            System.out.println(" |    | ");
            System.out.println(" |    o");
            System.out.println(" |   <|>");
            System.out.println(" | ");
            System.out.println(" | ");
            return;
        }
        if (lives == 2) {
            System.out.println(" ______");
            System.out.println(" |    | ");
            System.out.println(" |    o");
            System.out.println(" |   <|>");
            System.out.println(" |    ⅄");
            System.out.println(" | ");
            return;
        }
        if (lives == 1) {
            System.out.println(" ______");
            System.out.println(" |    | ");
            System.out.println(" |    o                mans might die.....");
            System.out.println(" |   <|>");
            System.out.println(" |    ⅄");
            System.out.println(" | ");
            return;
        }
    }

    public static void guessCheck(){
        String Guess = guess + "";
        if (!word.contains(Guess)){
            lives--;
            return;
        }
        String newWord = "";
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            String ch = c + "";
            String C = Guess.toUpperCase();
            if (ch.equalsIgnoreCase(C)){
                newWord += c;
            }
            else{
                newWord += displayWord.charAt(i);
            }
        }
        displayWord=newWord;
    }


    public static void takeGuess(){
        Scanner s = new Scanner(System.in);
        System.out.println("Take a guess.");
        userGuess = s.nextLine();
        guess = userGuess.toUpperCase().charAt(0);
    }

    public static void chooseWord(){
        String[] food = {"PIZZA","PANEER","HAMBURGER","POTATO", "ICECREAM", "PASTA", "CURLY FRIES", "HONEY"};
        String[] sports = {"BASKETBALL", "TENNIS","FOOTBALL", "SWIMMING", "LUGE", "CRICKET", "VOLLEY BALL"};
        String[] categories = {"food", "sports"};
        Random r = new Random();
        int random = r.nextInt(categories.length);
        category = categories[random];
        if (random == 0){
            int ran = r.nextInt(food.length);
            word = food[ran];
            return;
        }
        if (random == 1){
            int ran = r.nextInt(sports.length);
            word = sports[ran];
            return;
        }
    }
    public static void displayHanging(){
        System.out.println("Category: " + category);
        System.out.println("Lives: " + lives);
        System.out.println("Letters in word: " + word.length());
        System.out.println("Word: " + displayWord);
    }

    public static void display(){
        System.out.println("Welcome to hangman….. It would be a shame if something were to happen...");
    }


    public static void main(String[] args){
        display();
        chooseWord();
        createDisplayWord();
        while(gameIsOn()){
            displayHanging();
            drawImage();
            takeGuess();
            guessCheck();
        }
        if (gameIsWon()){
            winDisplay();
        }
        else{
            loseDisplay();
        }
    }
}


