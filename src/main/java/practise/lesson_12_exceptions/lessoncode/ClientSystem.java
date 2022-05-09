package practise.lesson_12_exceptions.lessoncode;


import java.util.Optional;

public class ClientSystem {

    public Optional<String> findClient(String id) {
        if (id.equals("1")) {
            return Optional.of("Alex");
        }
        return Optional.empty();
    }
}
