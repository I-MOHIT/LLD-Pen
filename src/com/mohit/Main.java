package com.mohit;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Starting execution of the project");

        Ink i1 = new Ink();
        Ink i2 = new Ink();

        Nib n1 = new Nib();
        Nib n2 = new Nib();

        RefillPipe r1 = new RefillPipe(i1, n1);
        RefillPipe r2 = new RefillPipe(i2, n2);
        RefillPipe r3 = new RefillPipe(i1, n2);
        RefillPipe r4 = new RefillPipe(i2, n1);

        Pen p1 = new InkPen(i1, n2);
        Pen p2 = new BallPen(r1);
        Pen p3 = new InkPen(i2, n1);
        Pen p4 = new BallPen(r2);

        p1.write();
        p4.refill();
        p2.refill();
        p3.write();
        p3.refill();
        p2.write();
        p4.write();
        p1.refill();

        Pencil p5 = new Pencil(0.5);
        Chalk p6 = new Chalk("Blue");

        p5.write();
        p6.write();
        System.out.println("Ending execution of the project");
    }
}
