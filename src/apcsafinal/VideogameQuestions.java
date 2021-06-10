/*
 * Videogame questions class
   Created on 6/1/20 by Enya Gu
 */
package apcsafinal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author enyag
 */
public class VideogameQuestions implements TopicQuestions{
    
    private ArrayList<Integer> questionsDone; //declares variables
    private int numInList;
    private int questionsCorrect;
    private ArrayList<String> questionsList;
    private ArrayList<String> answersList;
    
    public VideogameQuestions(){
        questionsDone = new ArrayList<Integer>(); //initializes variables
        questionsCorrect = 0;
        numInList = 0;
        String[] questions = new String[]{"What is the best selling game of all time?", "What is the most popular franchise in the world?", "How many characters are in Smash Ultimate without DLC?", "What is Mario's last name?", "How many villagers are there in Animal Crossing: New Horizons?", "In Persona 5, what is the main character's alias?", "In what game do you follow Joel and Ellie, fighting zombies?", "In what franchise do you play as a gang member and sing karoake?", "How many different sports are there in Wii Sports?", "What is the latest Fire Emblem game called?"};
        String[] answers = new String[]{"Minecraft", "Pokemon", "74", "Mario", "397", "Joker", "The Last of Us", "Yakuza", "5", "Three Houses"};
        questionsList = new ArrayList<String>(); //adds arrays to arraylists
        questionsList.addAll(Arrays.asList(questions));
        answersList = new ArrayList<String>();
        answersList.addAll(Arrays.asList(answers));
    }
    public String getQuestion(){ //returns a question not already asked
        Random random = new Random();
        numInList = random.nextInt(questionsList.size());
        String temp = questionsList.get(numInList);
        questionsList.remove(numInList);
        return temp;
    }
    public String getAnswer(){ //returns the ansewr to the question
        String temp = answersList.get(numInList);
        answersList.remove(numInList);
        return temp;
    }
    public void tracker(){ //updates number correct
        questionsCorrect++;
    }
    public int getResult(){ //returns number correct
        return questionsCorrect;
    }
}
