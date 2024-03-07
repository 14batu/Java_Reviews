package week11_review.inheritence_abst_poly;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Rectangle  extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }


    @Override
    public double getArea() {
        return width * height;
    }
}
