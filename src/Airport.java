import java.util.Arrays;

public class Airport {
    private int capacity;
    private int airfield[];
    public static void main(String args[]) {
    }

    public void initialize(){
        this.capacity = 100;
        this.airfield = new int[100];
    }

    public String returnCapacity() {
        return "The airfield capacity is " + this.capacity;
    }

    public String instructLand(){

//        if(Arrays.asList(airfield).contains(0)){
//            return "The plane may land when clear";
//        }else{
//            return "No space";
//        }
//
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
}
