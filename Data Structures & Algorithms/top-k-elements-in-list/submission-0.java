class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. Contar frecuencias de cada número
        HashMap<Integer, Integer> numsDict = new HashMap<>();
        for (int num : nums) {
            numsDict.put(num, numsDict.getOrDefault(num, 0) + 1);
        }

        // 2. Crear Min-Heap ordenado por FRECUENCIA (de menor a mayor)
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(numsDict.get(a), numsDict.get(b))
        );

        // 3. Insertar las claves (los números únicos) en la cola
        for (int key : numsDict.keySet()) {
            pq.add(key);
            // Mantenemos solo los 'k' más frecuentes en la cola
            if (pq.size() > k) {
                pq.poll(); // Elimina el de menor frecuencia
            }
        }

        // 4. Extraer los k elementos restantes al arreglo de resultado
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }

        return result;
    }
}