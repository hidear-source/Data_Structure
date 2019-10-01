public class StackTest {
    
    public static void main(String[] args) {
        
        Stack s = new Stack(10);
        
        System.out.println(s.getTop());    // -1
        System.out.println(s.Pop());       // MYSTACK is empty
        
        s.Push("A");
        s.Push("B");
        s.Push("C");
        s.Push("D");
        s.Push("E");
        s.Push("F");
        s.Push("G");
        s.Push("H");
        s.Push("I");
        s.Push("J");
        s.Push("K");    // MYSTACK is full
        s.Push("L");    // MYSTACK is full
        
        s.displayStack();
        
        System.out.println(s.Pop());       // J
        System.out.println(s.getTop());    // 8
    }
    
}
