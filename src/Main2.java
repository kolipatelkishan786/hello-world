public class Main2 {

    public static void main2(String[] args) {
        System.out.println("Hello World!");

        int i = 10;
        Integer ii = 10;

        String str = "sava ";
        str = str + "kishan";

        System.out.println(str);
        System.out.println(i);
//        System.out.println(ii);

        int x = 10;
        int y = 20;
        int z = x + y;
        System.out.println(z);

        String fName = "Kishan";
        String lName = "Patel";
        String fullName = fName + lName;
        System.out.println(fullName);


        char b = 66, c = 67;
//        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        int a = 5;
        System.out.println(!(a > 3 && a < 10));


        //length

        String txt = "welCome";
        System.out.println("The length of the txt string is: " + txt.length());

        // String Methods
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        //indexOf()
        String txt1 = "Please locate where 'locate' occurs!";
        System.out.println(txt1.indexOf("where"));

        //String Concatenation

        String firstName = "Dipak";
        String LastName = "Patel";
        System.out.println(firstName + " " + LastName);
        System.out.println(firstName.concat(LastName));

        //Special Characters
        String txt2 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt2);

        //if...else
        int time = 10;

        if (time > 8) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good Morning.");
        }

        //else if Statement
        if (time > 8) {
            System.out.println("Good morning.");
        } else if (time > 6) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good Evening.");
        }

        //Ternary Operator
        String result = (time > 5) ? "Good Day." : "Good Evening.";
        System.out.println(result);

        //Switch Statement

        int day = 7;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Good Bay");
        }

        //Loop

        //While Loop
        int j = 0;

        while (j < 5) {
            System.out.println(j);
            j++;
        }

        System.out.println("\n");

        //Do/While Loop
        int m = 0;
        do {
            System.out.println(m);
            m++;
        }
        while (m < 3);

        System.out.println("\n");

        //For Loop
        for (int p = 0; p <= 5; p++) {
            System.out.println(p);
        }

        System.out.println("\n");

        for (int p = 1; p <= 10; p++) {
            if (p % 2 == 2) {
                System.out.println(p);
            }
        }

        //For-Each Loop
        String[] name = {"Mayur", "Bhavesh", "Sanket", "Kishan"};

        for (String person : name) {
            System.out.println(person);
        }
    }
}
