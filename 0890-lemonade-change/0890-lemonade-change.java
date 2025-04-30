class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        int twenty = 0;
    
        int count = bills.length;
        for(int i = 0;i < bills.length;i++){
            if(bills[i] == 5){
                five++;
                count--;
            }
            else if(bills[i] == 10){
                ten++;
                if(five > 0){
                    five--;
                    count--;
                }
            }
            else if(bills[i] == 20){
                if(ten == 0 && five >= 3){
                    five -= 3;
                    count--;
                }
                else if(ten > 0 && five > 0){
                    ten--;
                    five--;
                    count--;
                }
            }
        }
        if(count == 0){
            return true;
        }
        return false;
    }
}