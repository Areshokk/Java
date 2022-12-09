package lab1.Task10;

public class Weather {
    private TypeOfWeather typeOfWeather;   //тип погоди
    private double temperature;           //температура
    private Integer atmosphericPressure;  //атмосферний тиск
    private Integer humidity;            // вологість


    @Override
    public String toString() {
        return "Weather {" +
                "typeOfWeather = " + typeOfWeather +
                ", temperature = " + temperature +
                ", atmosphericPressure = '" + atmosphericPressure + '\'' +
                ", humidity = '" + humidity + '\'' +
                '}';
    }


    public TypeOfWeather getTypeOfWeather() {
        return typeOfWeather;
    }

    public void setTypeOfWeather(final TypeOfWeather typeOfWeather) {
        this.typeOfWeather = typeOfWeather;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(final double temperature) {
        this.temperature = temperature;
    }

    public Integer getAtmosphericPressure() {
        return atmosphericPressure;
    }

    public void setAtmosphericPressure(final Integer atmosphericPressure) { this.atmosphericPressure = atmosphericPressure;}

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(final Integer humidity) {
        this.humidity = humidity;
    }


    @Override
    public boolean equals(final Object obj) {
        if (obj == this) return true;

        if (obj == null || this.getClass() != obj.getClass()) return false;

        final Weather weather = (Weather) obj;
        return this.getTemperature() == weather.getTemperature()
                && (this.getTypeOfWeather() == weather.getTypeOfWeather()
                || (this.getTypeOfWeather() != null && this.getTypeOfWeather().equals(weather.getTypeOfWeather())))
                && (this.getAtmosphericPressure() == weather.getAtmosphericPressure())
                && (this.getHumidity() == weather.getHumidity());
    }

    @Override
    public int hashCode() {
        return (int) (31 * this.getTemperature() +
                        31 * this.getTypeOfWeather().hashCode() +
                        31* this.getAtmosphericPressure ()+
                        31 * this.getHumidity());
    }

}


