package Viikko11.Adapter;

public class Main {
    public static void main(String[] args) {

        NewDateInterface dateAdapter = new CalendarToNewDateAdapter();


        dateAdapter.setDay(9);
        dateAdapter.setMonth(11);
        dateAdapter.setYear(2024);


        System.out.println("Beginning Date: " + dateAdapter.getDay() + "." + dateAdapter.getMonth() + "." + dateAdapter.getYear());

        dateAdapter.advanceDays(7);
        System.out.println("Date after advancing 7 days: " + dateAdapter.getDay() + "." + dateAdapter.getMonth() + "." + dateAdapter.getYear());

        dateAdapter.advanceDays(30);
        System.out.println("Date after advancing 30 more days: " + dateAdapter.getDay() + "." + dateAdapter.getMonth() + "." + dateAdapter.getYear());
    }
}

