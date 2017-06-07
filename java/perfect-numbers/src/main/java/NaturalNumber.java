import java.util.stream.IntStream;
import java.util.stream.Stream;

final class NaturalNumber {

    int sumOfFactors = -1;
    int value = -1;

    public NaturalNumber(int i) {
        if(i < 1){
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }

        sumOfFactors = getFactorsOf(i).sum();
        value = i;
    }

    public IntStream getFactorsOf(int number){

        if(number == 1){
            return IntStream.of(0);
        }

        Integer stop = (int)Math.ceil(number / 2.0);
        return IntStream.rangeClosed(1, stop).filter(n-> number % n == 0);
    }

    public Classification getClassification() {
        if(sumOfFactors == value){
            return Classification.PERFECT;
        }

        if(sumOfFactors > value){
            return Classification.ABUNDANT;
        }

        return  Classification.DEFICIENT;
    }
}
