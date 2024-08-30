public class Boat {

    private String name;
    private String boatClass;
    private int regNum;
    private double yardstick;
    private static int totalBoats = 0;
    private int seqNum;

    // Default constructor
    public Boat() {
        this.name = "unknown";
        this.boatClass = "unknown";
        this.regNum = -1;
        this.yardstick = 100.0;
        totalBoats++;
        this.seqNum = totalBoats;
    }

    // Constructor with parameters
    public Boat(String initName, String initBoatClass, int initRegNum, double initYardstick) {
        this.name = initName;
        this.boatClass = initBoatClass;
        this.regNum = initRegNum;
        this.yardstick = initYardstick;
        totalBoats++;
        this.seqNum = totalBoats;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getBoatClass() {
        return boatClass;
    }

    public int getRegNum() {
        return regNum;
    }

    public double getYardstick() {
        return yardstick;
    }

    public static String getTotal() {
        return ("Total number of boats created = " + totalBoats);
    }

    public int getSeqNum() {
        return seqNum;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setBoatClass(String boatClass) {
        this.boatClass = boatClass;
    }

    public void setRegNum(int regNum) {
        this.regNum = regNum;
    }

    public void setYardstick(double yardstick) {
        this.yardstick = yardstick;
    }

    // toString method
    public String toString() {
        return String.format("Boat %s, Class = %s, Registration # = KA %d", name, boatClass, regNum);
    }

    // Adjusted race time method
    public String adjustedRaceTime(int start, int end) {
        if (start >= end) {
            return "Incorrect time keeping";
        }

        // Extract hours and minutes from start and end times
        int startHour = start / 100;
        int startMinute = start % 100;
        int endHour = end / 100;
        int endMinute = end % 100;

        // Convert times to total minutes
        int startTotalMinutes = startHour * 60 + startMinute;
        int endTotalMinutes = endHour * 60 + endMinute;

        // Calculate elapsed time
        int elapsedMinutes = endTotalMinutes - startTotalMinutes;

        // Calculate adjusted time
        double adjustedTime = (elapsedMinutes / yardstick) * 100;
        return String.format("%.2f", adjustedTime);
    }
}
