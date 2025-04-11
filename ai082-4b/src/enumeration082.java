public class enumeration082 {

    public enum DayOfWeek {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;


        public boolean isWorkday() {
            return (this != SATURDAY && this != SUNDAY);
        }
    }

    public static void main(String[] args) {

        System.out.println("Is Monday a workday? " + DayOfWeek.MONDAY.isWorkday());


        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day + " is a workday? " + day.isWorkday());
        }
    }
}