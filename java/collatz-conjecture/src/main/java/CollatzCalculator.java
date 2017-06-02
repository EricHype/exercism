class CollatzCalculator {

    int computeStepCount(int start) {

        if(start < 1){
            throw new IllegalArgumentException("Only natural numbers are allowed");
        }

        int numberOfSteps = 0;
        int currentNumber = start;

        while(currentNumber > 1){
            if(currentNumber % 2 == 0){
                currentNumber /= 2;
            } else {
                currentNumber = (3 * currentNumber) + 1;
            }
            numberOfSteps++;
        }

        return numberOfSteps;
    }
}
