public class phoneMain {
    public static void main(String[] args) {
        phoneAccess phone = new phoneAccess();
        Phone your_phone = phone.getPhone("iPhone");
        your_phone.voiceAssistant();

    }

}
