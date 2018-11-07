package ist.java.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String... args) throws IOException{

                
                System.out.println("1: Write a tweet");
                System.out.println("2: Read all tweets");
                System.out.println("x: Exit");
                System.out.println("What do you want to do?");
                String action = System.in.read(); //if else for other letters

                if(action == 1){
                System.out.println("Please enter your username:");
                System.out.println();
                String author = System.in.read(); 

                System.out.println("What do you want to talk about ? (120 characters)");
                System.out.println();   	
                String tweet = System.in.read(); 

                System.out.println("send post: ");
                System.out.println("timestamp " + );
                System.out.println("author: \"" + author +"\"");
                System.out.println("tweet: \"" + tweet +"\"");

                //wrapping in a PostSubmission class before sending to the network
                } else{
                    //handling if it is a request
                }

    }
}
