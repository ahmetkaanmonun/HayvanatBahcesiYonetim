package com.ahmetkaanmonun;

public class Kemirgenler extends Hayvanlar implements IHayvan{
    public Kemirgenler() {
    }

    public Kemirgenler(String turAdi, double agirlik, int yas) {
        super(turAdi, agirlik, yas);
    }

    @Override
    public void getDosage(Hayvanlar hayvan) {

        if (hayvan.getYas() < 5){

            System.out.println("İlac vermemek gerekiyor.");

        }
        else{

            System.out.println("Günde iki adet ilaç alabilir.");

        }
    }

    @Override
    public void getFeedSchedule(Hayvanlar hayvan) {

        if (getAgirlik() > 5){

            System.out.println("Daha az besin almalı");

        }
        else {

            System.out.println("Daha fazla besin almalı");

        }
    }
}
