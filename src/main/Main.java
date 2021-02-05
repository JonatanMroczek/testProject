public class Main {

        public static void main(String[] args) {


                TicketSeller ticketSeller = new TicketSeller("Jan", "Kowalski", 2010);
                System.out.println("Base Salary: " +ticketSeller.baseSalary);
                System.out.println("Years of service: " +ticketSeller.calculateYearsOfService());
                System.out.println("Total monthly salary: " +ticketSeller.calculateMonthlySalary());

                Manager manager = new Manager ("Janusz", "Nowak", 2005);
                System.out.println("Base Salary: " +manager.baseSalary);
                System.out.println("Years of service: " +manager.calculateYearsOfService());
                System.out.println("Total monthly salary: " +manager.calculateMonthlySalary());
                System.out.println(manager.getBonus());
                manager.setBonus(700);
                System.out.println(manager.getBonus());
        }
}