import processing.core.PApplet;

public class ScrambleGame extends PApplet {
    private final String[] WORD_BANK = {"fungus", "meow", "juice", "rock", "scrumptious"};

    public static void main(String[] args) {
        PApplet.main("ScrambleGame");
    }

    public ScrambleGame() {
    }

    public void settings() {
        size(400, 400);
    }

    public void draw() {
        startGame();
        noLoop(); //draw is called just once
    }

    public void mouseClicked() {
        redraw();
    }

    public String selectWord() {
        return WORD_BANK; // how do i have the program select a random word from the bank?
    }

    public String Guess() { //have the ueser guess the original word
        System.out.println("Type in what you think the word is unscrammbled.");
        //other stuff??
    }
    private void startGame() {
        int NumberOfGuesses = 0;
        String ogWord = selectWord(); //??
        System.out.println("The shuffled word is: "); //how do i make it choose a random word from the word bank?
        Guess++; //idk how to put this, but i want the program to have the user guess?
        if (ogWord.equals(Guess)) {
            System.out.println("Nice job you unscrammbled the word");
        } else {
            System.out.println("You are wrong.");
            //need to make it stop letting the user guess after 3 guesses
        }
    }
    public String ShuffledWord() {
        String ShuffleWords = ogWord; //og word before ze shuffling
        //stuff idk
        return ShuffledWord;
    }
}