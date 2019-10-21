package com.company.model;

public class ChildFine  extends Parent {

        public Parent setName() {
            System.out.println("i'm child");
            return this;
        }

        public Parent setHand() {
            System.out.println("Parent gave me new hand");
            return this;
        }
}
