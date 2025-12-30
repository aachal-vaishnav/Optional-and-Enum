import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalDemo {
    static void main() {
        Optional<String> OptionalNameBox = getName();
//        if(OptionalNameBox.isPresent()) {
//            System.out.println(OptionalNameBox.get().toLowerCase());
//        }
        OptionalNameBox.ifPresent(s -> System.out.println(s.toLowerCase())); //Optional.empty

        String res = OptionalNameBox.orElse("Not Found");
        System.out.println(res);

        OptionalNameBox.orElseGet(()->"Not Found");

//        OptionalNameBox.orElseThrow(()->new NoSuchElementException());
        OptionalNameBox.orElseThrow(NoSuchElementException::new);
    }
    private static Optional<String> getName(){

        //return Optional.ofNullable(null);

        return Optional.empty();//no null pointer exception

    }
}
