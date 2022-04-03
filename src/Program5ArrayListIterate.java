import java.util.ArrayList;
import java.util.Iterator;

//Write a Java program to iterate through all elements in an array list using
//        Iterator.
public class Program5ArrayListIterate {
    //this method is used to iterate the interger list array
    public static void iterateMethod(){
        //arraylist creation
        ArrayList<Integer> list = new ArrayList();
        list.add(01);
        list.add(02);
        list.add(03);
        list.add(04);
        list.add(05);
        //interate set using Iterator interface
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {
        iterateMethod();
    }



}
