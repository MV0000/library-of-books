package practise.lesson_4_if_statement.lessoncode;

public class NotExample {

    public static void main(String[] args) {
        boolean rainy = true;
        boolean umbrella = false;

            //false
        if (!rainy || umbrella) {
            System.out.println("Идем гулять!!!");
        } else {
            System.out.println("Ой не, я сахарный");
        }
    }
}
