public abstract class BaseEmployee {
    protected String name;
    protected String surname;
    protected int baseSalary;
    protected int yearOfEmployment;


    public int getBaseSalary() {
        return baseSalary;
    }

    public BaseEmployee() {
    }

    public BaseEmployee(String name, String surname, int baseSalary, int yearOfEmployment) {
        this.name = name;
        this.surname = surname;
        this.baseSalary = baseSalary;
        this.yearOfEmployment = yearOfEmployment;
    }

    abstract int calculateMonthlySalary();

    int calculateYearsOfService() {
        return 2021 - yearOfEmployment;
    }
}
