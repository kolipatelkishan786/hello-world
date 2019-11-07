public class Person {
    String firstName;
    String lastName;
    Address address;
    Email email;
    Mobile_number mobile;

    void printFirstName() {
        System.out.println("Name:" + this.firstName + " " + lastName);
//        System.out.println(firstName);
        System.out.println("Address:" + this.address.streetName);
        System.out.println("Email:" + this.email.emailName);
        System.out.println("Mobile Number:" + this.mobile.mobileNumber);
    }

    static void printPersonName(Person person) {
//        System.out.println(person.firstName);
//        System.out.println(person.address.streetName);
//        System.out.println(person.mobile.mobileNumber);

    }
}
