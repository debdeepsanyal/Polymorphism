public class phoneAccess {
    public Phone getPhone(String phone){
        if(phone.equalsIgnoreCase("iphone")){
            return new iPhone();
        }
        else if(phone.equalsIgnoreCase("samsung")){
            return new Samsung();
        }
        else return null;
    }
}
