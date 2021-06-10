/*
 * Main class and GUI for the game
   Created on 6/1/20 b Enya Gu
 */
package apcsafinal;
import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
/**
 *
 * @author enyag
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() { //constructor to create an instance of the class
        initComponents(); //calls GUI method
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * Following is initialization of all JFrame components
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonC = new javax.swing.JButton(); //initializes everything
        buttonB = new javax.swing.JButton();
        buttonA = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        restartButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();
        dialogue = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); //makes it close when exited
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonC.setText("C"); //adds the content for buttons
        buttonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCActionPerformed(evt);
            }
        });
        buttonC.setVisible(false);
        getContentPane().add(buttonC, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, -1, -1));

        buttonB.setText("B");
        buttonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBActionPerformed(evt);
            }
        });
        buttonB.setVisible(false);
        getContentPane().add(buttonB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, -1, -1));

        buttonA.setText("A");
        buttonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAActionPerformed(evt);
            }
        });
        buttonA.setVisible(false);
        getContentPane().add(buttonA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, -1, -1));

        restartButton.setText("Restart");
        restartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartButtonActionPerformed(evt);
            }
        });
        restartButton.setVisible(false);
        getContentPane().add(restartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 170, 70));

        quitButton.setText("Quit");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });
        quitButton.setVisible(false);
        getContentPane().add(quitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, 170, 70));

        dialogue.setFont(new java.awt.Font("Malgun Gothic", 0, 16)); // sets the configuration for dialogue
        dialogue.setText("Welcome to the best and most interactive game in the world.");
        getContentPane().add(dialogue, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 780, 120));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/school.jpg"))); // configures the background
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        dialogueLine++; //adds to dialogueLine when called
        dialogue.setText(story.lineInStory(dialogueLine)); //updates text
        if(dialogueLine == 5){ //string of if else statements to run depending on what is happening
            inputStringWindow(); //calls a popup window for input
        } else if(dialogueLine == 13){
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ashketchum.jpg"))); // changes background
        } else if(dialogueLine == 24){
            action++; //adds to action to indicate a new arc
            inputStringWindow();
        } else if(dialogueLine == 27){
            inputStringWindow();
        } else if(dialogueLine == 30){
            inputStringWindow();
        } else if(dialogueLine == 33){
            inputStringWindow();
        } else if(dialogueLine == 36){
            inputStringWindow();
        } else if(dialogueLine == 39){
            inputStringWindow();
        } else if(dialogueLine == 42){
            inputStringWindow();
        } else if(dialogueLine == 45){
            inputStringWindow();
        } else if(dialogueLine == 48){
            inputStringWindow();
        } else if(dialogueLine == 51){
            inputStringWindow();
        } else if(dialogueLine == 59){
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/sodachi.jpg"))); // changes background
        } else if(dialogueLine == 66){
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/sodachi1.jpg"))); // changes background
            buttonA.setVisible(true); //makes buttons visible for visual novel portion
            buttonB.setVisible(true);
            buttonC.setVisible(true);
            nextButton.setVisible(false);
            action++;
        } else if(dialogueLine == 73){
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/sodachi.jpg"))); // changes background
            action++;
        } else if(dialogueLine == 75){
            inputStringWindow();
        } else if(dialogueLine == 78){
            inputStringWindow();
        } else if(dialogueLine == 81){
            inputStringWindow();
        } else if(dialogueLine == 84){
            inputStringWindow();
        } else if(dialogueLine == 87){
            inputStringWindow();
        } else if(dialogueLine == 93){
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/school.jpg"))); // changes background
        } else if(dialogueLine == 97){
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/elsa.jpg"))); // changes background
        } else if(dialogueLine == 99){
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/elsa1.jpg"))); // changes background
            buttonA.setVisible(true); //makes buttons visible for visual novel portion
            buttonB.setVisible(true);
            buttonC.setVisible(true);
            nextButton.setVisible(false);
            action++;
        } else if(dialogueLine == 103){
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/elsa.jpg"))); // changes background
        } else if(dialogueLine == 104){
            inputStringWindow();
        } else if(dialogueLine == 107){
            inputStringWindow();
        } else if(dialogueLine == 110){
            inputStringWindow();
        } else if(dialogueLine == 113){
            inputStringWindow();
        } else if(dialogueLine == 116){
            inputStringWindow();
        } else if(dialogueLine == 119){
            inputStringWindow();
        } else if(dialogueLine == 122){
            inputStringWindow();
        } else if(dialogueLine == 125){
            inputStringWindow();
        } else if(dialogueLine == 128){
            inputStringWindow();
        } else if(dialogueLine == 131){
            inputStringWindow();
        } else if(dialogueLine == 139){
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/masterchief.jpg")));  // changes background
        } else if(dialogueLine == 141){
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/masterchief1.jpg")));  // changes background
            buttonA.setVisible(true); //makes buttons visible for visual novel portion
            buttonB.setVisible(true);
            buttonC.setVisible(true);
            nextButton.setVisible(false);
            action++;
        } else if(dialogueLine == 146){
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/masterchief.jpg"))); // changes background
            inputStringWindow();
        } else if(dialogueLine == 149){
            inputStringWindow();
        } else if(dialogueLine == 152){
            inputStringWindow();
        } else if(dialogueLine == 155){
            inputStringWindow();
        } else if(dialogueLine == 158){
            inputStringWindow();
        } else if(dialogueLine == 161){
            inputStringWindow();
        } else if(dialogueLine == 164){
            inputStringWindow();
        } else if(dialogueLine == 167){
            inputStringWindow();
        } else if(dialogueLine == 170){
            inputStringWindow();
        } else if(dialogueLine == 173){
            inputStringWindow();
        } else if(dialogueLine == 181){
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch1.jpg")));  // changes background
            buttonA.setVisible(true); //makes buttons visible for visual novel portion
            buttonB.setVisible(true);
            buttonC.setVisible(true);
            nextButton.setVisible(false);
            action++;
        } else if(dialogueLine == 186){
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch.jpg")));  // changes background
            inputStringWindow();
        } else if(dialogueLine == 189){
            inputStringWindow();
        } else if(dialogueLine == 191){
            inputStringWindow();
        } else if(dialogueLine == 194){
            inputStringWindow();
        } else if(dialogueLine == 197){
            inputStringWindow();
        } else if(dialogueLine == 200){
            inputStringWindow();
        } else if(dialogueLine == 203){
            inputStringWindow();
        } else if(dialogueLine == 206){
            inputStringWindow();
        } else if(dialogueLine == 209){
            inputStringWindow();
        } else if(dialogueLine == 212){
            inputStringWindow();
        } else if(dialogueLine == 219){
            if(story.getEnding() == 3){ //depending on which ending is triggered different things happen
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch17.jpg")));  // changes background
            } else{
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch5.jpg")));  // changes background
            }
        } else if(dialogueLine == 220){
            if(story.getEnding() == 3){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch18.jpg")));  // changes background
                buttonA.setVisible(true); //makes buttons visible for visual novel portion
                buttonB.setVisible(true);
                action++;
            }
        } else if(dialogueLine == 223){
            if(story.getEnding() == 1){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch6.jpg")));  // changes background
            } else if(story.getEnding() == 2){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch8.jpg")));  // changes background
            }
        } else if(dialogueLine == 224){
            if(story.getEnding() == 1){
               background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch7.jpg")));  // changes background
            } else if(story.getEnding() == 2){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch9.jpg")));  // changes background
            } else if(story.getEnding() == 3){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch22.jpg")));  // changes background
            }
        } else if(dialogueLine == 225){
            if(story.getEnding() == 2){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch10.jpg")));  // changes background
            } else if(story.getEnding() == 3){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch23.jpg")));  // changes background
            }
        } else if(dialogueLine == 226){
            if(story.getEnding() == 2){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch11.jpg")));  // changes background
            } else if(story.getEnding() == 3){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch24.jpg")));  // changes background
            }
        } else if(dialogueLine == 227){
            if(story.getEnding() == 2){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch12.jpg")));  // changes background
            } else if(story.getEnding() == 3){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch25.jpg")));  // changes background
            }
        } else if(dialogueLine == 228){
            if(story.getEnding() == 2){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch13.jpg")));  // changes background
            } else if(story.getEnding() == 3){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch26.jpg")));  // changes background
            }
        } else if(dialogueLine == 229){
            if(story.getEnding() == 2){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch14.jpg")));  // changes background
            } else if(story.getEnding() == 3){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch27.jpg")));  // changes background
            }
        } else if(dialogueLine == 230){
            if(story.getEnding() == 2){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch15.jpg")));  // changes background
            } else if(story.getEnding() == 3){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch28.jpg")));  // changes background
            }
        } else if(dialogueLine == 231){
            if(story.getEnding() == 2){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch16.jpg")));  // changes background
            }
        } else if(dialogueLine == 901){
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch6.jpg")));  // changes background
        } else if(dialogueLine == 902){
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch7.jpg")));  // changes background
        }
        if(story.getFlag()){ //if the ending flag is triggered
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/badend.jpg")));  // changes background
            restartButton.setVisible(true); //sets the restart and quit buttons visible and the next button not
            quitButton.setVisible(true);
            nextButton.setVisible(false);
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void buttonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAActionPerformed
        //when the A button is clicked on
        if(action == 3){ //different things happen depending on the dialogueline and the action
            if(dialogueLine == 66){
                story.addBadPts(); //adds points to the story
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/sodachi2.jpg")));  // changes background
            } else if(dialogueLine == 67){
                story.addTruePts();
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/sodachi3.jpg")));  // changes background
            } else if(dialogueLine == 68){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/sodachi4.jpg")));  // changes background
                buttonA.setVisible(false); //at the end of each visual novel sequence, the buttons are reset to normal
                buttonB.setVisible(false);
                buttonC.setVisible(false);
                nextButton.setVisible(true);
            }
        } else if(action == 5){
            if(dialogueLine == 99){
                story.addBadPts();
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/elsa2.jpg")));  // changes background
            } else if(dialogueLine == 100){
                story.addBadPts();
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/elsa3.jpg")));  // changes background
            } else if(dialogueLine == 101){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/elsa4.jpg")));  // changes background
                buttonA.setVisible(false); //reset buttons
                buttonB.setVisible(false);
                buttonC.setVisible(false);
                nextButton.setVisible(true);
            }
        } else if(action == 6){
            if(dialogueLine == 141){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/masterchief2.jpg")));  // changes background
            } else if(dialogueLine == 142){
                story.addBadPts();
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/masterchief3.jpg")));  // changes background
            } else if(dialogueLine == 143){
                story.addTruePts();
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/masterchief4.jpg")));  // changes background
                buttonA.setVisible(false); //resets buttons
                buttonB.setVisible(false);
                buttonC.setVisible(false);
                nextButton.setVisible(true);
            }
        } else if(action == 7){
            if(dialogueLine == 181){
                story.addTruePts();
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch2.jpg")));  // changes background
            } else if(dialogueLine == 182){
                story.addBadPts();
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch3.jpg")));  // changes background
            } else if(dialogueLine == 183){
                story.addBadPts();
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch4.jpg")));  // changes background
                buttonA.setVisible(false);
                buttonB.setVisible(false);
                buttonC.setVisible(false);
                nextButton.setVisible(true);
            }
        } else if(action == 8){
            if(dialogueLine == 220){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch19.jpg")));  // changes background
            } else if(dialogueLine == 221){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch20.jpg")));  // changes background
            } else if(dialogueLine == 222){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch21.jpg")));  // changes background
                buttonA.setVisible(false);
                buttonB.setVisible(false);
                nextButton.setVisible(true);
            }
        }
        dialogueLine++; //adds to the dialogueline when called
        dialogue.setText(story.lineInStory(dialogueLine)); //updates the GUI
    }//GEN-LAST:event_buttonAActionPerformed

    private void buttonBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBActionPerformed
        // when the B button is clicked on
        if(action == 3){ //different things happen depending on the action and dialogueline
            if(dialogueLine == 66){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/sodachi2.jpg")));  // changes background
            }
            else if(dialogueLine == 67){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/sodachi3.jpg")));  // changes background
            }
            else if(dialogueLine == 68){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/sodachi4.jpg")));  // changes background
                story.addTruePts(); //points are added
                buttonA.setVisible(false); //resets buttons at the end of each VN portion
                buttonB.setVisible(false);
                buttonC.setVisible(false);
                nextButton.setVisible(true);
            }
        } else if(action == 5){
            if(dialogueLine == 99){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/elsa2.jpg")));  // changes background
            } else if(dialogueLine == 100){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/elsa3.jpg")));  // changes background
            } else if(dialogueLine == 101){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/elsa4.jpg")));  // changes background
                buttonA.setVisible(false); //resets buttons
                buttonB.setVisible(false);
                buttonC.setVisible(false);
                nextButton.setVisible(true);
            }
        } else if(action == 6){
            if(dialogueLine == 141){
                story.addTruePts();
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/masterchief2.jpg")));  // changes background
            } else if(dialogueLine == 142){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/masterchief3.jpg")));  // changes background
            } else if(dialogueLine == 143){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/masterchief4.jpg")));  // changes background
                buttonA.setVisible(false); //resets buttons
                buttonB.setVisible(false);
                buttonC.setVisible(false);
                nextButton.setVisible(true);
            }
        } else if(action == 7){
            if(dialogueLine == 181){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch2.jpg")));  // changes background
            } else if(dialogueLine == 182){
                story.addGoodPts();
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch3.jpg")));  // changes background
            } else if(dialogueLine == 183){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch4.jpg")));  // changes background
                buttonA.setVisible(false); //resets buttons
                buttonB.setVisible(false);
                buttonC.setVisible(false);
                nextButton.setVisible(true);
            }
        } else if(action == 8){ //triggers special bad end
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouchbad.jpg")));  // changes background
            dialogueLine = 899; 
            buttonA.setVisible(false);
            buttonB.setVisible(false);
            nextButton.setVisible(true);
        }
        dialogueLine++; //updates dialogueLine
        dialogue.setText(story.lineInStory(dialogueLine)); //updates GUI
    }//GEN-LAST:event_buttonBActionPerformed

    private void buttonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCActionPerformed
        // when button C is clicked on
        if(action == 3){ //different things happen depending on the action and dialogueline
            if(dialogueLine == 66){
                story.addGoodPts(); //adds points depending
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/sodachi2.jpg")));  // changes background
            } else if(dialogueLine == 67){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/sodachi3.jpg")));  // changes background
            } else if(dialogueLine == 68){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/sodachi4.jpg")));  // changes background
                buttonA.setVisible(false); //resets buttons at the end of each VN portion
                buttonB.setVisible(false);
                buttonC.setVisible(false);
                nextButton.setVisible(true);
            }
        } else if(action == 5){
            if(dialogueLine == 99){
                story.addGoodPts();
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/elsa2.jpg")));  // changes background
            } else if(dialogueLine == 100){
                story.addGoodPts();
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/elsa3.jpg")));  // changes background
            } else if(dialogueLine == 101){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/elsa4.jpg")));  // changes background
                story.addTruePts();
                buttonA.setVisible(false); //resets buttons
                buttonB.setVisible(false);
                buttonC.setVisible(false);
                nextButton.setVisible(true);
            }
        } else if(action == 6){
            if(dialogueLine == 141){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/masterchief2.jpg")));  // changes background
            } else if(dialogueLine == 142){
                story.addGoodPts();
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/masterchief3.jpg")));  // changes background
            } else if(dialogueLine == 143){
                story.addBadPts();
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/masterchief4.jpg")));  // changes background
                buttonA.setVisible(false); //resets buttons
                buttonB.setVisible(false);
                buttonC.setVisible(false);
                nextButton.setVisible(true);
            }
        } else if(action == 7){
            if(dialogueLine == 181){
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch2.jpg")));  // changes background
            } else if(dialogueLine == 182){
                story.addTruePts();
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch3.jpg")));  // changes background
            } else if(dialogueLine == 183){
                story.addTruePts();
                background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lelouch4.jpg")));  // changes background
                buttonA.setVisible(false); //resets buttons
                buttonB.setVisible(false);
                buttonC.setVisible(false);
                nextButton.setVisible(true);
            }
        }
        dialogueLine++; //updates dialogueLine
        dialogue.setText(story.lineInStory(dialogueLine)); //updates GUI
    }//GEN-LAST:event_buttonCActionPerformed

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        // when quit button is selected
        System.exit(0); //quits the program
    }//GEN-LAST:event_quitButtonActionPerformed

    private void restartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartButtonActionPerformed
        // when the restart button is select
        story.stopMusic(); //stops music
        this.dispose(); //disposes of this object
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                reset(); //resets all variables
                new GUI().setVisible(true); //creates new object
            }
        });
    }//GEN-LAST:event_restartButtonActionPerformed

    private static void inputStringWindow(){
        //window for inputs
        JFrame frame = new JFrame(); //creates a new jframe object
        frame.setSize(400, 400); //sets the frame to these dimensions
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes the jrame when the window is closed
        Container container = frame.getContentPane(); //creates a container for the jframe
        container.setLayout(new FlowLayout()); //sets the layout for the container
        JTextField textField = new JTextField(); //creates a new textfield
        textField.setPreferredSize(new Dimension(150, 25)); //sets the size of the textfield
        JLabel label = new JLabel("Input given the instructions."); //creates a label so users know what to input
        JButton okButton = new JButton("OK"); //creates a button so users can click it to move on
        okButton.addActionListener(new ActionListener() { //creates a new actionlistener that will know what to do when the button is clicked
            public void actionPerformed(ActionEvent e) {
                input = textField.getText(); //stores the input
                if(action == 1){
                    story.setName(input);
                } else if(action == 2){
                    /* if(input.equals("6")){ 
                        dialogueLine = 58;
                    } administrative cheat to skip trivia portion!
                    */
                    story.correctOrNotPokemon(input);
                } else if(action == 4){
                    /* if(input.equals("6")){
                        dialogueLine = 96;
                    } administrative cheat to skip trivia portion!
                    */
                    story.correctOrNotMath(input);
                } else if(action == 5){
                    /* if(input.equals("6")){
                        dialogueLine = 138;
                    } administrative cheat to skip trivia portion!
                    */
                    story.correctOrNotMovies(input);
                } else if(action == 6){
                    /* if(input.equals("6")){
                        dialogueLine = 180;
                    } administrative cheat to skip trivia portion!
                    */
                    story.correctOrNotGames(input);
                } else if(action == 7){
                    /* if(input.equals("6")){
                        dialogueLine = 217;
                    } administrative cheat to skip trivia portion!
                    */
                    story.correctOrNotAnime(input);
                }
                input = ""; //resets input
                frame.dispose(); //closes the frame
                }
            });

        container.add(textField); //adds the text to the container
        container.add(okButton); //adds the ok button to the container
        container.add(label); //adds the label to the container

            
        frame.setVisible(true); //sets the frame visible
    }
    /**
     * @param args the command line arguments
     */
    
    private static void reset(){
        action = 1; //resets all initial values
        dialogueLine = 0;
        story = new Story();
        input = "";
    }
    
    
    private static int dialogueLine; //the line of dialogue in the story where the user currently is
    private static Story story; //story object that controls the actual story itself
    private static String input; //stores user input
    private static int action; //depending on the integer the action is at, controls what happens as a result of choices
    public static void main(String args[]) {
        action = 1; //initializes variables
        dialogueLine = 0;
        story = new Story();
        input = "";
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //==</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true); //creates new GUI
            }
        });
    }
    
    // For GUI:
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton buttonA;
    private javax.swing.JButton buttonB;
    private javax.swing.JButton buttonC;
    private javax.swing.JLabel dialogue;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton quitButton;
    private javax.swing.JButton restartButton;
    // End of variables declaration//GEN-END:variables
}