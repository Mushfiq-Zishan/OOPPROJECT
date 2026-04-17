// 6. ================= TICKET CLASS =================
class Ticket {
    int id; double price;
    public Ticket(int id, double p) { this.id = id; this.price = p; }
    void showDetails() {
        System.out.println("Ticket ID: #" + id + " | Fair Amount: " + price + " TK");
    }
}