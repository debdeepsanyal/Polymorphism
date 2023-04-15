public class carPlan {
    public carPlan(){}//the empty constructor that will be called by the subclass constructors(declaring this wasnt necessary)
                        //since java creates a default constructor for the parent class anyway

    public void startEngine(){//empty methods to be overriden by the subclasses
    }
    public void drive(int km_to_dest){}
}
class gasCar extends carPlan{
    private double km_pl;
    private int cylinder;
    private int gas_left;

    public gasCar(double km_pl,int cylinder, int gas_left){
        this.km_pl = km_pl;
        this.cylinder=cylinder;
        this.gas_left=gas_left;
    }

    @Override
    public void startEngine() {
        System.out.println("Push the clutch while turning the key");
    }

    @Override
    public void drive(int km_to_dest) {
        double can_travel_dist = km_pl*gas_left;
        if(can_travel_dist>km_to_dest){
            System.out.println("You can reach the destination without worrying about gas");
        }
        else{
            System.out.printf("Find a gas station before %.1f kilometres",can_travel_dist);
        }
    }

    public void throttle(){//the method exclusive to class gasCar
        System.out.println("Your gas car has a stable throttle at the moment");
    }
}
class electricCar extends carPlan{
    private double km_pc;
    private double BatterySize;
    private int charge;


    public electricCar(double km_pc, double batterySize, int charge) {
        this.km_pc = km_pc;
        this.BatterySize = batterySize;
        this.charge = charge;
    }

    @Override
    public void startEngine() {
        System.out.println("Press the Start button to turn the engine on ");
    }

    @Override
    public void drive(int km_to_dest) {
        double can_travel_distance = km_pc*charge;
        if(can_travel_distance>km_to_dest){
            System.out.println("You can proceed without having to charge your EV");
        }
        else{
            System.out.printf("Find a charging station before %.1f kilometres",can_travel_distance);
        }
    }
    public void turbo(){// an exclusive method to the EV to test out some fundamental polymorphism concepts in the main class
        System.out.println("Turbo mode is on in your EV");
    }


}
class hybridCar extends carPlan{
    private double km_pc;
    private double BatterySize;
    private int charge;
    private double km_pl;
    private int gas_left;
    private int cylinder;


    public void setKm_pc(double km_pc) {
        this.km_pc = km_pc;
    }

    public hybridCar(double km_pc, double batterySize, int charge, double km_pl, int gas_left, int cylinder) {
        this.km_pc = km_pc;
        this.BatterySize = batterySize;
        this.charge = charge;
        this.km_pl = km_pl;
        this.gas_left = gas_left;
        this.cylinder = cylinder;
    }

    @Override
    public void startEngine() {
        System.out.println("Press the Start button to turn the engine on, Or push the clutch and turn the key ");
    }

    @Override
    public void drive(int km_to_dest) {
        double can_travel_distance = km_pl*gas_left;
        if(can_travel_distance>km_to_dest){
            System.out.println("You can proceed without having to charge your EV");
        }
        else{
            if(km_pc*charge>(km_to_dest - can_travel_distance)){
                System.out.printf("Your car will be running on the battery after %.1f kilometres",can_travel_distance);
            }
            else{
                System.out.printf("Fuel up after %f kilometres ",can_travel_distance);
            }
        }

    }

    public void getBatterySize() {
        System.out.printf("The battery size of your car is %f",BatterySize);
    }
    public void getCylinder(){
        System.out.printf("You have %d cylinders in your car ",cylinder);
    }
    public void switchMode(){//the method exclusive to hybridCar
        System.out.println("Your hybrid mode has been turned on ");
    }

}

