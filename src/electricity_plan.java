public class electricity_plan {

    protected double rate;
    public void getRate(){
    }
    public double calculateBill(int units){
        return units*rate;
    }
}
class domesticPlan extends electricity_plan{
    public void getRate(){
        rate = 2.5;
    }
}
class commercialPlan extends electricity_plan{
    public void getRate(){
        rate = 4.5;
    }
}
class institutionalPlan extends electricity_plan{
    public void getRate(){
        rate = 3.0;
    }
}