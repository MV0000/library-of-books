package practise.lesson_5_arrays_for_loop.lessoncode.banksystem;

public class Transaction {

    String operation;
    int amount;

    public Transaction(String operation, int amount) {
        this.operation = operation;
        this.amount = amount;
    }

    public void printInfo() {
        System.out.println("Operation: " + operation + " for amount: " + amount);
    }

    public String getOperation() {
        return operation;
    }

    public int getAmount() {
        return amount;
    }
}
