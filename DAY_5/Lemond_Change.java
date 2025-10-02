public class Lemond_Change {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;

        int ten = 0;

        for(int ele : bills) {
            if(ele==5)  five++;

            else if(ele==10) {
                if(five==0) return false;
                five--;
                ten++;
            }

            else {
                if(ten>0 && five>0) {
                    ten--;
                    five--;
                } else if(five>=3) {
                    five-=3;
                } else return false;
            }


        }

        return true;

    }

}
