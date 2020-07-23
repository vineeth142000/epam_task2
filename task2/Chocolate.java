package com.mavenproject.task2;
public class Chocolate extends newYearGift
{
    public Chocolate(String name, int quantity) {
        super(name, quantity);
    }

    @Override
    void pack()
    {
        System.out.println(this.getName() + " is packing ......");
    }

}