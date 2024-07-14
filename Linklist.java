public class Linklist {
    
    class Node{
        int info;
        Node link;

        public Node(int info){
            this.info=info;
            this.link=null;
        }
    }

    public Node first=null;

    public void insertAtFirst(int data){
        Node newNode=new Node(data);
        if(first==null){
            System.out.println("Linked List Is Eampty.");
        }
        else{
            newNode.link=first;
            newNode=first;
        }
    }

}
