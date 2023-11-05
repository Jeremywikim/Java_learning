/*
* MovieArray
 */
import java.util.Objects;

//
public class MovieArray {
    // declaration
    Movie[]  movieArrayList = new Movie[15];
    public int size = 0; // Initialize the size to 0



    // loop
    public void myLoop(){
        int selection;
        // try to reuse input<>
        Movie reuseInput = new Movie();
        do {
            System.out.println("1. Enter the details of an item \n" +
                    "2. Display the details of the last entered movie \n" +
                    "3. Display the Movie with the smallest duration \n" +
                    "4. Display the Movie with the longest duration \n" +
                    "5. Display the average duration of all the Movies entered until that point  \n" +
                    "6. Exit application \n" + "Please enter 1-6 to select \n*********************************");

            // I try to reuse the generic functions in Movie, but I don't know better method
            // Here I make an instance of Movie then , I can reuse input<>
            do {
                selection = reuseInput.intInput();
            } while (selection <= 0 || selection >= 7);



            switch (selection) {
                case 1: // Enter the details of an item
                    movieArrayList[size++] = makeInstance();
                    System.out.println("*********************************");
                    break;

                case 2: // The details of the last entered movie
                    if (size != 0) {
                        Movie item = movieArrayList[size-1];
                        System.out.println("Last entered movie is \n"+ item.toString());

                    }else{
                        System.out.println("Please enter items first !!!!! ");
                    }
                    System.out.println("*********************************");
                    break;

                case 3: // The Movie with the smallest duration
                    if (size != 0) {
                        System.out.println("The Movie with the smallest duration is ");
                        printSmallDurationMovie();

                    }else{
                        System.out.println("Please enter items first !!!!! ");
                    }
                    System.out.println("*********************************");
                    break;

                case 4: // The Movie with the longest duration
                    if (size != 0) {
                        System.out.println("The Movie with the longest duration is ");
                        printLongestDurationMovie();

                    }else{
                        System.out.println("Please enter items first !!!!! ");
                    }
                    System.out.println("*********************************");
                    break;

                case 5: // Average duration of all the Movies entered until that point
                    if (size != 0) {
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
        Double  minDuration = movieArrayList[0].getDuration();
        for (int i=0; i<size; i++){
            if(movieArrayList[i].getDuration()<=minDuration){
                minDuration = movieArrayList[i].getDuration();
            }

        }

        // Collect movies with the minimum duration
        for (int i=0; i<size; i++) {
            if (Objects.equals(movieArrayList[i].getDuration(), minDuration)) {
                System.out.println(movieArrayList[i]);
            }
        }

    }

    // printLongestDurationMovie
    private void printLongestDurationMovie(){
        // Find the maximum duration using Collections.min
        Double  maxDuration = movieArrayList[0].getDuration();
        for (int i=0; i<size; i++){
            if(movieArrayList[i].getDuration()>=maxDuration){
                maxDuration = movieArrayList[i].getDuration();
            }

        }

        // Collect movies with the maximum duration
        for (int i=0; i<size; i++) {
            if (Objects.equals(movieArrayList[i].getDuration(), maxDuration)) {
                System.out.println(movieArrayList[i].toString());
            }
        }

    }

    // printAverageDuration
    private void printAverageDuration(){
        Double totalDuration = 0.0;
        for (int i=0; i<size; i++) {
            totalDuration+=movieArrayList[i].getDuration();
        }
        System.out.println(totalDuration/size);

    }

}
