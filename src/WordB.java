public class WordB {

    public static void main(String[] args) {

        String[][] matris = new String[7][4];

        for (int row = 0; row<matris.length;row++ ){
            for (int col = 0; col<matris[row].length;col++){
                if (row == 0|| row == 3||row==6)
                {
                    matris[row][col] = "*";
                    
                } else if (col == 0||col==3) {
                    matris[row][col] = "*";

                }
                else
                {
                    matris[row][col] = " ";
                }
            }

        }
        for (String[] row: matris)
        {
            for(String col : row)
            {
                System.out.print(col);

            }
            System.out.println();
        }

    }


}
