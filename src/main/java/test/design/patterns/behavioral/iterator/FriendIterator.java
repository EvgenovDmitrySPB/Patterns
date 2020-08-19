package test.design.patterns.behavioral.iterator;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
public class FriendIterator implements Iterator{

    private int index;
    private List<Friend> friends;

    public FriendIterator(List<Friend> friends) {
        this.friends = friends;
    }

    @Override
    public Object getNext() {
        return friends.get(index++);
    }

    @Override
    public boolean hasNext() {
        if (index < friends.size()){
            return true;
        }
        return false;
    }
}
