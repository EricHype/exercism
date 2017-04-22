public class Hamming {

    private String input1;
    private String input2;

    public Hamming(String input1, String input2) {
        this.input1 = input1;
        this.input2 = input2;

        if(input1.length() != input2.length()){
            throw new IllegalArgumentException();
        }
    }

    public int getHammingDistance(){
        int totalDistance =0;
        for(int i=0; i< input1.length(); i++){
            if(input1.charAt(i) != input2.charAt(i)){
                totalDistance++;
            }
        }

        return totalDistance;
    }
}
