public class Stack {

    //Stack attributes declared privately
    private String MYSTACK[];
    private int top;
    private int size;
    
    //constructor: initialize the attributes of the stack MYSTACK
    public Stack(int s){
        this.MYSTACK = new String[s];
        this.size = s;
        this.top = -1;
    }
    
    public void Push(String i){
        if(top == size){
            System.out.println("MYSTACK is full");
        }
        else if(top < size){
            top++;
            MYSTACK[top] = i;
        }
    }
    
    public String Pop(){
        String item = null;
        if(top < 0){
            System.out.println("MYSTACK is empty");
        }
        else{
            item = MYSTACK[top];
            top--;
        }
        
        return item;
    }
    
    public int getTop(){
        return top;
    }
    
    public void displayStack(){
        for(int i=0; i<top; i++){
            System.out.println(MYSTACK[i]);
        }
    }
    
    public boolean isEmpty(){
        if(top < 0){
            return true;
        }
        return false;
    }
    
    public char Peek(){
        String item = null;
        if(top >=0 ){
            item = MYSTACK[top];
        }
        
        return item.charAt(0);
    }
}
