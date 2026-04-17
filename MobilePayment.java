// 9. ================= MOBILE PAYMENT CLASS =================
class MobilePayment implements Payment {
    String mobileNo;
    public MobilePayment(String no) { this.mobileNo = no; }
    @Override
    public void pay(double amount) {
        System.out.println("Payment: " + amount + " TK paid via Mobile (" + mobileNo + ")");
    }
}