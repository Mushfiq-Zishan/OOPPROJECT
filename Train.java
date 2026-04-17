class Train {
    private int trainNumber;
    private String trainName, source, destination;

    public Train(String name, String s, String d) {
        this.trainNumber = (int)(Math.random() * 9000) + 1000; // Random Train Number
        this.trainName = name;
        this.source = s;
        this.destination = d;
    }

    void showDetails() {
        System.out.println("Train: " + trainName + " | Source: " + source + " | Destination: " + destination);
    }
}
