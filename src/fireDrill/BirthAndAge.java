package fireDrill;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;



public class BirthAndAge {
    public static void main(String[] args) {
        System.out.println(tellAge("12/12/2022"));
        System.out.println(tellAge("26/01/2022"));
    }

    public static int tellAge(String dob) {
        LocalDate dobStr = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate currentDate = LocalDate.now();
        return Period.between(dobStr, currentDate).getYears();
    }
}