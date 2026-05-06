class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSet = new HashSet<>();
        int start = 0;
        int response = 0;

        for( int i = 0; i<s.length(); i++){
            while(charSet.contains(s.charAt(i))){
                charSet.remove(s.charAt(start));
                start++;
            }
            charSet.add(s.charAt(i));
            if(response<(i+1-start)){
                response=(i+1-start);
            }
        }

        return response;

    }
}
