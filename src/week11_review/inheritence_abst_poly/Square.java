package week11_review.inheritence_abst_poly;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Square extends Shape{

    private double side;

    public Square(double side) {
        setSide(side);
    }
    @Override
    public double getArea() {
        return side * side;
    }
}
