public class Engine implements EngineRequirements {
    //Attributes
    private FuelType f;
    private double CurrentFuelLevel;
    private double MaxFuelLevel;
    /**
     * @param f;
     * @param currentFuelLevel;
     * @param maxFuelLevel
     */
    public Engine(FuelType f, double currentFuelLevel,double maxFuelLevel)
    {
    this.f=f;
    this.CurrentFuelLevel= currentFuelLevel;
    this.MaxFuelLevel= maxFuelLevel;}

    public FuelType getFuelType(){
        return this.f;
    }
    public double getMaxFuel() {
        return this.MaxFuelLevel;
    }
    public double getCurrentFuel(){
        return this.CurrentFuelLevel;

    }

    public void refuel(){
        CurrentFuelLevel=MaxFuelLevel;
    }

    public Boolean go(){
        if (CurrentFuelLevel>0){
            if (CurrentFuelLevel<3){
                CurrentFuelLevel=0;
            } else{CurrentFuelLevel-=3;}
            System.out.println("Remaining fuel level" + CurrentFuelLevel);
            return true;
        } else{
           return false;
        }}
    public String toString(){
        return "Engine has fuel type:"+this.f+"current fuel level:"+this.CurrentFuelLevel+"an max fuel level"+this.MaxFuelLevel;
    }
    public static void main(String[] args) {
        Engine myEngine=new Engine(FuelType.ELECTRIC,50,100.0);
        System.out.println(myEngine);
        while (myEngine.go()) {
           System.out.println("Choo choo!");
       }
        System.out.println("Out of fuel.");
    }
    }