package by.itacademy.task1.array;

class DaysOfTheWeek {
    String [] days = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    protected String setDaysOfTheWeek(int number) {
        System.out.println("Это день: " + days[number - 1] +".");
        return days[number - 1];
    }
}

