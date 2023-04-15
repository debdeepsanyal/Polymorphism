public class planFactory {
    public electricity_plan getPlan(String planType){
        if(planType == "null"){
            return null;
        }
        else if(planType.equalsIgnoreCase("domestic")){
            return new domesticPlan();
        }
        else if(planType.equalsIgnoreCase("commercial")){
            return new commercialPlan();
        }
        else if(planType.equalsIgnoreCase("institutional")){
            return new institutionalPlan();
        }
        return null;
    }
}
