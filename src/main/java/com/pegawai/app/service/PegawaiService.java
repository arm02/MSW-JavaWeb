/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pegawai.app.service;

import com.pegawai.app.domain.Jabatan;
import com.pegawai.app.domain.Pegawai;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author adrian
 */
public interface PegawaiService extends JpaRepository<Pegawai, String> {

   


    
}
