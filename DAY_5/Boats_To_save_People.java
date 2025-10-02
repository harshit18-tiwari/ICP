import java.util.Arrays;

public class Boats_To_save_People {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0, right = people.length - 1;
        int ans = 0;
        while(left <= right) {
            if(people[left] + people[right] <= limit) {
                left++;
                right--;
            } else {
                right--;
            }
            ans++;
        }
        return ans;
    }
}
