package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// Girilen mesafe yaş ve yön tipine göre uçak bileti fiyatı hesaplayan program
        double pricePerDistance, distance, age, price=0;
        int option;
        pricePerDistance=0.10;
    Scanner input=new Scanner(System.in);
    System.out.print("Mesafe bilgisini kilometre cinsinden giriniz: ");
        distance=input.nextDouble();
        System.out.print("Yaşınızı giriniz: ");
        age=input.nextDouble();
        System.out.println("1-Tek Yön \n2-Gidiş-Dönüş");
        System.out.print("Yolculuk tipinizi giriniz: ");
        option=input.nextInt();
        if(option==1){price=distance*pricePerDistance;}
        else if(option==2){price=distance*pricePerDistance*2;}
        if(distance>0 && age>0 && option==1 || option==2){
            if(age<12){
                price=price-(price*50/100);
            }
            else if(age>=12 && age<24){
                price=price-(price*10/100);
            }
            else if(age>65) {
                price = price-(price * 30 / 100);
            }
        }
        else{
            System.out.println("Hatalı Veri Girdiniz!!!");
            System.exit(0);
        }
         if(option==2){
            price=price-(price*20/100);
        }


        System.out.println("Toplam Tutar: "+price);


    }
}
