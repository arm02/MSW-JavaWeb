/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pegawai.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author adrian
 */

@Entity
@Table(name="pegawai")

public class Pegawai {
    
    @Id
    @Column(name="nik", length = 10,nullable = false)
    private String nik;
    
     @Column(name="nama", length = 225,nullable = false)
    private String nama;
     
     @Column(name="username", length = 225,nullable = false)
    private String username;
     
    @Column(name="gaji", length = 225,nullable = false)
    private String gaji;
       
     @Column(name="telp", length = 25,nullable = false)
    private String telp;
           
    @Column(name="alamat", length = 225,nullable = false)
    private String alamat;
    
    @Column(name="jabatan", length = 25,nullable = false)
    private String jabatan;
               
    @Column(name="password", length = 25,nullable = false)
    private String password;
    
    @Column(name="role", length = 25,nullable = false)
    private String role;

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGaji() {
        return gaji;
    }

    public void setGaji(String gaji) {
        this.gaji = gaji;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    
}
