public class Airport {
    private int capacity;

    public static void main(String args[]) {
    }

    public void initialize(){
        this.capacity = 100;
    }

    public String returnCapacity() {
        return "The airfield capacity is " + this.capacity;
    }

    public String instructLand() {
        return "The plane can land!";
    }
}
