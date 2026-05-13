class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> numbers = new HashMap<>();
        int[] solution= new int[k];
        for(int i=0;i<nums.length;i++){
            if(numbers.containsKey(nums[i])){
                numbers.put(nums[i], numbers.get(nums[i]) + 1);
            }else{
                numbers.put(nums[i],0);
            }
        }
        Queue<int[]> pq = new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(Integer key: numbers.keySet()){
            pq.add(new int[]{key, numbers.get(key)});
        }
        for(int i=0;i<k;i++){
            solution[i]=pq.poll()[0];
        }
        return solution;


    }
}
