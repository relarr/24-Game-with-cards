package PointCardGame;

import java.util.*;

/**
 ****************************************************************************
 * Comments by student.
 * 
 ****************************************************************************
 * File name:       Answer.java
 * @author          Rafael Larrea
 * Created on:      March 9, 2015 11:04 AM
 * @version         1.0
 * Platform:        PC, Windows 7, NetBeans 8.0.1, JDK 1.8.0_20
 * @see             java.util.*
 * **************************************************************************
 * <b>
 * This Class provides an answer for the specific for integer given by 
 * the cards, including expressions with integer division and exponentiation.
 * </b>
 * **************************************************************************
 * Input:           The four randomly given integers.
 * Output:          one of the possible answers to the game if any.
 * *************************************************************************
 */

public class Answer 
{
    //class instance variables
    final String[] patterns = {"nononon"};
    final String operators = "+-*/^";
    public ArrayList<String>allAnswers=new ArrayList<>();
    private String answer;

    /**
     * A method that checks if the given expression is solvable
     * @param digits
     * @return boolean
     */
    public boolean isSolvable(List<Integer> digits) {
        Set<List<Integer>> dPerms = new HashSet<>(4 * 3 * 2);
        shift(digits, dPerms, 0);
        int total = 4 * 4 * 4;
        List<List<Integer>> oPerms = new ArrayList<>(total);
        shiftOperators(oPerms, 4, total);
 
        String sb = "";
 
        for (String pattern : patterns) {
            char[] patternChars = pattern.toCharArray();
 
            for (List<Integer> dig : dPerms) 
            {
                for (List<Integer> opr : oPerms) 
                {
 
                    int i = 0, j = 0;
                    for (char c : patternChars) 
                    {
                        if (c == 'n')
                            sb+=(dig.get((int) i++));
                        else
                            sb+=(operators.charAt(opr.get((int) j++)));
                    }
                   
                    String candidate = sb;
                    try 
                    {
                        if (CardGameGUI.evaluateExpression(sb) == 24) 
                        {
                            answer = (candidate);
                            allAnswers.add(answer);
                       
                        }
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
                    sb= "";
                }
            }
        }
        if(allAnswers.size()>0){
            return true;
        }
        return false;
    }

    /**
     * A method that shifts operands
     * @param lst
     * @param res
     * @param k 
     */
    private void shift(List<Integer> lst, Set<List<Integer>> res, int k) 
    {
        for (int i = k; i < lst.size(); i++) {
            Collections.swap(lst, i, k);
            shift(lst, res, k + 1);
            Collections.swap(lst, k, i);
        }
        if (k == lst.size())
            res.add(new ArrayList<>(lst));
    }
 
    /**
     * A method that shifts operators
     * @param res
     * @param n
     * @param total 
     */
    private void shiftOperators(List<List<Integer>> res, int n, int total) 
    {
        for (int i = 0, npow = n * n; i < total; i++)
            res.add(Arrays.asList((i / npow), (i % npow) / n, i % n));
    }
}
