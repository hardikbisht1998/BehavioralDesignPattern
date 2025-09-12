package commandPattern;

import java.util.Stack;

public class ActionHistory {

    Stack<Action> history=new Stack<>();
    public void push(Action action){
        history.push(action);
    }

    public Action pop(){
        return history.pop();
    }


    public boolean isEmpty(){return history.isEmpty();}

}
