import java.text.DecimalFormat;
import java.util.Random;
public class BoatMaker {

    public static void main(String[] args) {
        System.out.println("Starting boat application");
        System.out.println("Boat #\tStart\tEnd\tYdstk\tAdjusted Time (mins)");
        System.out.println("--------------------------------------------------");

        Random rand = new Random();
        double bestTime = Double.MAX_VALUE;
        int bestBoat = -1;

        for (int index = 1; index <= 8; index++) {
            int start = 1118;  // 固定出發時間
            double yardstick = 91 + rand.nextInt(10); // 隨機生成 yardstick 範圍在 91 到 100 之間
            Boat boat = new Boat();
            boat.setYardstick(yardstick);
            int end = getCorrectedTime(1030, 1230); // 隨機生成結束時間

            String adjustedTime = boat.adjustedRaceTime(start, end);
            if (!adjustedTime.equals("Incorrect time keeping")) {
                double time = Double.parseDouble(adjustedTime);
                if (time < bestTime) {
                    bestTime = time;
                    bestBoat = index;
                }
            }

            // Format the adjusted time to exclude ".00" if it's just zero
            if (adjustedTime.equals("Incorrect time keeping")) {
                System.out.printf("Boat %d\t%d\t%d\t%.0f\t%s\n", index, start, end, yardstick, adjustedTime);
            } else {
                double roundedTime = Double.parseDouble(adjustedTime);
                String formattedTime = (roundedTime % 1 == 0) ? String.format("0.##", roundedTime) : adjustedTime;
                System.out.printf("Boat %d\t%d\t%d\t%.0f\t%s\n", index, start, end, yardstick, formattedTime);
            }
        }

        System.out.println("--------------------------------------------------");
        System.out.println("The winner of the race is: Boat " + bestBoat + " with a time of " + bestTime + " minutes");

        // Output the total number of boats created
        //System.out.println("Total number of boats created = " + Boat.getTotal());
        System.out.println(Boat.getTotal());
    }

    public static int getCorrectedTime(int min, int max) {
        Random rand = new Random();
        int time = rand.nextInt(max - min + 1) + min;
        int minutes = time % 100;
        if (minutes > 59) {
            time += 40;
        }
        return time;
    }
}
