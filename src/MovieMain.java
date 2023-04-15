public class MovieMain {
    public static void main(String[] args) {
        Movie movie = new Movie("Atonement");
        movie.watchMovie();
        Movie adv = new Adventure("Infinity War");
        adv.watchMovie();//this object adv can only use the methods in the Movie class and not the Adventure class
        //we can also create an instance in this form
        //Movie adv = new Adventure("Infinity war"); //the data type of this object/instance can be Movie
        //instead of Adventure because Adventure is a subclass of the Movie class
        //adv.print();
        int num = adv.print();
        System.out.println(num);//overriden method gets executed
        Movie mov = Movie.getMovie("h","Conjuring");
        mov.watchMovie();


    }
}