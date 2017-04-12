# POJO (Plain Old Java Object)

Pada dasarnya, merancang object di java supaya di enkapsulasi (setter & getter) adalah proses yang paling 
mudah untuk mengakses sebuah variable namun kebanyakan membuatnya membutuhkan waktu (jika tampa generator seperti di text editor Netbeans, Eclipse, atau IDEA dan lainnya)
, selain membutuhkan waktu terkadang kita juga malas jika terjadi perubahan harus hapus dan buat ulang method assessor tersebut
 contohnya seperti berikut:
 
 ```java
package com.dimmaryanto93.engineer.entities;

public class AlamatNasabah {

    private String jalan;
    private String kabupatenKota;
    private String kecamantan;
    private String kelurahan;
    private Integer kodePos;

    public AlamatNasabah() {
    }

    public AlamatNasabah(String jalan, String kabupatenKota, String kecamantan, String kelurahan, Integer kodePos) {
        this.jalan = jalan;
        this.kabupatenKota = kabupatenKota;
        this.kecamantan = kecamantan;
        this.kelurahan = kelurahan;
        this.kodePos = kodePos;
    }

    public String getJalan() {
        return jalan;
    }

    public void setJalan(String jalan) {
        this.jalan = jalan;
    }

    public String getKabupatenKota() {
        return kabupatenKota;
    }

    public void setKabupatenKota(String kabupatenKota) {
        this.kabupatenKota = kabupatenKota;
    }

    public String getKecamantan() {
        return kecamantan;
    }

    public void setKecamantan(String kecamantan) {
        this.kecamantan = kecamantan;
    }

    public String getKelurahan() {
        return kelurahan;
    }

    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    public Integer getKodePos() {
        return kodePos;
    }

    public void setKodePos(Integer kodePos) {
        this.kodePos = kodePos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AlamatNasabah)) return false;

        AlamatNasabah that = (AlamatNasabah) o;

        if (getJalan() != null ? !getJalan().equals(that.getJalan()) : that.getJalan() != null) return false;
        if (getKabupatenKota() != null ? !getKabupatenKota().equals(that.getKabupatenKota()) : that.getKabupatenKota() != null)
            return false;
        if (getKecamantan() != null ? !getKecamantan().equals(that.getKecamantan()) : that.getKecamantan() != null)
            return false;
        if (getKelurahan() != null ? !getKelurahan().equals(that.getKelurahan()) : that.getKelurahan() != null)
            return false;
        return getKodePos() != null ? getKodePos().equals(that.getKodePos()) : that.getKodePos() == null;
    }

    @Override
    public int hashCode() {
        int result = getJalan() != null ? getJalan().hashCode() : 0;
        result = 31 * result + (getKabupatenKota() != null ? getKabupatenKota().hashCode() : 0);
        result = 31 * result + (getKecamantan() != null ? getKecamantan().hashCode() : 0);
        result = 31 * result + (getKelurahan() != null ? getKelurahan().hashCode() : 0);
        result = 31 * result + (getKodePos() != null ? getKodePos().hashCode() : 0);
        return result;
    }
}
```

Dengan mebuat kelas tersebut kita bisa menggunakanya dengan cara seperti berikut:

```java
package com.dimmaryanto93.engineer;

import com.dimmaryanto93.engineer.entities.AlamatNasabah;
import junit.framework.TestCase;
import org.junit.Test;

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
```

Sekarang kita bisa membuat semua itu tanpa menulis method getter dan setter dengan menggunakan dependency `project lombok`
seperti berikut:

```java
package com.dimmaryanto93.engineer.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Nasabah {
    private String id;
    private String nama;
    private String nomorRegister;
    private Date tanggalRegister;
    private AlamatNasabah alamat;
    private boolean aktif;
} 
```

Kita hanya perlu menginmport `@Data`, `@AllArgsConstructor` (optional) dan `@NoArgsConstructor` (optional)
untuk penggunanya kurang lebih sama seperti ini:

```java
package com.dimmaryanto93.engineer;

import com.dimmaryanto93.engineer.entities.AlamatNasabah;
import com.dimmaryanto93.engineer.entities.Nasabah;
import junit.framework.TestCase;
import org.junit.Test;

import java.sql.Date;
import java.time.LocalDate;

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
```