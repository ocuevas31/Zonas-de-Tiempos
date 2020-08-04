
import java.util.TimeZone;

public class Timezones {

    public static void main(final String[] args) {
        for (String id : TimeZone.getAvailableIDs()) {
            System.out.println(id);
        }

    }

}