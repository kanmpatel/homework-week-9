package calculate;

public class Calculator {
   //this method used for addition
    public void addition(int a,int b){
        System.out.println("Addition of "+ a + " and  " + b + " is:" + (a+b));
    }
    //this method used for subtraction
    public void subtraction(int a,int b){
        System.out.println("subtraction of "+ a + " and  " + b + " is:" + (a-b));
    }
    //this method used for division
    public void division(int a,int b){
        System.out.println("division of "+ a + " and  " + b + " is:" + (a/b));
    }
    //this method used for multiplication
    public void multiplication(int a,int b){
        System.out.println("multiplication of "+ a + " and  " + b + " is:" + (a*b));
    }
    //this method is used to show the result of perticular oprator operation
    public void calculateResult(int a,int b,char symbol){

        if(symbol == '+'){
            addition(a,b);
        } else if(symbol == '-'){
            subtraction(a,b);
        } else if(symbol == '*'){
            multiplication(a,b);
        } else if(symbol == '/'){
            division(a,b);
        } else {
            System.out.println("Invalid opreator");
        }

    }


}
