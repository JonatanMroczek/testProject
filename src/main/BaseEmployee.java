public class BaseEmployee {
    String name;
    String surname;
   int baseSalary = 3000;
   int yearOfEmployment;
   int bonus = 0;


  int calculateMonthlySalary (){
    return baseSalary + bonus;
    }

    int calculateYearsOfService(){
        return 2020 - yearOfEmployment;
        }
    }
