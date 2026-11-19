

class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char current = board[i][j];

                // Las celdas vacías no generan conflictos
                if (current == '.') {
                    continue;
                }

                // Construimos etiquetas únicas para fila, columna y sub-caja 3x3
                String rowKey = current + " in row " + i;
                String colKey = current + " in col " + j;
                String boxKey = current + " in box " + (i / 3) + "-" + (j / 3);

                // .add() devuelve false si el elemento ya existía en el Set
                if (!seen.add(rowKey) || !seen.add(colKey) || !seen.add(boxKey)) {
                    return false;
                }
            }
        }

        return true;
    }
}