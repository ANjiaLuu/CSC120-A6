import java.util.ArrayList;
public class Train implements TrainRequirements{
    public FuelType f;
    private double MaxFuelLevel;
    private ArrayList<Car> nCars;
    private int maxCapacity;
    private Engine engine; 

    Train(FuelType f, double MaxFuelLevel, ArrayList<Car>nCars, int maxCapacity){
        this.f=f;
        this.MaxFuelLevel=MaxFuelLevel;
        this.nCars= nCars;
        this.maxCapacity=maxCapacity;
    }

    public Engine getEngine(){
        return this.engine;
    }
    public Car getCar(int i){
        if ( i >= 0 && i < nCars.size()){
            return this.nCars.get(i);}
        return null;
    }
    public int getMaxCapacity(){
        return maxCapacity;
    }
    public int seatsRemaining(){
        int total=0;
        for (int i=0; i <nCars.size();i++) {
            Car car =nCars.get(i);
            total+=car.seatsRemaining();
        }
        return total;
    }
    public void printManifest(){
        for (int i=0; i <nCars.size();i++) {
            nCars.get(i).printManifest();
        }
    }
}
