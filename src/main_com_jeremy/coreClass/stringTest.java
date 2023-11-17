package main_com_jeremy.coreClass;
import org.junit.jupiter.api.Test;
import java.util.Scanner;

import java.util.Arrays;

public class stringTest {}


class stringTest1 {
    String s1 = "Hello";
    String s2 = new String(new char[] {'H', 'e', 'l', 'l', 'o'});
    @Test
    public void printString1(){
        System.out.println("s1: "+ s1);
        System.out.println("location in memory: "+ s1);
        System.out.println("s2: "+ s2);
        System.out.println("=======use toUpperCase()====================");
        s1 = s1.toUpperCase();
        System.out.println("s1:  "+ s1);
    }


}
class StringArray{
    private String[] words;
    private String sentences="I don't know what is that represent. ";

    //unitTest
    @Test
    public void print1(){
        setWords();
        System.out.println(Arrays.toString(words));

    }

    @Test
    public void print2(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = "app";

        for (int i =0; i< word.length(); i++){
            if(word.charAt(i)=='a') {
                System.out.print('a');
            }else{
                System.out.print("*");
            }
        }

    }

    public StringArray() {}


    public String[] getWords() {
        return words;
    }

    public void setWords() {
        this.words = sentences.split(" ");
    }

    public String getSentences() {
        return sentences;
    }

    public void setSentences(String sentences) {
        this.sentences = sentences;
    }
}


class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}