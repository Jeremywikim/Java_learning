package main_com_jeremy.CA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MovieArray {
    // declaration
    ArrayList<Movie> movieArrayList = new ArrayList<>();


    // loop
    public void myLoop(){
        int selection;
        // try to reuse input<>
        Movie reuseInput = new Movie();
        do {
            System.out.println("1 – Enter the details of an item \n" +
                    "2 – Display the details of the last entered movie \n" +
                    "3 – Display the Movie with the smallest duration \n" +
                    "4 – Display the Movie with the longest duration \n" +
                    "5 – Display the average duration of all the Movies entered until that point  \n" +
                    "6 – Exit application \n" + "Please enter 1-6 to select \n*********************************");

            // I try to reuse the generic functions in Movie, but I don't know better method
            // Here I make an instance of Movie then , I can reuse input<>
            do {
                selection = reuseInput.input(Integer.class);
            } while (selection <= 0 || selection >= 7);



            switch (selection) {
                case 1: // Enter the details of an item
                    movieArrayList.add(makeInstance());
                    System.out.println("*********************************");
                    break;

                case 2: // The details of the last entered movie
                    if (movieArrayList != null && !movieArrayList.isEmpty()) {
                        Movie item = movieArrayList.get(movieArrayList.size()-1);
                        System.out.println("Last entered movie is \n"+ item.toString());

                    }else{
                        System.out.println("Please enter items first !!!!! ");
                    }
                    System.out.println("*********************************");
                    break;

                case 3: // The Movie with the smallest duration
                    if (movieArrayList != null && !movieArrayList.isEmpty()) {
                        System.out.println("The Movie with the smallest duration is ");
                        printSmallDurationMovie();

                    }else{
                        System.out.println("Please enter items first !!!!! ");
                    }
                    System.out.println("*********************************");
                    break;

                case 4: // The Movie with the longest duration
                    if (movieArrayList != null && !movieArrayList.isEmpty()) {
                        System.out.println("The Movie with the longest duration is ");
                        printLongestDurationMovie();

                    }else{
                        System.out.println("Please enter items first !!!!! ");
                    }
                    System.out.println("*********************************");
                    break;

                case 5: // Average duration of all the Movies entered until that point
                    if (movieArrayList != null && !movieArrayList.isEmpty()) {
                        System.out.println("Average duration of all the Movies is ");
                        printAverageDuration();

                    }else{
                        System.out.println("Please enter items first !!!!! ");
                    }
                    System.out.println("*********************************");
                    break;
                case 6: // Exit application
                    System.out.println("Exited Application ! ");
                    System.out.println("*********************************");
                    break;

            }
        }// do
        while(selection !=6 );


    }// myLoop

    // new instance of Movie and set values
    private Movie makeInstance(){
        Movie movie = new Movie();
        movie.setTitle();
        movie.setYearOfRelease();
        movie.setDuration();
        movie.setRating();
        return movie;
    }

    // printSmallestDurationMovie
    private void printSmallDurationMovie(){
        // Find the minimum duration using Collections.min
        double minDuration = Collections.min(movieArrayList, durationComparator).getDuration();

        // Collect movies with the minimum duration
        List<Movie> moviesWithSmallestDuration = new ArrayList<>();
        for (Movie movie : movieArrayList) {
            if (movie.getDuration() == minDuration) {
                moviesWithSmallestDuration.add(movie);
            }
        }

        // Print all movies with the smallest duration
        for (Movie movie : moviesWithSmallestDuration) {
            System.out.println(movie.toString());
        }
    }

    // printLongestDurationMovie
    private void printLongestDurationMovie(){
        // Find the minimum duration using Collections.min
        double minDuration = Collections.max(movieArrayList, durationComparator).getDuration();

        // Collect movies with the minimum duration
        List<Movie> moviesWithLongestDuration = new ArrayList<>();
        for (Movie movie : movieArrayList) {
            if (movie.getDuration() == minDuration) {
                moviesWithLongestDuration.add(movie);
            }
        }

        // Print all movies with the longest duration
        for (Movie movie : moviesWithLongestDuration) {
            System.out.println(movie.toString());
        }
    }

    // printAverageDuration
    private void printAverageDuration(){
        Double totalDuration = 0.0;
        for (Movie movie : movieArrayList) {
            totalDuration+=movie.getDuration();
        }
        System.out.println(totalDuration/movieArrayList.size());

    }

    // Define a custom comparator for Movie based on duration
    Comparator<Movie> durationComparator = Comparator.comparingDouble(Movie::getDuration);


}
