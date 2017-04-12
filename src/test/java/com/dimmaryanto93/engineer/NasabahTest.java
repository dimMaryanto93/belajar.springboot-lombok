package com.dimmaryanto93.engineer;

import com.dimmaryanto93.engineer.entities.AlamatNasabah;
import com.dimmaryanto93.engineer.entities.Nasabah;
import junit.framework.TestCase;
import org.junit.Test;

import java.sql.Date;
import java.time.LocalDate;

/**
 * Created by dimmaryanto93 on 12/04/17.
 */
public class NasabahTest extends TestCase {

    @Test
    public void testNasabahBaros() {
        Nasabah nasabah = new Nasabah();
        nasabah.setAktif(true);
        nasabah.setAlamat(
                new AlamatNasabah(
                        "Jl. Bukit Indah",
                        "Kab. Bandung",
                        "Cileunyi",
                        "Cinunuk",
                        40526));
        nasabah.setNama("Dimas Maryanto");
        nasabah.setNomorRegister("1001000101");
        nasabah.setTanggalRegister(Date.valueOf(LocalDate.now()));
        assertEquals(new Integer(40526), nasabah.getAlamat().getKodePos());
        assertEquals("Dimas Maryanto", nasabah.getNama());
    }
}
