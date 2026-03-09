package com.example.javastudy.controlstatement;

public class For {
    public static void main(String[] args) {
        String[] colors = {"red", "blue", "green", "pink"};

        for (int i = 0; i < colors.length; i++){
            if (colors[i].equals("green")){
                break;
            }
            System.out.println("This color is " + colors[i]);
        }
    }
}
