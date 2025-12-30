import java.time.DayOfWeek;

public class EnumDemo {
    static void main() {
        DayOfWeek days = DayOfWeek.MONDAY;
        System.out.println(days);
        for (DayOfWeek day : DayOfWeek.values()){
            System.out.println(day);
        }
    }
}
enum days{
   MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}