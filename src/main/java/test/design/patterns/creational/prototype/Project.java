package test.design.patterns.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Project implements Copyable {

    private int id;
    private String projectName;
    private String sourceCode;

    public Object copy() {
        return new Project(id, projectName, sourceCode);
    }
}
