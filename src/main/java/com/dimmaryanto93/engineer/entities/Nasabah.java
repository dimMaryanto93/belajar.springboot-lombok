package com.dimmaryanto93.engineer.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * Created by dimmaryanto93 on 04/04/17.
 */
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
