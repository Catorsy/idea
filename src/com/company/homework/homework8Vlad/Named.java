package com.company.homework.homework8Vlad;

public interface Named {

    default String name() {
        return this.getClass().getSimpleName();
    }

}