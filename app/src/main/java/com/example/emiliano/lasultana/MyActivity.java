package com.example.emiliano.lasultana;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MyActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
    }

    @Override
    protected void onStop() {
        super.onStop();
        mediaPlayer.release();
        mediaPlayer = null;
    }

    public void abbassaTelevisore(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.abbassatelevisore);
        mediaPlayer.start();
    }

    public void unBacio(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bacio);
        mediaPlayer.start();
    }

    public void bimbaRincoglionita(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bimbarincoglionita);
        mediaPlayer.start();
    }

    public void buciardeBuciardi(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.buciarde);
        mediaPlayer.start();
    }

    public void cagano(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.cagano);
        mediaPlayer.start();
    }

    public void cartomantePiuLesbica(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.cartomantepiulesbica);
        mediaPlayer.start();
    }

    public void cheVoSape(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.chevosape);
        mediaPlayer.start();
    }

    public void cheVuoiSapere(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.chevuoisapere);
        mediaPlayer.start();
    }

    public void chiaramenteLimpidamente(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.chiaramentelimpidamente);
        mediaPlayer.start();
    }

    public void ciaoGioia(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ciaogioia);
        mediaPlayer.start();
    }

    public void ciaoTesoro(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ciaotesoro);
        mediaPlayer.start();
    }

    public void cinicheCinici(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.cinicheecinici);
        mediaPlayer.start();
    }

    public void cosaVuoiSapere(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.cosavuoisapere);
        mediaPlayer.start();
    }

    public void cucciola(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.cucciola);
        mediaPlayer.start();
    }

    public void cucciolaSaffica(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.cucciolasaffica);
        mediaPlayer.start();
    }

    public void daTutteLeParti(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.datuttelepartijentra);
        mediaPlayer.start();
    }

    public void discretoItaliano(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.discretoitaliano);
        mediaPlayer.start();
    }

    public void duFroci(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.dufroci);
        mediaPlayer.start();
    }

    public void eccomeQua(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.eccomequa);
        mediaPlayer.start();
    }

    public void fijiDeNa(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.fijidena);
        mediaPlayer.start();
    }

    public void forteee(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.forte);
        mediaPlayer.start();
    }

    public void inculatine(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.inculatine);
        mediaPlayer.start();
    }

    public void leccata(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.leccata);
        mediaPlayer.start();
    }

    public void maiFidaDellePersone(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.maifidadellepersone);
        mediaPlayer.start();
    }

    public void meravigliosaVoce(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.meravigliosavoce);
        mediaPlayer.start();
    }

    public void nonChiamare(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.nonchiamare);
        mediaPlayer.start();
    }

    public void nonGlieneFotte(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.nonglienefotte);
        mediaPlayer.start();
    }

    public void nonRappresentateItaliano(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.nonrappresentateitaliano);
        mediaPlayer.start();
    }

    public void occludeLeLinee(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.occludelelinee);
        mediaPlayer.start();
    }

    public void possoAncoraAndare(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.possoancoraandare);
        mediaPlayer.start();
    }

    public void pseudoapertura(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.pseudoapertura);
        mediaPlayer.start();
    }

    public void quandoSeiNata(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.quandoseinata);
        mediaPlayer.start();
    }

    public void quantoManca(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.quantomanca);
        mediaPlayer.start();
    }

    public void meSoRottaErCazzo(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.rottaercazzo);
        mediaPlayer.start();
    }

    public void saffona(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.saffona);
        mediaPlayer.start();
    }

    public void scoreggiateInFaccia(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.scureggiatenfaccia);
        mediaPlayer.start();
    }

    public void scusaIlTermine(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.scusatermine);
        mediaPlayer.start();
    }

    public void sembroNaMorta(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sembronamorta);
        mediaPlayer.start();
    }

    public void staiDormendo(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.staidormendo);
        mediaPlayer.start();
    }

    public void strillando(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.strillando);
        mediaPlayer.start();
    }

    public void tarmenteBella(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.tarmentebella);
        mediaPlayer.start();
    }

    public void telecamera(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.telecamera);
        mediaPlayer.start();
    }

    public void tiSento(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.tisento);
        mediaPlayer.start();
    }

    public void tutteCazzate(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.tuttecazzate);
        mediaPlayer.start();
    }

    public void voceAlta(View view) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.vocealta);
        mediaPlayer.start();
    }
}
