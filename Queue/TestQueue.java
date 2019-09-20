public class TestQueue {
    
    public static void main(String[] args) {
        
        Queue q = new Queue(10);
        
        System.out.println(q.getFront());   // -1
        System.out.println(q.getRear());    // -1
        System.out.println(q.Dequeue());    // -1
        
        q.Enqueue("A");
        q.Enqueue("B");
        q.Enqueue("C");
        q.Enqueue("D");
        q.Enqueue("E");
        q.Enqueue("F");
        q.Enqueue("G");
        q.Enqueue("H");
        
        System.out.println(q.getFront());   // 0
        System.out.println(q.getRear());    // 4
        System.out.println(q.Dequeue());    // A
        
        System.out.println(q.Dequeue());    // B
        System.out.println(q.getRear());    // 2
        System.out.println(q.getFront());   // 0
        
        System.out.println(q.Dequeue());    // C
        System.out.println(q.getFront());   // 0
        System.out.println(q.getRear());    // 1
        
        q.displayQueue();                   // D E F G
    }
    
}
