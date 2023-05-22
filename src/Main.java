import processing.core.PApplet;

public class Main extends PApplet {
    private final String[] SOLUTIONS = {"rock", "meow", "juice"}; //put jumbled words in bank, solutions = and jum
    private final String[] jumbled = {"kroc", "wmoe", "iceuj"};

    private String guess;

    private int index;

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    public Main() {
    }

    public void settings() {
        size(400, 400);
    }

    public void setup() {
        guess = "";
        index = (int) random(SOLUTIONS.length);
        //generate random index
    }

    public void draw() {
        fill(0);
        textSize(48);
        text(jumbled[index], width/2, height/2);
        text(guess, width/2, height/2 + 50);
        noLoop(); //draw is called just once
    }

    public void mouseClicked() {
        if(guess.equals(SOLUTIONS [index])) {
            System.out.println("Nice job you unscrammbled the word");
        } else {
            System.out.println("You are wrong.");
        }
        redraw();
        //if using a check box or try again box
    }

    public void keyPressed() {
        guess = guess + key;
        //concatenate key, glue each key onto end of the string
        //as soon as string is as long as length, it enters
        //visualize indicator of where the characeters you're pressing go
    }
}

    //public String ShuffledWord() {
        //tring ShuffleWords = ogWord; //og word before ze shuffling
        //stuff idk
        //return ShuffledWord;
        //could come back and add this
    //}
//}


//to do: check me box, feedback on guess (good guess or bad guess try again), offer to try again if wrong, play again if possible but do at least one wrong
//don't use system.out.println