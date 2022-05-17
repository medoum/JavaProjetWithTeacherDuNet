package com.medcode;

public class A {
    public int att1;
    private String att2;

    public A(int att1,String att2){
        this.att1 = att1;
        this.att2 = att2;


    }
    public void toto(){
        for (int i=0; i<4; i++){
            class B{
                public B(){
                    System.out.println("Je suis le construteur de la class B");
                }
            }
          new B();
        }

    }
     static class C{
        public C() {
            System.out.println("je suis le constructeur de la class c");

        }
    }
}
