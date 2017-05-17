/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pegawai.app.controller;

import com.pegawai.app.service.JabatanService;
import com.pegawai.app.domain.Jabatan;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 *
 * @author adrian
 */
@Controller
@RequestMapping("/jabatan")
public class JabatanController {

    @Autowired
    JabatanService jabatanService;

    @RequestMapping("/list")
    public void dafatarList(ModelMap mm, Pageable page) {
        Page<Jabatan> data = jabatanService.findAll(page);
        mm.addAttribute("daftarJabatan", data);
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public void tampilkanForm(
            @RequestParam( required=false, defaultValue="-") String id, ModelMap mm) {
        Jabatan j = null;
        if (!id.equals("-")) {
            j= jabatanService.findOne(id);
        }
        
        if (j != null) {
            mm.addAttribute("jabatan", j);
        } else {
            mm.addAttribute("jabatan", new Jabatan());
        }
    }

    @RequestMapping(value = "form", method = RequestMethod.POST)
    public String prosesForm(@ModelAttribute @Valid Jabatan k, BindingResult hasilValidasi) {
        if (hasilValidasi.hasErrors()) {
            return "/jabatan/form";
        }
        jabatanService.save(k);
        return "redirect:list";
    }
    
    @RequestMapping(value = "delete", method = RequestMethod.GET)
    public String delete(@RequestParam(required = false, name = "id") Jabatan jabatan){
        if(jabatan!=null){
            jabatanService.delete(jabatan);
        }
        return "redirect:list";
    }
    

}
