import java.util.Arrays;
import java.util.List;

/**
 * Created by eheitmuller on 4/21/17.
 */
public class Matrix {

    String matrixAsString = null;
    int[][] matrix = null;
    int rowCount =0;
    int columnCount = 0;

    public Matrix(String matrixAsString) {
        this.matrixAsString = matrixAsString;
        String[] rows =  matrixAsString.split("\n");
        rowCount = rows.length;
        columnCount = rows[0].split(" ").length;
        matrix = new int[rowCount][columnCount];

        for(int i=0; i< rowCount; i++){
            String[] columns = rows[i].split(" ");
            for(int j=0; j< columns.length; j++){
                matrix[i][j] = Integer.parseInt(columns[j]);
            }
        }
    }


    public int getRowsCount() {
        return rowCount;
    }

    public int getColumnsCount() {
        return columnCount;
    }

    public int[] getRow(int i) {
        return matrix[i];
    }

    public int[] getColumn(int columnIndex) {
        int[] retval = new int[rowCount];
        for(int i=0; i< rowCount; i++){
            retval[i] = matrix[i][columnIndex];
        }
        return retval;
    }
}
