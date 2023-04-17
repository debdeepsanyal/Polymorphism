public class animalPoly {
    public animalComposition AccessAnimal(String animal, String breed){
        if(animal.toLowerCase() == "cat"){
            return new Cat(breed);
        }
        if(animal.toLowerCase() == "dog"){
            return new Dog(breed);
        }
        else {
            return null;
        }
    }
}
