class CardPayment implements Payment {
    private String cardNumber;
    public CardPayment(String no) { this.cardNumber = no; }
    @Override
    public void pay(double amount) {
        System.out.println("Payment: " + amount + " TK paid via Card (" + cardNumber + ")");
    }
}
