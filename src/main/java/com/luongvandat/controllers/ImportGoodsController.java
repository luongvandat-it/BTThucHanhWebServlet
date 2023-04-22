package com.luongvandat.controllers;

import com.luongvandat.models.ImportGoods;
import com.luongvandat.services.ImportGoodsServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

@Controller
@RequestMapping("/importgoods")
public class ImportGoodsController {
    private ImportGoodsServices importGoodsServices;

    public ImportGoodsController(ImportGoodsServices importGoodsServices) {
        this.importGoodsServices = importGoodsServices;
    }

    @GetMapping("")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("importgoods", importGoodsServices.findAll());
        modelAndView.setViewName("list_importgoods");
        return modelAndView;
    }

    @GetMapping("/showImportGoodsForm")
    public ModelAndView showImportGoodsForm() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("importgoods", new ImportGoods());
        modelAndView.setViewName("add_importgoods_form");
        return modelAndView;
    }

    @GetMapping("/add")
    public ModelAndView add(ImportGoods importGoods,@ModelAttribute("importDate") Date importDate) throws ParseException {
        ModelAndView modelAndView = new ModelAndView();
        importGoods.setImportDate(importDate);
        importGoodsServices.save(importGoods);
        modelAndView.setViewName("redirect:/importgoods");
        return modelAndView;
    }
}