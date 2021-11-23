package Lab1.Task10;

public class Main {
    public static void main(final String[] args) {
        final int n=7;
        final Lab1.Task10.Day[] days = new Lab1.Task10.Day[n];

        days[0] = new Lab1.Task10.Day(Lab1.Task10.NameOfDay.Monday, Lab1.Task10.TypeOfWeather.Stormy,12.3,740,63);
        days[1] = new Lab1.Task10.Day(Lab1.Task10.NameOfDay.Tuesday, TypeOfWeather.Rainy,17.4,860,79);
        days[2] = new Lab1.Task10.Day(Lab1.Task10.NameOfDay.Wednesday, TypeOfWeather.Cloudy,19.8,560,72);
        days[3] = new Lab1.Task10.Day(Lab1.Task10.NameOfDay.Thursday, TypeOfWeather.Sunny,25.3,540,47);
        days[4] = new Lab1.Task10.Day(Lab1.Task10.NameOfDay.Friday, Lab1.Task10.TypeOfWeather.Hot,38.2,410,27);
        days[5] = new Lab1.Task10.Day(Lab1.Task10.NameOfDay.Saturday, Lab1.Task10.TypeOfWeather.Warm,21.0,745,64);
        days[6] = new Lab1.Task10.Day(Lab1.Task10.NameOfDay.Sunday, Lab1.Task10.TypeOfWeather.Cold,13.4,545,86);
       printWeatherCalendar (days);
    }
    private static void printWeatherCalendar(final Lab1.Task10.Day[] days){
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }

    }
}



