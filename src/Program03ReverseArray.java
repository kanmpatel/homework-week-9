//Write a Java program to reverse an array of integer values
public class Program03ReverseArray {
    //this method is used to reverseArray
    public static void reverseArray(){
       int a[] = {1,2,3,4,5,6,7};
        System.out.println("before reverse Araay");
        //for each loop to get the value form array
        for(int res : a){
            System.out.print(res + "  ");
        }

        System.out.println();
        System.out.println("after reverse Araay");
        //for loop to reverse the array
        for(int i = a.length-1; i >= 0;i--)
        {
            System.out.print(a[i]+ "  ");
        }
    }

    public static void main(String[] args) {
        //call reverseArray method
        reverseArray();
    }
}
