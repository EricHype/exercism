import java.util.ArrayList;
import java.util.List;

final class DiamondPrinter {



    public List<String> printToList(char b) {
        ArrayList<String> lines = new ArrayList();

        int numberofLines = (b - 'A') + 1;
        int currentSpaces = 0;
        int maxWidth = numberofLines * 2 - 1;


        for(int i='A'; i<b; i++){

            if(i == 'A'){
                lines.add(addClosingLine(maxWidth));
                currentSpaces++;
                continue;
            }

            lines.add(addDiamondLine((char)i, currentSpaces, maxWidth));
            currentSpaces += 2;
        }

        for(int i=b; i >= 'A'; i--){
            if(i == 'A'){
                lines.add(addClosingLine(maxWidth));
                break;
            }
            lines.add(addDiamondLine((char)i, currentSpaces, maxWidth));
            currentSpaces -= 2;

        }

        return lines;
    }

    public String addClosingLine(int maxWidth){

        if(maxWidth < 1)
            return "A";

        StringBuilder sb = new StringBuilder();
        int floor = (int)Math.floor(maxWidth / 2);

        for(int i=0; i< maxWidth; i++){
            if(i == floor){
                sb.append("A");
                continue;
            }
            sb.append(" ");
        }

        return sb.toString();
    }

    public String addDiamondLine(char currentChar, int currentSpaces, int maxWidth){

        StringBuilder sb = new StringBuilder();

        int padding = maxWidth - (2 + currentSpaces);

        //add left padding
        for(int i=0; i< padding / 2; i++){
            sb.append(" ");
        }

        //add characters and intervening space
        sb.append(currentChar);
        for(int i = 0; i< currentSpaces; i++ ){
            sb.append(" ");
        }
        sb.append(currentChar);

        //add right padding
        for(int i=0; i< padding / 2; i++){
            sb.append(" ");
        }

        return sb.toString();
    }


}
