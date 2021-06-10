/*
 * Story class for game
   Created on 6/1/20 by Enya Gu
 */
package apcsafinal;

import java.io.File;
import java.io.FileWriter;
/**
 *
 * @author enyag
 */
public class Story {
    
    private String name; //declares all variables
    private PokemonQuestions pokemon;
    private boolean correct;
    private String lastInput;
    private boolean flag;
    private String lastAnswer;
    private int goodEndPoints;
    private int badEndPoints;
    private int trueEndPoints;
    private MathQuestions maths;
    private MovieQuestions movies;
    private VideogameQuestions games;
    private AnimeQuestions anime;
    private int ending;
    private MusicPlayer player;
    
    public Story(){ //constructor
        name = ""; //initializes each variable
        pokemon = new PokemonQuestions();
        correct = false;
        flag = false;
        goodEndPoints = 0;
        badEndPoints = 0;
        trueEndPoints = 0;
        maths = new MathQuestions();
        movies = new MovieQuestions();
        games = new VideogameQuestions();
        anime = new AnimeQuestions();
        ending = 0;
        player = new MusicPlayer();
    }
    public String lineInStory(int dialogueLine){ //all dialogue is returned here
        if(dialogueLine == 1){
            return "You've been isekai'd (reincarnated) as a student at Ashford Academy.";
        } else if(dialogueLine == 2){
            player.startSong("schooldays"); //starts and stops songs depending on what is needed
            return "It's time for you to participate in the annual School Festival!";
        } else if(dialogueLine == 3){
            return "It is up to you to become the King of the School!";
        } else if(dialogueLine == 4){
            return "Now first, what is your name?";
        } else if(dialogueLine == 5){
            return "Please input it in the popup window.";
        } else if(dialogueLine == 6){
            return name + ", is that right?";
        } else if(dialogueLine == 7){
            return "Well, we're not one to judge names over here. It's nice to meet you, " + name;
        } else if(dialogueLine == 8){
            return "Now, it's time for the show to begin.";
        } else if(dialogueLine == 9){
            return "Prepare to meet your first opponent.";
        } else if(dialogueLine == 10){
            return "They outclass you in every way, even though it took them years to win anything!";
        } else if(dialogueLine == 11){
            return "His name is...";
        } else if(dialogueLine == 12){
            return "Can I get a drumroll please...";
        } else if(dialogueLine == 13){
            player.stopSong();
            player.startSong("PokemonThemeSong");
            return "That's right, it's Ash Ketchum!";
        } else if(dialogueLine == 14){
            return "Ah, that's right. I haven't explained the rules yet.";
        } else if(dialogueLine == 15){
            return "Well, there are several stages. You're going to need to beat the student council to become King.";
        } else if(dialogueLine == 16){
            return "Depending on the stage, you'll be asked different questions.";
        } else if(dialogueLine == 17){
            return "Instructions will vary, but basically, you need more points than your opponent to win!";
        } else if(dialogueLine == 18){
            return "Otherwise, you're not fit to be King.";
        } else if(dialogueLine == 19){
            return "The first category, is of course, Pokemon!";
        } else if(dialogueLine == 20){
            return "10 questions will be given to you in random order.";
        } else if(dialogueLine == 21){
            return "Let's see if YOU can beat the legendary Pokemon master Ash Ketchum, champion of the Alola league!";
        } else if(dialogueLine == 22){
            return "First question:"; //1st question set for Pokemon
        } else if(dialogueLine == 23){
            return pokemon.getQuestion();
        } else if(dialogueLine == 24){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 25){
            return pokemonResponse();
        } else if(dialogueLine == 26){
           return pokemon.getQuestion(); //2nd question set
        } else if(dialogueLine == 27){
           return "Please input your answer in the popup window.";
        } else if(dialogueLine == 28){
            return pokemonResponse();
        } else if(dialogueLine == 29){
           return pokemon.getQuestion(); //3rd question set
        } else if(dialogueLine == 30){
           return "Please input your answer in the popup window.";
        } else if(dialogueLine == 31){
            return pokemonResponse();
        } else if(dialogueLine == 32){
           return pokemon.getQuestion(); //4th question set
        } else if(dialogueLine == 33){
           return "Please input your answer in the popup window.";
        } else if(dialogueLine == 34){
            return pokemonResponse();
        } else if(dialogueLine == 35){
           return pokemon.getQuestion(); //5th question set
        } else if(dialogueLine == 36){
           return "Please input your answer in the popup window.";
        } else if(dialogueLine == 37){
            return pokemonResponse();
        } else if(dialogueLine == 38){
           return pokemon.getQuestion(); //6th question set
        } else if(dialogueLine == 39){
           return "Please input your answer in the popup window.";
        } else if(dialogueLine == 40){
            return pokemonResponse();
        } else if(dialogueLine == 41){
           return pokemon.getQuestion(); //7th question set
        } else if(dialogueLine == 42){
           return "Please input your answer in the popup window.";
        } else if(dialogueLine == 43){
            return pokemonResponse();
        } else if(dialogueLine == 44){
           return pokemon.getQuestion(); //8th question set
        } else if(dialogueLine == 45){
           return "Please input your answer in the popup window.";
        } else if(dialogueLine == 46){
            return pokemonResponse();
        } else if(dialogueLine == 47){
           return pokemon.getQuestion(); //9th question set
        } else if(dialogueLine == 48){
           return "Please input your answer in the popup window.";
        } else if(dialogueLine == 49){
            return pokemonResponse();
        } else if(dialogueLine == 50){
           return pokemon.getQuestion(); //10th question set
        } else if(dialogueLine == 51){
           return "Please input your answer in the popup window.";
        } else if(dialogueLine == 52){
            return pokemonResponse();
        } else if(dialogueLine == 53){
            return "Those are all the questinos. Now, the results...";
        } else if(dialogueLine == 54){
            return "Ash got...5 right!";
        } else if(dialogueLine == 55){
            return name + " got..." + pokemon.getResult() + "/10 right!";
        } else if(dialogueLine == 56){
            if(pokemon.getResult() > 5){ //if the user scored enough points
                return "You've successfully defeated Ash Ketchum!";
            } else{
                flag = true; //sets death flag to true
                return "Uh, you just lost to a 10 year old. How do you feel about that? Sorry, but you've lost. Try again!";
            }
        } else if(dialogueLine == 57){
            if(flag){
                return "";
            } else{
                return "Well then, it looks like you'll have to prepare for your next challenger.";
            }
        } else if(dialogueLine == 58){
            player.stopSong();
            player.startSong("Tamikurasou");
            return "Do you like math? Because that's what this next topic is!";
        } else if(dialogueLine == 59){
            return "Meet the next student council member, Oikura Sodachi.";
        } else if(dialogueLine == 60){
            return "Don't worry if you don't know who she is. She's not very popular.";
        } else if(dialogueLine == 61){
            return "But she's very good at math. However, we'll begin the 'visual novel' portion of the game.";
        } else if(dialogueLine == 62){
            return "After all, answering endless questions isn't very fun. You thought this was a visual novel, didn't you?";
        } else if(dialogueLine == 63){
            return "Let me explain this portion of the game. Basically, your choices will affect the ending you get.";
        } else if(dialogueLine == 64){
            return "If you become King, you will either get a good, bad, or the secret true ending.";
        } else if(dialogueLine == 65){
            return "It all depends on how you choose to talk to the student council members from here on out. Have fun!";
        } else if(dialogueLine == 66){
            return "A: I hate it!       B: It's okay.       C: It's the best <3";
        } else if(dialogueLine == 67){
            return "A: Euler is the man       B: Uh, Aristotle I guess?        C: Pythagoras ofc";
        } else if(dialogueLine == 68){
            return "A: Lazy ppl       B: Ppl who think they can do everything themselves       C: Ppl who don't respond";
        } else if(dialogueLine == 69){
            return "What is a Fibonacci sequence, you may ask?";
        } else if(dialogueLine == 70){
            return "It's where each number in the sequence is the sum of the two numbers that precede it, starting with 1.";
        } else if(dialogueLine == 71){
            return "Here's what the rules will be. You will have to input the correct term in the Fibonacci sequence.";
        } else if(dialogueLine == 72){
            return "Beat Oikura, and you win. Easy, right?";
        } else if(dialogueLine == 73){
            return "Get your calculators out, and good luck!";
        } else if(dialogueLine == 74){ //1st set of math
            return maths.getQuestion();
        } else if(dialogueLine == 75){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 76){
            return pokemonResponse();
        } else if(dialogueLine == 77){ //2nd set
            return maths.getQuestion();
        } else if(dialogueLine == 78){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 79){
            return pokemonResponse();
        } else if(dialogueLine == 80){ //3rd set
            return maths.getQuestion();
        } else if(dialogueLine == 81){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 82){
            return pokemonResponse();
        } else if(dialogueLine == 83){ //4th set
            return maths.getQuestion();
        } else if(dialogueLine == 84){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 85){
            return pokemonResponse();
        } else if(dialogueLine == 86){ //5th set
            return maths.getQuestion();
        } else if(dialogueLine == 87){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 88){
            return pokemonResponse();
        } else if(dialogueLine == 89){
            return "We'll stop here.";
        } else if(dialogueLine == 90){
            return name + " got..." + maths.getResult() + "/5 right!";
        } else if(dialogueLine == 91){
            return "Oikura got...everything right!";
        } else if(dialogueLine == 92){
            if(maths.getResult() != 5){ //if the user didn't meet the threshold
                flag = true;
                return "RIP. Maybe work on those math skills?";
            } else{
                return "We usually count ties as losses, but fortunately for you, it's the top score, so we'll let you pass!";
            }
        } else if(dialogueLine == 93){
            if(flag){
                return "";
            } else{
                return "Just a few more to go.";
            }
        } else if(dialogueLine == 94){
            player.stopSong();
            player.startSong("ForTheFirstTimeInForever");
            return "Next is movie trivia! I bet you're excited, huh?";
        } else if(dialogueLine == 95){
            return "Unfortunately or fortunately, not all questions will be Frozen based.";
        } else if(dialogueLine == 96){
            return "Your challenger is...";
        } else if(dialogueLine == 97){
            return "Due to popular demand, it's Elsa!";
        } else if(dialogueLine == 98){
            return "Now then, she's got some questions she wants to ask you!";
        } else if(dialogueLine == 99){
            return "A: Cold, disappear!       B: I guess?       C: WINTER FTW";
        } else if(dialogueLine == 100){
            return "A: Heck no, gross!       B: I prefer vanilla.       C: WHO DOESN'T??";
        } else if(dialogueLine == 101){
            return "A: Uh, no!       B: Sure...?       C: HECK YAAAAAAA";
        } else if(dialogueLine == 102){
            return "Here we go!";
        } else if(dialogueLine == 103){ //1st set of movie questions
            return movies.getQuestion();
        } else if(dialogueLine == 104){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 105){
            return pokemonResponse();
        } else if(dialogueLine == 106){ //2nd set of movie questions
            return movies.getQuestion();
        } else if(dialogueLine == 107){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 108){
            return pokemonResponse();
        } else if(dialogueLine == 109){ //3rd set of movie questions
            return movies.getQuestion();
        } else if(dialogueLine == 110){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 111){
            return pokemonResponse();
        } else if(dialogueLine == 112){ //4th set of movie questions
            return movies.getQuestion();
        } else if(dialogueLine == 113){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 114){
            return pokemonResponse();
        } else if(dialogueLine == 115){ //5th set of movie questions
            return movies.getQuestion();
        } else if(dialogueLine == 116){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 117){
            return pokemonResponse();
        } else if(dialogueLine == 118){ //6th set of movie questions
            return movies.getQuestion();
        } else if(dialogueLine == 119){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 120){
            return pokemonResponse();
        } else if(dialogueLine == 121){ //7th set of movie questions
            return movies.getQuestion();
        } else if(dialogueLine == 122){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 123){
            return pokemonResponse();
        } else if(dialogueLine == 124){ //8th set of movie questions
            return movies.getQuestion();
        } else if(dialogueLine == 125){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 126){
            return pokemonResponse();
        } else if(dialogueLine == 127){ //9th set of movie questions
            return movies.getQuestion();
        } else if(dialogueLine == 128){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 129){
            return pokemonResponse();
        } else if(dialogueLine == 130){ //10th set of movie questions
            return movies.getQuestion();
        } else if(dialogueLine == 131){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 132){
            return pokemonResponse();
        } else if(dialogueLine == 133){
            return "Now, for the results!";
        } else if(dialogueLine == 134){
            return name + " got..." + movies.getResult() + "/10 right!";
        } else if(dialogueLine == 135){
            return "Elsa got 8/10!";
        } else if(dialogueLine == 136){
            if(movies.getResult() > 8){
                return "You've successfully defeated Elsa!";
            } else{
                flag = true;
                return "GG, Elsa clapped you. That's rough, buddy.";
            }
        } else if(dialogueLine == 137){
            if(flag){
                return "";
            } else{
                return "You ready for who's next?";
            }
        } else if(dialogueLine == 138){
            player.stopSong();
            player.startSong("HaloThemeSong");
            return "It's...";
        } else if(dialogueLine == 139){
            return "Master Chief!";
        } else if(dialogueLine == 140){
            return "That's right, it's video game questions next! But first...";
        } else if(dialogueLine == 141){
            return "A: 'Course not, screw authority!       B: Not always.       C: Orders are orders!";
        } else if(dialogueLine == 142){
            return "A: No such thing as luck!       B: Well, it's not always good.       C: LUCK OP LUCK OP";
        } else if(dialogueLine == 143){
            return "A: Cortana ofc!       B: Who actually uses either?       C: Bruh Siri is where it's at";
        } else if(dialogueLine == 144){
            return "I hope you're ready for video game trivia! Let's go!";
        } else if(dialogueLine == 145){ //1st set of video game questions
            return games.getQuestion();
        } else if(dialogueLine == 146){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 147){
            return pokemonResponse();
        } else if(dialogueLine == 148){ //2nd set of video game questions
            return games.getQuestion();
        } else if(dialogueLine == 149){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 150){
            return pokemonResponse();
        } else if(dialogueLine == 151){ //3rd set of video game questions
            return games.getQuestion();
        } else if(dialogueLine == 152){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 153){
            return pokemonResponse();
        } else if(dialogueLine == 154){ //4th set of video game questions
            return games.getQuestion();
        } else if(dialogueLine == 155){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 156){
            return pokemonResponse();
        } else if(dialogueLine == 157){ //5th set of video game questions
            return games.getQuestion();
        } else if(dialogueLine == 158){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 159){
            return pokemonResponse();
        } else if(dialogueLine == 160){ //6th set of video game questions
            return games.getQuestion();
        } else if(dialogueLine == 161){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 162){
            return pokemonResponse();
        } else if(dialogueLine == 163){ //7th set of video game questions
            return games.getQuestion();
        } else if(dialogueLine == 164){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 165){
            return pokemonResponse();
        } else if(dialogueLine == 166){ //8th set of video game questions
            return games.getQuestion();
        } else if(dialogueLine == 167){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 168){
            return pokemonResponse();
        } else if(dialogueLine == 169){ //9th set of video game questions
            return games.getQuestion();
        } else if(dialogueLine == 170){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 171){
            return pokemonResponse();
        } else if(dialogueLine == 172){ //10th set of video game questions
            return games.getQuestion();
        } else if(dialogueLine == 173){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 174){
            return pokemonResponse();
        } else if(dialogueLine == 175){
            return "And the results are...";
        } else if(dialogueLine == 176){
            return name + " got..." + games.getResult() + "/10 right!";
        } else if(dialogueLine == 177){
            return "Master Chief got...9 right!";
        } else if(dialogueLine == 178){
            if(games.getResult() > 9){
                return "You've successfully defeated Master Chief!";
            } else{
                flag = true;
                return "Unlucky you. Well, it was a valient effort.";
            }
        } else if(dialogueLine == 179){
            if(flag){
                return "";
            } else{
                player.stopSong();
                player.startSong("LoveIsJustice");
                return "Our last opponent...";
            }
        } else if(dialogueLine == 180){
            return "Who is he, I wonder?";
        } else if(dialogueLine == 181){
            return "A: No.       B: Sometimes, I suppose?       C: Of course, lies are exceptions.";
        } else if(dialogueLine == 182){
            return "A: Some things are just unforgiveable.   B: Depends on the person/what they did.   C: Always forgive no matter what.";
        } else if(dialogueLine == 183){
            return "A: No way.       B: I guess it depends.       C: Of course.";
        } else if(dialogueLine == 184){
            return "The last stretch! Defeat him and you win! Here we go...";
        } else if(dialogueLine == 185){ //1st anime question
            return anime.getQuestion();
        } else if(dialogueLine == 186){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 187){
            return pokemonResponse();
        } else if(dialogueLine == 188){ //2nd anime question
            return anime.getQuestion();
        } else if(dialogueLine == 189){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 187){
            return pokemonResponse();
        } else if(dialogueLine == 190){ //3rd anime question
            return anime.getQuestion();
        } else if(dialogueLine == 191){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 192){
            return pokemonResponse();
        } else if(dialogueLine == 193){ //4th anime question
            return anime.getQuestion();
        } else if(dialogueLine == 194){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 195){
            return pokemonResponse();
        } else if(dialogueLine == 196){ //5th anime question
            return anime.getQuestion();
        } else if(dialogueLine == 197){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 198){
            return pokemonResponse();
        } else if(dialogueLine == 199){ //6th anime question
            return anime.getQuestion();
        } else if(dialogueLine == 200){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 201){
            return pokemonResponse();
        } else if(dialogueLine == 202){ //7th anime question
            return anime.getQuestion();
        } else if(dialogueLine == 203){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 204){
            return pokemonResponse();
        } else if(dialogueLine == 205){ //8th anime question
            return anime.getQuestion();
        } else if(dialogueLine == 206){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 207){
            return pokemonResponse();
        } else if(dialogueLine == 208){ //9th anime question
            return anime.getQuestion();
        } else if(dialogueLine == 209){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 210){
            return pokemonResponse();
        } else if(dialogueLine == 211){ //10th anime question
            return anime.getQuestion();
        } else if(dialogueLine == 212){
            return "Please input your answer in the popup window.";
        } else if(dialogueLine == 213){
            return pokemonResponse();
        } else if(dialogueLine == 214){
            return "Now, the results...";
        } else if(dialogueLine == 215){
            return name + " got..." + anime.getResult() + "/10 right!";
        } else if(dialogueLine == 216){
            return "Lelouch got...10 right!";
        } else if(dialogueLine == 217){
            if(anime.getResult() < 10){
                flag = true;
                return "Oof, close. But not quite. Try again!";
            } else{
                return "Oh, looks like we have a problem...";
            }
        } else if(dialogueLine == 218){
            if(flag){
                return "";
            } else{
                setEnding();
                return "A tie...? On the final stage...";
            }
        } else if(dialogueLine == 219){
            if(ending == 3){
                player.stopSong();
                player.startSong("ContinuedStory");
                return "";
            } else{
                player.stopSong();
                player.startSong("MadderSky");
                return "Your valient efforts weren't enough to beat the King...";
            }
        } else if(dialogueLine == 220){
            if(ending == 3){
                return "A: Yes               B: No";
            } else{
                return "Will anyone come to save you?!";
            }
        } else if(dialogueLine == 221){
            if(ending == 3){
                return "A: Yes               B: No";
            } else{
                return "...";
            }
        } else if(dialogueLine == 222){
            if(ending == 3){
                return "A: Yes               B: No";
            } else{
                return "No one...";
            }
        } else if(dialogueLine == 223){
            if(ending == 1){
                return "";
            } else if(ending == 2){
                return "Wait...what's this?";
            } else if(ending == 3){
                return "";
            } else{
                return "This is the secret hacker ending!!"; //probably won't be able to get here ever
            }
        } else if(dialogueLine == 224){
            if(ending == 1){
                flag = true;
                return "You have achieved the bad end.";
            }
             else if(ending == 2){
                return "";
            } else if(ending == 3){
                return "";
            } else{
                System.exit(0);
            }
        } else if(dialogueLine == 225){
            if(flag){
                return "";
            } else if(ending == 2){
                return "";
            } else if(ending == 3){
                return "";
            }
        } else if(dialogueLine == 226){
            if(ending == 2){
                return "";
            } else if(ending == 3){
                return "";
            }
        } else if(dialogueLine == 227){
            if(ending == 2){
                return "";
            } else if(ending == 3){
                return "";
            }
        } else if(dialogueLine == 228){
            if(ending == 2){
                return "";
            } else if(ending == 3){
                return "";
            }
        } else if(dialogueLine == 229){
            if(ending == 2){
                return "";
            } else if(ending == 3){
                return "";
            }
        } else if(dialogueLine == 230){
            if(ending == 2){
                return "";
            } else if(ending == 3){
                return "";
            }
        } else if(dialogueLine == 231){
            if(ending == 2){
                player.selectionSort();
                return "You have completed the good end! Congratulations. Your results have been printed.";
            } else if(ending == 3){
                return "Thank you, " + name + ", for reaching the true end. I hope you enjoyed it! Results have been printed.";
            }
        } else if(dialogueLine == 232){
            if(ending == 2){
                printResult(); //prints the results
                return "Try for the true end next!";
            } else if(ending == 3){
                printResult(); //prints the result
                System.exit(0); //quits the program
            }
        } else if(dialogueLine == 233){
            if(ending == 2){
                System.exit(0); //quits the program
            }
        } else if(dialogueLine == 900){
            player.stopSong();
            player.startSong("MadderSky");
            return "";
        } else if(dialogueLine == 901){
            return "";
        } else if(dialogueLine == 902){
            return "Wrong decisions were made. You were close.";
        } else if(dialogueLine == 903){
            flag = true;
        } else if(dialogueLine == 904){
            return "";
        }
        return "There was an error"; //shouldn't ever be returned
    }
    public void setName(String input){ //sets the user's name
        name = input; //stores it
    }
    public void correctOrNotPokemon(String input){ //does a series of actions based on whether the response was correct or not for pokemon questions
        lastAnswer = pokemon.getAnswer(); //sets the last answer to the answer
        if(input.equalsIgnoreCase(lastAnswer)){
            pokemon.tracker();
            correct = true;
        } else{
            correct = false;
        }
        lastInput = input;
    }
    private String pokemonResponse(){ //method for returning the result of a response
        if(correct){
            return "Correct!";
        } else{
            return "Incorrect. The correct answer was: " + lastAnswer + ". Your answer was: " + lastInput;
        }
    }
    public void addGoodPts(){ //adds good points
        goodEndPoints++;
    }
    public void addBadPts(){ //adds bad points
        badEndPoints++;
    }
    public void addTruePts(){ //adds true points
        trueEndPoints++;
    }
    public void correctOrNotMath(String input){ //does a series of actions based on whether the response was correct or not for math questions
        lastAnswer = maths.getAnswer();
        if(input.equalsIgnoreCase(lastAnswer)){
            maths.tracker();
            correct = true;
        } else{
            correct = false;
        }
        lastInput = input;
    }
    public void correctOrNotMovies(String input){//does a series of actions based on whether the response was correct or not for movie questions
        lastAnswer = movies.getAnswer();
        if(input.equalsIgnoreCase(lastAnswer)){
            movies.tracker();
            correct = true;
        } else{
            correct = false;
        }
        lastInput = input;
    }
    public void correctOrNotGames(String input){//does a series of actions based on whether the response was correct or not for game questions
        lastAnswer = games.getAnswer();
        if(input.equalsIgnoreCase(lastAnswer)){
            games.tracker();
            correct = true;
        } else{
            correct = false;
        }
        lastInput = input;
    }
    public void correctOrNotAnime(String input){//does a series of actions based on whether the response was correct or not for anime questions
        lastAnswer = anime.getAnswer();
        if(input.equalsIgnoreCase(lastAnswer)){
            anime.tracker();
            correct = true;
        } else{
            correct = false;
        }
        lastInput = input;
    }
    public void setEnding(){ //sets the ending depending on the following criteria
        if(trueEndPoints == 8 && badEndPoints == 0){
            ending = 3; //true ending
        } else if(goodEndPoints > badEndPoints){
            ending = 2; //good ending
        } else{
            ending = 1; //bad ending
        }
    }
    public int getEnding(){ //returns ending
        return ending;
    }
    public boolean getFlag(){ //returns flag
        return flag;
    }
    public void stopMusic(){ //stops any song playing
        player.stopSong();
    }
    private void printResult(){ //prints statistics if a good or true end is achieved
        player.selectionSort(); //alphabeticizes the songs
        File file = new File("src/Results/" + name + ".txt"); //creates new file
        int initialize = 0; //initializes variables
        int version = 1;
        if(file.exists()){ //if the file already exists
            while(initialize == 0){
                if(!file.exists()){ //if the file doesn't exist
                    initialize = 1; //breaks loop
                } else{
                    file = new File("src/Results/" + name + "v" + version + ".txt"); //creates a new file with a version number
                    version++; //updates version number in case that version is also used
                }
            }
        }
        try{
            file.createNewFile(); //creates the file
            FileWriter writer = new FileWriter(file); //new filewriter
            writer.write(name + System.lineSeparator()); //writes name
            
            writer.write("- Results - " + System.lineSeparator()); //writes results of each part
            writer.write("Pokemon: " + pokemon.getResult() + "/10" + System.lineSeparator());
            writer.write("Math: " + maths.getResult() + "/5" + System.lineSeparator());
            writer.write("Movies: " + movies.getResult() + "/10" + System.lineSeparator());
            writer.write("Video Games: " + games.getResult() + "/10" + System.lineSeparator());
            writer.write("Anime: " + anime.getResult() + "/10" + System.lineSeparator());
            
            writer.write("- Points - " + System.lineSeparator()); //writes results of each points
            writer.write("Good End Points: " + goodEndPoints + System.lineSeparator());
            writer.write("Bad End Points: " + badEndPoints + System.lineSeparator());
            writer.write("True End Points: " + trueEndPoints + "/8" + System.lineSeparator());
            
            writer.write("- OST - " + System.lineSeparator()); //writes all songs
            for(String str: player.getArray()) {
              writer.write(str + System.lineSeparator());
            }
            
            writer.write("- - - - - - " + System.lineSeparator());
            if(ending == 2){ //writes ending achieved
                writer.write("You achieved the good ending." + System.lineSeparator());
            } else if(ending == 3){
                writer.write("You achieved the true ending." + System.lineSeparator());
            }
            writer.write("Thank you!" + System.lineSeparator());
            writer.close(); //closes writer
        } catch (Exception ex){
            ex.printStackTrace(); //prints any exceptions
        }
        
    }
}
