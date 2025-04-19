import java.util.ArrayList;
import java.util.HashMap;

class Item{
    public int itemId;
    private String itemName;
    private int quantity;
    public Item(int id,String name,int q){
        this.itemId = id;
        this.itemName = name;
        this.quantity = q;
    }
    public String getName(){
        return this.itemName;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public void setName(String name){
        this.itemName = name;
    }
    public void setQuantity(int q){
        this.quantity = q;
    }
}
public class MainProgram{
    public static void main(String[] args){
        HashMap<Integer,Item> map = new HashMap<>();
        Item item1 = new Item(1,"Apple",5);
        Item item2 = new Item(5,"Mangoes",10);
        Item item3 = new Item(2,"Milk",3);
        Item item4 = new Item(4,"Pen",20);
        Item item5 = new Item(13,"Pencil",15);

        map.put(item1.itemId,item1);
        map.put(item2.itemId,item2);
        map.put(item3.itemId,item3);
        map.put(item4.itemId,item4);
        map.put(item5.itemId,item5);

        //sorting
        ArrayList<Item> l = new ArrayList<>();
        for(int i : map.keySet()){
            l.add(map.get(i));
        }
        System.out.println(" Before sorting the list by quantity : ");
        for(int i =0;i<l.size();i++){
            System.out.println(l.get(i).itemId +" "+l.get(i).getName()+" "+l.get(i).getQuantity());
        }
        bubbleSort(l);
        System.out.println(" After sorting : ");
        for(int i =0;i<l.size();i++){
            System.out.println(l.get(i).itemId +" "+l.get(i).getName()+" "+l.get(i).getQuantity());
        }

        //searching

        int index = linearSearch(l,"Milk");
        if(index != -1){
            System.out.println("element found at position "+ (index+1));
        }else{
            System.out.println("element not found !");
        }
    }

    public static void bubbleSort(ArrayList<Item> l){
        for(int i=0;i<l.size();i++){
            for(int j=i+1;j<l.size();j++){
                if(l.get(j).getQuantity()<l.get(i).getQuantity()){
                    Item temp = l.get(i);
                    l.set(i,l.get(j));
                    l.set(j,temp);
                }
            }
        }
    }
    public static int linearSearch(ArrayList<Item> l, String n){
        for(int i=0;i<l.size();i++){
            if(l.get(i).getName().equals(n)){
                return i;
            }
        }
        return -1;
    }
}