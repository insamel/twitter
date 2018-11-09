package ist.java.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
import java.net.*;

public class Client {
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private Socket connection;

	// Empty constructor for now
	public Client(){
	}

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
            System.out.println("timestamp " );
            System.out.println("author: \"" + author +"\"");
            System.out.println("tweet: \"" + tweet +"\"");

            //wrapping in a PostSubmission class before sending to the network
            } else{
            	//handling if it is a request
	    }


		// Client handling code from here and down
		Client client = new Client(); 
		while(true){  
			client.startRunning();
		}
    } // end of main

	//connect to server
	public void startRunning(){
		try{
			connectToServer();
			streamSetup();
		}catch(EOFException eofException){
			System.out.println("\n Client terminated the connection");
		}catch(IOException ioException){
			ioException.printStackTrace();
		}finally{
			close();
		}
	}

	//connect to server
	private void connectToServer() throws IOException{
		connection = new Socket("localhost", 4040); 
		System.out.println("Connected to localhost in port 4040");
		// Connects on localhost (IP that always route back to our own computer) and port 4040. 
	}

	//setup of IO streams
	private void streamSetup() throws IOException{
		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		input = new ObjectInputStream(connection.getInputStream());
	//	showMessage("\n The streams are now set up! \n");
	}

	//Close connection
	private void close(){
		try{
			output.close();
			input.close();
			connection.close();
		}catch(IOException ioException){
			ioException.printStackTrace();
		}
	}	
}
