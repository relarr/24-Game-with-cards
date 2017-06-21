package PointCardGame;

import java.util.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.*;
import javax.swing.Timer;

/**
 ********************************************************************
 * Comments by student.
 * 
 ********************************************************************
 * File name:       CardGameGUI.java
 * @author          Rafael Larrea
 * Created on:      March 5, 2015 8:04 AM
 * @version         1.0
 * Platform:        PC, Windows 7, NetBeans 8.0.1, JDK 1.8.0_20
 * @see             java.util.*
 * @see             java.awt.Color
 * @see             java.awt.Container
 * @see             java.awt.Toolkit
 * @see             java.awt.event.ActionEvent
 * @see             javax.swing.*
 * @see             javax.swing.Timer
 * *********************************************************************
 * <b>
 * This application simulates a 24 Point Card Game. the objective is to 
 * find a way to manipulate four integers so that the end result is 24.
 * The  calculations are made using two  objects from the  GenericStack 
 * class; one for operators and one for values.
 * </b>
 * *********************************************************************
 * Input:           The user's expression with the randomly given integers
 * Output:          The verification of the expression either correct or
 *                  incorrect, and also the answer if requested.
 * *********************************************************************
 */

public class CardGameGUI extends javax.swing.JFrame 
{
    //Class instance variables
    //An array for the Four cards to be displayed
    final int cardArray[] = new int[4];
    //An ArrayList for 52 cards on the deck
    private final ArrayList<Integer> digits = new ArrayList<>();
    //Instantiate a new Timer object
    private Timer myTime;  
    int counter = 0;
    int NumWins = 0;
    int NumLosses = 0;
    StringBuffer display = new StringBuffer("");
    
    /**
     * Creates new form CardGameGUI
     */
    public CardGameGUI() {
        initComponents();
        
        //centers the form
        setLocationRelativeTo(null);
        
        // Set the verify button as default.
        this.getRootPane().setDefaultButton(verifyJButton);
        
        //displays icon image
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/resources/icon.jpeg"));
        
        //set background color
        Container container = this.getContentPane();
        container.setBackground(Color.getHSBColor(0.290f, 0.779f, 0.793f));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        cardsJPanel = new javax.swing.JPanel();
        card1IconJLabel = new javax.swing.JLabel();
        card2IconJLabel = new javax.swing.JLabel();
        card3IconJLabel = new javax.swing.JLabel();
        card4IconJLabel = new javax.swing.JLabel();
        titleJLabel = new javax.swing.JLabel();
        timerJLabel = new javax.swing.JLabel();
        yourTimeJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        statisticsJTextArea = new javax.swing.JTextArea();
        controlJPanel = new javax.swing.JPanel();
        answersJButton = new javax.swing.JButton();
        verifyJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        exitJButton = new javax.swing.JButton();
        expressionJPanel = new javax.swing.JPanel();
        expressionJLabel = new javax.swing.JLabel();
        expressionJTextField = new javax.swing.JTextField();
        GUIJMenuBar = new javax.swing.JMenuBar();
        fileJMenu = new javax.swing.JMenu();
        saveJMenuItem = new javax.swing.JMenuItem();
        printJMenuItem = new javax.swing.JMenuItem();
        exitJMenuItem = new javax.swing.JMenuItem();
        editJMenu = new javax.swing.JMenu();
        refreshJMenuItem = new javax.swing.JMenuItem();
        verifyJMenuItem = new javax.swing.JMenuItem();
        answersJMenuItem = new javax.swing.JMenuItem();
        helpJMenu = new javax.swing.JMenu();
        aboutJMenuItem = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("24-Point Card Game");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cardsJPanel.setBackground(new java.awt.Color(31, 196, 31));
        cardsJPanel.setLayout(new java.awt.GridLayout(1, 4));

        card1IconJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        card1IconJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backside2.png"))); // NOI18N
        card1IconJLabel.setToolTipText("");
        cardsJPanel.add(card1IconJLabel);

        card2IconJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        card2IconJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backside1.png"))); // NOI18N
        card2IconJLabel.setToolTipText("");
        cardsJPanel.add(card2IconJLabel);

        card3IconJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        card3IconJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backside2.png"))); // NOI18N
        card3IconJLabel.setToolTipText("");
        cardsJPanel.add(card3IconJLabel);

        card4IconJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        card4IconJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backside1.png"))); // NOI18N
        card4IconJLabel.setToolTipText("");
        cardsJPanel.add(card4IconJLabel);

        getContentPane().add(cardsJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 189, 354, 100));

        titleJLabel.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        titleJLabel.setForeground(java.awt.Color.red);
        titleJLabel.setText("My 24 Point Card Game");
        getContentPane().add(titleJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        timerJLabel.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        timerJLabel.setForeground(java.awt.Color.orange);
        timerJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timerJLabel.setToolTipText("");
        getContentPane().add(timerJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 43, 87, 22));

        yourTimeJLabel.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        yourTimeJLabel.setForeground(java.awt.Color.red);
        yourTimeJLabel.setText("your time:");
        getContentPane().add(yourTimeJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 43, -1, -1));

        statisticsJTextArea.setEditable(false);
        statisticsJTextArea.setColumns(20);
        statisticsJTextArea.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        statisticsJTextArea.setRows(5);
        jScrollPane1.setViewportView(statisticsJTextArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 71, 340, -1));

        controlJPanel.setBackground(new java.awt.Color(31, 196, 31));
        controlJPanel.setLayout(new java.awt.GridLayout(1, 4));

        answersJButton.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        answersJButton.setMnemonic('w');
        answersJButton.setText("Answer");
        answersJButton.setToolTipText("show an answer");
        answersJButton.setEnabled(false);
        answersJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answersJButtonActionPerformed(evt);
            }
        });
        controlJPanel.add(answersJButton);

        verifyJButton.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        verifyJButton.setMnemonic('V');
        verifyJButton.setText("Verify");
        verifyJButton.setToolTipText("verify the expression");
        verifyJButton.setEnabled(false);
        verifyJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyJButtonActionPerformed(evt);
            }
        });
        controlJPanel.add(verifyJButton);

        refreshJButton.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        refreshJButton.setMnemonic('R');
        refreshJButton.setText("Refresh");
        refreshJButton.setToolTipText("refresh the cards for a new game");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        controlJPanel.add(refreshJButton);

        exitJButton.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        exitJButton.setMnemonic('x');
        exitJButton.setText("Exit");
        exitJButton.setToolTipText("exit the application");
        exitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitJButtonActionPerformed(evt);
            }
        });
        controlJPanel.add(exitJButton);

        getContentPane().add(controlJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 320, 340, 30));

        expressionJPanel.setBackground(new java.awt.Color(31, 196, 31));
        expressionJPanel.setLayout(new java.awt.GridLayout(1, 2, 5, 0));

        expressionJLabel.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        expressionJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        expressionJLabel.setText("Enter an expression:");
        expressionJPanel.add(expressionJLabel);

        expressionJTextField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        expressionJTextField.setToolTipText("enter your expression");
        expressionJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                expressionJTextFieldKeyTyped(evt);
            }
        });
        expressionJPanel.add(expressionJTextField);

        getContentPane().add(expressionJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 290, 340, 30));

        fileJMenu.setMnemonic('F');
        fileJMenu.setText("File");
        fileJMenu.setToolTipText("File");

        saveJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveJMenuItem.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        saveJMenuItem.setMnemonic('S');
        saveJMenuItem.setText("Save");
        saveJMenuItem.setToolTipText("save the statistics");
        saveJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(saveJMenuItem);

        printJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        printJMenuItem.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        printJMenuItem.setMnemonic('P');
        printJMenuItem.setText("Print");
        printJMenuItem.setToolTipText("print the GUI");
        printJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(printJMenuItem);

        exitJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        exitJMenuItem.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        exitJMenuItem.setMnemonic('x');
        exitJMenuItem.setText("Exit");
        exitJMenuItem.setToolTipText("exit the application");
        exitJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(exitJMenuItem);

        GUIJMenuBar.add(fileJMenu);

        editJMenu.setMnemonic('A');
        editJMenu.setText("Action");
        editJMenu.setToolTipText("Action");

        refreshJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        refreshJMenuItem.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        refreshJMenuItem.setMnemonic('R');
        refreshJMenuItem.setText("Refresh");
        refreshJMenuItem.setToolTipText("refresh the cards for a new game");
        refreshJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJMenuItemActionPerformed(evt);
            }
        });
        editJMenu.add(refreshJMenuItem);

        verifyJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        verifyJMenuItem.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        verifyJMenuItem.setMnemonic('V');
        verifyJMenuItem.setText("Verify");
        verifyJMenuItem.setToolTipText("verify the expression");
        verifyJMenuItem.setEnabled(false);
        verifyJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyJMenuItemActionPerformed(evt);
            }
        });
        editJMenu.add(verifyJMenuItem);

        answersJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        answersJMenuItem.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        answersJMenuItem.setMnemonic('w');
        answersJMenuItem.setText("Answer");
        answersJMenuItem.setToolTipText("show an answer");
        answersJMenuItem.setEnabled(false);
        answersJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answersJMenuItemActionPerformed(evt);
            }
        });
        editJMenu.add(answersJMenuItem);

        GUIJMenuBar.add(editJMenu);

        helpJMenu.setMnemonic('H');
        helpJMenu.setText("Help");
        helpJMenu.setToolTipText("Help");

        aboutJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        aboutJMenuItem.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        aboutJMenuItem.setMnemonic('b');
        aboutJMenuItem.setText("About");
        aboutJMenuItem.setToolTipText("show about form");
        aboutJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutJMenuItemActionPerformed(evt);
            }
        });
        helpJMenu.add(aboutJMenuItem);

        GUIJMenuBar.add(helpJMenu);

        setJMenuBar(GUIJMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        //enables the answersJButton and verifyJButton
        answersJButton.setEnabled(true);
        verifyJButton.setEnabled(true);
        answersJMenuItem.setEnabled(true);
        verifyJMenuItem.setEnabled(true);

        //clears the expressionJTextField and request focus
        expressionJTextField.setText("");
        expressionJTextField.requestFocus();
        
        //creates a DeckOfCards object
        DeckOfCards myDeck = new DeckOfCards(digits);
        
        //calls the setInteger method from the DeckOfCards Class to assign an integer value for each of the 52 cards
        myDeck.setInteger(digits);
        //calls the shuffle method from the DeckOfCards Class to randomly display the four cards
        myDeck.shuffle(digits);
        
        for (int i = 0; i < 4; i++)
        {
            cardArray [i]= (int)(digits.get((int) i)%13+1);
        } 
        //assigns the images the to corresponding jLabels
        ImageIcon cardImage1 = new ImageIcon("src/CardImages/" + (digits.get(3)+1) + ".png");
        ImageIcon cardImage2 = new ImageIcon("src/CardImages/" + (digits.get(2)+1) + ".png");
        ImageIcon cardImage3 = new ImageIcon("src/CardImages/" + (digits.get(1)+1) + ".png");
        ImageIcon cardImage4 = new ImageIcon("src/CardImages/" + (digits.get(0)+1) + ".png");
        
        digits.clear();     //clears the digits ArrayList
        
        card1IconJLabel.setIcon(cardImage1);
        card2IconJLabel.setIcon(cardImage2);
        card3IconJLabel.setIcon(cardImage3);
        card4IconJLabel.setIcon(cardImage4);
        
        //
        timerJLabel.setText(counter + "");
        if (myTime != null)
        {
            myTime.stop();
        }
        counter = 100;
        timerJLabel.setText(counter + "");
        myTime = new Timer(1000, (ActionEvent ae) ->
        {
            counter --;
            timerJLabel.setText(counter + "");
            myTime.restart();
            if(counter == 0)
            {
                myTime.stop();
                //displays a JOptionPane when the user's time is up
                Object[] options = {"OK"};
                int question = JOptionPane.showOptionDialog(null, "Your time is up, would you like to play again?",
                    "Time's Up", JOptionPane.PLAIN_MESSAGE, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
                
                if(question == JOptionPane.OK_OPTION)   //JOptionPane with only "ok" option.
                {
                    NumLosses +=1;
                    refreshJButtonActionPerformed(evt);
                    verifyJButton.setEnabled(true);
                    refreshJButton.setEnabled(true);
                } 
                myTime.stop();
                counter = 100;
                verifyJButton.setEnabled(true);
                refreshJButton.setEnabled(true);
            }
        });           
        myTime.start();
        
        // Display the statiscs of the game.
        display = displayStats();
        statisticsJTextArea.setText(display.toString());
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void answersJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answersJButtonActionPerformed
        //instantiates an object of the Answer class
        Answer myAnswer = new Answer();
        
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0 ; i < cardArray.length; i++)
        {
            numbers.add(cardArray[i]);
        }
        //calls the isSolvable method from the Answer class
        boolean solvable = myAnswer.isSolvable(numbers);
        for (int i = 0 ; i< myAnswer.allAnswers.size(); i++)
        {
            Object[] options = {"OK"};
                int question = JOptionPane.showOptionDialog(null, expressionJTextField.getText() + 
                        myAnswer.allAnswers.get(i) +"",
                    "Answer", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE,
                    null, options, options[0]);
                if(question == JOptionPane.OK_OPTION)   //JOptionPane with only "ok" option.
                {
                    refreshJButtonActionPerformed(evt);
                    return;
                }
        }
        if (!solvable)
        {
            JOptionPane.showMessageDialog(null, "no solution");
            refreshJButtonActionPerformed(evt);
        }
    }//GEN-LAST:event_answersJButtonActionPerformed

    /**
     * A method that display the results of won and lost games
     * @return statOutput--a StringBuffer object containing the formatted game results.
     */
    public StringBuffer displayStats()
    {
        StringBuffer statOutput = new StringBuffer();
        statOutput.append("Number of games played = " + (NumWins + NumLosses) + "\n");
        statOutput.append("Number of games won = " + (NumWins) + "\n");
        statOutput.append("Number of games lost = " + (NumLosses) + "\n");
       
        return statOutput;
    }
    
    /**
     * A method to evaluate the expression entered by the user
     * @param expression
     * @return valueStack.pop();
     * @throws FullStackException
     * @throws EmptyStackException 
     */
    public static Integer evaluateExpression(String expression) throws FullStackException, EmptyStackException
    {
        //instantiate valueStack for values
        GenericStack<Integer> valueStack = new GenericStack<>();
        //instantiate operatorStack for operators
        GenericStack<Character> operatorStack = new GenericStack<>();
        //calls the putBlanks method
        String[] tokens = putBlanks(expression).split(" ");

        for (String token : tokens) 
        {
            token = token.trim();
            //checks the given operator for priority 
            if (token.length() == 0) {
            } else
            if (token.charAt(0) == '+' || token.charAt(0) == '-')
            {
                while (!operatorStack.isEmpty() && (operatorStack.peek() == '+'
                        || operatorStack.peek() == '-' || operatorStack.peek() == '*'
                        || operatorStack.peek() == '/')) 
                {
                    processAnOperator(valueStack, operatorStack);   //calls the processAnOperator method
                }
                operatorStack.push(token.charAt(0));
            } 
            else 
                if (token.charAt(0) == '*' || token.charAt(0) == '/') 
                {
                    //peeks into the top of the operatorStack
                    while (!operatorStack.isEmpty() && (operatorStack.peek() == '*'
                        || operatorStack.peek() == '/')) 
                    {
                        processAnOperator(valueStack, operatorStack);   //calls the processAnOperator method
                    }
                    operatorStack.push(token.charAt(0));    //pushes the operatorStack if '*' or '/'
                } 
                else 
                    if (token.trim().charAt(0) == '(') 
                    {
                        operatorStack.push('(');    
                    } 
                    else 
                        if (token.trim().charAt(0) == ')')  //if a ')' is found the inner expression has a higher precedence
                        {
                            while (operatorStack.peek() != '(') 
                            {
                                processAnOperator(valueStack, operatorStack);   //calls the processAnOperator method
                            }
                            operatorStack.pop(); 
                        } 
                        else 
                        { 
                            valueStack.push(new Integer(token));   
                        }
        }
        while (!operatorStack.isEmpty()) 
        {
            processAnOperator(valueStack, operatorStack);   //calls the processAnOperator method
        }
        return valueStack.pop();    //displays the top of the valueStack
    }
    
    /**
     * A method to process operators
     * @param operandStack
     * @param operatorStack
     * @throws FullStackException
     * @throws EmptyStackException 
     */
    public static void processAnOperator(GenericStack<Integer> operandStack, GenericStack<Character> operatorStack)
        throws FullStackException, EmptyStackException
    {
        char op = operatorStack.pop();
        int  op1 = operandStack.pop();
        int  op2 = operandStack.pop();
        if (op == '+') {
            operandStack.push(op2 + op1);
        } else if (op == '-') {
            operandStack.push(op2 - op1);
        } else if (op == '*') {
            operandStack.push(op2 * op1);
        } else if (op == '/') {
            operandStack.push(op2 / op1);
        }
    }
    
    /**
     * A method to add blank spaces before and after an operator.
     * @param s
     * @return result
     */
    public static String putBlanks(String s) 
    {
        String result = "";
        for (int i = 0; i < s.length(); i++) 
        {
            if (s.charAt(i) == '(' || s.charAt(i) == ')' || s.charAt(i) == '+' 
                    || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/') 
            {
                result += " " + s.charAt(i) + " ";  //add blank spaces before and after the operator
            } 
            else 
            {
                result += s.charAt(i);
            }
        }
        return result;
    }
    
    /**
     * A method that checks if the user has used the given numbers
     * @param cards
     * @param input
     * @return a boolean
     */
    public static boolean UseGivenNumbers(int[] cards,String input)
    {
        String[] tokens = putBlanks(input).split(" ");   
        boolean [] correctNums = new boolean[cards.length];

        for(int i = 0; i < correctNums.length; i++)
        {
            correctNums[i]= false;
        }
        for (String token : tokens) 
        {
            token = token.trim();
            if (token.length() == 0) 
            {
                continue;
            }
            int number;

            try 
            {
                number = (int) Integer.parseInt(token);
            }
            catch(NumberFormatException e )
            {
                continue;
            }
            boolean userNum = false ;

            for (int i = 0; i < cards.length; i++)
            {
                if (number == cards[i] && correctNums[i] == false)
                {
                    correctNums[i]= true;
                    userNum = true;
                    break;
                }

            }  
            if (userNum == false)
            {
                return false;
            }
        }
        return true;
    }
    
    private void verifyJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyJButtonActionPerformed
        //check the expression entered by the user to see if it is correct
        try
        {
            myTime.stop();  //stop the timer
            /*checks if the user's expression is equal to 24 and if the given numbers
              were used*/
            if (evaluateExpression(expressionJTextField.getText()) == 24 &&
                UseGivenNumbers(cardArray,expressionJTextField.getText())) 
                {
                    JOptionPane.showMessageDialog(null, "Correct"); 
                    myTime.stop();
                    refreshJButtonActionPerformed(evt);
                    NumWins +=1;
                    display = displayStats();
                    statisticsJTextArea.setText(display.toString());
                }
            else   //if incorrect displays a JOptionPane message
            {
                JOptionPane.showMessageDialog(null, "Your Expression is Incorrect");
                expressionJTextField.requestFocus();
                expressionJTextField.selectAll();
                NumLosses +=1;
                refreshJButtonActionPerformed(evt);
                display = displayStats();
                statisticsJTextArea.setText(display.toString());
            }
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Invalid Entry");   //invalid entry by the user
            expressionJTextField.requestFocus();
            expressionJTextField.selectAll();
        }

           verifyJButton.setEnabled(true);
           refreshJButton.setEnabled(true);
           myTime.restart();
    }//GEN-LAST:event_verifyJButtonActionPerformed

    private void expressionJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_expressionJTextFieldKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) evt.consume();
    }//GEN-LAST:event_expressionJTextFieldKeyTyped

    private void exitJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitJMenuItemActionPerformed
        //exit the application from the GUI
        exitJButtonActionPerformed(evt);
    }//GEN-LAST:event_exitJMenuItemActionPerformed

    private void refreshJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJMenuItemActionPerformed
        //shows a new set of four cards from the menu
        refreshJButtonActionPerformed(evt);
    }//GEN-LAST:event_refreshJMenuItemActionPerformed

    private void verifyJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyJMenuItemActionPerformed
        //verifies the expression from the menu
        verifyJButtonActionPerformed(evt);
    }//GEN-LAST:event_verifyJMenuItemActionPerformed

    private void answersJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answersJMenuItemActionPerformed
        //display an answer if any from the menu
        answersJButtonActionPerformed(evt);
    }//GEN-LAST:event_answersJMenuItemActionPerformed

    private void printJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printJMenuItemActionPerformed
        // Print the whole GUI.
        try
        {
            //http://www.apl.jhu.edu/~hall/java/Swing-Tutorial/Swing-Tutorial-Printing.html
            PrintUtilities.printComponent(this);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_printJMenuItemActionPerformed

    private void aboutJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutJMenuItemActionPerformed
        //Opens and sets the JDialog for the about form visible.
        AboutJDialog aboutDialog = new AboutJDialog();
        aboutDialog.setVisible(true);
    }//GEN-LAST:event_aboutJMenuItemActionPerformed

    private void exitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitJButtonActionPerformed
        // Exit the application.
        System.exit(0);
    }//GEN-LAST:event_exitJButtonActionPerformed

    private void saveJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJMenuItemActionPerformed
        // Save the content of the Jext area to an external file
        try
        {
            // Create a file to append 
            display = displayStats();
            FileWriter fwriter = new FileWriter("src/PointCardGame/Statistics.txt", true);
            PrintWriter outputFile = new PrintWriter(fwriter);                     

            // Write to the file.
            outputFile.println(display);
            outputFile.close();
            
            Object[] options = {"OK"};
                int question = JOptionPane.showOptionDialog(null, "File Saved",
                    "Save", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE,
                    null, options, options[0]);
                if(question == JOptionPane.OK_OPTION)   //JOptionPane with only "ok" option.
                {
                    return;
                }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_saveJMenuItemActionPerformed
   
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(CardGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CardGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CardGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CardGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CardGameGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar GUIJMenuBar;
    private javax.swing.JMenuItem aboutJMenuItem;
    private javax.swing.JButton answersJButton;
    private javax.swing.JMenuItem answersJMenuItem;
    private javax.swing.JLabel card1IconJLabel;
    private javax.swing.JLabel card2IconJLabel;
    private javax.swing.JLabel card3IconJLabel;
    private javax.swing.JLabel card4IconJLabel;
    private javax.swing.JPanel cardsJPanel;
    private javax.swing.JPanel controlJPanel;
    private javax.swing.JMenu editJMenu;
    private javax.swing.JButton exitJButton;
    private javax.swing.JMenuItem exitJMenuItem;
    private javax.swing.JLabel expressionJLabel;
    private javax.swing.JPanel expressionJPanel;
    private javax.swing.JTextField expressionJTextField;
    private javax.swing.JMenu fileJMenu;
    private javax.swing.JMenu helpJMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem printJMenuItem;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JMenuItem refreshJMenuItem;
    private javax.swing.JMenuItem saveJMenuItem;
    private javax.swing.JTextArea statisticsJTextArea;
    private javax.swing.JLabel timerJLabel;
    private javax.swing.JLabel titleJLabel;
    private javax.swing.JButton verifyJButton;
    private javax.swing.JMenuItem verifyJMenuItem;
    private javax.swing.JLabel yourTimeJLabel;
    // End of variables declaration//GEN-END:variables
}
