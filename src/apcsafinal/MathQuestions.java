/*
 * Math questions class
   Created on 6/1/20 by Enya Gu
 */
package apcsafinal;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author enyag
 */
public class MathQuestions implements TopicQuestions{
    
    private ArrayList<Integer> numbersDone; //declares variables
    boolean initialize;
    private int lastNum;
    private int questionsCorrect;
    
    public MathQuestions(){
        numbersDone = new ArrayList<Integer>(); //initializes variables
        initialize = false;
        questionsCorrect = 0;
    }
    public String getQuestion(){
        Random random = new Random(); //gets a random number between 1-20
        int nextNum = random.nextInt(20) + 1;
        int exists = 0;
        if(initialize){
            while(exists == 0){
                int total = 0;
                for(int numbers: numbersDone){ //if the number has already been asked, gets a new number
                    if(numbers == nextNum){
                        nextNum = random.nextInt(20) + 1;
                        break;
                    } else{
                        total++;
                    }
                }
                if(total == numbersDone.size()){
                    exists = 1; //breaks loop
                }
            }
            numbersDone.add(nextNum); //adds it to the lits
        } else{
            numbersDone.add(nextNum);
        }
        lastNum = nextNum;
        return "What is the value of term " + nextNum + " in the sequence?"; //returns a question
    }
    public String getAnswer(){
        return Integer.toString(getFibonacciSequence(lastNum)); //calls method to get answer
    }
    private int getFibonacciSequence(int x){ //uses recursion to get the answer to the fibonacci sequence
        if(x <= 1){ //base case
            return x;
        }
        return getFibonacciSequence(x - 1) + getFibonacciSequence(x - 2); //recursive function
    }
    public void tracker(){ //updates number correct
        questionsCorrect++;
    }
    public int getResult(){ //returns number correct
        return questionsCorrect;
    }
}
