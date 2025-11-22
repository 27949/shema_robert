package p27949.q3;

import java.util.Date;
import java.util.Scanner;

public class EmployeePayrollSystem {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Company Details:");
            System.out.print("Company Name: ");
            String companyName = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Phone Number (10 digits): ");
            String phoneNumber = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.println("\nEnter Department Details:");
            System.out.print("Department Name: ");
            String departmentName = scanner.nextLine();
            System.out.print("Department Code (alphanumeric, min 3 chars): ");
            String departmentCode = scanner.nextLine();

            System.out.println("\nEnter Manager Details:");
            System.out.print("Manager Name: ");
            String managerName = scanner.nextLine();
            System.out.print("Manager Email: ");
            String managerEmail = scanner.nextLine();
            System.out.print("Manager Phone (10 digits): ");
            String managerPhone = scanner.nextLine();

            System.out.println("\nEnter Employee Details:");
            System.out.print("Employee Name: ");
            String employeeName = scanner.nextLine();
            System.out.print("Employee ID: ");
            int employeeId = scanner.nextInt();
            scanner.nextLine(); // consume newline
            System.out.print("Designation: ");
            String designation = scanner.nextLine();
            System.out.print("Contact Number (10 digits): ");
            String contactNumber = scanner.nextLine();

            System.out.println("\nEnter Attendance Details:");
            System.out.print("Total Days: ");
            int totalDays = scanner.nextInt();
            System.out.print("Present Days: ");
            int presentDays = scanner.nextInt();
            System.out.print("Leave Days: ");
            int leaveDays = scanner.nextInt();

            System.out.println("\nEnter Allowance Details:");
            System.out.print("Housing Allowance: ");
            double housingAllowance = scanner.nextDouble();
            System.out.print("Transport Allowance: ");
            double transportAllowance = scanner.nextDouble();

            System.out.println("\nEnter Deduction Details:");
            System.out.print("Tax Deduction: ");
            double taxDeduction = scanner.nextDouble();
            System.out.print("Loan Deduction: ");
            double loanDeduction = scanner.nextDouble();

            System.out.println("\nEnter Salary Details:");
            System.out.print("Basic Salary: ");
            double basicSalary = scanner.nextDouble();

            double grossSalary = basicSalary + housingAllowance + transportAllowance;
            double netSalary = grossSalary - (taxDeduction + loanDeduction);

            PayrollRecord payrollRecord = new PayrollRecord(
                    1, new Date(), new Date(),
                    companyName, address, phoneNumber, email,
                    departmentName, departmentCode,
                    managerName, managerEmail, managerPhone,
                    employeeName, employeeId, designation, contactNumber,
                    totalDays, presentDays, leaveDays,
                    housingAllowance, transportAllowance,
                    taxDeduction, loanDeduction,
                    basicSalary, grossSalary, netSalary
            );

            System.out.println("\n--- Payroll Details ---");
            System.out.println("Employee Name: " + payrollRecord.getEmployeeName());
            System.out.println("Net Salary: " + payrollRecord.calculateNetSalary());

        } catch (PayrollDataException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
