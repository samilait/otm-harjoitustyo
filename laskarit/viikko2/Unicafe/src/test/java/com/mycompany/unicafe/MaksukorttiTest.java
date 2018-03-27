package com.mycompany.unicafe;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MaksukorttiTest {

    Maksukortti kortti;

    @Before
    public void setUp() {
        kortti = new Maksukortti(10);
    }

    @Test
    public void luotuKorttiOlemassa() {
        assertTrue(kortti!=null);      
    }
    
    @Test
    public void saldoOnOikein() {
        assertEquals("saldo: 10.0", kortti.toString());
    }
    
    @Test
    public void rahanLataaminenKasvattaaSaldoaOikein() {
        kortti.lataaRahaa(10);
        assertEquals("saldo: 20.0", kortti.toString());
    }

    @Test
    public void saldoVaheneeOikein() {
        kortti.otaRahaa(5);
        assertEquals("saldo: 5.0", kortti.toString());
    }

    @Test
    public void saldoEiMuutuJosEiKatetta() {
        kortti.otaRahaa(15);
        assertEquals("saldo: 10.0", kortti.toString());
    }

    @Test
    public void otaRahaaPalauttaaOikein() {
        kortti.otaRahaa(15);
        assertEquals(false, kortti.otaRahaa(15));
    }

}
