public class Main {

    public static void main(String[] args) {
        Node n1 = new Node(12);
        System.out.println("Размер листа - "+n1.size());
        //System.out.println(n1);
        n1.printAll(n1);
        n1.addEnd(n1,22);
        System.out.println("Размер листа - "+n1.size());
        n1.printAll(n1);
        Node n2 = new Node(13);
        System.out.println("Размер листа - "+n2.size());
        //System.out.println(n1);
        
        n1.addEnd(n1,34);
        System.out.println("Размер листа - "+n1.size());
        //n1.addEnd(n1,44);
        
        System.out.println(n1);
        n1.printAll(n1);
       
    }
}