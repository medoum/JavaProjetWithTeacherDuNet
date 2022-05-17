package com.medcode;

public class Interrupteur {
    private Lampe lampe;
    private boolean position;

    public Interrupteur(Lampe lampe) {
        this.lampe = lampe;
        this.position = lampe.estAllumee();
    }
    public String getPosition(){
        if(position == true){
            return "On";
        }else{
            return "Off";
        }
    }
    public void presser(){
        lampe.modifierEtat();
        position = lampe.estAllumee();
    }
}
