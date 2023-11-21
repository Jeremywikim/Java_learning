package main_com_jeremy.CA;/*
 * Movie
 */
import java.util.Scanner;
import java.util.InputMismatchException;

class Movie implements Comparable<Movie> {
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
    public void setDuration() {
        System.out.println("Please enter duration(mins) of the movie");
        this.duration = input(Double.class);
    }

    public Double getRating() {
        return rating;
    }

    // setRating
    public void setRating() {
        Double rate ;
        while(true){
            System.out.println("Please enter rating(0-10) of the movie ");
            rate = input(Double.class);
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
        this.title = input(String.class);
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    // setYearOfRelease
    public void setYearOfRelease() {
        int year ;
        while(true){
            System.out.println("Please enter release year(1900-2024) of the movie ");
            year = input(Integer.class);
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

    @Override
    public int compareTo(Movie other) {
        // Implement natural ordering based on duration
        return Double.compare(this.duration, other.duration);
    }

    // input
    public<T> T input(Class<T> c) {

        while (true) {
            try {
                if(c==Double.class) {
                    System.out.print("Enter an double: ");
                    return c.cast(scanner.nextDouble());
                }
                else if(c==String.class){
                    System.out.print("Enter an string: ");
                    return c.cast(scanner.nextLine());
                }else if(c==Integer.class) {
                    System.out.print("Enter an Int: ");
                    return c.cast(scanner.nextInt());
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an "+c);
                scanner.nextLine();  // Clear the invalid input from the scanner
            }
        }
    }


}






