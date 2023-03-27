import homework.Main;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class nextHomework {
    public static void main(String[] args) {

        System.out.println(LocalDate.now());//1
        System.out.println(LocalDate.of(2020, 10, 17));//2
        System.out.println(LocalDate.parse("2024-12-18"));//3

        boolean before = LocalDate.now().isBefore(LocalDate.parse("2020-03-03"));//4
        boolean after = LocalDate.now().isAfter(LocalDate.parse("2023-02-23"));

        System.out.println(before == after);

        LocalDate localDate12 = LocalDate.of(2023, 02, 23);
        LocalDate localDate11 = LocalDate.of(2023, 02, 23);

        System.out.println(localDate11.equals(localDate12));

        System.out.println(LocalTime.now());
        System.out.println(LocalTime.now().plusHours(3));

        System.out.println(LocalDate.now().plusWeeks(1));
        System.out.println(LocalDate.now().minusYears(1));
        System.out.println(LocalDate.now().plusYears(1));

        LocalDate tomorrow = LocalDate.parse("2023-03-28");
        LocalDate yesterday = LocalDate.parse("2023-03-26");
        System.out.println(tomorrow.isAfter(yesterday));
        System.out.println(yesterday.isBefore(tomorrow));

        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(2020, 12, 18));
        dates.add(LocalDate.of(2022, 9, 1));
        dates.add(LocalDate.of(2023, 5, 19));
        dates.add(LocalDate.of(2023, 5, 29));

        double daysBetween = calculateDayDiff1(dates);

        System.out.println("Days between first and last date: " + daysBetween);

    }

    private static int calculateDayDiff1(List<LocalDate> listDate) {
        LocalDate first = listDate.get(0);
        LocalDate last = listDate.get(0);

        for (LocalDate dates : listDate) {
            if (dates.isBefore(first)) {
                first = dates;
            }

            if (dates.isAfter(last)) {
                last = dates;
            }
        }

        return (int) ChronoUnit.DAYS.between(first, last);
    }
    /*2023-03-27
2020-10-17
2024-12-18
false
true
20:26:37.932066500
23:26:37.932066500
2023-04-03
2022-03-27
2024-03-27
true
true
Days between first and last date: 892.0
*/
    }

