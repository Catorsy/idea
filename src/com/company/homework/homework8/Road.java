package com.company.homework.homework8;

public class Road implements Exist {
    private int length;
    private String type;

    public Road (int length, String type){
        this.length = length;
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public boolean didIt(Member member){
        if(!(member instanceof Runables)){
            System.out.println(member.getName() + " не умеет бегать.");
            return false;
        }else {
            int maxRun = ((Runables)member).getMaxRun();
            if (maxRun >= length){
                member.run();
                return true;
            }
            return false;
        }
    }
}