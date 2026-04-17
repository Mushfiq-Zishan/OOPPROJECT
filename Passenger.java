// 3. ================= PASSENGER CLASS =================
class Passenger extends Person {
    int age;
    public Passenger(String name, String email, String phone, int age) {
        super(name, email, phone);
        this.age = age;
    }
    void showDetails() {
        System.out.println("Passenger: " + name + " (Age: " + age + ")");
        System.out.println("Contact: " + phone + " | Email: " + email);
    }
}