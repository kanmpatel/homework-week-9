import java.util.ArrayList;

// Write a Java program to test an array list is empty or not. Define array list with
//underground tube names
public class Program07listEmpty {



    //this method is used to list is empty or not
    public static void emptyArray(){
        //arraylist creation
        ArrayList<String> tubeName = new ArrayList();

        tubeName.add("London Overground");
        tubeName.add("Metropolitan");
        tubeName.add("Northern");
        tubeName.add("Piccadilly");
        tubeName.add("Bakerloo");
        tubeName.add("Central");
        //for each loop to get all tube name list
        for(String name : tubeName){
            System.out.println(name);
        }

        if(tubeName.isEmpty()){
            System.out.println("underground tube name list is empty");
        } else {
            System.out.println("underground tube name list is not empty");
        }

    }

    public static void main(String[] args) {
        emptyArray();
    }

}
