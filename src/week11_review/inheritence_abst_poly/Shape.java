package week11_review.inheritence_abst_poly;

public abstract class Shape {

    private final String name;

    public Shape() {
        this.name = getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public abstract double getArea();
}
