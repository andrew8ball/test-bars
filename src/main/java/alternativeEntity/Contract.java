package alternativeEntity;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Contract {
    //2 реализация, преимущества в том что можно организовать более сложные структуры и сереализация из коробки
    private JsonObject jsonProperty;

    public JsonObject getJsonProperty() {
        return jsonProperty;
    }

    public void setJsonProperty(JsonObject jsonProperty) {
        this.jsonProperty = jsonProperty;
    }

    public JsonElement getProperty(String name) {
        return jsonProperty.get(name);
    }

    public void addProperty(String name, JsonElement object) {
        if (jsonProperty == null) jsonProperty = new JsonObject();
        jsonProperty.add(name, object);
    }

    public void printProp() {
        System.out.println(jsonProperty.toString());
    }
}
