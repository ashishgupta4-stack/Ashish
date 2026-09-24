import java.util.Scanner;

// User-defined exception 1
class AgeNotithinRangeException extends Exception {
    AgeNotithinRangeException(String msg) {
        super(msg);
    }
}

// User-defined exception 2
class NameNotValidException extends Exception {
    NameNotValidException(String msg) {
        super(msg);
    }
}

// Student class
class Student {
    int rollNo;
    String name;
    int age;
    String course;

    // Parameterized constructor
    Student(int rollNo, String name, int age, String course)
            throws AgeNotithinRangeException, NameNotValidException {

        // Check age
        if (age < 15 || age > 21) {
            throw new AgeNotithinRangeException(
                "Age is not within the range 15 to 21"
            );
        }

        // Check name
        if (!name.matches("[a-zA-Z ]+")) {
            throw new NameNotValidException(
                "Name contains numbers or special symbols"
            );
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Course  : " + course);
    }
}

// Main class
class  Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Taking input from user
            System.out.print("Enter Roll No: ");
            int rollNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Course: ");
            String course = sc.nextLine();

            // Creating Student object
            Student s = new Student(rollNo, name, age, course);

            // Display details
            s.display();
        }

        catch (AgeNotithinRangeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        catch (NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}