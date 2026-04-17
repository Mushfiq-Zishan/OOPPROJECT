class RailwayStaff extends Person {
    private int staffId;

    public RailwayStaff(String name, int id) {
        super(name, null, null);
        this.staffId = id;
    }

    public void updateSchedule() { System.out.println("Schedule updated."); }
    public void modifyTicket() { System.out.println("Ticket modified."); }
    public void addOffer() { System.out.println("Offer added."); }

    void verify() {
        System.out.println("Verification: Done by Staff " + getName() + " (ID: " + staffId + ")");
    }
}
