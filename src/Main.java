import java.util.*;

public class Main {

    public static void main(String[] args) {
        Person kishan = new Person();
        kishan.firstName = "Kishan";
        kishan.lastName = "Patel";

        Address myAddress = new Address();
        myAddress.streetName = "Sanand";
        kishan.address = myAddress;

        Email myEmail = new Email();
        myEmail.emailName = "Kishan@gmail.com";
        kishan.email = myEmail;

        Mobile_number myNumber = new Mobile_number();
        myNumber.mobileNumber = 987124988;
        kishan.mobile = myNumber;

        kishan.printFirstName();

        Person.printPersonName(kishan);

        System.out.println("\n");
        User mayur = new User("Mayur", "Patel", 981234560);
        User bhavesh = new User("Bhavesh", "Kadiya", 123456789);
        User Sanket = new User("Sanket", "Patel", 123456788);
        //ArrayList
        ArrayList<User> userArrayList = new ArrayList<>();

        userArrayList.add(mayur);
        userArrayList.add(bhavesh);
        userArrayList.add(Sanket);

        System.out.println(mayur.firstName + " " + mayur.lastName + " : " + mayur.mobileNumber);
        System.out.println(bhavesh.firstName + " " + bhavesh.lastName + " : " + bhavesh.mobileNumber);
        System.out.println(Sanket.firstName + " " + Sanket.lastName + " : " + Sanket.mobileNumber);

        System.out.println("\n");

        //LinkList

        LinkedList<String> name = new LinkedList<>();

        System.out.println("Initial list of elements: " + name);
        name.add("Mayur");
        name.add("Kishan");
        name.add("Bhavesh");
        name.add("Sanket");
        System.out.println(name);
        //Adding an element at the specific position

        name.add(1, "Dipak");
        System.out.println("After invoking add(int index, E element) method: " + name);

        LinkedList<String> ll2 = new LinkedList<>();
        ll2.add("Sonoo");
        ll2.add("Hanumat");
        //Adding second list elements to the first list
        name.addAll(ll2);
        System.out.println("After invoking addAll(Collection<? extends E> c) method: " + name);

        LinkedList<String> ll3 = new LinkedList<>();
        ll3.add("John");
        ll3.add("Rahul");
        //Adding second list elements to the first list at specific position
        name.addAll(1, ll3);
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: " + name);
        //Adding an element at the first position
        name.addFirst("lokesh");
        System.out.println("After invoking addFirst(E e) method: " + name);
        //Adding an element at the last position
        name.addLast("Harse");
        System.out.println("After invoking addLast(E e) method: " + name);

//        LinkedList Example
//        LinkedList<String> al = new LinkedList<String>();
//        al.add("Ravi");
//        al.add("Vijay");
//        al.add("Ravi");
//        al.add("Ajay");
//
//        Iterator<String> itr = al.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }

        //Removing specific element from arraylist
        name.remove("John");
        System.out.println("After invoking remove(object) method: " + name);

        //Removing element on the basis of specific position
        name.remove(0);
        System.out.println("After invoking remove(index) method: " + name);

        LinkedList<String> ll4 = new LinkedList<>();
        ll4.add("Ravi");
        ll4.add("Hanumat");
        // Adding new elements to arraylist
        name.addAll(ll4);
        System.out.println("Updated list : " + name);

        //Removing all the new elements from arraylist
        name.removeAll(ll4);
        System.out.println("After invoking removeAll() method: " + name);

        //Removing first element from the list
        name.removeFirst();
        System.out.println("After invoking removeFirst() method: " + name);

        //Removing first element from the list
        name.removeLast();
        System.out.println("After invoking removeLast() method: " + name);

//        Removing first occurrence of element from the list
        name.removeFirstOccurrence("Rahul");
        System.out.println("After invoking removeFirstOccurrence() method: " + name);

        //Removing last occurrence of element from the list
        name.removeLastOccurrence("Sonoo");
        System.out.println("After invoking removeLastOccurrence() method: " + name);

        //Removing all the elements available in the list
        name.clear();
        System.out.println("After invoking clear() method: " + name);

//        LinkedList Example to reverse a list of elements
        LinkedList<String> reversell = new LinkedList<>();
        //Traversing the list of elements in reverse order
        reversell.add("Ravi");
        reversell.add("Vijay");
        reversell.add("Ajay");
        System.out.println(reversell);

        Iterator i = reversell.descendingIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
