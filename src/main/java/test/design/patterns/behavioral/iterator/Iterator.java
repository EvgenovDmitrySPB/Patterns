package test.design.patterns.behavioral.iterator;

public interface Iterator {

    /**
     * Получить следующий элемент
     * @return
     */
    Object getNext();

    /**
     * Проверка наличия следующего элемента
     * @return
     */

    boolean hasNext();
}
