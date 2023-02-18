package OOP_seminar2;

public abstract class Herbivores extends Animal {
    public Herbivores(String name) {
        super(name);
    }

    @Override
    public String eat() {
        return "I eat herbs.";
    }
}
