/*
 * Movie questions class
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
public class MovieQuestions implements TopicQuestions{
    
    private ArrayList<Integer> questionsDone; //declares variables
    private int numInList;
    private int questionsCorrect;
    private ArrayList<String> questionsList;
    private ArrayList<String> answersList;
    
    public MovieQuestions(){
        questionsDone = new ArrayList<Integer>(); //initializes variables
        questionsCorrect = 0;
        numInList = 0;
        String[] questions = new String[]{"What movie won the Oscar for best picture in 2020?", "What movie piloted the way for super hero movies to be taken seriously?", "What movie did Leonardo diCaprio win his Best Actor Oscar for?", "What is the highest grossing animated film?", "What legendary director called Marvel films not real cinema, but rather akin to amusement parks?", "What is the latest film to win 11 Oscars, the most that has ever been won by a film?", "What is the highest grossing R rated film of all time?", "What 1970 movie marked the feature debut of Arnold Schwarzenegger?", "Who is the first and only woman of color to win the Oscar for Best Actress?", "What is the name of Christopher Nolan's upcoming film?"};
        String[] answers = new String[]{"Parasite", "Batman Begins", "The Revenant", "Frozen 2", "Martin Scorsese", "The Return of the King", "Joker", "Hercules in New York", "Halle Berry", "Tenet"};
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
    public String getAnswer(){ //returns the answer to the question
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
