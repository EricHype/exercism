import java.util.ArrayList;
import java.util.List;

/**
 * Created by eheitmuller on 4/7/17.
 */
public class Acronym {

    private String phrase;

    public Acronym(String phrase) {
        this.phrase = phrase;
    }

    public String get(){
        String[] words = phrase.split("[- ]");
        StringBuilder acronym = new StringBuilder();

        for(String currentWord : words){
            acronym.append(getNonContiguousCapitalLetters(currentWord));
        }

        return acronym.toString().toUpperCase();
    }

    public StringBuilder getNonContiguousCapitalLetters(String input){
        StringBuilder foundChars = new StringBuilder();
        boolean previousWasUppercase = false;
        for(Character currentChar : input.toCharArray() ){
            if(Character.isUpperCase(currentChar) && !previousWasUppercase){
                previousWasUppercase = true;
                foundChars.append(currentChar);
            } else{
                previousWasUppercase = Character.isUpperCase(currentChar);
            }
        }

        if(foundChars.length() == 0){
            foundChars.append(input.charAt(0));
        }

        return foundChars;
    }
}
