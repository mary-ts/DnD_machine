import java.util.ArrayList;
import java.util.Collections;

public class Character {
    diceRoll dice = new diceRoll();

    public int sum3(){
        ArrayList<Integer> nums = new ArrayList<>();
        int random;
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            random = dice.rollD6();
            nums.add(random);
        }
        Collections.sort(nums);
        nums.remove(0);
        for (int s:
                nums) {
            sum += s;
        }
        return sum;
    }
}
