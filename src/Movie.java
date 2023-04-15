public class Movie {
    private String title;
    protected int c;
    public Movie(String title){
        this.title=title;
    }
    public void watchMovie(){
        String objectType = this.getClass().getSimpleName();//this.getClass() returns the class of the Object
        //created.it returns something like class java.util.Movie. class java.util.movie.getSimpleName() simply returns Movie
        System.out.println(title + " is a " + objectType + " movie");
    }
    public int print(){
        return 0;
    }
    public static Movie getMovie(String title, String name){
        return switch (title.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(name);
            case 'C' -> new Comedy(name);
            case 'H' -> new Horror(name);
            default -> null;

        };
    }

}
class Adventure extends Movie{ //compiler will go through all the methods in the subclass but wont be able to run them.
                               //object can only run the  methods in the parent class because  the datatype of the object
                               //is the parent class and not the subclass.however, Overriden methods will be executed
    public Adventure(String movie){
        super(movie);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("%s %n".repeat(3),"Nerve wracking suspense",
                "Omnious music ",
                "Heart drops");
    }
    public int print(){
        c=4;
//        System.out.println(c);
//        System.out.println("Just to prove that this is the method which gets executed" +
//                "but i cant directly access it here from the subclass so i have to override it ");
        return c;
    }


}
class Comedy extends Movie{ //compiler will go through all the methods in the subclass but wont be able to run them.
    //object can only run the  methods in the parent class because  the datatype of the object
    //is the parent class and not the subclass.however, Overriden methods will be executed
    public Comedy(String movie){
        super(movie);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("%s %n".repeat(3),"Something funnny happens",
                "probably some cringe ",
                "light ending ");
    }



}
class Horror extends Movie{ //compiler will go through all the methods in the subclass but wont be able to run them.
    //object can only run the  methods in the parent class because  the datatype of the object
    //is the parent class and not the subclass.however, Overriden methods will be executed
    public Horror(String movie){
        super(movie);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("%s %n".repeat(3),"some sinister plot",
                "some jumpscares ",
                "no sleep at night ig");
    }



}