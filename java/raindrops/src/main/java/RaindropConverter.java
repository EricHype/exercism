/**
 * Created by eheitmuller on 4/10/17.
 */
public class RaindropConverter {

    public static final String PLING = "Pling";
    public static final String PLANG = "Plang";
    public static final String PLONG = "Plong";


    public String convert(int inputNumber) {

        StringBuilder retVal = new StringBuilder();

        if(inputNumber % 3 ==0){
            retVal.append(PLING);
        }
        if(inputNumber % 5 == 0){
            retVal.append(PLANG);
        }
        if(inputNumber % 7 == 0){
            retVal.append(PLONG);
        }

        return retVal.length() > 0 ? retVal.toString() : String.valueOf(inputNumber);
    }
}
