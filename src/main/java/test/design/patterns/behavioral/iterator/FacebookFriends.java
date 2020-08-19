package test.design.patterns.behavioral.iterator;

import lombok.Data;

import java.util.List;

@Data
public class FacebookFriends implements IterableCollection {

    private String name;
    private List<Friend> friends;

    public FacebookFriends(String name, List<Friend> friends) {
        this.name = name;
        this.friends = friends;
    }

    @Override
    public Iterator createIterator(int number) {
        if (number == 1){
            return new FriendIterator(friends);
        }else {
            return new FriendIteratorReverse(friends);
        }
    }
}
