public class animalComposition {
    public void eyeColor(){}
    public void furType(){}
}
class Cat extends animalComposition{
    private Siamese siamese;
    private BritishShortHair britishShortHair;
    private String breed;
    public Cat(String breed){
        siamese = new Siamese();
        britishShortHair = new BritishShortHair();
        this.breed = breed;
    }
    public void eyeColor(){
        breed = breed.toLowerCase();
        switch (breed){
            case "siamese" -> siamese.eye_color();
            case "british short hair" -> britishShortHair.eye_color();
        }
    }
    public void furType(){
        breed = breed.toLowerCase();
        switch (breed){
            case "siamese" -> siamese.furType();
            case "british short hair" -> britishShortHair.furType();
        }
    }
}
class Dog extends animalComposition{
    public Husky husky;
    public Pitbull pitbull;
    public String breed;
    public Dog(String breed){
        husky = new Husky();
        pitbull = new Pitbull();
        this.breed = breed;
    }
    public void eyeColor(){
        breed = breed.toLowerCase();
        switch (breed){
            case "husky" -> husky.eye_color();
            case "pitbull" -> pitbull.eye_color();
        }
    }
    public void furType(){
        breed = breed.toLowerCase();
        switch (breed){
            case "husky" -> husky.furType();
            case "pitbull" -> pitbull.furType();
        }
    }

}
