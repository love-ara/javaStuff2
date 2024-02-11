package dataStructures;
import java.util.ArrayList;
import java.util.Collection;

public class MySet{
    private ArrayList<String> items;
    private int size;

    public MySet(){
        items = new ArrayList<>();
        boolean isEmpty = true;
    }



    public boolean isEmpty() {
        return items.isEmpty();
    }

    public int size(){
        return items.size();
    }

    public boolean addItem(String item) {
        if(!contains(item)){
            items.add(item);
            return true;
        }
        return false;
    }

    public void addAll(Collection<? extends String> collection){
        for(String item : collection){
            addItem(item);
        }
    }

    public boolean contains(String item){
        return items.contains(item);
    }

    public boolean removeItem(String item){
        return items.remove(item);
    }

    public void clear(){
        items.clear();
    }

//    public String toString(){
//        return items.toString();
//    }
}
