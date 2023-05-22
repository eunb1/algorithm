class Solution {
    public int solution(int slice, int n) {
        int pizza = n / slice;
        if(n % slice != 0) {
            pizza += 1;
        }
        return pizza;
    }
}