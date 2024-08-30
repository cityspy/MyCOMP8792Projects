public class Assignment {

    public static void main(String[] args) {
        // 1.Declare an int variable called total with an initial value of 0
        int total = 0;
        //2.Declare an int variable called val1 which has no initial value
        int val1;
        //3.Declare an int variable called val2 which has no initial value
        int val2;
        //4.Assign 31 to the variable val1
        val1 = 31;
        //5.Assign a value 1 bigger than the value of val1 to the variable val2 (you should not use the literal value 32)
        val2 = val1 + 1;
        //6.Assign the sum of val1 and val2 to the variable total
        total = val1 + val2;
        //7.Print out the values of val1, val2 and total so that each is separated by a comma
        System.out.println(val1 + ", " + val2 + ", " + total);
    }

}
