package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
//commit on feature 3
    public static void main(String[] args) {
        int nbZones = sc.nextInt();
        if(nbZones==0){
            System.out.println(0);
        }else if(nbZones > 0) {
            if (nbZones <24) {
                System.out.println(0 + nbZones);
            } else if(nbZones==24){
                System.out.println(0);
            }else{
                System.out.println(nbZones-24);
            }
        }else{
            if(nbZones==-24){
                System.out.println(0);
            }else if(nbZones>-24) {
                System.out.println(24+nbZones);
            }else{
                System.out.println(24+(nbZones+24));
            }
        }

    }
}