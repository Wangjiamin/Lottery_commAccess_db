package com.xinwei.commAccessDb.domain;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 * Model class of 正在发生的业务交易表.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class BalanceTransRunning implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 用户的账户的UID. */
	private long userid;

	/** 业务交易时间. */
	private Date transactionTime;

	/** 业务唯一标识. */
	private String transid;

	/** 交易金额. */
	private double amount;

	/** 业务有效期. */
	private Date expiretime;

	/** 交易描述. */
	private String transdesc;

	/** 交易后余额. */
	private double balance;

	/** orderId. */
	private String orderid;

	/** 业务类型. */
	private String biztype;

	/** 操作类型. */
	private String opertype;

	/** 校验和. */
	private String checksum;

	/** 业务更新时间. */
	private Date updatetime;

	/** 业务来源. */
	private String bizsource;

	/** 业务请求IP地址. */
	private String srcipaddress;

	/** 交易当前状态. */
	private int status;
	
	/** 业务level*/
	private int runPriority;
	

	/**
	 * Constructor.
	 */
	public BalanceTransRunning() {
	}

	/**
	 * Set the 用户的账户的UID.
	 * 
	 * @param userid
	 *            用户的账户的UID
	 */
	public void setUserid(long userid) {
		this.userid = userid;
	}

	/**
	 * Get the 用户的账户的UID.
	 * 
	 * @return 用户的账户的UID
	 */
	public long getUserid() {
		return this.userid;
	}

	
	/**
	 * Set the 业务唯一标识.
	 * 
	 * @param transid
	 *            业务唯一标识
	 */
	public void setTransid(String transid) {
		this.transid = transid;
	}

	/**
	 * Get the 业务唯一标识.
	 * 
	 * @return 业务唯一标识
	 */
	public String getTransid() {
		return this.transid;
	}

	/**
	 * Set the 交易金额.
	 * 
	 * @param amount
	 *            交易金额
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * Get the 交易金额.
	 * 
	 * @return 交易金额
	 */
	public double getAmount() {
		return this.amount;
	}

	/**
	 * Set the 业务有效期.
	 * 
	 * @param expiretime
	 *            业务有效期
	 */
	public void setExpiretime(Date expiretime) {
		Calendar expireCalendar = Calendar.getInstance();
		expireCalendar.setTime(expiretime);
		expireCalendar.set(Calendar.MILLISECOND, 0);
		this.expiretime = expireCalendar.getTime();
	}

	/**
	 * Get the 业务有效期.
	 * 
	 * @return 业务有效期
	 */
	public Date getExpiretime() {
		return this.expiretime;
	}

	/**
	 * Set the 交易描述.
	 * 
	 * @param transdesc
	 *            交易描述
	 */
	public void setTransdesc(String transdesc) {
		this.transdesc = transdesc;
	}

	/**
	 * Get the 交易描述.
	 * 
	 * @return 交易描述
	 */
	public String getTransdesc() {
		return this.transdesc;
	}

	/**
	 * Set the 交易后余额.
	 * 
	 * @param balance
	 *            交易后余额
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * Get the 交易后余额.
	 * 
	 * @return 交易后余额
	 */
	public double getBalance() {
		return this.balance;
	}

	/**
	 * Set the orderId.
	 * 
	 * @param orderid
	 *            orderId
	 */
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	/**
	 * Get the orderId.
	 * 
	 * @return orderId
	 */
	public String getOrderid() {
		return this.orderid;
	}

	/**
	 * Set the 业务类型.
	 * 
	 * @param biztype
	 *            业务类型
	 */
	public void setBiztype(String biztype) {
		this.biztype = biztype;
	}

	/**
	 * Get the 业务类型.
	 * 
	 * @return 业务类型
	 */
	public String getBiztype() {
		return this.biztype;
	}

	/**
	 * Set the 操作类型.
	 * 
	 * @param opertype
	 *            操作类型
	 */
	public void setOpertype(String opertype) {
		this.opertype = opertype;
	}

	/**
	 * Get the 操作类型.
	 * 
	 * @return 操作类型
	 */
	public String getOpertype() {
		return this.opertype;
	}

	/**
	 * Set the 校验和.
	 * 
	 * @param checksum
	 *            校验和
	 */
	public void setChecksum(String checksum) {
		this.checksum = checksum;
	}

	/**
	 * Get the 校验和.
	 * 
	 * @return 校验和
	 */
	public String getChecksum() {
		return this.checksum;
	}

	/**
	 * Set the 业务更新时间.
	 * 
	 * @param updatetime
	 *            业务更新时间
	 */
	public void setUpdatetime(Date updatetime) {
		Calendar expireCalendar = Calendar.getInstance();
		expireCalendar.setTime(updatetime);
		expireCalendar.set(Calendar.MILLISECOND, 0);
		this.updatetime = expireCalendar.getTime();
	}

	/**
	 * Get the 业务更新时间.
	 * 
	 * @return 业务更新时间
	 */
	public Date getUpdatetime() {
		return this.updatetime;
	}

	/**
	 * Set the 业务来源.
	 * 
	 * @param bizsource
	 *            业务来源
	 */
	public void setBizsource(String bizsource) {
		this.bizsource = bizsource;
	}

	/**
	 * Get the 业务来源.
	 * 
	 * @return 业务来源
	 */
	public String getBizsource() {
		return this.bizsource;
	}

	/**
	 * Set the 业务请求IP地址.
	 * 
	 * @param srcipaddress
	 *            业务请求IP地址
	 */
	public void setSrcipaddress(String srcipaddress) {
		this.srcipaddress = srcipaddress;
	}

	/**
	 * Get the 业务请求IP地址.
	 * 
	 * @return 业务请求IP地址
	 */
	public String getSrcipaddress() {
		return this.srcipaddress;
	}

	/**
	 * Set the 交易当前状态.
	 * 
	 * @param status
	 *            交易当前状态
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * Get the 交易当前状态.
	 * 
	 * @return 交易当前状态
	 */
	public int getStatus() {
		return this.status;
	}

	public Date getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(Date transactionTime) {
		this.transactionTime = transactionTime;
	}

	public int getRunPriority() {
		return runPriority;
	}

	public void setRunPriority(int runPriority) {
		this.runPriority = runPriority;
	}

	@Override
	public String toString() {
		return "BalanceTransRunning [userid=" + userid + ", transactionTime=" + transactionTime + ", transid=" + transid
				+ ", amount=" + amount + ", expiretime=" + expiretime + ", transdesc=" + transdesc + ", balance="
				+ balance + ", orderid=" + orderid + ", biztype=" + biztype + ", opertype=" + opertype + ", checksum="
				+ checksum + ", updatetime=" + updatetime + ", bizsource=" + bizsource + ", srcipaddress="
				+ srcipaddress + ", status=" + status + ", runPriority=" + runPriority + "]";
	}
     
	
    
}
