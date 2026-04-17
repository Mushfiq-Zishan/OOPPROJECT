// 4. ================= STAFF CLASS =================
class RailwayStaff extends Person {
    int staffId;
    public RailwayStaff(String name, int id) {
        super(name, null, null); // Staff er email/phone dorkar nai ekhane
        this.staffId = id;
    }
    void verify() {
        System.out.println("Verification: Done by Staff " + name + " (ID: " + staffId + ")");
    }
}