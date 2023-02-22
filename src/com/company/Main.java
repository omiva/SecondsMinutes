package com.company;

public class Main
{
    public static int getDurationString(int minutes, int seconds)
    {
        int hours;
        if(minutes<0||seconds<0||seconds>59)
        {
            System.out.println("invalid input");
        }
        else
        {
            hours=minutes/60;
            minutes=minutes%60;
            System.out.println((int)hours+" hours "+minutes+" minutes "+seconds+" seconds");
        }
        return 0;
    }


    public static void main(String[] args)
    {
        getDurationString(74,17);
    }
}
