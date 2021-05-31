public class Movie {
    private String title;
    private String studio;
    private String rating;
    Movie(String title,String studio,String rating){
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }
    Movie(String title,String studio){
        this.title=title;
        this.studio=studio;
        rating="PG";
    }
    static Movie[] getPG(Movie[] movies){
        Movie[] pgMovies=new Movie[movies.length];int i=0;
        for(Movie movie:movies){
            if(movie.rating.contains("PG")){pgMovies[i++]=movie;}
        }
        return pgMovies;
    }
    @Override
    public String toString(){
        return "Title: "+title+" Production: "+studio;
    }
    public static void main(String args[]){
        Movie movie1=new Movie("Casino Royale","Eon Productions","PG-13");
        Movie movie2=new Movie("Iron Man","Marvel Studios","PG-13");
        Movie movie3=new Movie("Ratatouille","Disney Pixar","U");
        Movie movie4=new Movie("Moana","Disney Pixar");
        Movie[] movies={movie1,movie2,movie3,movie4};
        Movie[] pgMovies=getPG(movies);
        for(Movie pgMovie:pgMovies){
            if(pgMovie==null){break;}
            System.out.println(pgMovie.toString());
        }
    }
}
