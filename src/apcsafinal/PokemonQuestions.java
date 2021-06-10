/*
 * Pokemon questions class
   Created on 6/1/20 by Enya Gu
 */
package apcsafinal;

import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
/**
 *
 * @author enyag
 */
public class PokemonQuestions implements TopicQuestions{
    
    private ArrayList<Integer> questionsDone; //declares variables
    private int numInList;
    private int questionsCorrect;
    private ArrayList<String> questionsList;
    private ArrayList<String> answersList;
    
    public PokemonQuestions(){
        questionsDone = new ArrayList<Integer>(); //initializes variables
        questionsCorrect = 0;
        numInList = 0;
        String[] questions = new String[]{"What does Pikachu evolve into?", "Who is the God of all Pokemon?", "How many seasons of Pokemon are there?", "Where did Ash release his Pidgeot, who he never came back for?", "Who is the fastest Pokemon? (don't need the form name)", "Excluding gigamax, what is the only physical poison type move Garbodor can learn?", "What is the name of the season where Team Rocket appeared in every single episode?", "Which Pokemon has an EV yield of 1 HP and 1 speed?", "What is the name of the only Dark type gym leader?", "What is the only type without a legendary?"};
        String[] answers = new String[]{"Raichu", "Arceus", "22", "Pallet Town", "Deoxys", "Gunk Shot", "Diamond and pearl", "Delcatty", "Marnie", "Poison"};
        questionsList = new ArrayList<String>(); //adds arrays to arraylist
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
    public String getAnswer(){ //returns answer to the question
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
