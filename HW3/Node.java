public class Node {
    int value;
    Node nextNode = null;
     int count = 1;

    public Node(Integer valu){
        this.value = valu;
        this.nextNode = null;

    }
   
    // public void add(Integer val) {
    //     nextNode = new Node(val);
        
    // }

    public void addEnd ( int val) {
        System.out.println("Dobavlzem "+val);
        if (this.nextNode == null) {
            this.nextNode = new Node(val);
            count++;
            System.out.println("Sozdal");
        } else {
            System.out.println("Perehod");
            nextNode.addEnd( val);
            
        }

       // return this;
    }

    public int size() { return count;}

    // private String print(Node n){
    //     StringBuilder rez = new StringBuilder();
    
    // if (n.nextNode != null) {
    //     System.out.println("next Print");
    //     rez.append(",");
    //   rez.append(String.valueOf(getValue(n.nextNode)));  

    // }
    // else{
    //     rez.append(String.valueOf(n.getValue(n)));
    // }
    // return rez.toString();       
    // }


    public void printAll(Node n){
        if (n.nextNode != null) {
            System.out.print(String.valueOf(n.value)+" , ");
            printAll(n.nextNode);
        } else {
            System.out.println(String.valueOf(n.value));           
        }
    }

    private Integer getValue(Node n){
        return n.value;
    }

    // @Override
    // public String toString() {
    //     return print(Node n,int val);
    // }


    @Override
     public String toString() {    
    StringBuilder rez = new StringBuilder();
    rez.append(String.valueOf(value));
    if (this.nextNode != null) {
        System.out.println("next Print");
        rez.append(",");
      rez.append(String.valueOf(getValue(this.nextNode)));  

    }
    return rez.toString();
    }

}
