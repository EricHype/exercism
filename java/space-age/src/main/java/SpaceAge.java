/**
 * Created by eheitmuller on 4/6/17.
 */
public class SpaceAge {

    public static final Double SECONDS_IN_EARTH_YEAR = 31557600d;
    public static final Double SECONDS_IN_MERCURY_YEAR = 31557600d * 0.2408467;
    public static final Double SECONDS_IN_VENUS_YEAR = 31557600d * 0.61519726 ;
    public static final Double SECONDS_IN_MARS_YEAR = 31557600d * 1.8808158 ;
    public static final Double SECONDS_IN_JUPTIER_YEAR = 31557600d * 11.862615 ;
    public static final Double SECONDS_IN_SATURN_YEAR = 31557600d * 29.447498 ;
    public static final Double SECONDS_IN_URANUS_YEAR = 31557600d * 84.016846 ;
    public static final Double SECONDS_IN_NEPTUNE_YEAR = 31557600d * 164.79132 ;

    private Double ageInSeconds;

    public SpaceAge(long ageInSeconds) {
        this.ageInSeconds = new Double(ageInSeconds);
    }

    public Double getSeconds(){
        return ageInSeconds;
    }

    public double onEarth() {
        return ageInSeconds / SECONDS_IN_EARTH_YEAR;
    }


    public double onMercury() {
        return ageInSeconds / SECONDS_IN_MERCURY_YEAR;
    }

    public double onVenus() {
        return ageInSeconds / SECONDS_IN_VENUS_YEAR;
    }

    public double onMars() {
        return ageInSeconds / SECONDS_IN_MARS_YEAR;
    }

    public double onJupiter() {
        return ageInSeconds / SECONDS_IN_JUPTIER_YEAR;
    }

    public double onSaturn() {
        return ageInSeconds / SECONDS_IN_SATURN_YEAR;
    }

    public double onUranus() {
        return ageInSeconds / SECONDS_IN_URANUS_YEAR;
    }

    public double onNeptune() {
        return ageInSeconds / SECONDS_IN_NEPTUNE_YEAR;
    }
}
