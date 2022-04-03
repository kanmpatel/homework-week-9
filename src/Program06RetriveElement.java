import java.util.ArrayList;
//Write a Java program to retrieve an element (at a specified index) from a given
//array list
public class Program06RetriveElement {

    //this method is used to Retrieve Element  the color list array
    public static void retrieveElement(){
        //arraylist creation
        ArrayList<String> employeename = new ArrayList();
        employeename.add("megha");
        employeename.add("neha");
        employeename.add("jalpa");
        employeename.add("shilpa");
        employeename.add("jalpa");
        employeename.add("kinjal");
        //for each loop to get all employee name list
        for(String employeename1 : employeename){
            System.out.println(employeename1);
        }

        System.out.println("retrieve the element of given index");
        System.out.println(employeename.get(05));

    }

    public static void main(String[] args) {
        //call the method retrieveElement
        retrieveElement();
    }
}
