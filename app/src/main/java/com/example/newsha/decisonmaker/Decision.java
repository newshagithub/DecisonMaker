package com.example.newsha.decisonmaker;

/**
 * Created by newsha on 11/16/16.
 */

public class Decision {

    int weight, f1rate, f2rate, f3rate, f4rate, f5rate, result;
    String topic, option, factor;

    public Decision(String topic) {
        this.topic = topic;
    }
    public Decision() {
    }

    //** public void setId(int id) {
    //this.id = id;
    // }

    //public int getId() {
    //    return id;
    //}

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getOption() {
        return option;
    }

    public void setFactor(String factor) {
        this.factor = factor;
    }

    public String getFactor() {
        return factor;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setF1rate(int f1rate) {
        this.f1rate = f1rate;
    }

    public int getF1rate() {
        return f1rate;
    }

    public void setF2rate(int f2rate) {
        this.f2rate = f2rate;
    }

    public int getF2rate() {
        return f2rate;
    }

    public void setF3rate(int f3rate) {
        this.f3rate = f3rate;
    }

    public int getF3rate() {
        return f3rate;
    }

    public void setF4rate(int f4rate) {
        this.f4rate = f4rate;
    }

    public int getF4rate() {
        return f4rate;
    }

    public void setF5rate(int f5rate) {
        this.f5rate = f5rate;
    }

    public int getF5rate() {
        return f5rate;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getResult() {
        return result;
    }
}