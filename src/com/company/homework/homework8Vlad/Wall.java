package com.company.homework.homework8Vlad;


public class Wall implements Overcomable {

    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void overcome(Participant o) {
        if (!(o instanceof Jumpable)) {
            System.out.println("Can't overcome let");
        }
        if (((Jumpable) o).maxJump() > height) {
            ((Jumpable) o).jump();
        } else {
            o.inactive();
        }
    }

}
