package practise.lesson_5_arrays_for_loop.lessoncode.banksystem;

public class BankAccount {

    String ownerName;
    int amount;

    //Alt + Insert - Generate menu
    //Ctrl + Alt + L - formatting
    public BankAccount(String ownerName, int amount) {
        this.ownerName = ownerName;
        this.amount = amount;
    }

    public void credit(int amount) {
        this.amount = this.amount - amount;
    }

    public void debit(int amount) {
        this.amount = this.amount + amount;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getAmount() {
        return amount;
    }
}
