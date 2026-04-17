// 8. ================= CARD PAYMENT CLASS =================
class CardPayment implements Payment {
    String cardNo;
    public CardPayment(String no) { this.cardNo = no; }
    @Override
    public void pay(double amount) {
        System.out.println("Payment: " + amount + " TK paid via Card (" + cardNo + ")");
    }
}