public class TicketSeller extends BaseEmployee {

    private static final int DEFAULT_SALARY = 3000;

    TicketSeller(String name, String surname, int yearOfEmployment) {
        super(name, surname,DEFAULT_SALARY, yearOfEmployment);
    }

    TicketSeller(String name, String surname, int baseSalary, int yearOfEmployment) {
        super(name, surname, baseSalary, yearOfEmployment);
    }

    @Override
    int calculateMonthlySalary() {
        return baseSalary ;
    }


}

