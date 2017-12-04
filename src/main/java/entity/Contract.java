package entity;

import java.util.HashMap;
import java.util.Map;

public class Contract {
    //1 более простая реализация
    private Map<String, Object> properties;

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    public void addProperty(String name, Object value) {
        if (properties == null) properties = new HashMap<>();
        properties.put(name, value);
    }

    public Object getProperty(String name) {
        return properties.get(name);
    }

    public void printProp() {
        if (properties != null)
            properties.forEach((s, o) -> System.out.println("key: " + s + " value: " + o + " class: " + o.getClass()));
    }
}
