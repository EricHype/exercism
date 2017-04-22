import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.TimeZone;

/**
 * Created by eheitmuller on 4/6/17.
 */
public class Gigasecond {

    private LocalDateTime birthDateTime;

    public Gigasecond(LocalDateTime birthDateTime) {
        this.birthDateTime = birthDateTime;
    }

    public Gigasecond(LocalDate birthDate){
        birthDateTime = LocalDateTime.of(birthDate.getYear(), birthDate.getMonth(), birthDate.getDayOfMonth(), 0, 0);
    }

    public LocalDateTime getDate(){
        return birthDateTime.plusSeconds(1000000000);
    }
}
