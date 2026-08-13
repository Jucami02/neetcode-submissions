class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        // PASO 1: Guardar en ans[i] el producto de todo lo que está A LA IZQUIERDA
        ans[0] = 1; // A la izquierda del primer elemento no hay nada (1)
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // PASO 2: Multiplicar por todo lo que está A LA DERECHA
        int derecha = 1; // El acumulado desde la derecha empieza en 1
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * derecha;
            derecha = derecha * nums[i]; // Actualizamos el acumulado hacia la izquierda
        }

        return ans;
    }
}