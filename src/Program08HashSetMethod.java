import java.util.HashSet;
import java.util.Set;

//Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
//Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
//and if else)
public class Program08HashSetMethod {
    //this method to set the vale using hashset and find number is between 1 to 10 or not
    public static void hashset(){
        //hashset creation
        Set<Integer> list = new HashSet();
        //add the value
        list.add(4);
        list.add(8);
        list.add(7);

        for(int i = 1; i <= 10; i++) {
            if(list.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }

    }

    public static void main(String[] args) {
        hashset();
    }

}
