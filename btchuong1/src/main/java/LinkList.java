import java.util.LinkedList;

class QueueDemo {
    public LinkedList<Integer> getQueue() {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        queue.addFirst(5);
        queue.addLast(40);

        queue.removeFirst();
        queue.removeLast();

        return queue;
    }
}
