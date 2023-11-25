/*
 * MovieArray
 * author: MINGYAN JIA
 * 23 Nov 2023
 */

package main_com_jeremy.CA;


/*
 * this class is used for store instances of Movie and provide function as below
 * printSmallestDurationMovie, printLongestDurationMovie, printAverageDuration
 */
public class MovieArray {

    // declaration
    // new an array that contains instances of Movie.
    Movie[]  movieArrayList = new Movie[15];
    // Store how many instances in the array, Initialize the size to 0.
    public int size = 0;



    // loop
    public void myLoop(){

        // try to reuse intInput(), I named a intInput() in Movie(cause we didn't learn the Interface).
        // create an instance of Movie class.
        Movie reuseInput = new Movie();
        int selection;

        // use case flow control to create different branch
        do {
            // print prompt information
            System.out.println("1. Enter the details of an item \n" +
                    "2. Display the details of the last entered movie \n" +
                    "3. Display the Movie with the smallest duration \n" +
                    "4. Display the Movie with the longest duration \n" +
                    "5. Display the average duration of all the Movies entered until that point  \n" +
                    "6. Exit application \n" + "Please enter 1-6 to select \n*********************************");

            // use a nested do....while to get a valid int enter between scope of 1 to 6
            // reuse the intInput() (link to Movie class)
            do {
                selection = reuseInput.intInput();
            } while (selection <= 0 || selection >= 7);


            // from case 1 to 6, refer to different branch
            switch (selection) {

                // Enter the details of an item
                case 1:
                    // make an instance of Movie and add 1 to  size(refer to count of instance that created ).
                    movieArrayList[size++] = makeInstance();
                    System.out.printf("You have entered %s movie.\n", size);
                    System.out.println("*********************************");
                    break;

                // The details of the last entered movie
                case 2:
                    // print last item that entered
                    // when  the size is 0, print remind to enter item first.
                    if (size != 0) {
                        Movie item = movieArrayList[size-1];
                        System.out.println("Last entered movie is \n"+ item.toString());

                    }else{
                        System.out.println("Please enter items first !!!!! ");
                    }
                    System.out.println("*********************************");
                    break;

                // The Movie with the smallest duration
                case 3:
                    // print movie with the shortest duration
                    // when  the size is 0, print remind to enter item first.
                    if (size != 0) {
                        System.out.println("The Movie with the shortest duration is ");
                        printSmallestDurationMovie();

                    }else{
                        System.out.println("Please enter items first !!!!! ");
                    }
                    System.out.println("*********************************");
                    break;

                // The Movie with the longest duration
                case 4:
                    // print movie with the longest duration
                    // when  the size is 0, print remind to enter item first.
                    if (size != 0) {
                        System.out.println("The Movie with the longest duration is ");
                        printLongestDurationMovie();

                    }else{
                        System.out.println("Please enter items first !!!!! ");
                    }
                    System.out.println("*********************************");
                    break;

                // Average duration of all the Movies entered until that point.
                case 5:
                    // print average duration.
                    // when  the size is 0, print remind to enter item first.
                    if (size != 0) {
                        System.out.println("Average duration of all the Movies is ");
                        printAverageDuration();

                    }else{
                        System.out.println("Please enter items first !!!!! ");
                    }
                    System.out.println("*********************************");
                    break;

                // Exit application
                case 6:
                    System.out.println("Exited Application ! ");
                    System.out.println("*********************************");
                    break;

            } // switch

        } // do
        while(selection !=6 );

    } // myLoop

    // create an instance of Movie and pass values
    private Movie  makeInstance(){
        // create a Movie instance
        Movie movie = new Movie();

        // setTitle
        movie.setTitle();
        // setYearOfRelease
        movie.setYearOfRelease();
        // setDuration
        movie.setDuration();
        // setRating
        movie.setRating();
        return movie;
    } // makeInstance

    // printSmallestDurationMovie
    public void printSmallestDurationMovie(){
        // calculate the min duration
        int  minDuration = movieArrayList[0].getDuration();
        for (int i=0; i<size; i++){
            if(movieArrayList[i].getDuration()<minDuration){
                minDuration = movieArrayList[i].getDuration();
            }
        } // for

        // print min duration and the first Movie instance that has the duration.
        for (int i=0; i<size; i++) {
            // compare each duration with min duration.
            if (movieArrayList[i].getDuration() == minDuration) {
                System.out.println("the shortest duration:  "+ minDuration + " - " + movieArrayList[i]);
                break;
            }
        } // for
    } // printSmallestDurationMovie

    // printLongestDurationMovie
    public void printLongestDurationMovie(){
        // calculate the maximum duration
        int  maxDuration = movieArrayList[0].getDuration();
        for (int i=0; i<size; i++){
            if(movieArrayList[i].getDuration()>maxDuration){
                maxDuration = movieArrayList[i].getDuration();
            }
        } // for

        // print max duration and the first Movie instance that has the duration.
        for (int i=0; i<size; i++) {
            if (movieArrayList[i].getDuration() == maxDuration) {
                System.out.println("the longest duration: " + maxDuration + " - " + movieArrayList[i].toString());
                break;
            }
        }// for

    } // printLongestDurationMovie

    // printAverageDuration
    private void printAverageDuration(){
        // calculate avg duration
        int totalDuration = 0;
        for (int i=0; i<size; i++) {
            totalDuration+=movieArrayList[i].getDuration();
        } // for

        System.out.println((double) totalDuration/size); // transfer to double
    } // printAverageDuration

} // MovieArray
