package homeworkTuesday;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();


        LocalDate date = LocalDate.of(2023,12,31);
        List<LocalDate>dates = new LinkedList<>();
        Collections.addAll(dates,LocalDate.now(),
                LocalDate.now().plusDays(10),
                LocalDate.now().plusDays(20),
                LocalDate.now().plusWeeks(6),
                LocalDate.now().plusYears(1));
        System.out.println(daysInBeetween(dates));
        Collections.sort(dates);
        System.out.println(dates);
    }
    public static long daysInBeetween(List<LocalDate> dates){
        Collections.sort(dates);
       return ChronoUnit.DAYS.between(dates.get(0),dates.get(dates.size()-1));

    }
}
