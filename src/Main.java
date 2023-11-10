import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<Mappable> mappables = new ArrayList<>();

        mappables.add(new Building("Georgia Town Hall", UsageType.GOVERNMENT));
        mappables.add(new Building("Movie Theater", UsageType.ENTERTAINMENT));
        mappables.add(new Building("Braves Stadium", UsageType.SPORTS));

        mappables.add(new UtilityLine("MLK BLVD", UtilityType.FIBER_OPTIC));
        mappables.add(new UtilityLine("MLK BLVD", UtilityType.WATER));

        for (var m : mappables) {
            Mappable.mapIt(m);
        }



    }


}
