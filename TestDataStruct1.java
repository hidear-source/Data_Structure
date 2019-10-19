public class TestDataStruct1 {
   
    public static void main(String[] args) {
        
        Array A = new Array(3);
        A.setElement(0, "a");
        A.setElement(1, "b");
        A.setElement(2, "c");
        
        Stack B = new Stack(5);
        B.Push("a");
        B.Push("b");
        B.Push("c");
        B.Push("d");
        B.Push("e");
        
        Queue C = new Queue(7);
        C.Enqueue("a");
        C.Enqueue("b");
        C.Enqueue("c");
        C.Enqueue("d");
        C.Enqueue("e");
        
        System.out.print("1. ");
        A.expand(2);
        System.out.println(A.getElement(2));
        
        System.out.print("2. ");
        System.out.println(B.Pop());
        
        System.out.print("3. ");
        System.out.println(C.Dequeue());
        
        System.out.print("4. ");
        A.setBase(25);
        System.out.println(A.getElement(27));
        
        System.out.print("5. ");
        System.out.println(B.Pop());
        
        System.out.print("6. ");
        System.out.println(C.Dequeue());
        
        System.out.print("7. ");
        System.out.println(A.getSize());
        
        System.out.print("8. ");
        B.Push("a");
        System.out.println(B.getTop());
        
        System.out.print("9. ");
        C.Enqueue("a");
        System.out.println(C.Dequeue());
        
        System.out.print("10. ");
        A.expand(50);
        System.out.println(A.getSize());
        
        System.out.print("11. ");
        System.out.println(B.Pop());
        
        System.out.print("12. ");
        System.out.println(C.getRear());
        
        System.out.print("13. ");
        System.out.println(A.getElement(26));
        
        System.out.print("14. ");
        B.Push("b");
        System.out.println(B.Pop());
        
        System.out.print("15. ");
        System.out.println(C.getFront());
    }
    
}
