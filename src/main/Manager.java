public class Manager extends BaseEmployee {

    int bonus = 500;
    int baseSalary = 5000;

    Manager (String name, String surname, int yearOfEmployment){
        this.name = name;
        this.surname = surname;
        this.yearOfEmployment = yearOfEmployment;
    }

    @Override
    int calculateMonthlySalary (){
        return baseSalary + bonus;
    }
    void setBouns (int bonus) {
        this.bonus = bonus;
    }



}
