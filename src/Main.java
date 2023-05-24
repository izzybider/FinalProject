import processing.core.PApplet;

public class Main extends PApplet {
    private final String[] SOLUTIONS = {"rock", "meow", "juice"};
    private final String[] jumbled = {"kroc", "wmoe", "iceuj"};
    private boolean won = false;

    private boolean lost = false;

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

    public void setup() {        //generate random index
        guess = "";
        index = (int) random(SOLUTIONS.length);
    }

    public void draw() {
        background(255, 0, 0);
        fill(0);
        textSize(30);
        textAlign(CENTER);
        text(jumbled[index], width/2, height/2);
        text(guess, width/2, height/2 + 50);
        rect(width/4, height*3/4, width/2, 40);  //x,y, width, height
        fill(255);
        text("try", width/2, height*3/4+30);
        if(won) {
            text("Great you got it. Play again", width / 2, 40);
        }
        if(lost) {
            text("You are wrong. Try again", width / 2, 40);
        }
        noLoop(); //draw is called just once
    }

    public void mouseClicked() {
        if(mouseX >= width/4 && mouseX <= width*3/4 && mouseY >= height*3/4 && mouseY <= height*3/4+40) {
            System.out.println("hi");
            if (guess.equals(SOLUTIONS[index])) {
                won = true;
                System.out.println("Great you got it. Play again");
                text(jumbled[index], width/2, height/2); //choose a new word
                setup(); //call setup
            } else {
                lost = true;
                System.out.println("You are wrong. Try again");
                //make try button become try again here --> i just added try again to the text...?
                guess = ""; //clear guess by making guess an empty string
            }
            redraw();
        }
    }

    public void keyPressed() {
        if(guess.length() == jumbled[index].length()) { //if making this super nice you make this have an else if to see if you are typing delete
            return;
        }
        guess = guess + key;
        won = false;
        lost = false;
        redraw();
        //concatenate key, glue each key onto end of the string
        //as soon as string is as long as length, it enters
        //visualize indicator of where the characeters you're pressing go
    }
}


//to do: check me box, feedback on guess (good guess or bad guess try again), offer to try again if wrong, play again if possible but do at least one wrong
//don't use system.out.println