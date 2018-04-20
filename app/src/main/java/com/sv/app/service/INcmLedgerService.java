package com.sv.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sv.app.entity.NcmLedger;


public interface INcmLedgerService {
	List<NcmLedger> getAllLedger();
	Object getLedgerById();
	void addLedger();
	void updateLedger();
	void deleteLedger();
}
