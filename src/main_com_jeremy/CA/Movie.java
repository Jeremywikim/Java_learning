/*
* Movie
*/
package main_com_jeremy.CA;
import java.util.Scanner;
import java.util.InputMismatchException;

class Movie  {
    // declaration
    protected String title;
    protected Double duration, rating;
    protected int yearOfRelease;


    Scanner scanner = new Scanner(System.in);

    // constructor
    public Movie() {}

    public Double getDuration() {
        return duration;
    }

    // setDuration
//    public void setDuration() {
//        System.out.println("Please enter duration(mins) of the movie");
//        this.duration = doubleInput();
//
//    }

    public void setDuration() {
        Double duration ;
        while(true){
            System.out.println("Please enter duration(mins between (0-1000)) of the movie");
            duration = doubleInput();
            if(duration>0 && duration<=1000){
                this.duration = duration;
                break;
            }// if
        }
    }


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

    public String getTitle() {
        return title;
    }

    // setTitle
    public void setTitle() {
        System.out.println("Please enter title of the movie");
        this.title = stringInput();
    }

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

    }// setYearOfRelease

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


    // input
    public int intInput() {

        while (true) {
            try {
                System.out.print("Enter an Int: ");
                return scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input, Please enter an integer !");
                scanner.nextLine();  // Clear the invalid input from the scanner
            }
        }
    }

    public Double doubleInput() {

        while (true) {
            try {
                System.out.print("Enter an double: ");
                return scanner.nextDouble();
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input, Please enter an Double !");
                scanner.nextLine();  // Clear the invalid input from the scanner
            }
        }
    }

    public String stringInput() {

        while (true) {
            try {
                System.out.print("Enter an string: ");
                return scanner.nextLine();
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input, Please enter an string !");
                scanner.nextLine();  // Clear the invalid input from the scanner
            }
        }
    }


}






