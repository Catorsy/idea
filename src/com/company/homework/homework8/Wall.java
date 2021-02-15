package com.company.homework.homework8;

public class Wall implements Exist {
    private int height;
    private String type;

    public Wall (int height, String type){
        this.height = height;
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public boolean didIt(Member member){
        if(!(member instanceof Jumpable)){
            System.out.println(member.getName() + " не умеет прыгать.");
            return false;
        } else {
            int maxJump = ((Jumpable)member).getMaxJump();
            if (maxJump >= height){
                ((Jumpable) member).jump();
                return true;
            }
            return false;
        }
    }
}
