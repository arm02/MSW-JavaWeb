/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pegawai.app.controller;

import com.pegawai.app.domain.Jabatan;
import com.pegawai.app.domain.Pegawai;
import com.pegawai.app.service.JabatanService;
import com.pegawai.app.service.PegawaiService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author adrian
 */

@Controller
@RequestMapping("/pegawai")
public class PegawaiController {
    
    @Autowired PegawaiService pegawaiService;
    @Autowired JabatanService jabatanService;

    @RequestMapping("/list")
    public void dafatarList(ModelMap mm, Pageable page) {
        Page<Pegawai> data = pegawaiService.findAll(page);
        mm.addAttribute("daftarPegawai", data);
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public void tampilkanForm(
         @RequestParam( required=false, defaultValue="-") String id, ModelMap mm) {
        Pegawai p = null;
        if (!id.equals("-")) {
            p= pegawaiService.findOne(id);
        }
        
        if (p != null) {
            mm.addAttribute("pegawai", p);
        } else {
            mm.addAttribute("pegawai", new Pegawai());
        }
        
         Long countJabatan = jabatanService.count();
        Page<Jabatan> listJabatan = jabatanService  .findAll(new PageRequest(0, countJabatan.intValue()));
        mm.addAttribute("daftarJabatan", listJabatan);
    }

    @RequestMapping(value = "form", method = RequestMethod.POST)
    public String prosesForm(@ModelAttribute @Valid Pegawai k, BindingResult hasilValidasi) {
        if (hasilValidasi.hasErrors()) {
            return "/pegawai/form";
        }
        pegawaiService.save(k);
        return "redirect:list";
    }
    
    @RequestMapping(value = "delete", method = RequestMethod.GET)
    public String delete(@RequestParam(required = false, name = "id") Pegawai pegawai){
        if(pegawai!=null){
            pegawaiService.delete(pegawai);
        }
        return "redirect:list";
    }
    
}
