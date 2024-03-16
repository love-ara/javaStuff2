package arraysAndPhonebook;

import arraysAndPhonebook.MenstrualApp;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;


public class MenstrualAppDriver {
    private static MenstrualApp app = new MenstrualApp();
    private static String pregnancyDueDate;

    public static void main(String[] args) {
        print("""
                Hello, welcome!
                To track your next period, please fill form with correct information.
                Click okay to continue""");
        try {
            String inputDate = userInput("Please enter the start date of the last period e.g, 23/04/2023");
            int numberOfDays = Integer.parseInt(userInput("How many days did it last?"));
            int menstrualCycle = Integer.parseInt(userInput("What is your menstrual cycle?"));


            LocalDate date = parseDate(inputDate);


            String periodDays = app.getPeriodDays(date, numberOfDays, menstrualCycle);
            List<String> fertilityDays = app.getFertilityDays(date, menstrualCycle);
            String ovulationDay = app.getOvulationDay(date, menstrualCycle);
            String dueDate = app.getDueDate(date, menstrualCycle);

            final StringBuilder builder = new StringBuilder();
            builder.append("Next Period Days = ").append(periodDays).append("\n");
            builder.append("Fertility Days = ");
            for (int index = 0; index < fertilityDays.size(); index++) {
                builder.append(fertilityDays.get(index));
                if (index == fertilityDays.size() - 1) break;
                builder.append(", ");
            }
            builder.append("\n");
            builder.append("Ovulation Day = ").append(ovulationDay).append("\n");
            builder.append("If pregnant during ovulation, Pregnancy Due Date= ").append(pregnancyDueDate).append("\n");
            print(builder.toString());

            date = date.plusDays(28);

        }catch (RuntimeException e){
            print(e.getMessage());
        }
    }
    private static LocalDate parseDate(String inputDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/M/yyyy");
        return LocalDate.parse(inputDate, formatter);
    }
    private static void print(Object prompt) {
        JOptionPane.showMessageDialog(null, prompt);
    }
    private static String userInput(String prompt) {
        return JOptionPane.showInputDialog(null, prompt);
    }


}