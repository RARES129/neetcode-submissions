class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i<numCourses; i++){
            graph.add(new ArrayList<>());
        }

        int[] visiting = new int[numCourses];

        for(int i = 0; i < prerequisites.length; i++){
            int course = prerequisites[i][0];
            int prereq = prerequisites[i][1];

            graph.get(prereq).add(course);
            visiting[course]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i<numCourses; i++){
            if(visiting[i] == 0){
                queue.add(i);
            }
        }

        int coursesTaken = 0;

        while(!queue.isEmpty()){
            int currentCourse = queue.poll();
            coursesTaken++;

            List<Integer> dependentCourses = graph.get(currentCourse);

            for(int i = 0; i<dependentCourses.size(); i++){
                int nextCourse = dependentCourses.get(i);
                visiting[nextCourse]--;

                if( visiting[nextCourse]==0){
                    queue.add(nextCourse);
                }
            }
        }

        return coursesTaken == numCourses;
    }
}
