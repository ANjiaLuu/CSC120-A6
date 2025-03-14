import java.util.ArrayList;
public class Car implements CarRequirements{
    //Attributes
    private int maxCapacity;
    private ArrayList<Passenger> passengers;
    /**
     * constructor
     * @param maxcapacity
     */
    public Car(int maxCapacity, ArrayList<Passenger> passengers){
        this.maxCapacity = maxCapacity;
        this.passengers = passengers;
    }
    /**
     * return the maximum capacity of car
     */
    public int getCapacity(){
        return this.maxCapacity;
    }
    /**
     * return the remaining seats
     */
    public int seatsRemaining(){
        return this.maxCapacity-this.passengers.size();
    }
    /**
     * assess if there is remaining seats 
     * adding passenger if there are remaining seats 
     */
    public Boolean addPassenger(Passenger p){
        if (seatsRemaining()>0){
            passengers.add(p);
            return true;
        }
        else{
            return false;}
    }
    public Boolean removePassenger(Passenger p){
        if (passengers.contains(p)){
            passengers.remove(p);
        }
        return true;
    }
    public void printManifest(){
        if (this.passengers.size()==0){
            System.out.println("This car is EMPTY.");
        }else{
            for (int i = 0;i< this.passengers.size()-1; i++){
                System.out.println(passengers.get(i));
            }
        }}
}