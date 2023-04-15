public class electricity_main {
    public static void main(String[] args) {
        planFactory plan = new planFactory();
        electricity_plan ins = plan.getPlan("institutional");
        ins.getRate();//gets the rate from the getRate overriden method in institution class
        System.out.println(ins.calculateBill(2));
    }

}
