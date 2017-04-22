public final class DifferenceOfSquaresCalculator {


    public int computeSquareOfSumTo(int input) {

        int sigmaOfNumbers = 0;


        for(int i=1; i<= input; i++ ){
            sigmaOfNumbers += i;
        }

        return (sigmaOfNumbers * sigmaOfNumbers);
    }

    public int computeSumOfSquaresTo(int input ) {

        int sumOfSquares= 0;
        for(int i=1; i<= input; i++ ){
            sumOfSquares += i * i;
        }

        return sumOfSquares;
    }

    public int computeDifferenceOfSquares(int input) {

        int sigmaOfNumbers = 0;
        int sumOfSquares= 0;


        for(int i=1; i<= input; i++ ){
            sigmaOfNumbers += i;
            sumOfSquares += i * i ;
        }

        return (sigmaOfNumbers * sigmaOfNumbers) - sumOfSquares;
    }
}
