import java.util.Arrays;

public class Airport {
    private int capacity;
    private int airfield[];
    public static void main(String args[]) {
    }

    public void initialize(int airfieldCapacity){
        this.capacity = airfieldCapacity;
        this.airfield = new int[airfieldCapacity];
    }

    public String returnCapacity() {
        return "The airfield capacity is " + this.capacity;
    }

    public String instructLand(){

        String clear = "";

        for(int i=0; i < airfield.length; i++)
            if(airfield[i] == 0) {
                clear = "Yes";
                break;
            }else{
                clear = "NO";
                break;
            }
        if(clear == "Yes"){
            return "The plane may land when clear";
        }else{
            return "The airfield is too full";
        }
    }


    public String landConfirmed(int aircraftReg) {

        for(int i=0; i < airfield.length; i++)
            if(airfield[i] == 0) {
                airfield[i] = aircraftReg;
                break;
            }

        String groundedPlanes =  (Arrays.toString(airfield));
        return "Aircraft on the ground: " + groundedPlanes;

    }

    public String takeOff(int aircraftReg){
        for(int i=0; i < airfield.length; i++)
            if(airfield[i] == aircraftReg) {
                airfield[i] = 0;
                break;
            }
        String groundedPlanes =  (Arrays.toString(airfield));
        return "Aircraft on the ground: " + groundedPlanes;

    }


    public static String validConditions(){
        double x = Math.random();
        if(x >= 0.70){
            return "Stormy";
        }else{
            return "Suitable conditions for landing/take off";

        }

    }
}
