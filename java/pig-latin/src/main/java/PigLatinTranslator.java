import java.util.ArrayList;

/**
 * Created by eheitmuller on 6/6/17.
 */
public class PigLatinTranslator {
    public String translate(String englishPhrase) {
        String[] words = englishPhrase.split(" ");
        ArrayList<String> retVal = new ArrayList<>();

        for(String word: words) {
            char[] letters = word.toCharArray();
            char prevChar = ' ';

            while(!isImmovable(letters[0], prevChar, letters[1])){
                char moveToEnd = letters[0];
                for(int i=1; i< letters.length; i++){
                    letters[i-1] = letters[i];
                }
                letters[letters.length - 1] = moveToEnd;
                prevChar = moveToEnd;
            }

            retVal.add(new String(letters) + "ay");
        }

        if(retVal.size() < 2){
            return retVal.get(0);
        }

        return String.join(" ", retVal);
    }


    public boolean isImmovable(char letter){
        return isImmovable(letter, ' ', ' ');
    }

    public boolean isImmovable(char letter, char previousLetter, char nextLetter){

        if(letter == 'x' && !isImmovable(nextLetter)){
            return true;
        }
        if(letter == 'y' && !isImmovable(nextLetter)){
            return true;
        }

        switch(letter){
            case 'a': case 'e': case 'i': case 'o':
                return true;
            case 'u':
                return previousLetter != 'q';
            default:
                return false;
        }
    }

}
