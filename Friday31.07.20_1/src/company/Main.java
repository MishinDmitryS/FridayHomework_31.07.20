package company;

public class Main {
    public static void main(String[] args) {
        LList<String> ll = new LList();
        ll.add("Test 1");
        ll.add("Test 2");
        ll.add("Test 3");
        ll.add("Test 4");
        int cout = ll.size();
        System.out.println(cout);

        System.out.println(ll.get(0));

        System.out.println(ll.get(1));

        System.out.println(ll.get(2));


    }
}

class Node <T>{
    T data;
    Node next;

    public Node(T item){
        this.data = item;
    }
}

class LList<T>{
    Node root;
    Object a;

    public void add(T obj){
        if(obj == null){
            return;
        }
        Node node = new Node(obj);
        Node last = findLast();

        if(last == null){
            root = node;
        } else {
            last.next = node;
        }
    }

    public int size(){
        if(root == null){
            return 0;
        }
        int count = 0;
        Node currentNode = root;

        while(currentNode.next != null){
            currentNode = currentNode.next;
            count++;
        }

        return count;
    }

    public Object get(int id){
        if(root == null){
            return 0;
        } else {
            Node currentNode = root;
            int i = 0;

            while (currentNode.next != null) {
                if(i == id){
                    return currentNode.data;
                }
                currentNode = currentNode.next;
                i++;
            }
        }
        return 0;
    }

    private Node findLast(){
        if(root == null){
            return null;
        } else {
            Node currentNode = root;
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }

            return currentNode;
        }
    }

}