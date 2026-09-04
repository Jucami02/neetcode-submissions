class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Caso base: si el arreglo está vacío o es nulo
        if (strs == null || strs.length == 0) {
            return "";
        }

        StringBuilder sResult = new StringBuilder();

        // Recorremos cada letra de la PRIMERA palabra (strs[0])
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);

            // Comparamos esa letra contra TODAS las palabras
            for (int j = 0; j < strs.length; j++) {

                // 1. Si el índice 'i' supera el tamaño de alguna palabra
                // 2. O la letra no coincide con la primera palabra
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    // Terminamos de inmediato y devolvemos lo acumulado
                    return sResult.toString();
                }
            }

            // Si todas las palabras coincidieron en la letra 'i', la agregamos
            sResult.append(c);
        }

        return sResult.toString();
    }
}