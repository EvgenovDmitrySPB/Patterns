package test.design.patterns.behavioral.iterator;


import lombok.Data;

import java.util.List;

@Data
public class FriendIterator implements Iterator {

    private int index;
    private List friends;

    public FriendIterator(List friends) {
        this.friends = friends;
    }

    @Override
    public Object getNext() {
        return friends.get(index++);
    }

    @Override
    public boolean hasNext() {
        if (index < friends.size()) {
            return true;
        }
        return false;
    }
}
