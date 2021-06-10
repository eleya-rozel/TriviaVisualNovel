/*
 * Music Player class
   Created on 6/1/20 by Enya Gu
 */
package apcsafinal;

import java.util.ArrayList;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author enyag
 */
public class MusicPlayer {
    
    private ArrayList<String> songNames; //declares variables
    Clip clip;
    
    public MusicPlayer(){
        songNames = new ArrayList<String>(); //initializes variables
    }
    public void startSong(String name){ //method to play songs
        try{
            songNames.add(name); //adds to arraylist
            File path = new File("src/Resources/" + name + ".wav"); //new file object
            if(path.exists()){ //if it exists
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(path); //opens, starts, and loops the clip
                clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            } else{ //otherwise prints this message
                System.out.println("Make sure all files are installed correctly. There are missing audio files.");
            }
        } catch(Exception ex){ //catches the exception and prints it
            System.out.println("There's something wrong with the audio/audio files.");
            ex.printStackTrace();
        }
    }
    public void stopSong(){ //stops playing song
        clip.stop();
    }
    public void selectionSort(){ //selection sorts the songs added to the list
        for(int i = 0; i < songNames.size()-1; i++){
            int min = i;
            for(int j = i + 1; j < songNames.size(); j++){
                if(songNames.get(j).compareTo(songNames.get(min)) < 0){ //loops and compares each of the Strings in the array
                    min = j;
                }
            }
            String temp = songNames.get(i); //switches the strings depending on the result of compareTo
            songNames.set(i, songNames.get(min));
            songNames.set(min, temp);
        }
    }
    public ArrayList<String> getArray(){ //returns the songNames array
        return songNames;
    }
}
