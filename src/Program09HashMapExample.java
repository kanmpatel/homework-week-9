import java.util.HashMap;
import java.util.Map;

//Create a HashMap object called people that will store String keys and Integer
//values: And use for each loop to iterate the value from Map
public class Program09HashMapExample {
    //this method is used to set and get the value of hasmap
    public static void hashMap(){
       //declare map
        //ArrayList<String> list = new ArrayList();
        Map<String,Integer> list = new HashMap<>();
        list.put("Audi",15000);
        list.put("BMW",30000);
        list.put("Ford",50000);
        list.put("Farari",5641000);
        list.put("Range Rover",78000);
        //get the value using for loop
        //get the value using for loop
        for(Map.Entry<String,Integer> listname : list.entrySet()){
            System.out.println(listname);
        }
    }

    public static void main(String[] args) {
        hashMap();
    }

}
