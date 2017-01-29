
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by admin on 30.01.2017.
 */
public class QuranCards {
    public static void main(String args[]) {
        Map<Integer, String> suraNameMap = new HashMap<Integer, String>();
        suraNameMap.put(1, "al-Fatiha");
        suraNameMap.put(2, "al-Baqara");
        suraNameMap.put(3, "Alu Imran");
        suraNameMap.put(4, "an-Nisa");
        suraNameMap.put(5, "al-Maida");
        suraNameMap.put(6, "al-Anam");
        suraNameMap.put(7, "al-Araf");
        suraNameMap.put(8, "al-Anfal");
        suraNameMap.put(9, "at-Tauba");
        suraNameMap.put(10, "Yunus");
        final int FIRST = 1;
        final int LAST = suraNameMap.size();
        int score = 0;

        //while (true)
        for (int i = 0; i <= LAST; i++) {
            int target = FIRST + (int) (Math.random() * ((LAST - FIRST) + 1));
            Scanner scanner = new Scanner(System.in);
            System.out.println(suraNameMap.get(target));
            if (scanner.nextInt() == target) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong :(");
                score--;
            }

        }
        System.out.print("Your score is " + score+". ");
        //System.out.print(1.0*score/LAST*100+"% accuracy");

    }

}
