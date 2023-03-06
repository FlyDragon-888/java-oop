package seminar2;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String eat();

    @Override
    public String toString() {
        return String.format("My name is %s. %s", name, eat());
    }
}