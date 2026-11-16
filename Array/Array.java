import java.util.*;

public  class Array {

    private int[] items;
    private int count;

    public Array(int lenght){
        items = new int[lenght];
    }

    public void print(){
        for(int i=0; i<items.length;i++){
            System.out.println(items[i]);
        }
    } 

    public void insert(int item){
        if(items.length == count){
            int[] newitems = new int[count * 2];
            for(int i=0;i<count;i++)
                newitems[i]=items[i];
            items = newitems;
        }
        items[count++] = item;
    }

    public void removeAt(int index){
        if(index < 0 || index >= count)
            throw new IllegalArgumentException();
        for(int i=index;i<count;i++){
            items[i] = items[i+1];
        }
        count--;
    }

    public void indexOf(int item){
        for(int i=0;i<count;i++){
            if(items[i]==item){
                System.out.println("Index of " + item + " is: " + i);
                return;
            }
        }
        System.out.println("Item not found");
    }

}