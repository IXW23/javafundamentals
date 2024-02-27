package com.fundamentals.labs;

public class LoopingLab {
    public void whileLoop() {
        int num = 0;
        while(num <= 15) {
            if(num == 5) {
                System.out.print("Five, ");
            } else if(num == 10) {
                System.out.print("Ten, ");
            } else if(num == 15) {
                System.out.print("Fifteen ");
            } else {
                System.out.print(num + ", ");
            }
            num++;
        }
    }

    public void forLoop() {
        for(int i = 0; i <= 30; i++) {
            if(i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    public static void main(String[] args) {
        LoopingLab myLoopingLab = new LoopingLab();
        myLoopingLab.whileLoop();
        myLoopingLab.forLoop();
    }
}
