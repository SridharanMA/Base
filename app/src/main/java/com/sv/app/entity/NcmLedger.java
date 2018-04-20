package com.sv.app.entity;



import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

@Entity(name="NcmLedger")
@Table(name="NCM_LEDGER")
public class NcmLedger implements Serializable{

    /**
     * The ledgerId.
     */
	@Id
	@Column(name="ledger_id")
    private String m_ledgerId;
    /**
     * The shortName.
     */
	@Column(name="short_name")
    private String m_shortName;
    /**
     * The description.
     */
	@Column(name="description")
    private String m_description;
    /**
     * The status.
     */
	@Column(name="status")
    private String m_status;
	
	@Column(name="app_regi_date")
	@CreatedDate
    private Date m_appRegiDate;
	
	@Column(name="app_upd_date")
    private Date m_appUpdDate;
	
	@Column(name="created_by")
	@CreatedBy
    private String m_createdBy;
	
	@Column(name="creation_date")
	@CreatedDate
    private Date m_creationDate;
	
	@Column(name="updated_by")
	@LastModifiedBy
    private String m_updatedBy;
	
	@Column(name="update_date")
	@LastModifiedDate
    private Date m_update_date;

	/**
	 * @return the m_ledgerId
	 */
	public String getM_ledgerId() {
		return m_ledgerId;
	}

	/**
	 * @param m_ledgerId the m_ledgerId to set
	 */
	public void setM_ledgerId(String m_ledgerId) {
		this.m_ledgerId = m_ledgerId;
	}

	/**
	 * @return the m_shortName
	 */
	public String getM_shortName() {
		return m_shortName;
	}

	/**
	 * @param m_shortName the m_shortName to set
	 */
	public void setM_shortName(String m_shortName) {
		this.m_shortName = m_shortName;
	}

	/**
	 * @return the m_description
	 */
	public String getM_description() {
		return m_description;
	}

	/**
	 * @param m_description the m_description to set
	 */
	public void setM_description(String m_description) {
		this.m_description = m_description;
	}

	/**
	 * @return the m_status
	 */
	public String getM_status() {
		return m_status;
	}

	/**
	 * @param m_status the m_status to set
	 */
	public void setM_status(String m_status) {
		this.m_status = m_status;
	}

	/**
	 * @return the m_appRegiDate
	 */
	public Date getM_appRegiDate() {
		return m_appRegiDate;
	}

	/**
	 * @param m_appRegiDate the m_appRegiDate to set
	 */
	public void setM_appRegiDate(Date m_appRegiDate) {
		this.m_appRegiDate = m_appRegiDate;
	}

	/**
	 * @return the m_appUpdDate
	 */
	public Date getM_appUpdDate() {
		return m_appUpdDate;
	}

	/**
	 * @param m_appUpdDate the m_appUpdDate to set
	 */
	public void setM_appUpdDate(Date m_appUpdDate) {
		this.m_appUpdDate = m_appUpdDate;
	}

	/**
	 * @return the m_createdBy
	 */
	public String getM_createdBy() {
		return m_createdBy;
	}

	/**
	 * @param m_createdBy the m_createdBy to set
	 */
	public void setM_createdBy(String m_createdBy) {
		this.m_createdBy = m_createdBy;
	}

	/**
	 * @return the m_creationDate
	 */
	public Date getM_creationDate() {
		return m_creationDate;
	}

	/**
	 * @param m_creationDate the m_creationDate to set
	 */
	public void setM_creationDate(Date m_creationDate) {
		this.m_creationDate = m_creationDate;
	}

	/**
	 * @return the m_updatedBy
	 */
	public String getM_updatedBy() {
		return m_updatedBy;
	}

	/**
	 * @param m_updatedBy the m_updatedBy to set
	 */
	public void setM_updatedBy(String m_updatedBy) {
		this.m_updatedBy = m_updatedBy;
	}

	/**
	 * @return the m_update_date
	 */
	public Date getM_update_date() {
		return m_update_date;
	}

	/**
	 * @param m_update_date the m_update_date to set
	 */
	public void setM_update_date(Date m_update_date) {
		this.m_update_date = m_update_date;
	}

	
}
