class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder removed = new StringBuilder();
        
        for(char c : my_string.toCharArray()) {
            if(c != letter.charAt(0)) {
                removed.append(c);
            }
        }
        
        return removed.toString();
    }
}