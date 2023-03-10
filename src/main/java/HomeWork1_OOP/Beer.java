package HomeWork1_OOP;

public class Beer extends Product{

    private int alcohol = 0;

    public Beer(String name, Double price) {
        super(name, price);
    }

    public Beer(String name, Double price, int alcohol) {
        super(name, price);
        this.alcohol = alcohol;
    }

    public int getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(int alcohol) {
        this.alcohol = alcohol;
    }

    @Override
    public String toString() {
        return String.format("%s alcohol = %d;", super.toString(), alcohol);
    }
}