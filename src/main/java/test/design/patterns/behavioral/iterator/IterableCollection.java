package test.design.patterns.behavioral.iterator;

public interface IterableCollection {

    /**
     *
     * @param number - номер итератора
     * @return
     */
    Iterator createIterator(int number);
}
