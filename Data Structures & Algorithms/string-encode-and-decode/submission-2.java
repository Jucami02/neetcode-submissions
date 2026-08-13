

class Solution {

    // ENCODE: Convierte la lista en un solo String usando "longitud#texto"
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        
        for (String str : strs) {
            sb.append(str.length()) // Añade la cantidad de caracteres
              .append('#')          // Añade el separador de longitud
              .append(str);         // Añade el texto original
        }
        
        return sb.toString();
    }

    // DECODE: Lee la longitud antes del '#' para extraer la palabra exacta
    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            // 1. Buscamos dónde está el próximo '#'
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }

            // 2. Extraemos el número que indica la longitud de la palabra
            int length = Integer.parseInt(str.substring(i, j));

            // 3. Movemos el puntero pasando el '#'
            i = j + 1;

            // 4. Extraemos exactamente 'length' caracteres
            result.add(str.substring(i, i + length));

            // 5. Avanzamos el puntero al inicio de la siguiente palabra
            i += length;
        }

        return result;
    }
}