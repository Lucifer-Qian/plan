package com.plan.dream.pattern.state.demo1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.state.demo1
 * @ClassName: Context
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/29 17:00
 * @version: 1.0
 */

@Data
public class Context {

    private State currentState;

    public Context(){
        this.currentState = null;
    }

    public Context(State currentState){
        this.currentState = currentState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    @Override
    public String toString() {
        return "Context{" +
                "currentState=" + currentState +
                '}';
    }
}
