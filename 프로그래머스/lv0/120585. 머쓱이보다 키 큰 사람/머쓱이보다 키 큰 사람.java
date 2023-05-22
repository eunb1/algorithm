import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        int count = 0;
        Arrays.sort(array);
        
        for(int i = array.length - 1; i >= 0; i--) {
            if(array[i] <= height) break;
            count++;
        }
        
        return count;
    }
}