package com.ahmetkaanmonun;

public class Atlar extends Hayvanlar implements IHayvan{
    public Atlar() {
    }

    public Atlar(String turAdi, double agirlik, int yas) {
        super(turAdi, agirlik, yas);
    }

    @Override
    public void getDosage(Hayvanlar hayvan) {

        if (hayvan.getYas() < 20){

            System.out.println("İlac vermemek gerekiyor.");

        }
        else{

            System.out.println("Günde iki adet ilaç alabilir.");

        }

    }

    @Override
    public void getFeedSchedule(Hayvanlar hayvan) {

        if (getAgirlik() > 500){

            System.out.println("Daha az besin almalı");

        }
        else {

            System.out.println("Daha fazla besin almalı");

        }

    }
}
