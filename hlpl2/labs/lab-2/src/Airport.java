import java.util.Objects;

public class Airport {
    private String name;
    private String city;
    private int runways;
    private int time;

    public Airport(String name, String city, int runways, int time) {
        this.name = name;
        this.city = city;
        this.runways = runways;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRunways() {
        return runways;
    }

    public void setRunways(int runways) {
        this.runways = runways;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", runways=" + runways +
                ", time=" + time +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return getRunways() == airport.getRunways() && getTime() == airport.getTime() && Objects.equals(getName(), airport.getName()) && Objects.equals(getCity(), airport.getCity());
    }
}
