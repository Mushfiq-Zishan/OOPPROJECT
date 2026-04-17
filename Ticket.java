class Ticket {
    private int ticketNumber;
    private double price;

    public Ticket(int id, double p) {
        this.ticketNumber = id;
        this.price = p;
    }

    public void generateTicket() { System.out.println("Ticket generated."); }
    public void cancelTicket() { System.out.println("Ticket cancelled."); }

    void showDetails() {
        System.out.println("Ticket ID: #" + ticketNumber + " | Fair Amount: " + price + " TK");
    }
}
