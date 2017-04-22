public class RnaTranscription {
    public String ofDna(String dnaString) {

        char[] charArray = dnaString.toCharArray();
        for(int i=0; i<charArray.length; i++){
           charArray[i] = translateChar(charArray[i]);
        }

        return new String(charArray);
    }

    private char translateChar(char input){
        switch (input){
            case 'G':
                return 'C';
            case 'C':
                return 'G';
            case 'T':
                return 'A';
            case 'A':
                return 'U';
            default:
                return input;
        }
    }
}