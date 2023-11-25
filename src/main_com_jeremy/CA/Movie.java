/*
 * Movie
 * author: MINGYAN JIA
 * 23 Nov 2023
 */

package main_com_jeremy.CA;
import java.util.Scanner;
import java.util.InputMismatchException;


// Movie class is used as container for instance of movie, provide loads of functions as
// getter and setter of all fields, toString (overflow).
class Movie  {
    // declaration
    protected String title;
    protected int duration;
    protected Double  rating;
    protected int yearOfRelease;

    // create an instance of Scanner
    Scanner scanner = new Scanner(System.in);

    // constructor
    public Movie() {}

    // getDuration
    public int getDuration() {
        return duration;
    }

    // setDuration
    public void setDuration() {
        int duration ;
        while(true){
            System.out.println("Please enter duration (minutes between (60-300)) of the movie");
            duration = intInput();
            if(duration>=60 && duration<=300){
                this.duration = duration;
                break;
            }// if
        }
    }

    // getRating
    public Double getRating() {
        return rating;
    }

    // setRating
    public void setRating() {
        Double rate ;
        while(true){
            System.out.println("Please enter rating(0-10) of the movie ");
            rate = doubleInput();
            if(rate>=0 && rate<=10){
                this.rating = rate;
                break;
            }// if

        }// while

    }// setRating

    // getTitle
    public String getTitle() {
        return title;
    }

    // setTitle
    public void setTitle() {
        System.out.println("Please enter title of the movie");
        this.title = stringInput();
    }

    // getYearOfRelease
    public int getYearOfRelease() {
        return yearOfRelease;
    }

    // setYearOfRelease
    public void setYearOfRelease() {
        int year ;
        while(true){
            System.out.println("Please enter release year(1900-2024) of the movie ");
            year = intInput();
            if(year>=1900 && year<=2024){
                this.yearOfRelease = year;
                break;
            }// if

        }// while

    }

    // toString
    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", duration=" + duration +
                ", rating=" + rating +
                '}';
    }


    // this function is used to get an int enter
    public int intInput() {
        // use exception to make codes stronger
        while (true) {
            try {
                System.out.print("Enter an Int: ");
                return scanner.nextInt(); // return an int
            }

            catch (InputMismatchException e) {
                System.out.println("Invalid input, Please enter an integer !");
                scanner.nextLine();  // Clear the invalid input from the scanner
            }
        } // while
    } // intInput

    // this function is used to get a Double enter
    public Double doubleInput() {
        // use exception to make codes stronger
        while (true) {
            try {
                System.out.print("Enter an double: ");
                return scanner.nextDouble(); // return a double
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input, Please enter an Double !");
                scanner.nextLine();  // Clear the invalid input from the scanner
            }
        } // while
    } // doubleInput

    public String stringInput() {
        // use exception to make codes stronger
        while (true) {
            try {
                System.out.print("Enter an string: ");
                return scanner.nextLine(); // return a string
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input, Please enter an string !");
                scanner.nextLine();  // Clear the invalid input from the scanner
            }
        } // while
    } // stringInput

} // Movie






