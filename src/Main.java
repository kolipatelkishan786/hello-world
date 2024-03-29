import java.util.*;
import java.util.stream.Stream;

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


//        LinkedList Example: Book

        //Creating list of Books
        List<Book> list = new LinkedList<>();
        //Creating Books
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 6);
        Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 4);

        //Adding Books to list
        list.add(b1);
        list.add(b2);
        list.add(b3);

        //Traversing list
        for (Book b : list) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }

        //HashMap
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        System.out.println("Initial list of elements:" + hm);
        hm.put(101, "Amit");
        hm.put(102, "Vijay");
        hm.put(103, "Ajaty");

        System.out.println("After invoking put() method ");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        hm.putIfAbsent(104, "Mayur");
        System.out.println("After invoking putIfAbsent() method ");

        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(105, "Ravi");
        map.putAll(hm);
        System.out.println("After invoking putAll() method ");

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        //HashMap example to remove() elements

        System.out.println("Initial list of elements: " + map);

        //key-based removal
        map.remove(101);
        System.out.println("Updated list of elements: " + map);

        map.remove(102);
        System.out.println("Updated list of elements: " + map);

        //key-value pair based removal
        map.remove(103, "Ajaty");
        System.out.println("Updated list of elements: " + map);

        map.remove(105);
        System.out.println("Updated list of elements: " + map);

        System.out.println("\n");

        //HasMap example to replace() elements
        HashMap<Integer, String> hm1 = new HashMap<Integer, String>();

        hm1.put(100, "Amit");
        hm1.put(101, "Vijay");
        hm1.put(102, "Rahul");
        System.out.println("Initial list of elements:");

        for (Map.Entry m : hm1.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        //replace
        System.out.println("Updated list of elements:");
        hm1.replace(101, "Mayur");

        for (Map.Entry m : hm1.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("Updated list of elements:");

        hm1.replace(102, "Rahul", "Ravi");
        for (Map.Entry m : hm1.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("Updated list of elements:");

        //replaceAll

        hm1.replaceAll((k, v) -> "Ajay");

        for (Map.Entry m : hm1.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }


//        TreeMap maintains ascending order.
        //TreeMap Example
        TreeMap<Integer, String> tmap = new TreeMap<>();

        tmap.put(101, "Mayur");
        tmap.put(104, "Kishanr");
        tmap.put(103, "Bhavesh");
        tmap.put(102, "Sanket");

        for (Map.Entry m : tmap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

//        TreeMap Example: remove()
        System.out.println("Before invoking remove() method");
        tmap.remove(102);
        System.out.println("After invoking remove() method");
        for (Map.Entry m : tmap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

//        TreeMap Example: NavigableMap
        NavigableMap<Integer, String> nmap = new TreeMap<Integer, String>();
        nmap.put(100, "Amit");
        nmap.put(102, "Ravi");
        nmap.put(101, "Vijay");
        nmap.put(103, "Rahul");
        //Maintains descending order
        System.out.println("descendingMap: " + nmap.descendingMap());

        //Returns key-value pairs whose keys are less than or equal to the specified key.

        System.out.println("headMap: " + nmap.headMap(102, true));

        //Returns key-value pairs whose keys are greater than or equal to the specified key.
        System.out.println("tailMap: " + nmap.tailMap(102, true));

        //Returns key-value pairs exists in between the specified key.
        System.out.println("SubMap:" + nmap.subMap(100, false, 102, true));

        System.out.println("\n");
        //TreeMap Example: SortedMap
        SortedMap<Integer, String> smap = new TreeMap<>();
        smap.put(100, "Amit");
        smap.put(102, "Ravi");
        smap.put(101, "Vijay");
        smap.put(103, "Rahul");

        //Returns key-value pairs whose keys are less than the specified key.
        System.out.println("headMap: " + smap.headMap(103));

        //Returns key-value pairs whose keys are greater than or equal to the specified key.
        System.out.println("tailMap: " + smap.tailMap(102));

        //Returns key-value pairs exists in between the specified key.
        System.out.println("subMap: " + smap.subMap(101, 102));


        //TreeMap Book Example
        Map<Integer, Book> bmap = new TreeMap<Integer, Book>();

        //Creating Books
        Book a1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book a2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book a3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
        Book a4 = new Book(104, "Java", "Forouzan", "BPB", 7);
        //Adding Books to map
        bmap.put(4, a4);
        bmap.put(2, a2);
        bmap.put(1, a1);
        bmap.put(3, a3);

        //Traversing map
        for (Map.Entry<Integer, Book> entry : bmap.entrySet()) {
            int key = entry.getKey();
            Book b = entry.getValue();

            System.out.println(key + " Details:");
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }

        //Stack

        Stack stack = new Stack();
        //Push element on stack

        stack.push("1");
        stack.push("2");
        stack.push("3");

        System.out.println("Stack Push Element" + stack);

//        String topElement = stack.pop();
//        System.out.println("Stack Push Element" + topElement);
//        String topElement = stack.peek();

        int index = stack.search("1");
        System.out.println(index);

        Iterator iterator = stack.iterator();

        while (iterator.hasNext()) {
            Object value = iterator.next();
//            System.out.println(value);
        }

        Stack stack1 = new Stack();
        stack1.push("A");
        stack1.push("B");
        stack1.push("C");

        Stream stream = stack1.stream();

        stream.forEach((element) -> {
            System.out.println(element);  // print element
        });

        List list1 = new ArrayList();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        System.out.println(list1);

        Stack stack2 = new Stack();
        while (list1.size() > 0) {
            stack2.push(list1.remove(0));
        }

        while (stack.size() > 0) {
            list1.add(stack.pop());
        }

        System.out.println(list1);
    }
}
