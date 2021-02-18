
    public class Main {
        public static void main(String[] args) {
            Operations operations = new Additon();
            Integer result = operations.calculate(5, 6);
            System.out.println("result=" + result);
            Operations operations1 = new Substraction();
            Integer result1 = operations1.calculate(5, 6);
            System.out.println("result=" + result1);
            Operations operations2 = new Mulitiplication();
            Integer result2 = operations2.calculate(6,6);
            System.out.println("result=" + result2);
            Operations operations3 = new Division();
            Integer result3 = operations3.calculate(6,6);
            System.out.println("result=" + result3);


        }
    }

