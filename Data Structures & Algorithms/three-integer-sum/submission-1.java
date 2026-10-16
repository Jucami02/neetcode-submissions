
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        // 1. Ordenar el arreglo es fundamental para Two Pointers
        Arrays.sort(nums);

        // N-2 porque necesitamos espacio para i, left y right
        for (int i = 0; i < nums.length - 2; i++) {
            
            // Si el número menor ya es mayor a 0, imposible que tres positivos sumen 0
            if (nums[i] > 0) break;

            // Evitar duplicados para el elemento i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // CORRECCIÓN 1: Reiniciar los punteros para CADA posición i
            int left = i + 1;
            int right = nums.length - 1;

            // CORRECCIÓN 2: Ciclo while para buscar todos los pares posibles para este i
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    
                    // CORRECCIÓN 3: Mover ambos punteros tras encontrar coincidencia
                    left++;
                    right--;

                    // CORRECCIÓN 4: Saltear duplicados en left y right
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } 
                else if (sum < 0) {
                    left++; // Necesitamos aumentar la suma
                } 
                else {
                    right--; // Necesitamos disminuir la suma
                }
            }
        }

        return result;
    }
}