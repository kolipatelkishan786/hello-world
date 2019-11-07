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


    }
}
