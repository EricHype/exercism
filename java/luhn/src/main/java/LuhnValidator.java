import java.util.ArrayList;

/**
 * Created by eheitmuller on 4/20/17.
 */
public class LuhnValidator {
    public boolean isValid(String s) {

        ArrayList<Integer> digits = new ArrayList<>();
        int charCounter = 1;
        for(int i=s.toCharArray().length -1; i >= 0 ; i--) {

            Character c = s.charAt(i);

            if(!Character.isDigit(c)){
                if(c != Character.DASH_PUNCTUATION && !Character.isWhitespace(c)){
                    return false;
                }
                continue;
            }

            int value = Integer.parseInt(c.toString());
            if( charCounter ==0 || charCounter % 2 ==0){
                value = value * 2;
                if(value > 9){
                    value -= 9;
                }
                digits.add(value);
                charCounter++;
                continue;
            }
            digits.add(value);
            charCounter++;
        }


        int sum = digits.stream().reduce(0, Integer::sum);

        return  sum % 10 == 0 && (sum > 0 || charCounter > 2);

    }


}
