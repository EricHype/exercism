import java.util.Arrays;

/**
 * Created by eheitmuller on 6/1/17.
 */
public class IsogramChecker {
    public boolean isIsogram(String duplicates) {
        char[] chars = duplicates.toLowerCase()
                .replaceAll("[\\p{Punct}\\p{Space}]", "")
                .toCharArray();
        Arrays.sort(chars);

        for(int i=0; i< chars.length - 1; i++){
            if(chars[i] == chars[i+1]){
                return false;
            }
        }

        return true;
    }
}
