package calculate;

import java.util.Scanner;

/**Write a java program using the following descriptions
 1. Create one package with name calculate
 2. Create two class with name “Calculator” and “Main”
 3. Create four methods with manes “addition”, “subtraction”, “division”,
 and “multiplication”. All methods are instance method and it doesn’t
 return anything. But it has two parameters with name “int a” and “int
 b”. Also each method have System.out.println(). This prints the result.
 Also create all one more method with name “calculateResult” with
 three parameter with name int a, int b and char symbol. Write the logic
 in calculateResult method that when user enter first number and
 second number and symbol based on symbol it does calculate.
 4. Write a “main” method into main class. It has scanner that takes user
 input. Also write the logic that it ask user to “Enter first Number:”,
 “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
 enter + symbol result like “Addition of 5 and 10 is: 15” and respective
 for other symbol.
 5. With the result it’s also print one more message “Would you like to do
 more calculation Please enter “Y” or “N” :” (Hint use while loop if user
 enter Y program asking the user to enter First Number, and if user enter
 N programme should terminate)
 *
 */

public class Main {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the First Number :");
        int a = Input.nextInt();
        System.out.print("Enter the secound Number :");
        int b = Input.nextInt();
        System.out.print("Please enter one of symbol +,-,*, /:");
        char symbol = Input.next().charAt(0);

        Calculator obj = new Calculator();
        obj.calculateResult(a,b,symbol);

        System.out.print("Would you like to do more calculation Please enter 'Y' or 'N' :");
        while(Input.hasNext()){
            char ask = Input.next().charAt(0);
            if(ask == 'Y' || ask == 'y'){
                System.out.print("Enter the First Number :");
                a = Input.nextInt();
                System.out.print("Enter the secound Number :");
                b = Input.nextInt();
                System.out.print("Please enter one of symbol +,-,*, /:");
                symbol = Input.next().charAt(0);
                obj.calculateResult(a,b,symbol);
            } else {
                break;
            }
            System.out.print("Please enter again 'Y' or 'N' :");
            Input.nextLine();


        }





    }

}
