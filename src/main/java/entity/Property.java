package entity;

public class Property<T> {

    private String name;

    private T property;

    public Property(String name, T property) {
        this.name = name;
        this.property = property;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProperty(T property) {
        this.property = property;
    }

    public T getProperty() {
        return property;
    }

    @Override
    public String toString() {
        return "Property{" +
                "name='" + name + '\'' +
                ", property=" + property +
                ", class property=" + property.getClass() +
                '}';
    }
}
