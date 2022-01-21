import java.util.NoSuchElementException;
public class ContactList{
    private Node head;

    public ContactList(){
        head = null;
    }

    public boolean addIndex(Contact toAdd, int index){

        Node addNode = new Node(toAdd);
        boolean success = false;

        if(index == 0){
            addNode.next = head;
            head = addNode;
            success = true;
        }
        else{
            int count = 0;
            Node curr = head;

            while(count < index - 1 && curr != null){
                curr = curr.next;
                count++;
            }
            if(curr != null){
                addNode.next = curr.next;
                curr.next = addNode;
                success = true;
            }
        }
        return success;

    }

    public Contact remove(Contact toRemove) throws NoSuchElementException {
        Contact removed = null;

        if(head == null){
            throw new NoSuchElementException();
        }
        else if (head.data.compareTo(toRemove) == 0){
            removed = head.data;
            head = head.next;
        }
        else{
            Node curr = head.next;
            Node prev = head;
            boolean done = false;
            while(curr != null){
                if(curr.data.compareTo(toRemove) == 0){
                    removed = curr.data;
                    prev.next = curr.next;
                    done = true;
                }
                prev = curr;
                curr = curr.next;
            }
            if(!done){
                throw new NoSuchElementException();
            }
        }
        return removed;
    }

    public String toString(){
        String result = "";
        Node temp = head;
        while(temp != null){
            result += temp.data + "\n";
            temp = temp.next;
        }
        return result;
    }

    private class Node{
        public Contact data;
        public Node next;

        public Node(Contact dataIn){
            data = dataIn;
            next = null;
        }
    }

}