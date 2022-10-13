import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add(0,"Jonh");
        names.add(1,"Hooue");
        names.add(2,"Cannex");

        names = names.stream()
                .map(s -> s.substring(1))
                .collect(Collectors.toList());

        System.out.println(names);

        }

    }

