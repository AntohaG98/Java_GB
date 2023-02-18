package OOP_seminar2;

public abstract class Predator extends Animal {
    public Predator(String name) {
        super(name);
    }

    @Override
    public String eat() {
        return "I eat meat.";
    }
}
