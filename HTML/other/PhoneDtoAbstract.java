/*
 * Copyright (c) 2012 NewDaysys Corporation
 *
 */
package selftantei.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>DTO�N���X</B>.
 * <BR>�ڍא��� �F<BR>
 * <UL>
 *  <LI> �f�[�^�x�[�X�Ɋi�[����Ă��郌�R�[�h��\���܂��B
 *  <LI> �e�[�u�����F�@��}�X�^
 * </UL>
 *@author NewDaysys
 *@version 1.0
 */
public class PhoneDtoAbstract implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * property of PHONE.PHONE_NO
	 * ���ږ� �F �d�b�ԍ�
	 * ���l�@ �F 
	 */
	private java.lang.String PHONE_NO;

	/**
	 * property of PHONE.PHONE_NAME
	 * ���ږ� �F �[����
	 * ���l�@ �F 
	 */
	private java.lang.String PHONE_NAME;

	/**
	 * property of PHONE.PHONE_ID
	 * ���ږ� �F �@��ID
	 * ���l�@ �F 
	 */
	private java.lang.String PHONE_ID;

	/**
	 * property of PHONE.PHONE_PASS
	 * ���ږ� �F �@��p�X���[�h
	 * ���l�@ �F 
	 */
	private java.lang.String PHONE_PASS;

	/**
	 * property of PHONE.USER_NAME
	 * ���ږ� �F ���q�l��
	 * ���l�@ �F 
	 */
	private java.lang.String USER_NAME;

	/**
	 * property of PHONE.LOGIN_URL
	 * ���ږ� �F ���O�C���pURL
	 * ���l�@ �F 
	 */
	private java.lang.String LOGIN_URL;

	/**
	 * property of PHONE.EXPIRE
	 * ���ږ� �F �_��I����
	 * ���l�@ �F 
	 */
	private java.util.Date EXPIRE;

	/**
	 * property of PHONE.SCHEDULE1
	 * ���ږ� �F �X�P�W���[��1�g�p�t���O
	 * ���l�@ �F 0�F���g�p 1�F�g�p
	 */
	private int SCHEDULE1;

	/**
	 * property of PHONE.SCHEDULE1_WEEK
	 * ���ږ� �F �X�P�W���[��1�ݒ�j��
	 * ���l�@ �F 
	 */
	private int SCHEDULE1_WEEK;

	/**
	 * property of PHONE.SCHEDULE1_TIME_FROM
	 * ���ږ� �F �X�P�W���[��1�ݒ莞�ԊJ�n
	 * ���l�@ �F 
	 */
	private java.util.Date SCHEDULE1_TIME_FROM;

	/**
	 * property of PHONE.SCHEDULE1_TIME_TO
	 * ���ږ� �F �X�P�W���[��1�ݒ莞�ԏI��
	 * ���l�@ �F 
	 */
	private java.util.Date SCHEDULE1_TIME_TO;

	/**
	 * property of PHONE.SCHEDULE1_INTERVAL
	 * ���ږ� �F �X�P�W���[��1�ݒ�Ԋu
	 * ���l�@ �F 
	 */
	private int SCHEDULE1_INTERVAL;

	/**
	 * property of PHONE.SCHEDULE2
	 * ���ږ� �F �X�P�W���[��2�g�p�t���O
	 * ���l�@ �F 0�F���g�p 1�F�g�p
	 */
	private int SCHEDULE2;

	/**
	 * property of PHONE.SCHEDULE2_WEEK
	 * ���ږ� �F �X�P�W���[��2�ݒ�j��
	 * ���l�@ �F 
	 */
	private int SCHEDULE2_WEEK;

	/**
	 * property of PHONE.SCHEDULE2_TIME
	 * ���ږ� �F �X�P�W���[��2�ݒ莞��
	 * ���l�@ �F 
	 */
	private java.util.Date SCHEDULE2_TIME;

	/**
	 * property of PHONE.SCHEDULE3
	 * ���ږ� �F �X�P�W���[��3�g�p�t���O
	 * ���l�@ �F 0�F���g�p 1�F�g�p
	 */
	private int SCHEDULE3;

	/**
	 * property of PHONE.SCHEDULE3_WEEK
	 * ���ږ� �F �X�P�W���[��3�ݒ�j��
	 * ���l�@ �F 
	 */
	private int SCHEDULE3_WEEK;

	/**
	 * property of PHONE.SCHEDULE3_TIME
	 * ���ږ� �F �X�P�W���[��3�ݒ莞��
	 * ���l�@ �F 
	 */
	private java.util.Date SCHEDULE3_TIME;

	/**
	 * property of PHONE.SCHEDULE4
	 * ���ږ� �F �X�P�W���[��4�g�p�t���O
	 * ���l�@ �F 0�F���g�p 1�F�g�p
	 */
	private int SCHEDULE4;

	/**
	 * property of PHONE.SCHEDULE4_WEEK
	 * ���ږ� �F �X�P�W���[��4�ݒ�j��
	 * ���l�@ �F 
	 */
	private int SCHEDULE4_WEEK;

	/**
	 * property of PHONE.SCHEDULE4_TIME
	 * ���ږ� �F �X�P�W���[��4�ݒ莞��
	 * ���l�@ �F 
	 */
	private java.util.Date SCHEDULE4_TIME;

	/**
	 * property of PHONE.OPTION1
	 * ���ږ� �F �I�v�V�����_��1
	 * ���l�@ �F 0�F���g�p 1�F�g�p
	 */
	private int OPTION1;

	/**
	 * property of PHONE.OPTION2
	 * ���ږ� �F �I�v�V�����_��2
	 * ���l�@ �F 0�F���g�p 1�F�g�p
	 */
	private int OPTION2;

	/**
	 * property of PHONE.SEARCH_CNT
	 * ���ږ� �F ������
	 * ���l�@ �F 
	 */
	private int SEARCH_CNT;

	/**
	 * property of PHONE.CREATE_DATETIME
	 * ���ږ� �F �쐬��
	 * ���l�@ �F 
	 */
	private java.util.Date CREATE_DATETIME;

	/**
	 * property of PHONE.CREATE_USER
	 * ���ږ� �F �쐬��
	 * ���l�@ �F 
	 */
	private java.lang.String CREATE_USER;

	/**
	 * property of PHONE.UPDATE_DATETIME
	 * ���ږ� �F �X�V��
	 * ���l�@ �F 
	 */
	private java.util.Date UPDATE_DATETIME;

	/**
	 * property of PHONE.UPDATE_USER
	 * ���ږ� �F �X�V��
	 * ���l�@ �F 
	 */
	private java.lang.String UPDATE_USER;


	/**
	 * get PHONE of PHONE.PHONE_NO
	 * ���ږ� �F �d�b�ԍ�
	 * @return {$p.PHONE_NO}
	 */
	public java.lang.String getPHONE_NO() {
		return this.PHONE_NO;
	}

	/**
	 * set PHONE of PHONE.PHONE_NO
	 * ���ږ� �F �d�b�ԍ�
	 * @param PHONE_NO
	 */
	@JsonProperty("PHONE_NO")
	public void setPHONE_NO(final java.lang.String PHONE_NO) {
		this.PHONE_NO = PHONE_NO;
	}


	/**
	 * get PHONE of PHONE.PHONE_NAME
	 * ���ږ� �F �[����
	 * @return {$p.PHONE_NAME}
	 */
	public java.lang.String getPHONE_NAME() {
		return this.PHONE_NAME;
	}

	/**
	 * set PHONE of PHONE.PHONE_NAME
	 * ���ږ� �F �[����
	 * @param PHONE_NAME
	 */
	@JsonProperty("PHONE_NAME")
	public void setPHONE_NAME(final java.lang.String PHONE_NAME) {
		this.PHONE_NAME = PHONE_NAME;
	}


	/**
	 * get PHONE of PHONE.PHONE_ID
	 * ���ږ� �F �@��ID
	 * @return {$p.PHONE_ID}
	 */
	public java.lang.String getPHONE_ID() {
		return this.PHONE_ID;
	}

	/**
	 * set PHONE of PHONE.PHONE_ID
	 * ���ږ� �F �@��ID
	 * @param PHONE_ID
	 */
	@JsonProperty("PHONE_ID")
	public void setPHONE_ID(final java.lang.String PHONE_ID) {
		this.PHONE_ID = PHONE_ID;
	}


	/**
	 * get PHONE of PHONE.PHONE_PASS
	 * ���ږ� �F �@��p�X���[�h
	 * @return {$p.PHONE_PASS}
	 */
	public java.lang.String getPHONE_PASS() {
		return this.PHONE_PASS;
	}

	/**
	 * set PHONE of PHONE.PHONE_PASS
	 * ���ږ� �F �@��p�X���[�h
	 * @param PHONE_PASS
	 */
	@JsonProperty("PHONE_PASS")
	public void setPHONE_PASS(final java.lang.String PHONE_PASS) {
		this.PHONE_PASS = PHONE_PASS;
	}


	/**
	 * get PHONE of PHONE.USER_NAME
	 * ���ږ� �F ���q�l��
	 * @return {$p.USER_NAME}
	 */
	public java.lang.String getUSER_NAME() {
		return this.USER_NAME;
	}

	/**
	 * set PHONE of PHONE.USER_NAME
	 * ���ږ� �F ���q�l��
	 * @param USER_NAME
	 */
	@JsonProperty("USER_NAME")
	public void setUSER_NAME(final java.lang.String USER_NAME) {
		this.USER_NAME = USER_NAME;
	}


	/**
	 * get PHONE of PHONE.LOGIN_URL
	 * ���ږ� �F ���O�C���pURL
	 * @return {$p.LOGIN_URL}
	 */
	public java.lang.String getLOGIN_URL() {
		return this.LOGIN_URL;
	}

	/**
	 * set PHONE of PHONE.LOGIN_URL
	 * ���ږ� �F ���O�C���pURL
	 * @param LOGIN_URL
	 */
	@JsonProperty("LOGIN_URL")
	public void setLOGIN_URL(final java.lang.String LOGIN_URL) {
		this.LOGIN_URL = LOGIN_URL;
	}


	/**
	 * get PHONE of PHONE.EXPIRE
	 * ���ږ� �F �_��I����
	 * @return {$p.EXPIRE}
	 */
	public java.util.Date getEXPIRE() {
		return this.EXPIRE;
	}

	/**
	 * set PHONE of PHONE.EXPIRE
	 * ���ږ� �F �_��I����
	 * @param EXPIRE
	 */
	@JsonProperty("EXPIRE")
	public void setEXPIRE(final java.util.Date EXPIRE) {
		this.EXPIRE = EXPIRE;
	}


	/**
	 * get PHONE of PHONE.SCHEDULE1
	 * ���ږ� �F �X�P�W���[��1�g�p�t���O
	 * @return {$p.SCHEDULE1}
	 */
	public int getSCHEDULE1() {
		return this.SCHEDULE1;
	}

	/**
	 * set PHONE of PHONE.SCHEDULE1
	 * ���ږ� �F �X�P�W���[��1�g�p�t���O
	 * @param SCHEDULE1
	 */
	@JsonProperty("SCHEDULE1")
	public void setSCHEDULE1(final int SCHEDULE1) {
		this.SCHEDULE1 = SCHEDULE1;
	}


	/**
	 * get PHONE of PHONE.SCHEDULE1_WEEK
	 * ���ږ� �F �X�P�W���[��1�ݒ�j��
	 * @return {$p.SCHEDULE1_WEEK}
	 */
	public int getSCHEDULE1_WEEK() {
		return this.SCHEDULE1_WEEK;
	}

	/**
	 * set PHONE of PHONE.SCHEDULE1_WEEK
	 * ���ږ� �F �X�P�W���[��1�ݒ�j��
	 * @param SCHEDULE1_WEEK
	 */
	@JsonProperty("SCHEDULE1_WEEK")
	public void setSCHEDULE1_WEEK(final int SCHEDULE1_WEEK) {
		this.SCHEDULE1_WEEK = SCHEDULE1_WEEK;
	}


	/**
	 * get PHONE of PHONE.SCHEDULE1_TIME_FROM
	 * ���ږ� �F �X�P�W���[��1�ݒ莞�ԊJ�n
	 * @return {$p.SCHEDULE1_TIME_FROM}
	 */
	public java.util.Date getSCHEDULE1_TIME_FROM() {
		return this.SCHEDULE1_TIME_FROM;
	}

	/**
	 * set PHONE of PHONE.SCHEDULE1_TIME_FROM
	 * ���ږ� �F �X�P�W���[��1�ݒ莞�ԊJ�n
	 * @param SCHEDULE1_TIME_FROM
	 */
	@JsonProperty("SCHEDULE1_TIME_FROM")
	public void setSCHEDULE1_TIME_FROM(final java.util.Date SCHEDULE1_TIME_FROM) {
		this.SCHEDULE1_TIME_FROM = SCHEDULE1_TIME_FROM;
	}


	/**
	 * get PHONE of PHONE.SCHEDULE1_TIME_TO
	 * ���ږ� �F �X�P�W���[��1�ݒ莞�ԏI��
	 * @return {$p.SCHEDULE1_TIME_TO}
	 */
	public java.util.Date getSCHEDULE1_TIME_TO() {
		return this.SCHEDULE1_TIME_TO;
	}

	/**
	 * set PHONE of PHONE.SCHEDULE1_TIME_TO
	 * ���ږ� �F �X�P�W���[��1�ݒ莞�ԏI��
	 * @param SCHEDULE1_TIME_TO
	 */
	@JsonProperty("SCHEDULE1_TIME_TO")
	public void setSCHEDULE1_TIME_TO(final java.util.Date SCHEDULE1_TIME_TO) {
		this.SCHEDULE1_TIME_TO = SCHEDULE1_TIME_TO;
	}


	/**
	 * get PHONE of PHONE.SCHEDULE1_INTERVAL
	 * ���ږ� �F �X�P�W���[��1�ݒ�Ԋu
	 * @return {$p.SCHEDULE1_INTERVAL}
	 */
	public int getSCHEDULE1_INTERVAL() {
		return this.SCHEDULE1_INTERVAL;
	}

	/**
	 * set PHONE of PHONE.SCHEDULE1_INTERVAL
	 * ���ږ� �F �X�P�W���[��1�ݒ�Ԋu
	 * @param SCHEDULE1_INTERVAL
	 */
	@JsonProperty("SCHEDULE1_INTERVAL")
	public void setSCHEDULE1_INTERVAL(final int SCHEDULE1_INTERVAL) {
		this.SCHEDULE1_INTERVAL = SCHEDULE1_INTERVAL;
	}


	/**
	 * get PHONE of PHONE.SCHEDULE2
	 * ���ږ� �F �X�P�W���[��2�g�p�t���O
	 * @return {$p.SCHEDULE2}
	 */
	public int getSCHEDULE2() {
		return this.SCHEDULE2;
	}

	/**
	 * set PHONE of PHONE.SCHEDULE2
	 * ���ږ� �F �X�P�W���[��2�g�p�t���O
	 * @param SCHEDULE2
	 */
	@JsonProperty("SCHEDULE2")
	public void setSCHEDULE2(final int SCHEDULE2) {
		this.SCHEDULE2 = SCHEDULE2;
	}


	/**
	 * get PHONE of PHONE.SCHEDULE2_WEEK
	 * ���ږ� �F �X�P�W���[��2�ݒ�j��
	 * @return {$p.SCHEDULE2_WEEK}
	 */
	public int getSCHEDULE2_WEEK() {
		return this.SCHEDULE2_WEEK;
	}

	/**
	 * set PHONE of PHONE.SCHEDULE2_WEEK
	 * ���ږ� �F �X�P�W���[��2�ݒ�j��
	 * @param SCHEDULE2_WEEK
	 */
	@JsonProperty("SCHEDULE2_WEEK")
	public void setSCHEDULE2_WEEK(final int SCHEDULE2_WEEK) {
		this.SCHEDULE2_WEEK = SCHEDULE2_WEEK;
	}


	/**
	 * get PHONE of PHONE.SCHEDULE2_TIME
	 * ���ږ� �F �X�P�W���[��2�ݒ莞��
	 * @return {$p.SCHEDULE2_TIME}
	 */
	public java.util.Date getSCHEDULE2_TIME() {
		return this.SCHEDULE2_TIME;
	}

	/**
	 * set PHONE of PHONE.SCHEDULE2_TIME
	 * ���ږ� �F �X�P�W���[��2�ݒ莞��
	 * @param SCHEDULE2_TIME
	 */
	@JsonProperty("SCHEDULE2_TIME")
	public void setSCHEDULE2_TIME(final java.util.Date SCHEDULE2_TIME) {
		this.SCHEDULE2_TIME = SCHEDULE2_TIME;
	}


	/**
	 * get PHONE of PHONE.SCHEDULE3
	 * ���ږ� �F �X�P�W���[��3�g�p�t���O
	 * @return {$p.SCHEDULE3}
	 */
	public int getSCHEDULE3() {
		return this.SCHEDULE3;
	}

	/**
	 * set PHONE of PHONE.SCHEDULE3
	 * ���ږ� �F �X�P�W���[��3�g�p�t���O
	 * @param SCHEDULE3
	 */
	@JsonProperty("SCHEDULE3")
	public void setSCHEDULE3(final int SCHEDULE3) {
		this.SCHEDULE3 = SCHEDULE3;
	}


	/**
	 * get PHONE of PHONE.SCHEDULE3_WEEK
	 * ���ږ� �F �X�P�W���[��3�ݒ�j��
	 * @return {$p.SCHEDULE3_WEEK}
	 */
	public int getSCHEDULE3_WEEK() {
		return this.SCHEDULE3_WEEK;
	}

	/**
	 * set PHONE of PHONE.SCHEDULE3_WEEK
	 * ���ږ� �F �X�P�W���[��3�ݒ�j��
	 * @param SCHEDULE3_WEEK
	 */
	@JsonProperty("SCHEDULE3_WEEK")
	public void setSCHEDULE3_WEEK(final int SCHEDULE3_WEEK) {
		this.SCHEDULE3_WEEK = SCHEDULE3_WEEK;
	}


	/**
	 * get PHONE of PHONE.SCHEDULE3_TIME
	 * ���ږ� �F �X�P�W���[��3�ݒ莞��
	 * @return {$p.SCHEDULE3_TIME}
	 */
	public java.util.Date getSCHEDULE3_TIME() {
		return this.SCHEDULE3_TIME;
	}

	/**
	 * set PHONE of PHONE.SCHEDULE3_TIME
	 * ���ږ� �F �X�P�W���[��3�ݒ莞��
	 * @param SCHEDULE3_TIME
	 */
	@JsonProperty("SCHEDULE3_TIME")
	public void setSCHEDULE3_TIME(final java.util.Date SCHEDULE3_TIME) {
		this.SCHEDULE3_TIME = SCHEDULE3_TIME;
	}


	/**
	 * get PHONE of PHONE.SCHEDULE4
	 * ���ږ� �F �X�P�W���[��4�g�p�t���O
	 * @return {$p.SCHEDULE4}
	 */
	public int getSCHEDULE4() {
		return this.SCHEDULE4;
	}

	/**
	 * set PHONE of PHONE.SCHEDULE4
	 * ���ږ� �F �X�P�W���[��4�g�p�t���O
	 * @param SCHEDULE4
	 */
	@JsonProperty("SCHEDULE4")
	public void setSCHEDULE4(final int SCHEDULE4) {
		this.SCHEDULE4 = SCHEDULE4;
	}


	/**
	 * get PHONE of PHONE.SCHEDULE4_WEEK
	 * ���ږ� �F �X�P�W���[��4�ݒ�j��
	 * @return {$p.SCHEDULE4_WEEK}
	 */
	public int getSCHEDULE4_WEEK() {
		return this.SCHEDULE4_WEEK;
	}

	/**
	 * set PHONE of PHONE.SCHEDULE4_WEEK
	 * ���ږ� �F �X�P�W���[��4�ݒ�j��
	 * @param SCHEDULE4_WEEK
	 */
	@JsonProperty("SCHEDULE4_WEEK")
	public void setSCHEDULE4_WEEK(final int SCHEDULE4_WEEK) {
		this.SCHEDULE4_WEEK = SCHEDULE4_WEEK;
	}


	/**
	 * get PHONE of PHONE.SCHEDULE4_TIME
	 * ���ږ� �F �X�P�W���[��4�ݒ莞��
	 * @return {$p.SCHEDULE4_TIME}
	 */
	public java.util.Date getSCHEDULE4_TIME() {
		return this.SCHEDULE4_TIME;
	}

	/**
	 * set PHONE of PHONE.SCHEDULE4_TIME
	 * ���ږ� �F �X�P�W���[��4�ݒ莞��
	 * @param SCHEDULE4_TIME
	 */
	@JsonProperty("SCHEDULE4_TIME")
	public void setSCHEDULE4_TIME(final java.util.Date SCHEDULE4_TIME) {
		this.SCHEDULE4_TIME = SCHEDULE4_TIME;
	}


	/**
	 * get PHONE of PHONE.OPTION1
	 * ���ږ� �F �I�v�V�����_��1
	 * @return {$p.OPTION1}
	 */
	public int getOPTION1() {
		return this.OPTION1;
	}

	/**
	 * set PHONE of PHONE.OPTION1
	 * ���ږ� �F �I�v�V�����_��1
	 * @param OPTION1
	 */
	@JsonProperty("OPTION1")
	public void setOPTION1(final int OPTION1) {
		this.OPTION1 = OPTION1;
	}


	/**
	 * get PHONE of PHONE.OPTION2
	 * ���ږ� �F �I�v�V�����_��2
	 * @return {$p.OPTION2}
	 */
	public int getOPTION2() {
		return this.OPTION2;
	}

	/**
	 * set PHONE of PHONE.OPTION2
	 * ���ږ� �F �I�v�V�����_��2
	 * @param OPTION2
	 */
	@JsonProperty("OPTION2")
	public void setOPTION2(final int OPTION2) {
		this.OPTION2 = OPTION2;
	}


	/**
	 * get PHONE of PHONE.SEARCH_CNT
	 * ���ږ� �F ������
	 * @return {$p.SEARCH_CNT}
	 */
	public int getSEARCH_CNT() {
		return this.SEARCH_CNT;
	}

	/**
	 * set PHONE of PHONE.SEARCH_CNT
	 * ���ږ� �F ������
	 * @param SEARCH_CNT
	 */
	@JsonProperty("SEARCH_CNT")
	public void setSEARCH_CNT(final int SEARCH_CNT) {
		this.SEARCH_CNT = SEARCH_CNT;
	}


	/**
	 * get PHONE of PHONE.CREATE_DATETIME
	 * ���ږ� �F �쐬��
	 * @return {$p.CREATE_DATETIME}
	 */
	public java.util.Date getCREATE_DATETIME() {
		return this.CREATE_DATETIME;
	}

	/**
	 * set PHONE of PHONE.CREATE_DATETIME
	 * ���ږ� �F �쐬��
	 * @param CREATE_DATETIME
	 */
	@JsonProperty("CREATE_DATETIME")
	public void setCREATE_DATETIME(final java.util.Date CREATE_DATETIME) {
		this.CREATE_DATETIME = CREATE_DATETIME;
	}


	/**
	 * get PHONE of PHONE.CREATE_USER
	 * ���ږ� �F �쐬��
	 * @return {$p.CREATE_USER}
	 */
	public java.lang.String getCREATE_USER() {
		return this.CREATE_USER;
	}

	/**
	 * set PHONE of PHONE.CREATE_USER
	 * ���ږ� �F �쐬��
	 * @param CREATE_USER
	 */
	@JsonProperty("CREATE_USER")
	public void setCREATE_USER(final java.lang.String CREATE_USER) {
		this.CREATE_USER = CREATE_USER;
	}


	/**
	 * get PHONE of PHONE.UPDATE_DATETIME
	 * ���ږ� �F �X�V��
	 * @return {$p.UPDATE_DATETIME}
	 */
	public java.util.Date getUPDATE_DATETIME() {
		return this.UPDATE_DATETIME;
	}

	/**
	 * set PHONE of PHONE.UPDATE_DATETIME
	 * ���ږ� �F �X�V��
	 * @param UPDATE_DATETIME
	 */
	@JsonProperty("UPDATE_DATETIME")
	public void setUPDATE_DATETIME(final java.util.Date UPDATE_DATETIME) {
		this.UPDATE_DATETIME = UPDATE_DATETIME;
	}


	/**
	 * get PHONE of PHONE.UPDATE_USER
	 * ���ږ� �F �X�V��
	 * @return {$p.UPDATE_USER}
	 */
	public java.lang.String getUPDATE_USER() {
		return this.UPDATE_USER;
	}

	/**
	 * set PHONE of PHONE.UPDATE_USER
	 * ���ږ� �F �X�V��
	 * @param UPDATE_USER
	 */
	@JsonProperty("UPDATE_USER")
	public void setUPDATE_USER(final java.lang.String UPDATE_USER) {
		this.UPDATE_USER = UPDATE_USER;
	}


}

