package practise.lesson_12_exceptions.lessoncode;

public class Result {

    private String client;
    private String notification;

    public Result(String client, String notification) {
        this.client = client;
        this.notification = notification;
    }

    public String getClient() {
        return client;
    }

    public String getNotification() {
        return notification;
    }
}
