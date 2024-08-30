## Decisions

For this lab exercise we will begin to look at making decisions within our code. Selection or decisions are a key
component of any program that you write. By allowing the program to make decisions based on values provided not only
allows for interactivity but also enables a generalised set of instructions that could be applied to many variations of
execution.

### Simple Flow of Control - Checkpoint 12

**_if_ Statement, _if ... else_ Statement**
In the programs you have seen so far, we have had a list of statements, which were executed in the order that they
were written in your program (the **.java** file). In more complicated programs, you may need to change the order
in which statements are executed. The order of execution for statements in your program is referred to as **flow of
control**.  
Let’s look at one example. Suppose you are organising an event that costs $12 for everyone older than 8 and $6 for
anyone 8 years or younger. One way to do this is to say the ticket is $12, unless you are 8 or younger, then it is
$6. In this case, you can write:

|                                         |       |                         |
|:----------------------------------------|:-----:|:------------------------|
| **pseudocode**                          |       | **java equivalent**     |
| --------------------------------------- | ----- | ----------------------- |
| ticket = 12                             |       | double ticket = 12.0;   |
| age                                     |       | double age;             |
| if age is less than or equal to 8 then  |       | if (age <= 8)           |
| ticket = 6                              |       | ticket = 6;             |

There is another way to do this.

|                                         |       |                         |
|:----------------------------------------|:-----:|:------------------------|
| **pseudocode**                          |       | **java equivalent**     |
| --------------------------------------- | ----- | ----------------------- |
| if age is less than or equal to 8 then  |       | if (age <= 8)           |
| ticket = 6                              |       | ticket = 6;             |
| otherwise                               |       | else                    |
| ticket = 12                             |       | ticket = 12;            |

Both of these do the same thing. In both cases, you will change the flow of execution when you reach the statement;
**“age is 8 or younger”**. If that statement happens to be true, i.e., age is 8 or younger, then the value of ticket
will
change to $6, otherwise, you will go with its initialised value of $12.
In general, the statement in the parentheses is either **TRUE** or **FALSE**. Depending on that being true or
false, you will change the flow of execution of the statements in the program.
In order for your program to decide about the flow of the execution, it uses a comparison operator.
Examples of comparison operators are:

1. _**equal to**_, **=** , which will be written as == (2 =’s) in java, with a general form of:<br>
   _statement1 == statement2_.<br>
   <samp>Example: y == x + 1</samp>
2. _**not equal to**_, &ne;, which will be written as != in java, with a general form of:<br>
   _statement1 != statement2_.<br>
   <samp>Example: y != x + 1</samp>
3. _**less than**_, <, which will be written as < in java, with a general form of:<br>
   _statement1 < statement2_.<br>
   <samp>Example: y < x + 1</samp>
4. _**less than or equal to**_, &le;, which will be written as <= in java, with a general form of:<br>
   _statement1 <= statement2_.<br>
   <samp>Example: y <= x + 1</samp>
5. _**greater than**_, >, which will be written as > in java, with a general form of:<br>
   _statement1 > statement2_.<br>
   <samp>Example: y > x + 1</samp>
6. _**greater than or equal to**_, &ge;, which will be written as >= in java, with a general form of:<br>
   _statement1 >= statement2_.<br>
   <samp>Example: y >= x + 1</samp>
7. _**OR**_, which will be written as || (2 of the |’s) in java, with a general form of:<br>
   _statement1 || statement2_.<br>
   Which may be True when EITHER one of the two statements are TRUE.
8. _**AND**_, which will be written as && (2 of the &’s) in java, with a general form of:<br>
   _statement1 && statement2_.<br>
   Which may be True ONLY when both statements are TRUE.


Now that you have learned about changing the flow of control, let’s look at the program `Ticket.java` that asks
users to enter an age and displays the cost of the ticket based on the criteria that was given in the prelude (first
example). Try the other method to make sure it works.

Once you are confident that the code works as expected change it so that it displays:<br>  
**_$6_** for people who are _**8 years old or younger**_ **OR** _**65 years or older**_.  <br>  
Ensure you use the _**OR**_ predicate from Point 7 above in your solution (there is no need to use and _else_
statement).

---

### Number Evaluation: Nested IF...ELSE - Checkpoint 13

Open the file `NumberEvaluation.java`:

1. Write a program that prompts the user to input a number.
2. The program should then output the number and message saying whether the number is "<tt>Positive", “Negative”, or
   “Zero”</tt>.
3. It should further output whether the number is <tt>"odd"</tt> or <tt>"even"</tt> (zero is counted as even)

Examples (user input is shown <b><mark>highlighted</mark></b>, output shown in **bold**):

<tt>Enter an integer:  
<mark>21</mark>  
**Positive and odd**  
</tt>  
<tt>Enter an integer:  
<mark>0</mark>  
**Zero and even**  
</tt>  
<tt>Enter an integer:  
<mark>-10</mark>  
**Negative and even**  
</tt>

---

### Calculate BMI: More IF...ELSE statements - Checkpoint 14

Open the file `CalculateBMI.java`.
You need to write a program that accepts user input for the <tt>**weight**</tt> and <tt>**height**</tt> of a
person and then uses these values to calculate the BMI category for that person.   
BMI is the body mass index of a person and is calculated by:

* taking the weight (in kilograms) and dividing it by the square of the height (in metres).

The following table provides an interpretation of the BMI based on calculated values:

|             |        |                    |
|:------------|:------:|:-------------------|
| **BMI**     |        | **Interpretation** |
| ----------- | ------ | -----------------  |
| Below 18.5  |        | Underweight        |
| 18.5 - 24.9 |        | Normal             |
| 25.0 - 29.9 |        | Overweight         |
| Above 30.0  |        | Obese              |


Complete the code to output the correct interpretation

#### Examples

user input is shown <b><mark>highlighted</mark></b>, output shown in **bold**  
(<i>the output **must** be to one decimal place</i>)  
**_Also ensure that the input is on the same line as the request (see below)._**<br>  
<tt>Enter your weight in kilograms: <mark>65.7</mark>  
Enter your height in metres: <mark>1.65</mark>  
**Your BMI is 24.1, which means you are in the Normal range.**
</tt>  <br><br>
<tt>Enter your weight in kilograms: <mark>75.0</mark>  
Enter your height in metres: <mark>1.7</mark>  
**Your BMI is 26.0, which means you are in the Overweight range.**
</tt>

**Hint:**  
There are number of ways to format for one decimal place:
<ul>
    <li>NumberFormat  </li>
    <li>DecimalFormat </li> 
    <li>Math.round() </li> 
</ul>

However, not all of them guarantee one decimal place if the result is an exact integer value. You **_will_** have to
experiment to find the ones that do.

---

### Annuities: Checkpoint 15

Open the file `Annuities.java`:

An annuity (sometimes called a reverse mortgage) is an account that yields a fixed payment
every year until it is depleted. The present value of the annuity is the amount that you
would need to invest at a given interest rate so that the payments can be made.
The present value of an annuity (PV<sub>ann</sub>) at the time of the first deposit can be calculated
using the following formula:

![](../specifications/annuities.png "Annuities formula")

Where:

|           |                                                               |
|----------:|:--------------------------------------------------------------|
| **_PMT_** | : periodic payment                                            |
|   **_r_** | : periodic interest or compound rate                          |
|   **_n_** | : number of payments                                          |

---

1. Write a program to calculate the present value of an annuity if the periodic payment is $10,000 every year for
   20 years with an interest rate of 8% (i.e. **_PMT_** = 10000, **_r_** = 0.08 and **_n_** = 20).

2. Spend some time looking at the algorithm and explore how you can implement it in code. Remember that you can use
   the `Math.pow(x, y)` to calculate x<sup>y</sup>.

3. Consider the type of variables required to achieve the result shown in 4 below. Does this look like you need to
   use integers or floating point numbers?

4. Verify the accuracy of your algorithm implementation by checking the result displayed is: 98181.47407449293  
   (_You will format this into dollars later_)

5. Now that you have the functionality working correctly you should implement a robust version of this application.
   To complete this you should prompt the user for the values for the three variables of the algorithm. Be aware that 
   the user will enter the interest rate as a percentage (e.g., 12), but the formula expects a decimal value (e.g., 0.12).

6. You should also use a `NumberFormat.getCurrencyInstance()` object to format the output in a dollar format.

7. You should prompt and process each individual value on separate lines, for example (user input is shown
   **<mark>highlighted</mark>**, output shown in **bold**):


<tt>Enter the PMT value:  
<mark>5000</mark>  
Enter the interest rate:  
<mark>12</mark>  
Enter the number of payments:  
<mark>15</mark>  
**Present Value of the annuity is: $34,054.32**
</tt>
<br><br>

<tt>Enter the PMT value:  
<mark>25363</mark>  
Enter the interest rate:  
<mark>5.65</mark>  
Enter the number of payments:  
<mark>17</mark>  
**Present Value of the annuity is: $272,554.61**
</tt>

---