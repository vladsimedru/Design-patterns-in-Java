package com.company;

public class Main {

    public static void main(String[] args) {
        LaunchOrder.Builder builder = new LaunchOrder.Builder();

        builder.bread("Lae Pecu").condiments("Rozmarin").dressing("Cartofi prajiti").meat("Ceafa de porc");

        LaunchOrder launchOrder = builder.build();

        System.out.println(launchOrder.getBread());
        System.out.println(launchOrder.getCondiments());
        System.out.println(launchOrder.getDressing());
        System.out.println(launchOrder.getMeat());
    }
}
