package com.sv.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sv.app.entity.NcmLedger;
import com.sv.app.service.INcmLedgerService;

@RestController
@RequestMapping("/ledgerquery")
public class HomeController {
	
	@Autowired
	INcmLedgerService ncmLedgerService;
	
    @RequestMapping("/ang")
    public String viewIndex() {
        return "index";
    }
    @RequestMapping("/home")
    public String viewHome() {
    	return "home";
    }
    
    @RequestMapping("/query")
    public List<NcmLedger> query(){
    	StringBuffer sb = new StringBuffer();
    	List<NcmLedger> li = ncmLedgerService.getAllLedger();
    	 //return new ModelAndView("/views/queryResult.html", "result", li);
    	return li;
    }
}