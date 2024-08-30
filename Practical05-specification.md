## Class Definitions, Logical Operators, Selection and Iteration Statements

### Aims and Objectives

This laboratory has been designed to help you to

- design and modify class definitions,
- extend a class with additional methods and instance variables and
- make use of selection and iteration statements.

### Task 1 - Checkpoint 22

The following class definitions are included:

```java
public class FrogProgram {
   public static void main(String[] args) {
      Frog myFrog = new Frog();  // creates a Frog object
      myFrog.setName("Fred");    // ###
      System.out.println(myFrog);
   }
}

public class Frog() {
   private String name = "Name not set";
   private int id = -1;   // -1 used to indicate it has not been set

   public Frog() {
      // Constructor currently does nothing
      // No code in body of constructor
   }

   public void setName(String name) {
      this.name = name;
   }

   public String toString() {
      return "**** Start of print method ****\n"
              + "Frog's name is " + name + "\n"
              + "Id is " + id;
   }
}
```

Compile and run the application. It should produce the output:  <br><br>
__<samp>**** Start of print method ****  
Frog's name is Fred  
Id is -1</samp>__

Add a method call to the **main** method which sets the instance variable `id`, contained in the object
referred to by `myFrog`, to 1000.
<dl>
<dt>Hint:</dt>
<dd>observe how the instance variable name is being assigned a value in the line ending with // ###. <br>
You will need to create a method in the <code>Frog</code> class similar to the <code>setName(...)</code> method.</dd>
</dl>

Compile and run the application. It should produce the output:   <br><br>
__<samp>**** Start of print method ****  
Frog's name is Fred  
Id is 1000  </samp>__

Modify the program in the following ways.

1. Declare another instance variable in the class `Frog` to store a Frog's age in days. Its initial value should be 0.
2. Add code to the **main** method to assign the instance variable `age`, in the object referred to in my `myFrog`, to
   22 (use the same strategy as for the `id`)
3. Define a method called `ageGroup` in the class `Frog` which has no formal parameters and which returns the age 
   group of the frog (as a String) according to the following table:

   | Age                | Age Group          |
            |:-------------------|:-------------------|
   | 0 to 20 days       | Age group is young              |
   | 21 to 50 days      | Age group is juvenile           |
   | more than 50 days  | Age group is adult              |

4. Add a (call) to the `ageGroup` method (using the object referred to by `myFrog`) to the end of the **main** method inside a `print` statement:

```java
System.out.println(myFrog.ageGroup());
```

5. Run the application from IntelliJ . The following output should be produced:  <br><br>
   __<samp>**** Start of print method ****  
   Frog's name is Fred  
   Id is 1000  
   Age group is juvenile
   </samp>__

---

### Task 2 - Checkpoint 23

Modify the program developed in Task 1 in the following ways.

1. Add a second constructor in the class `Frog` that has three formal parameters, `name`,
   `id` and `age`, and assigns the corresponding instance variables, `name`, `id` and `age` to the formal
   parameters.
2. Create the original `Frog` using this new constructor
3. Add a declaration and statements to the end of the **main** method to create another `Frog`
   with the `name` _Fran_, `id` of _1001_ and an `age` of _75_ (use the newly created constructor). The variable
   `myFrog1` should be used to store a reference to the new frog. Include appropriate calls to `print` and `ageGroup` for this
   frog.
4. Run the application. The following output should be produced:  <br><br>
   __<samp>**** Start of print method ****  
   Frog's name is Fred  
   Id is 1000  
   Age group is juvenile  
   **** Start of print method ****  
   Frog's name is Fran  
   Id is 1001  
   Age group is adult</samp>__  <br><br>

5. Add accessor (getter) methods for the `name`, `id` and `age` in the `Frog` class

---

### Task 3 - Checkpoint 24

Modify the program developed in Task 2 in the following ways.

1. Add a definition of a method called `alterName` to the class `Frog` which **_returns_** the name using the
   following translation table:   
   (You only have to return the altered name **_not change_** the name)

   |                           |                            |
               |:--------------------------:|:--------------------------:|
   | **Original Letter** &emsp; | **Letter after _altered_** |  
   | a                         |             e              |
   | n                         |             e              |
   | r                         |             a              |
   | F                         |             a              |
   | d                         |             i              |

   Make use of a _**for loop**_ and a _**switch statement**_ to control the alteration of letters.  <br><br>

2. At the end of the **main** method add calls to the `alterName` method for both frogs
3. Also print the `name` of each frog as part of the message "Frog's name is ...", using the accessor methods created in Task 2
4. Run the application. The following output should be produced:<br><br>

   __<samp>
   **** Start of print method ****  
   Frog's name is Fred  
   Id is 1000  
   Age group is juvenile  
   **** Start of print method ****  
   Frog's name is Fran  
   Id is 1001  
   Age group is adult  
   aaei  
   aaee  
   Frog's name is Fred  
   Frog's name is Fran   
   </samp>__

---

### Task 4 - Checkpoint 25 (Challenging)

Modify the program developed in Task 4 in the following ways.

1. Add a definition of a method called `firstAlphabetically` to the class `Frog` which takes another `Frog`
   as a formal parameter and returns the `frog` (object reference) whose name comes first alphabetically. For
   example,
   ```
   *************
   Frog f = myFrog.firstAlphabetically(myFrog1);
   System.out.println(f);
   *************
   ```
   Once you have completed the method, add the statements above (those between the asterisks) to the end of the <b>
   main</b> method which should cause the following lines to be printed: <br><br>
   __<samp>
   **** Start of print method ****  
   Frog's name is Fran  
   Id is 1001  
   </samp>__

 <dl>
  <dt>Hint:</dt>
  <dd>You will need to use the <code>compareTo</code> method from the <code>String</code> class to achieve the result.</dd> 
 </dl>

2. Add a new method `shiftName(int shift)` to the class Frog, that returns a shifted version of the frog's name where each 
   letter is changed to `shift` characters later in the alphabet - see below for examples.
   <br><br>
   Example if `shift` was 5 then:

   |                            |                            |
            |:--------------------------:|:--------------------------:|
   | **Original Letter** &emsp; | **Letter after _altered_** |  
   |             a              |             f              |
   |             g              |             l              |
   |             n              |             s              |
   |             x              |             c              |
   |             z              |             e              |
   |             F              |             K              |

   and if we applied this as follows:
      ```
         System.out.println(myFrog.shiftName(5));
         System.out.println(myFrog1.shiftName(15));
      ```
   then the following output would be printed:  
   **<samp>
   Kwji  
   Ugpc
   </samp>**

  <dl>
  <dt>Hint:</dt>
   <dd>In the ascii table <b><kbd>a</kbd></b> is the integer 97 and <b><kbd>z</kbd></b> is the integer 122. 
<br>Similarly, <b><kbd>A</kbd></b> is the integer 65 and <b><kbd>Z</kbd></b> is the integer 90. <br>
So one strategy might be to convert the characters to integers and apply the shift, then convert them back to characters.</dd>
  </dl>
   Add the following statements to the end of the <b>main</b> method.

   ```java
      System.out.println(myFrog.shiftName(5));
        System.out.println(myFrog.shiftName(10));
        System.out.println(myFrog.shiftName(15));
        System.out.println(myFrog1.shiftName(5));
        System.out.println(myFrog1.shiftName(10));
        System.out.println(myFrog1.shiftName(15));
   ```

Once completed the final output should be:

**<samp>
**** Start of print method ****  
Frog's name is Fred  
Id is 1000  
Age group is juvenile  
**** Start of print method ****  
Frog's name is Fran  
Id is 1001  
Age group is adult  
aaei  
aaee  
Frog's name is Fred  
Frog's name is Fran  
**** Start of print method ****  
Frog's name is Fran  
Id is 1001  
Kwji  
Pbon  
Ugts  
Kwfs  
Pbkx  
Ugpc
</samp>**

---