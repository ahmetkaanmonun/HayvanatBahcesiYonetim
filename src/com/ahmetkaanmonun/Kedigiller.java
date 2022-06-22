package com.ahmetkaanmonun;

public class Kedigiller extends Hayvanlar implements IHayvan{
    public Kedigiller() {
    }

    public Kedigiller(String turAdi, double agirlik, int yas) {
        super(turAdi, agirlik, yas);
    }

    @Override
    public void getDosage(Hayvanlar hayvan) {

        if (hayvan.getYas() < 10){

            System.out.println("İlac vermemek gerekiyor.");

        }
        else{

            System.out.println("Günde iki adet ilaç alabilir.");

        }


    }

    @Override
    public void getFeedSchedule(Hayvanlar hayvan) {

        if (getAgirlik() > 30){

            System.out.println("Daha az besin almalı");

        }
        else {

            System.out.println("Daha fazla besin almalı");

        }
    }
}
