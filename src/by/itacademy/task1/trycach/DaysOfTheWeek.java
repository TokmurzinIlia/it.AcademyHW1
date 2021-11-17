package by.itacademy.task1.trycach;

class DaysOfTheWeek {

    String [] days = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    protected void setDaysOfTheWeek(int number)
    {
        String s;
        if (number != -1)
        {
        try
        {
            s = days[number - 1];
            System.out.println("Это день: " + s + ".");

        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Такого дня не существует");
        }

        }

    }
}

