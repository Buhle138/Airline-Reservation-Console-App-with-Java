import java.util.Arrays;
public class Main{
    public static void main(String[] args) {

        String[] passportNothing = new String[3];

        String[] passport = new String[]{"Buhle", "South African", "98"};

        Person person = new Person("Buhle", "South Africa", "98", passportNothing, 3);

        Boolean acceptance = person.applyForPassport();

      

        if(acceptance == true){

            System.out.println("Congratulations " + person.getName() + " Your passport was approved!");
            Person person2 = new Person(person);
            person2.setPassport(passport);
            System.out.println(person2);
        }else if(acceptance == false){
            System.out.println("We're sorry " + person.getName() + ". " + " We cannot process you application.");
            System.out.println(person);
        }


        
    }
}