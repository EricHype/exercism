import java.util.HashMap;
import java.util.Map;

public class PangramChecker {

    public boolean isPangram(String input) {

        input = input.toLowerCase();
        HashMap<Character, Boolean> alphabetMap = getEmptyAlphabetMap();

        for(int i=0; i< input.length(); i++){
            alphabetMap.put(input.charAt(i), true);
        }

        for(Map.Entry<Character, Boolean> entry : alphabetMap.entrySet()){
            if(entry.getValue() == false){
                return false;
            }
        }

        return true;
    }

    private HashMap<Character, Boolean> getEmptyAlphabetMap(){
        HashMap<Character, Boolean> defaultState = new HashMap<>();
        for (int i=0; i<26; i++){
            defaultState.put(characterAfterLowercaseA(i), false);
        }
        return defaultState;
    }

    private Character characterAfterLowercaseA(int offset){
        int value = 'a' + offset;
        return (char)value;
    }
}
