package com.company;

class WhitePage {
    int age = 0;
    String number;

    public void setOperands(int age, String number) {
        this.age = age;
        this.number = number;
    }

    public void ageAdd() {
        this.age++;
    }
}

public class Main {

    public static void main(String[] args) {
        int a = 27;
        String b = "01083876368";
        WhitePage w1 = new WhitePage();

        w1.setOperands(a, b);
        w1.ageAdd();

        System.out.println(w1.age);
    }
}