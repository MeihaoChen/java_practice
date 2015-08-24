import java.util.*;

public class DotCom {
    private String name;
    private ArrayList<String> locations;
    public void setName(String n){
        name = n;
    }
    public void setLocationCells(ArrayList<String> loc) {
        locations = loc;
    }
    public void checkYourself(String userGuess){
        String result = "miss";
        int index = locations.indexOf(userGuess);
        if (index >= 0) {
            locations.remove(index);
            if (locations.isEmpty()){
                result = "kill";
                System.out.println("You sunk " + name + " !");
            }else{
                result = "hit";
            }
        }
    }
}


