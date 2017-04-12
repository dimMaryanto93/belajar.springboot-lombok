package com.dimmaryanto93.engineer;

import com.dimmaryanto93.engineer.entities.AlamatNasabah;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by dimmaryanto93 on 12/04/17.
 */
public class AlamatNasabahTest extends TestCase {

    @Test
    public void testAlamatNasabahBandung() {
        AlamatNasabah cinunuk = new AlamatNasabah();
        cinunuk.setJalan("Jl. Bukit Indah No B8");
        cinunuk.setKabupatenKota("Kab. Bandung");
        cinunuk.setKecamantan("Cileunyi");
        cinunuk.setKelurahan("Cinunuk");
        cinunuk.setKodePos(40526);
        assertEquals(new Integer(40526), cinunuk.getKodePos());
        assertEquals("Cinunuk", cinunuk.getKelurahan());
    }
}
