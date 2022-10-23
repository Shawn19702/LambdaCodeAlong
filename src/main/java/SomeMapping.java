import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class SomeMapping {

    public static void main(String[] args) {

        User sarah = new User("Sarah", 23);
        User james = new User("James", 26);
        User mary = new User("Mary", 87);
        User john = new User("John", 90);

        List<User> users = List.of(sarah, james, mary, john);
        List<String> names = new ArrayList<>();
        Function<User, String> toName = (User user) -> user.getName();
        for (User user : users) {
            String name = toName.apply(user);
            names.add(name);
        }
        users.forEach(u -> System.out.println(u));
        Consumer<String> action = s -> System.out.println(s);
        names.forEach(action);
    }

}
