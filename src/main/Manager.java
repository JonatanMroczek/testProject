public class Manager extends BaseEmployee {

    private static final int DEFAULT_SALARY = 5000;
    private static int bonus = 500;

    public Manager (String name, String surname, int yearOfEmployment){
        super(name, surname,DEFAULT_SALARY, yearOfEmployment);
    }

    public Manager (String name, String surname, int baseSalary, int yearOfEmployment) {
        super(name, surname, baseSalary, yearOfEmployment);
    }


    @Override
    int calculateMonthlySalary (){
        return baseSalary + bonus;
    }
    void setBonus (int bonus) {
        this.bonus = bonus;
    }
    public static int getBonus() {
        return bonus;
    }



}
