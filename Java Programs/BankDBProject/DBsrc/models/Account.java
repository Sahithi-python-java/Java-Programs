package models;

public class Account {
    private int id;
    private Bank bank;
    private Patron patron;

    public Account(int id, Bank bank, Patron patron) {
        this.id = id;
        this.bank = bank;
        this.patron = patron;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Bank getBank() { return bank; }
    public void setBank(Bank bank) { this.bank = bank; }

    public Patron getPatron() { return patron; }
    public void setPatron(Patron patron) { this.patron = patron; }
}
