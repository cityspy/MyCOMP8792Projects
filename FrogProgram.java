public class FrogProgram {
    public static void main(String[] args) {
        // Task 1
        Frog myFrog = new Frog("Fred", 1000, 22);
        System.out.println(myFrog);
        System.out.println(myFrog.ageGroup());

        // Task 2
        Frog myFrog1 = new Frog("Fran", 1001, 75);
        System.out.println(myFrog1);
        System.out.println(myFrog1.ageGroup());

        // Task 3
        System.out.println(myFrog.alterName());
        System.out.println(myFrog1.alterName());

        // Printing the names using getter methods
        System.out.println("Frog's name is " + myFrog.getName());
        System.out.println("Frog's name is " + myFrog1.getName());

        // Task 4
        Frog f = myFrog.firstAlphabetically(myFrog1);
        System.out.println(f);

        // Shift name examples
        System.out.println(myFrog.shiftName(5));
        System.out.println(myFrog.shiftName(10));
        System.out.println(myFrog.shiftName(15));
        System.out.println(myFrog1.shiftName(5));
        System.out.println(myFrog1.shiftName(10));
        System.out.println(myFrog1.shiftName(15));
    }
}
