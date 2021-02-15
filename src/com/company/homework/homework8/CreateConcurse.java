package com.company.homework.homework8;

public class CreateConcurse {

    public static Exist [] getConcurses(){
        Exist wall = new Wall (2, "\"Стена\"");
        Exist road = new Road (1000, "\"Дорожка\"");
        return new Exist[] {wall, road};
    }
}
