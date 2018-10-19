/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experts.Entities;

import java.util.ArrayList;

/**
 *
 * @author owner
 */
public class Premise {
    
    int     id              = -1;
    String  question        = "";
    // CHANGED SOON, TO ANSWER OBJECT
    int     true_val        = -1;
    String  answer          = "";
    
    public LogicOperator operator = null;
    public ArrayList <Answer> list_of_answer = new ArrayList <Answer>();
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getTrue_val() {
        return true_val;
    }

    public void setTrue_val(int true_val) {
        this.true_val = true_val;
    }
    
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
    public Premise(){
        
    }
    
    public Premise(int _id, String _question){
        id          = _id;
        question    = _question;
    }
    
    public Premise(int _id, String _question, String _true_val){
        id          = _id;
        question    = _question;
        answer      = _true_val;
    }
    
    public Premise(int _id, String _question, int _true_val){
        id          = _id;
        question    = _question;
        true_val    = _true_val;
    }
    
}