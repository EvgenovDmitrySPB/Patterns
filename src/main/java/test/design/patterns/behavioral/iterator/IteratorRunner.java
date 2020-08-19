package test.design.patterns.behavioral.iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class IteratorRunner {

    public static final Logger log = LogManager.getLogger(IteratorRunner.class);

    public static void main(String args) {
        log.info(args);
        Iterator iterator;
        List<Friend> list = new ArrayList<>();
        list.add(new Friend("Ivan Ivanov", 20));
        list.add(new Friend("Anna Iaroshevicz", 15));
        list.add(new Friend("Olga Isaakova", 27));
        list.add(new Friend("Fedia Curkevitz", 32));
        list.add(new Friend("Tagir Ramazanov", 12));


        FacebookFriends facebookFriends = new FacebookFriends("My list", list);

        //по очереди используем 2 итератора
        for (int i=1;i<=2;i++){
            iterator = facebookFriends.createIterator(i);

            while (iterator.hasNext()){
                System.out.println( "iterator #" + i + " " + iterator.getNext());
            }
            System.out.println(" ");
        }

        log.info(args);
    }
}
