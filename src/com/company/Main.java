package com.company;

public class Main {

    public static <Farm1> void main(String[] args) {

        Cow cow = new Cow("Bessie","famale",400,5);

        System.out.println("Cow NickName: " + cow.getNickName() +"\n"+ "Cow Gender: " + cow.getGender() + "\n"+ "Cow age: " + cow.getAge()+ "\n" +"Cow Weight: " + cow.getWeight());


         System.out.println("===========================================================================================");


        Sheep sheep = new Sheep("Jerry","famale",70,3);

        System.out.println("Sheep NickName: " + sheep.getNickName() +"\n"+ "Sheep Gender: " + sheep.getGender() + "\n"+ "Sheep age: " + sheep.getAge()+ "\n" +"Sheep Weight: " + sheep.getWeight());


        System.out.println("===========================================================================================");


        Horse horse = new Horse("Rosie","famale",450,5);

        System.out.println("Horse NickName: " + horse.getNickName() +"\n"+ "Horse Gender: " + horse.getGender() + "\n"+ "Horse age: " + horse.getAge()+ "\n" +"Horse Weight: " + horse.getWeight());


        System.out.println("===========================================================================================");


        Farm farm = new Farm("Baraka","selo Barskoon ul: Akuluev 56","6 cows","3 horse","4 sheep");

        System.out.println("OwerName: "+farm.getOwnerName()+"\n"+"Adress: "+farm.getAddress() +"\n"+"Cows: "+ farm.getCows() + "\n"+"Horses: "+ farm.getHorses()+"\n"+"Sheep: "+farm.getSheeps());

        System.out.println("===========================================================================================");


        String Farm1[] = new String[10];

        Farm1[0] = "Sheep1";
        Farm1[1] = "Sheep2";
        Farm1[2] = "Sheep3";
        Farm1[3] = "Cow1";
        Farm1[4] = "Cow2";
        Farm1[5] = "Cow3";
        Farm1[6] = "Cow4";
        Farm1[7] = "Cow5";
        Farm1[8] = "Horse1";
        Farm1[9] = "Horse2";

        for (String s:Farm1) {
            System.out.println("Farm 1: " + s);
        }
        System.out.println("===========================================================================================");


        String Farm2[] = new String[3];
        Farm2[0] = "Sheep";
        Farm2[1] = "Cow";
        Farm2[2] = "Horse";

        for (String c:Farm2) {
            System.out.println("Farm 2: " + c);
        }
    }
}

