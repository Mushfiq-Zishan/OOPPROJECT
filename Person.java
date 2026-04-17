abstract class Person {
    private String name;
    private String email;
    private String phoneNumber;

    public Person(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phone;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }

    public void login() { System.out.println(name + " logged in."); }
    public void logout() { System.out.println(name + " logged out."); }
}
