package ist.java.data;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Blog implements Readable, Writable{
    List<AbstractPost> tweets;

    public Blog(){
        tweets = new LinkedList<>();
        try{
            populateFromDisk();
        }
        //TODO
    }

    private void populateFromDisk() throws IOException {
        //TODO
    }


//returns latest tweet
    public AbstractPost readOne(){


    }


//returns all tweets
    public List<AbstractPost> readAll() throws IOException {
        


    }

//returns only E from the same author
    public List<AbstractPost> readOwnPost() throws IOException{



    }

//save() rewrites the whole file, erasing previous data
 void save() throws IOException{

     
 }

}
