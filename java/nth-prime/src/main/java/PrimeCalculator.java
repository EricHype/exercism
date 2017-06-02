import java.util.ArrayList;

/**
 * Created by eheitmuller on 4/26/17.
 */
public class PrimeCalculator {



    public int nth(int i) {

        if(i < 1){
            throw new IllegalArgumentException();
        }

        int primesFound = 0;
        int currentValueToCheck = 1;
        while(primesFound < i){
            currentValueToCheck++;
            if(isPrime(currentValueToCheck)){
                primesFound++;
            }
        }

        return currentValueToCheck;
    }

    public boolean isPrime(int value){

        for(int i=2; i<= Math.sqrt(value); i++){
            if(value % i == 0)
                return false;
        }

        return true;
    }

}
