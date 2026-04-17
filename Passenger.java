class Passenger extends Person {
    private int age;
    private String address;

    public Passenger(String name, String email, String phone, int age) {
        super(name, email, phone);
        this.age = age;
        this.address = "Not Provided";
    }

    public void searchTrain() { System.out.println("Searching for available trains..."); }
    public void bookTicket() { System.out.println("Ticket booking initiated..."); }
    public void cancelTicket() { System.out.println("Ticket cancellation requested."); }

    void showDetails() {
        System.out.println("Passenger: " + getName() + " (Age: " + age + ")");
        System.out.println("Contact: " + getPhoneNumber() + " | Email: " + getEmail());
    }
}
