import java.util.Scanner;

class InvalidDayException extends Exception {
    public InvalidDayException(String message) {
        super(message);
    }
}

class InvalidMonthException extends Exception {
    public InvalidMonthException(String message) {
        super(message);
    }
}

class MyDate {
    public int Day;
    public int Month;
    public int Year;

    public MyDate(int Day, int Month, int Year)
            throws InvalidDayException, InvalidMonthException {
        if (Day < 1 || Day > 31) {
            throw new InvalidDayException("Day is Invalid");
        }
        if (Month < 1 || Month > 12) {
            throw new InvalidMonthException("Month is Invalid");
        }
        this.Day = Day;
        this.Month = Month;
        this.Year = Year;
    }

    public void Confirm() {
        System.out.println("Valid Date!");
    }
}

class myMain5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Day: ");
            int Day = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Month: ");
            int Month = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Year: ");
            int Year = sc.nextInt();
            sc.nextLine();
            MyDate date = new MyDate(Day, Month, Year);
            date.Confirm();
        } catch (InvalidDayException | InvalidMonthException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e){
            System.err.println("Exception e.");
        }
    }
}