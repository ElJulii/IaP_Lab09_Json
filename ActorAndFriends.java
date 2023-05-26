import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.time.LocalDate;
import java.util.List;

@JsonAutoDetect
public class ActorAndFriends extends Actor {
     List<String> friends;

    public ActorAndFriends() {
        super();
    }

    public ActorAndFriends(List<String> friends) {
        super();
        this.friends = friends;
    }

    public ActorAndFriends(String name, String address, LocalDate birthday, boolean crime, int prisoners, List<String> friends) {
        super(name, address, birthday, crime, prisoners);
        this.friends = friends;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "ActorAndFriends{" + super.toString() +
                "\nfriends=" + friends.toString() +
                '}';
    }
}
