package com.sv.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sv.app.entity.NcmLedger;
@Transactional
@Repository
public class NcmLedgerDao implements INcmLedgerDao{

/*	@Autowired
	Session session;*/
	
	@PersistenceContext	
	private EntityManager entityManager;

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteInBatch(Iterable<NcmLedger> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<NcmLedger> findAll() {
		String hql = "FROM NcmLedger";
		return (List<NcmLedger>) entityManager.createQuery(hql).getResultList();
		//return NcmLedgerGen.class;
	}

	@Override
	public List<NcmLedger> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NcmLedger> findAll(Iterable<String> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public NcmLedger getOne(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends NcmLedger> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends NcmLedger> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<NcmLedger> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(NcmLedger entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends NcmLedger> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public NcmLedger findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends NcmLedger> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends NcmLedger> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends NcmLedger> List<S> findAll(Example<S> arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends NcmLedger> long count(Example<S> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends NcmLedger> boolean exists(Example<S> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends NcmLedger> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends NcmLedger> S findOne(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
