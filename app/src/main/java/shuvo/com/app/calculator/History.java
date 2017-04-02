package shuvo.com.app.calculator;

/**
 * Created by User on 3/16/2017.
 */

public class History {
    private int id;
    private String history;

    public History(){

    }

    public History(String history){
        this.history = history;
    }

    public void set_id(int id){
        this.id = id;
    }

    public void set_history(String history){
        this.history = history;
    }

    public int get_id(){
        return id;
    }

    public String get_history(){
        return history;
    }
}
