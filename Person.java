import java.util.Arrays;
public class Person{

    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;


    public Person(String name, String nationality, String dateOfBirth, String[] passport, int seatNumber){
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.passport = new String[3];
        this.seatNumber = seatNumber;
    }

    public Person(Person source){
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.passport = new String[3];
        this.seatNumber = source.seatNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String[] getPassport() {
        return Arrays.copyOf(this.passport, this.passport.length);
    }

    public void setPassport(String[] passport) {
        this.passport = Arrays.copyOf(passport, passport.length);
    }

    public boolean applyForPassport(){

       

        int random = (int) Math.random() * 2;

        if(random == 0){
            return false;
        }else{
            return true;
        }

    }

    public void chooseSeat(){
        this.seatNumber = (int) (Math.random()) * 11 + 1;
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
    
    public String toString(){
        return "Name: " + this.name + "\n" 
        + "Nationality: " + this.nationality + "\n"
        + "Date of Birth:  " + this.dateOfBirth + "\n"
        + "Seat Number: " + this.seatNumber + "\n"
        + "Passport:  " + Arrays.toString(this.passport);
    }

}