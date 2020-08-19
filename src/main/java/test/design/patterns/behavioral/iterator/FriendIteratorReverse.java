package test.design.patterns.behavioral.iterator;


import lombok.Data;

import java.util.List;

@Data
public class FriendIteratorReverse implements Iterator{

    private int index;
    private List<Friend> friends;

    public FriendIteratorReverse(List<Friend> friends) {
        this.friends = friends;
    }

    @Override
    public Object getNext() {
        Object object = friends.get(friends.size() - index - 1);
        index++;
        return object;
    }

    @Override
    public boolean hasNext() {
        if ((friends.size() - index - 1) >= 0){
            return true;
        }
        return false;
    }
}
