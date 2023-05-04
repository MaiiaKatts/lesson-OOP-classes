public class Account {
    private Person owner;
    private String iban;
    private double balance;
    private double percent;
//генерация кода: code -> Generate -> Constructor и далее выбираем нужные поля
    public Account(Person owner, String iban, double balance) {
        this.owner = owner;
        this.iban = iban;
        this.balance = balance;
    }
    @Override// что это такое?????
    public String toString() {//это системой сгенерированный метод
        return "Account{" +
                "Owner=" + owner +
                ", IBAN ='" + iban + '\'' +
                ", Balance=" + balance +
                '}';
    }
    public double getBalance (){//гетеры - методы доступа к полю
        return balance;
    }
    public void setBalance (double balance) {//сетеры - методы доступа к полю
        if (balance > 0) {
            this.percent = percent+1;
            this.balance = balance-1;
        }
    }
}
