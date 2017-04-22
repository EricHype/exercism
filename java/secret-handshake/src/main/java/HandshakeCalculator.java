import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class HandshakeCalculator {


    public List<Signal> calculateHandshake(int input) {

        ArrayList<Signal> retVal = new ArrayList<>();
        if( isBitAtPositionEnabled(input, 0)){
            retVal.add(Signal.WINK);
        }

        if( isBitAtPositionEnabled(input, 1)){
            retVal.add(Signal.DOUBLE_BLINK);
        }

        if( isBitAtPositionEnabled(input, 2)){
            retVal.add(Signal.CLOSE_YOUR_EYES);
        }

        if( isBitAtPositionEnabled(input, 3)){
            retVal.add(Signal.JUMP);
        }

        if( isBitAtPositionEnabled(input, 4)){
            Collections.reverse(retVal);
        }

        return retVal;
    }

    private boolean isBitAtPositionEnabled(int input, int position){
        return ((input >>> position) & 1 ) != 0;
    }
}
