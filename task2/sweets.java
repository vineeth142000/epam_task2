package com.mavenproject.task2;
public class sweets extends newYearGift
{
    public sweets(String name, int quantity) {
        super(name, quantity);
    }

    @Override
    void pack()
    {
        System.out.println(this.getName()+" are packing......");
    }

}