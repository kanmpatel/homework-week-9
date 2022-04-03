import java.util.ArrayList;
//Write a Java program to create a new array list, add some colours (string) and
//printout the collection using for each loop.
public class Program4ArrayListColour {
    //this method is used to get the color list array
    public void arrayListColours(){
        //arraylist creation
        ArrayList<String> colourList = new ArrayList();
        colourList.add("Red");
        colourList.add("Blue");
        colourList.add("White");
        colourList.add("Black");
        colourList.add("Gray");
        colourList.add("Yellow");
        //for each loop to get all color list
        for(String colourName : colourList){
            System.out.println(colourName);
        }

    }

    public static void main(String[] args) {
        //call the method arrayListColours
        Program4ArrayListColour obj = new Program4ArrayListColour();
        obj.arrayListColours();
    }

}
