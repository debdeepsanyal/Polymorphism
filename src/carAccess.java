public class carAccess {
    double km_pl, km_pc, BatterySize;
    int cylinder,gas_left, charge;
    String type;
    public carAccess(double km_pc, double BatterySize,int charge, String type){//chaining for EVs
        this(0,km_pc,0,BatterySize,0,charge, type);
    }
    public carAccess(double km_pl, int cylinder, int gas_left, String type){//constructor chaining for gas car, the components of elelctric car are set to 0
        this(km_pl,0,cylinder,0,gas_left,0, type);
    }
    public carAccess(double km_pl, double km_pc, int cylinder, double BatterySize, int gas_left, int charge, String type ){//this constructor inputs all the possible
        this.km_pl=km_pl;  //values for all the types of cars, this can also be called if the user has a hybrid car(since hybrids are combination of the other 2 types)
        this.km_pc = km_pc;
        this.cylinder = cylinder;
        this.BatterySize = BatterySize;
        this. gas_left = gas_left;
        this.charge = charge;
        this.type = type;

    }
    public carPlan carplan()
    {//now that we have all the values required, we can pass them to the individual class constructors
        if(type.equalsIgnoreCase("gas")){
            return new gasCar(km_pl,cylinder,gas_left);
        }
        else if(type.equalsIgnoreCase("electric")){
            return new electricCar(km_pc,BatterySize,charge);
        }
        else if(type.equalsIgnoreCase("hybrid")){
            return new hybridCar(km_pc,BatterySize,charge,km_pl,gas_left,cylinder);
        }
        else {
            return null;
        }
    }


}
