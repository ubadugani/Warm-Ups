package com.example.tshirtlauncher;

import java.util.*;

public class TShirtLauncherApp {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        double x=0.0;
        double y=0.0;
        System.out.println("Enter launch velocity (m/s): ");
        Double vel= scan.nextDouble();
        System.out.println("Enter launch angle (degrees): ");
        Double deg=scan.nextDouble();
        System.out.println("Projectile's path: ");
        for(int i=0;y>=0;i++){
            x=Math.cos(Math.toRadians(deg))*i*vel;
            y=Math.sin(Math.toRadians(deg))*i*vel-0.5*9.8*Math.pow(i,2);
            System.out.println("Time: "+i+"s");
            System.out.println("x-pos: "+x+"m");
            if(y<0){
                System.out.println("y-pos: 0m");
            }
            else {
                System.out.println("y-pos: " + y + "m");
            }
        }


    }
}
