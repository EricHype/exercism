public class LargestSeriesProductCalculator {

    private String input;

    public LargestSeriesProductCalculator(String input){
        
        if(null == input){
            throw new IllegalArgumentException("String to search must be non-null.");
        }

        for(Character c : input.toCharArray()){
            if(!Character.isDigit(c)){
                throw new IllegalArgumentException("String to search may only contains digits.");
            }
        }
        
        this.input = input;
    }

    public Long calculateLargestProductForSeriesLength(int digitLength){
        if(digitLength < 0){
            throw new IllegalArgumentException("Series length must be non-negative.");
        }
        if(digitLength > input.length()){
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        }
        char[] inputChars = input.toCharArray();
        Long largestProductSeen = 0L;
        for(int i=0; i< (inputChars.length - (digitLength-1)) ; i++){
            Long currentProduct = new Long(1L);
            for(int j=i; j< (i + digitLength); j++){
                Character c = inputChars[j];
                currentProduct *= Long.parseLong(c.toString());
            }
            if(currentProduct > largestProductSeen){
                largestProductSeen = currentProduct;
            }
        }

        return largestProductSeen;
    }
}
