import java.util.Scanner;

interface NetPayCalculation {
    void grossPayCalculation();
    void taxCalculation();
    float netPayCalculation();
}

class Employee implements NetPayCalculation {
    int empId;
    String name;
    float basic, hra, da, ta, grossSalary;
    float pf, professionalTax, totalDeduction, netSalary;

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basic = sc.nextFloat();
    }

    public void grossPayCalculation() {
        hra = basic * 0.20f;
        da = basic * 0.10f;
        ta = basic * 0.05f;
        grossSalary = basic + hra + da + ta;
    }

    public void taxCalculation() {
        pf = basic * 0.12f;
        professionalTax = 200;
        totalDeduction = pf + professionalTax;
    }

    public float netPayCalculation() {
        netSalary = grossSalary - totalDeduction;
        return netSalary;
    }

    void display_details() {
        System.out.println("\n");
        System.out.println("======================================================");
        System.out.println("                  EMPLOYEE PAYSLIP");
        System.out.println("======================================================");

        System.out.printf("%-25s : %s%n", "Employee ID", empId);
        System.out.printf("%-25s : %s%n", "Employee Name", name);

        System.out.println("------------------------------------------------------");
        System.out.printf("%-25s %15s%n", "EARNINGS", "AMOUNT (₹)");
        System.out.println("------------------------------------------------------");

        System.out.printf("%-25s %15.2f%n", "Basic Salary", basic);
        System.out.printf("%-25s %15.2f%n", "HRA (20%)", hra);
        System.out.printf("%-25s %15.2f%n", "DA (10%)", da);
        System.out.printf("%-25s %15.2f%n", "TA (5%)", ta);

        System.out.println("------------------------------------------------------");
        System.out.printf("%-25s %15.2f%n", "Gross Salary", grossSalary);

        System.out.println("\n------------------------------------------------------");
        System.out.printf("%-25s %15s%n", "DEDUCTIONS", "AMOUNT (₹)");
        System.out.println("------------------------------------------------------");

        System.out.printf("%-25s %15.2f%n", "Provident Fund (12%)", pf);
        System.out.printf("%-25s %15.2f%n", "Professional Tax", professionalTax);

        System.out.println("------------------------------------------------------");
        System.out.printf("%-25s %15.2f%n", "Total Deduction", totalDeduction);

        System.out.println("======================================================");
        System.out.printf("%-25s %15.2f%n", "NET SALARY", netSalary);
        System.out.println("======================================================");
    }
}

class Payroll {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.getData();
        e.grossPayCalculation();
        e.taxCalculation();
        e.netPayCalculation();
        e.display_details();
    }
}