class MobilePayment implements Payment {
    private String mobileNumber;
    public MobilePayment(String no) { this.mobileNumber = no; }
    @Override
    public void pay(double amount) {
        System.out.println("Payment: " + amount + " TK paid via Mobile/Bank (" + mobileNumber + ")");
    }
}
