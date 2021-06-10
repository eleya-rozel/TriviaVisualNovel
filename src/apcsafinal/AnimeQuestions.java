/*
 * Anime questions class
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
public class AnimeQuestions implements TopicQuestions{
    private ArrayList<Integer> questionsDone; //declares variables
    private int numInList; //track of which number in array it is
    private int questionsCorrect;
    private ArrayList<String> questionsList;
    private ArrayList<String> answersList;
    public AnimeQuestions(){
        questionsDone = new ArrayList<Integer>(); //initializes variables
        questionsCorrect = 0; //all set to 0
        numInList = 0;
        String[] questions = new String[]{"In Fullmetal Alchemist, who is Ed's childhood friend?", "In the Fate series, who is the master of Archer?", "In Haikyuu, who was the strongest team in the Miyagi Prefecture during interhigh?", "In Neon Genesis Evangelion, what Eva does Shinji pilot? (just the number)", "In Death Note, who is Light's nemesis?", "In Sword Art Online, what is the name of the floating castle in the game?", "In Attack on Titan, what is the name of the innermost wall?", "In Tokyo Ghoul, what is the name of the weapons ghouls use?", "In Fairy Tail, what kind of magic does Lucy use?", "In Demon Slayer, what kind of breathing style does Shinobu use?"};
        String[] answers = new String[]{"Winry", "Rin Tohsaka", "Shiratorizawa", "01", "L", "Aincrad", "Sheena", "Kagune", "Celestial Spirit", "Insect"};
        questionsList = new ArrayList<String>(); //adds arrays to arraylist
        questionsList.addAll(Arrays.asList(questions));
        answersList = new ArrayList<String>();
        answersList.addAll(Arrays.asList(answers));
    }
    public String getQuestion(){
        Random random = new Random(); //gets a random question
        numInList = random.nextInt(questionsList.size());
        String temp = questionsList.get(numInList);
        questionsList.remove(numInList); //removes it from the list
        return temp;
    }
    public String getAnswer(){ //gets the answer to the question
        String temp = answersList.get(numInList);
        answersList.remove(numInList); //removes it from the list
        return temp;
    }
    public void tracker(){ //updates number correct
        questionsCorrect++;
    }
    public int getResult(){ //returns number correct
        return questionsCorrect;
    }
}
