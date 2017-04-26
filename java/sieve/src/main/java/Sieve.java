import java.util.*;
public class Sieve{

    public int limit;

    public Sieve(int limit){
        if(limit < 2){
            throw new IllegalArgumentException("No primes under 2");
        }

        this.limit = limit;
    }

    public List<Integer> getPrimes(){

        boolean[] validValues = new boolean[limit +1];
        for(int i=0; i< validValues.length; i++){
            validValues[i] = true;
        }

        for(int i=2; i<= limit; i++){

            if(!validValues[i]){
                continue;
            }

            for(int j=i+i; j<=limit; j += i){
                validValues[j] = false;
            }
        }

        ArrayList<Integer> primes = new ArrayList<>();
        for(int i=2; i< validValues.length; i++){
            if(validValues[i]){
                primes.add(i);
            }
        }

        return primes;

    }
}