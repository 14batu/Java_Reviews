package week11_review.inheritence_abst_poly;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
