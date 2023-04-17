import java.util.Scanner;

public class animal_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for Cat, Press 2 for dog ");
        int check = sc.nextInt();
        animalPoly ins = new animalPoly();
        if(check == 1){
            System.out.println("Enter 1 for Siamese, Enter 2 for British Short Hair");
            int check_2 = sc.nextInt();
            if(check_2 == 2){
                animalComposition cat = ins.AccessAnimal("cat","British short hair");
                System.out.println("Press 1 for fur type, Press 2 for Eye color");
                int check_3 = sc.nextInt();
                if(check_3 == 1){
                    cat.furType();
                }
                else if(check_3 == 2){
                    cat.eyeColor();
                }
            }
            else if (check_2 == 1){
                animalComposition cat = ins.AccessAnimal("cat","siamese");
                System.out.println("Press 1 for fur type, Press 2 for Eye color");
                int check_3 = sc.nextInt();
                if(check_3 == 1){
                    cat.furType();
                }
                else if(check_3 == 2){
                    cat.eyeColor();
                }
            }
        }
        else if(check == 2){
            System.out.println("Enter 1 for Husky, Enter 2 for PitBull");
            int check_2 = sc.nextInt();
            if(check_2 == 1){
                animalComposition dog = ins.AccessAnimal("dog","husky");
                int check_3 = sc.nextInt();
                if(check_3 == 1){
                    dog.furType();
                }
                else if(check_3 == 2){
                    dog.eyeColor();
                }
            }
            else if (check_2 == 2){
                animalComposition dog = ins.AccessAnimal("dog","husky");
                int check_3 = sc.nextInt();
                if(check_3 == 1){
                    dog.furType();
                }
                else if(check_3 == 2){
                    dog.eyeColor();
                }

            }
        }
    }
}
