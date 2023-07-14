import java.util.ArrayList;
import java.util.Random;


public class PuzzleJava {

    // getTenRolls
    //rnd = random

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> random10 = new ArrayList<Integer>();
        Random rnd = new Random();
        for(int i = 1; i <= 10; i++) {
            random10.add(rnd.nextInt(20) + 1);
        }
        return random10;
    }

    //getRandomLetter
    //rnd = random

    public String getRandomLetter() {
        Random rnd = new Random();
        String alphabetString = "abcdefghijklmnopqrstuvwyyz";
        char randomChar = alphabetString.charAt(rnd.nextInt(26));
        return String.valueOf(randomChar);
    }

    // generatePassword

    public String generatePassword(){
        String password = "";
        for(int i = 0; i < 8; i++) {
            password = password + getRandomLetter();
        }
        return password;
    }


    // getNewPasswordSet

    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> passwordSet = new ArrayList<String>();
        for(int i = 0; i < length; i++) {
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }


    //shuffleArray


}
