import com.google.gson.JsonPrimitive;
import entity.Contract;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Contract c = new Contract();

        c.addProperty("idContract", 123456L);
        c.addProperty("date", new Date());

        c.printProp();

        alternativeEntity.Contract ac = new alternativeEntity.Contract();

        ac.addProperty("idContract", new JsonPrimitive(12345L));
        ac.addProperty("date", new JsonPrimitive(String.valueOf(new Date())));

        ac.printProp();
    }
}
