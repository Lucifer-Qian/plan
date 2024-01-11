package com.plan.dream.pattern.state.demo1;

import lombok.Data;

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

    private DemoState currentDemoState;

    public Context(){
        this.currentDemoState = null;
    }

    public Context(DemoState currentDemoState){
        this.currentDemoState = currentDemoState;
    }

    public DemoState getCurrentDemoState() {
        return currentDemoState;
    }

    public void setCurrentDemoState(DemoState currentDemoState) {
        this.currentDemoState = currentDemoState;
    }

    @Override
    public String toString() {
        return "Context{" +
                "currentState=" + currentDemoState +
                '}';
    }
}
