package test.design.patterns.creational.prototype;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import test.design.patterns.creational.prototype.v2Cloneable.Book;

public class PrototypeRunner {

    public static final Logger log = LogManager.getLogger(PrototypeRunner.class);

    public static void main(String args) {
        log.info(args);

        Project master = new Project(1, "Project test", "int a=0;");
        System.out.println(master + "\n");

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();
        System.out.println("clone \n" + masterClone);
        System.out.println("equals : " + (masterClone == master));

        Book book1 = new Book(1, "Test1");
        try {
            Book book2 = (Book) book1.clone();
            System.out.println(book1.toString());
            System.out.println(book2.toString());
            System.out.println("equals : " + (book1 == book2));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        log.info(args);
    }
}
