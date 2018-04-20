package com.sv.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sv.app.dao.NcmLedgerDao;
import com.sv.app.entity.NcmLedger;

@Service
public class NcmLedgerService implements INcmLedgerService{

	@Autowired
	NcmLedgerDao ncmLedgerDao; 
	
	@Override
	public List<NcmLedger> getAllLedger() {
		
		return (List<NcmLedger>) ncmLedgerDao.findAll();
	}

	@Override
	public Object getLedgerById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addLedger() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateLedger() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteLedger() {
		// TODO Auto-generated method stub
		
	}

}
