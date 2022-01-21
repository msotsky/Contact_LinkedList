import java.util.NoSuchElementException;
public class ContactListDriver {
    
    public static void main(String[] args){
        Contact c1 = new Contact("Jill", 7, 25);
        Contact c2 = new Contact("Jack", 11, 13);
        Contact c3 = new Contact("Jill", 7, 1);
        Contact c4 = new Contact("Mike", 6, 3);
        Contact c5 = new Contact("Ann", 12, 24);
        Contact c6 = new Contact("Jack", 1, 25);

        ContactList list = new ContactList();
        System.out.println("Added: " + list.addIndex(c1, 0));
        System.out.println("Added: " + list.addIndex(c2, 1));
        System.out.println("Added: " + list.addIndex(c3, 0));
        System.out.println("Added: " + list.addIndex(c4, 3));
        System.out.println("Added: " + list.addIndex(c5, 5));

        System.out.println(list);

        try{
            System.out.println("Removed: " + list.remove(c1));
        }catch(NoSuchElementException e){
            System.out.println("Element not in the list");
        }
        System.out.println(list);
    }
}
