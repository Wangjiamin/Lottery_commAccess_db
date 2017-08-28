package com.xinwei.lotteryDb;

import java.io.Serializable;
import java.util.Date;

/**
 * Model class of user_balanceLog.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class UserBalancelog implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 用户的UID. */
	private Long userId;

	/** 最后更新时间. */
	private Date updatetime;

	/** 事物号. */
	private String transaction;

	/** 更新来源. */
	private String updatesource;

	/** 操作前余额. */
	private Double beginningbalance;

	/** 操作前的有效期. */
	private Date beginningexpiretimes;

	/** 转账金额. */
	private Double amount;

	/** 备注. */
	private String remark;

	/**
	 * Constructor.
	 */
	public UserBalancelog() {
	}

	/**
	 * Set the 用户的UID.
	 * 
	 * @param userId
	 *            用户的UID
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * Get the 用户的UID.
	 * 
	 * @return 用户的UID
	 */
	public Long getUserId() {
		return this.userId;
	}

	/**
	 * Set the 最后更新时间.
	 * 
	 * @param updatetime
	 *            最后更新时间
	 */
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	/**
	 * Get the 最后更新时间.
	 * 
	 * @return 最后更新时间
	 */
	public Date getUpdatetime() {
		return this.updatetime;
	}

	/**
	 * Set the 事物号.
	 * 
	 * @param transaction
	 *            事物号
	 */
	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}

	/**
	 * Get the 事物号.
	 * 
	 * @return 事物号
	 */
	public String getTransaction() {
		return this.transaction;
	}

	/**
	 * Set the 更新来源.
	 * 
	 * @param updatesource
	 *            更新来源
	 */
	public void setUpdatesource(String updatesource) {
		this.updatesource = updatesource;
	}

	/**
	 * Get the 更新来源.
	 * 
	 * @return 更新来源
	 */
	public String getUpdatesource() {
		return this.updatesource;
	}

	/**
	 * Set the 操作前余额.
	 * 
	 * @param beginningbalance
	 *            操作前余额
	 */
	public void setBeginningbalance(Double beginningbalance) {
		this.beginningbalance = beginningbalance;
	}

	/**
	 * Get the 操作前余额.
	 * 
	 * @return 操作前余额
	 */
	public Double getBeginningbalance() {
		return this.beginningbalance;
	}

	/**
	 * Set the 操作前的有效期.
	 * 
	 * @param beginningexpiretimes
	 *            操作前的有效期
	 */
	public void setBeginningexpiretimes(Date beginningexpiretimes) {
		this.beginningexpiretimes = beginningexpiretimes;
	}

	/**
	 * Get the 操作前的有效期.
	 * 
	 * @return 操作前的有效期
	 */
	public Date getBeginningexpiretimes() {
		return this.beginningexpiretimes;
	}

	/**
	 * Set the 转账金额.
	 * 
	 * @param amount
	 *            转账金额
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * Get the 转账金额.
	 * 
	 * @return 转账金额
	 */
	public Double getAmount() {
		return this.amount;
	}

	/**
	 * Set the 备注.
	 * 
	 * @param remark
	 *            备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * Get the 备注.
	 * 
	 * @return 备注
	 */
	public String getRemark() {
		return this.remark;
	}


}
