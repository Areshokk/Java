package lab1.Task10;

public class Main {
    public static void main(final String[] args) {
        final int n=7;
        final lab1.Task10.Day[] days = new lab1.Task10.Day[n];

        days[0] = new lab1.Task10.Day(lab1.Task10.NameOfDay.Monday, lab1.Task10.TypeOfWeather.Stormy,12.3,740,63);
        days[1] = new lab1.Task10.Day(lab1.Task10.NameOfDay.Tuesday, TypeOfWeather.Rainy,17.4,860,79);
        days[2] = new lab1.Task10.Day(lab1.Task10.NameOfDay.Wednesday, TypeOfWeather.Cloudy,19.8,560,72);
        days[3] = new lab1.Task10.Day(lab1.Task10.NameOfDay.Thursday, TypeOfWeather.Sunny,25.3,540,47);
        days[4] = new lab1.Task10.Day(lab1.Task10.NameOfDay.Friday, lab1.Task10.TypeOfWeather.Hot,38.2,410,27);
        days[5] = new lab1.Task10.Day(lab1.Task10.NameOfDay.Saturday, lab1.Task10.TypeOfWeather.Warm,21.0,745,64);
        days[6] = new lab1.Task10.Day(lab1.Task10.NameOfDay.Sunday, lab1.Task10.TypeOfWeather.Cold,13.4,545,86);
       printWeatherCalendar (days);
    }
    private static void printWeatherCalendar(final lab1.Task10.Day[] days){
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }

    }
}



