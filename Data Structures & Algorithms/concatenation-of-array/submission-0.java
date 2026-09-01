class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int [] aux = nums;
        int[] resultado = new int[(2 * n)];


    // Copiar el primer arreglo
    System.arraycopy(nums, 0, resultado, 0, nums.length);

    // Copiar el segundo arreglo
    System.arraycopy(aux, 0, resultado, nums.length, aux.length);

    return resultado;


        
    }
}