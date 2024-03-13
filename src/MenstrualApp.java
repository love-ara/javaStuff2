import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class MenstrualApp {
    private LocalDate localDate;
    private String ovulationDay = " ";
    private String periodDays = " ";
    private List<String> fertilityDays = new ArrayList<>();
    //private String pregnancyDueDate;

    public String getPeriodDays(LocalDate date, int numberOfDays, int menstrualCycle) {
        validate(numberOfDays, menstrualCycle);
        getPeriod(date, menstrualCycle);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd/MMMM/yyyy");
        String periodDays = " ";
            periodDays = (formatter.format(localDate));

        return periodDays;
    }

    private static void validate(int numberOfDays, int menstrualCycle) {
        if(numberOfDays < 3 || numberOfDays > 7) throw new RuntimeException("Menstrual cycle should be between 2 days" +
                " - 7 days");
        if(menstrualCycle < 21 || menstrualCycle > 35) throw new RuntimeException("Your menstrual cycle is irregular," +
                "see a doctor");
    }

    private void getPeriod(LocalDate date, int menstrualCycle) {
        localDate = date.plusDays(menstrualCycle);
    }

    public List<String> getFertilityDays(LocalDate date, int menstrualCycle) {
        getPeriod(date, menstrualCycle);
        localDate = localDate.plusDays(9);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd/MMMM/yyyy");
        List<String> fertilityDays = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            fertilityDays.add(formatter.format(localDate.plusDays(i)));
        }
        return fertilityDays;
    }

//    public String fertileWindows(){
//        LocalDate firstWindow = lastPeriodStartDate.plusDays(9);
//        LocalDate secondWindow = lastPeriodStartDate.plusDays(15);
//        String fertileRange = " from  " + firstWindow + " to " +secondWindow;
//        return fertileRange;
//    }


    public String getOvulationDay(LocalDate date, int menstrualCycle) {
        int length = menstrualCycle >= 28 ? (menstrualCycle - 28) + 14 : 14 - (28 - menstrualCycle);
        localDate = date
                .plusDays(length);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd/MMMM/yyyy");
        return formatter.format(localDate);
    }

    public String getDueDate(LocalDate date, int menstrualCycle) {
       // getPeriod(date, menstrualCycle);
        localDate = localDate.plusMonths(9).plusDays(4);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd/MMMM/yyyy");
        return formatter.format(localDate);
    }

    public String toString(){
        final StringBuilder builder = new StringBuilder();
        builder.append("Next Period Days : ").append(periodDays).append("\n");
        builder.append("Fertility Days : ").append(fertilityDays).append("\n");
        builder.append("Ovulation Day : ").append(ovulationDay).append("\n");
        //builder.append("If pregnant during ovulation, Pregnancy Due Date: ").append(pregnancyDueDate).append("\n");
        return builder.toString();
    }
}
