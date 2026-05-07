class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> solution = new ArrayList<>();
        solution.add(intervals[0]);

        for(int[] interval : intervals){
            int start = interval[0];
            int end = interval[1];
            int lastEnd = solution.get(solution.size()-1)[1];

            if(start<=lastEnd){
                solution.get(solution.size()-1)[1] = Math.max(end, lastEnd);
            } else {
                solution.add(new int[]{start, end});
            }
        }

        return solution.toArray(new int[solution.size()][2]);
    }
}
