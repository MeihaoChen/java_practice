import java.util.ArrayList;

public class SimpleDotComGame {
    public static void main(String[] args){
        int numOfGuesses = 0;
        SimpleDotCom dot = new SimpleDotCom();
        GameHelper helper = new GameHelper();

        int randomNum = (int) (Math.random() * 5);
        ArrayList<String> locations = new ArrayList<String>();
        int i = 0;
        for (i = 0; i < 3; i++){
            locations.add(randomNum + i);
        }
        dot.setLocationCells(locations);
        boolean isAlive = true;

        while(isAlive == true){
            String guess = helper.getUserInput("enter a number");
            String result = dot.checkYourself(guess);
            numOfGuesses ++;

            if(result.equals("kill")){
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}
