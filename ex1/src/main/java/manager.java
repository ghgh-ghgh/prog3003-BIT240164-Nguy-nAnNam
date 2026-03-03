
import java.util.ArrayList;
import java.util.List;

class Manager<T> {
     private final List<T> data = new ArrayList<>();
     public void add(T item){
         data.add(item);
     }
     public List<T> getAll() {
         return data;
     }
}