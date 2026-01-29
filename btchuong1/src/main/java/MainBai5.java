
import java.util.LinkedList;

public class MainBai5 {
    public static void main(String[] args) {
        QueueDemo qd = new QueueDemo();
        LinkedList<Integer> queue = qd.getQueue();

        System.out.println("Danh sách sau khi xử lý: " + queue);
    }
}
