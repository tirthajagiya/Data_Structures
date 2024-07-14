class LinkList{
    class Node{
        int info;
        Node link;
    
        public Node(int info){
            this.info=info;
            this.link=null;
        }
    }
    public Node first=null;
    public void insertAtFirst(int info){
        Node newNode=new Node(info);
            newNode.link=first;
            first=newNode;
    }

    public void insertAtLast(int info){
        Node newNode=new Node(info);
        if(first==null){
            first=newNode;
        }
        Node last=first;
        while(last.link!=null){
            last=last.link;
        }

        last.link=newNode;
    }

    public void insertAtorder(int info){
        Node newNode=new Node(info);
        if(first.info>newNode.info || first==null){
            newNode.link=first;
            first=newNode;
        }
        Node save=first;
        if(save.link!=null && newNode.info>=save.link.info){
            save=save.link;
        }
        newNode.link=save.link;
        save.link=newNode;
    }

    public void deleteAtFirst(){
        if(first==null){
            System.out.println("Empty.");
            return;
        }
        first=first.link;
    }

    public void deleteAtLast(){
        if(first==null){
            System.out.println("Empty.");
            return;
        }
        Node save=first;
        while (save.link.link!=null) {
            save=save.link;
        }
        save.link=null;
    }
    
    public void deleteElemant(int key){
        if(first==null){
            System.out.println("Empty.");
            return;
        }
        Node save=first;
        if(first.info==key){
            first=first.link;
        }

        while(save.link!=null && save.link.info!=key){
            save=save.link;
        }
        if(save.link==null){
            System.out.println("Node Not found.");
            return;
        }

        save.link=save.link.link;
    }

    public LinkList copyLinkedList(){
        if(first==null){
            System.out.println("Linked List Is empty.");
            return null;
        }
        Node save=first;
        LinkList copy=new LinkList();
        Node saveCopy=new Node(save.info);
        save=save.link;
        while(save.link!=null){
            saveCopy.link=new Node(save.info);
            saveCopy=saveCopy.link;
            save=save.link;
        }

        return copy;
    }

    public int countNode(){
        int count=0;
        if(first==null){
            count =0;
        }

        Node save=first;
        while(save!=null){
            count++;
            save=save.link;
        }

        return count;
    }

    public void sortLinkList(){
        if(first==null){
            System.out.println("Linked List is emepty.");
            return;
        }
        Node save=first;
        boolean flag;
        do{
            save=first;
            flag=false;
            if(save.info>save.link.info){
                int temp=save.info;
                save.info=save.link.info;
                save.link.info=temp;
                flag=true;
            }
            save=save.link;
        }while(flag);
    }

    public void checkEquality(LinkList l){
        if(this.countNode()!=l.countNode()){
            System.out.println("Linked List Are Not Same.");
        }

        
    }

}