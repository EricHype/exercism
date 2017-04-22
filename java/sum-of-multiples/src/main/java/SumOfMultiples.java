
public class SumOfMultiples {
    private int upperLimit;
    private int[] multiples;

    public SumOfMultiples(int upperLimit, int[] multiples) {
        this.upperLimit = upperLimit;
        this.multiples = multiples;
    }

    public int getSum(){
        int sum =0;

        for(int i=1; i<upperLimit; i++){
            for(int j=0; j< multiples.length; j++){
                if(i % multiples[j] == 0){
                    sum += i;
                    break;
                }
            }
        }
        return sum;
    }

}
