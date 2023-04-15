public class Phone {
    public Phone(){}
    public void Camera(){}
    public void Lock(boolean yes){}
    public void voiceAssistant(){}
    public void softwareVersion(double vers){}
}
class iPhone extends Phone{

    @Override
    public void Camera() {
        System.out.println("Rocks a 48 mp main lens, 3x telephoto and a wide angle lens ");
    }

    @Override
    public void Lock(boolean yes) {
        if(yes){
            System.out.println("Your iPhone has been locked.");
        }
        else{
            System.out.println("Unlock with your face ID");
        }
    }

    @Override
    public void softwareVersion(double vers) {
        if(vers<16.4){
            System.out.println("Updates available, iOS 16.4 ready");
        }
        else{
            System.out.println("Your iPhone is updates to the latest version of iOS");
        }
    }

    @Override
    public void voiceAssistant() {
        System.out.println("Hey, this is Siri, how can i help");
    }

}
class Samsung extends Phone{
    @Override
    public void Camera() {
        System.out.println("A 100 mp main lens, 100 x telephoto and a wide angle lens ");
    }

    @Override
    public void Lock(boolean yes) {
        if(yes){
            System.out.println("Your Android is locked ");
        }
        else{
            System.out.println("Enter the key to unlock your phone ");
        }
    }

    @Override
    public void voiceAssistant() {
        System.out.println("Hey! Bixby at your service ");
    }

    @Override
    public void softwareVersion(double vers) {
        if(vers<4.3){
            System.out.println("Updates available for your Galaxy device, update to version 4.3");
        }
        else {
            System.out.println("Your Galaxy is updates to the latest software");
        }
    }
}
