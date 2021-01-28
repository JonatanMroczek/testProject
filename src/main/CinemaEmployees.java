public class CinemaEmployees {
    public static void main(String[] args) {


Manager manager1 = new Manager("Patryk", "Wojnicz", 2010);
        System.out.println("Manager");
        System.out.println("Base salary is: " +  manager1.baseSalary);
        System.out.println ("Total Salary is: " + manager1.calculateMonthlySalary());
        System.out.println("Years of service: " + manager1.calculateYearsOfService());
        manager1.setBouns(1000);
        System.out.println ("Total Salary is: " + manager1.calculateMonthlySalary());


        System.out.println("TicketSeller");
        TicketSeller ticketSeller1 = new TicketSeller ("Patrycja", "Adamowicz", 2018);
        System.out.println("Base salary is: " +  ticketSeller1.baseSalary);
        System.out.println ("Total Salary is: " + ticketSeller1.calculateMonthlySalary());
        System.out.println("Years of service: " + ticketSeller1.calculateYearsOfService());



}}
