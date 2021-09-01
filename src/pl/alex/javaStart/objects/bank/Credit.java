package pl.alex.javaStart.objects.bank;

public class Credit {
    Person person;
    double cashBorrowed;
    double cashReturned;
    double interestRate;
    int termMonths;

    public Credit(Person person, double cashBorrowed, double cashReturned, double interestRate, int termMonths) {
        this.person = person;
        this.cashBorrowed = cashBorrowed;
        this.cashReturned = cashReturned;
        this.interestRate = interestRate;
        this.termMonths = termMonths;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "person=" + person +
                ", cashBorrowed=" + cashBorrowed +
                ", cashReturned=" + cashReturned +
                ", interestRate=" + interestRate +
                ", termMonths=" + termMonths +
                '}';
    }
}
