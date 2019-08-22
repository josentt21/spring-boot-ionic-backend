package com.jose.cursomc.resources.exception;

import java.io.Serializable;

public class StandartError implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private Integer status;
	private String msg;
	private long timeStamp;
	
	public StandartError(Integer status, String msg, Long timeStamp) {
		super();
		this.status=status;
		this.msg=msg;
		this.msg=msg;
		
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	

}
