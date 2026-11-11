class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //se cuenta la frecuencia de los numeros
        HashMap<Integer, Integer> numsMap = new HashMap<>();

        for(int num: nums){
            numsMap.put(num, numsMap.getOrDefault(num, 0) + 1);
        }

        //Se crea mini heap
        PriorityQueue<Integer> heap = new PriorityQueue(
            (a,b) -> Integer.compare(numsMap.get(a), numsMap.get(b))
        );

        //se añade elementos al heap
        for(int key: numsMap.keySet()){
            heap.add(key);
            if(heap.size() > k){
                heap.poll();
            }
        }

        //se crea elemento a retornar
        int[] result = new int[k];
        for (int i = 0; i < k; i++){
            result[i] = heap.poll();
        }

        return result;        
    }
}
