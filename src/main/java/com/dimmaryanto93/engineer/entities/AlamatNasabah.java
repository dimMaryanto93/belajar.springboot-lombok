package com.dimmaryanto93.engineer.entities;

/**
 * Created by dimmaryanto93 on 04/04/17.
 */
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
