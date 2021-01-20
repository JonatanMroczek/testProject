public class AgeVerification {
    public static void main(String[] args) {
System.out.println(ageVerification(18));
System.out.println(ageVerification(17));
    }
    public static String ageVerification (int age){
        if (age >= 18) {
            return "Age verification passed";}
               else {
                   return "Age verification failed";
            }
            }
        }


