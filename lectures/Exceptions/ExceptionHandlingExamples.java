import java.util.Scanner;

public class ExceptionHandlingExamples
{
    static void checkAge(int age)
    {
        if (age < 18)
        {
            //In Java, there are many different types of exceptions, many of which you will have seen before:
            //ArithmeticException, ArrayIndexOutOfBoundsException, etc.
            //You can actually create and throw these exceptions yourself; see example on the next line.
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else
        {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args)
    {
        //Example 1
        try //This is the block of code where an error might be introduced.
        {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        }
        catch (Exception e) //And the block of code where you do something about the problem...Fail gracefully.
        {
            //print out path trace
            System.out.println(e.toString());
            System.out.println("Something went wrong.");
            throw e;
        }
        finally //This occurs after the above is finished.
        {
            System.out.println("The 'try catch' is finished.");
        }

        //Example 2 - using custom errors
        checkAge(12);

        //Example 3 - catching an error
        System.out.println("Please enter an integer!");
        Scanner intScanner = new Scanner(System.in);
        int i;
        try
        {
            i = Integer.parseInt(intScanner.nextLine());
        }
        catch (Exception e)
        {
            System.out.println("Invalid integer!  Program terminating.");
            throw e;
        }
        System.out.println("This is the int that was entered: " + i + ".");
    }
}
