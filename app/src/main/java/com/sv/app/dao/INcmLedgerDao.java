package com.sv.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sv.app.entity.NcmLedger;


public interface INcmLedgerDao extends JpaRepository<NcmLedger, String> {

	
}
