// 5. ================= TRAIN CLASS =================
class Train {
    String tName, src, dest;

    public Train(String n, String s, String d) {
        this.tName = n;
        this.src = s;
        this.dest = d;
    }

    void showDetails() {
        System.out.println("Train: " + tName + " | Source: " + src + " | Destination: " + dest);
    }
}
