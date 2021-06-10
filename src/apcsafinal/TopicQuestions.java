/*
 * Question interface
   Created on 6/1/20 by Enya Gu
 */
package apcsafinal;

/**
 *
 * @author enyag
 */
public interface TopicQuestions { //interface implemented by each object for questions
    public String getQuestion(); //method to get the question
    public String getAnswer(); //method to get the answer
    public void tracker(); //method to add to the number correct
    public int getResult(); //method to get the result
}
