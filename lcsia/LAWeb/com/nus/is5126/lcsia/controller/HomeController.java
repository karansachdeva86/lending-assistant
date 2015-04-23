package com.nus.is5126.lcsia.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nus.is5126.lcsia.entity.LoanProcessed;
import com.nus.is5126.lcsia.form.MasterForm;
import com.nus.is5126.lcsia.service.ICoreService;

@Controller
@RequestMapping("/smart-agent")
public class HomeController {

    @Autowired
    private ICoreService coreService;

    @RequestMapping("")
    public String smartAgentHome(ModelMap map) {

        MasterForm masterForm = new MasterForm();
        masterForm.setStateList(coreService.getStateList());

        map.addAttribute("masterForm", masterForm);

        return "home";

    }

    @RequestMapping("/submit")
    public String smartAgentSubmit(ModelMap map, @Valid MasterForm masterForm) {

        List<LoanProcessed> searchResults = coreService.getLoanResults(masterForm);
        masterForm.setStateList(coreService.getStateList());
        map.addAttribute("searchResults", searchResults);
        map.addAttribute("masterForm", masterForm);
        
        return "home";

    }

}
