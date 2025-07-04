//Alright .......so let's to proceed Question 4

//Write a Java program to create a stack with
// hybrid items using Stack collection.
//HINT: Stack stck_list = new Stack();
import java.util.Stack;
public class Main{
    public static void main(String[] args) {

        //All this one is still grammar sha what they are trying to test is to see if you can mix data types
        //Lemme explain further.........................
        Stack<Object> stack = new Stack<>();

        //However with the Object Type you can mix alot pf datatypes sha

        stack.push("Hello"); // String
        stack.push(10);// Integer
        stack.push(10.5);//Float
        stack.push(true);//boolean

        //Is like you are getting the gist now ba?

        System.out.println(stack);

    }

}