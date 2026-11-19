class Solution {
    public boolean isValidSudoku(char[][] board) {
        // 9 sets para las 9 filas, 9 para las 9 columnas y 9 para las 9 cajas 3x3
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for (int k = 0; k < 9; k++) {
            rows[k] = new HashSet<>();
            cols[k] = new HashSet<>();
            boxes[k] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char current = board[i][j];

                if (current == '.') {
                    continue;
                }

                // Convertimos la coordenada (i, j) de la caja 3x3 en un índice del 0 al 8
                int boxIndex = (i / 3) * 3 + (j / 3);

                // Ahora sí: solo guardamos y revisamos el carácter limpio
                if (!rows[i].add(current) ||
                    !cols[j].add(current) ||
                    !boxes[boxIndex].add(current)) {
                    return false;
                }
            }
        }

        return true;
    }
}