import java.util.*;
import java.io.*;
public class J04012{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int base=Integer.parseInt(sc.nextLine());
        int day=Integer.parseInt(sc.nextLine());
        String rank=sc.nextLine();
        int bonus=0;
        switch(rank){
            case "GD":
                bonus=250000;
                break;
            case "PGD":
                bonus=200000;
                break;
            case "TP":
                bonus=180000;
                break;
            case "NV":
                bonus=150000;
                break;
        }
        int reward=0;
        if(day>=25) reward=base*day*20/100;
        else if(day>=22 && day<25) reward=base*day*10/100;
        System.out.println("NV01 "+name+" "+
                            base*day+ " "+ reward+" "
                            + bonus+ " " + String.valueOf(base*day+reward+bonus)
        );
    }
}