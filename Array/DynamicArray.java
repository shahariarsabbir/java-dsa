import java.util.ArrayList;


public class DynamicArray {
    public static void main(String[] args){

         ArrayList<Integer> list = new  ArrayList<>();
         list.add(10);
         list.add(20);
         list.add(30);
         list.add(40);
         list.add(50);
         list.add(60);
         list.add(70);

         list.toArray();
         list.remove(2);
         list.size();
        
         System.out.println(list);

    }
}
