public class Queue {
    //Queue attributes declared privately
    private String MYQUEUE[];
    private int front;
    private int rear;
    private int size;
    
    //constructor: initialize the attributes of the stack MYQUEUE
    public Queue(int s){
        this.MYQUEUE = new String[s];
        this.size = s;
        this.front = -1;
        this.rear = -1;
    }
    
    public void Enqueue(String i){
        if(rear == size){
            System.out.println("MYQUEUE is full");
        }
        else if(rear < size){
            rear++;
            if(rear == size){
                System.out.println("MYQUEUE is full");
                rear--;
            }
            else{
                MYQUEUE[rear] = i;
                front = 0;
            }
        }
    }
    
    public String Dequeue(){
        String item = "";
        if(rear < 0 ){
            System.out.println("MYQUEUE is empty");
            front = -1;
        }
        else{
            item = MYQUEUE[front];
            rear--;
            for(int i=0; i<=rear; i++){
                MYQUEUE[i] = MYQUEUE[i+1];
            }
            if(rear < 0){
                front = -1;
            }
        }
        
        return item;
    }
    
    public int getFront(){
        return front;
    }
    
    public int getRear(){
        return rear;
    }
    
    public void displayQueue(){
        if(rear < 0 ){
            System.out.println("MYQUEUE is empty");
        }
        else{
            for(int i=front; i<=rear; i++){
                System.out.println(MYQUEUE[i]);
            }
        }
    }
    
    public boolean isEmpty(){
        if(rear < 0){
            return true;
        }
        return false;
    }
}
