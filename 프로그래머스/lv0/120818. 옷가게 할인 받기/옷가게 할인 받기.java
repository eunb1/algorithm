class Solution {
    public int solution(int price) {
        int money = 0;
        if(price >= 500000) {
            money = (int) (price * 0.8);
        } else if(price >= 300000) {
            money = (int) (price * 0.9);
        } else if(price >= 100000) {
            money = (int) (price * 0.95);
        } else {
            money = price;
        }
        
        return money;
    }
}