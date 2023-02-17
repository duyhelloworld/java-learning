package forarray;

/**
 * @author duyhelloworld
 * 
 * @category BackTracking
 *         Quay lui là một kĩ thuật thiết kế giải thuật dựa trên đệ quy. 
 *              Ý tưởng của quay lui là tìm lời giải từng bước, mỗi bước chọn một trong số
 *              các lựa chọn khả dĩ và đệ quy.
 *         Người đầu tiên đề ra thuật ngữ này (backtrack) là nhà toán học người Mỹ D. H. Lehmer vào những năm 1950.
 */

/**
 * Sudoku
 */
class Sudoku {
    int size = 9;
    int[][] sudoku;

    public Sudoku() {
        // int[][] game = new int[size][];
        int[][] lorem = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };
        sudoku = lorem;
    }
    
    void print(int[][] Su, int size) {
        // for (int[] row : Su) {
        //     for (int element : row) {
        //         System.out.print(element + "\t");
        //     }
        //     System.out.println();
        // }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (size % (j+1) == 0 && j != 0) {
                    System.out.print(Su[i][j] + "\t|\t");
                } else {
                    System.out.print(Su[i][j] + "\t");
                }
            }
            if (size % (i + 1) == 0 || i != 0) {
                System.out.println("\n__________________________________________________________________________________|");
            } else {
                System.out.println();
            }
        }
    }

    // Solve A Sudoku
    void solve(int[][] Su, int c, int r) {

    }
}

public class BackTracking {
    
    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        sudoku.print(sudoku.sudoku, 9);
    }
}
