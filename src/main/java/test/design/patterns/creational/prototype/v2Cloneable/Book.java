package test.design.patterns.creational.prototype.v2Cloneable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book implements Cloneable{
    private int id =1;
    private String name = "testBook";

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
