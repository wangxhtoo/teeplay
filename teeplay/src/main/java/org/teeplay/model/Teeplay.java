package org.teeplay.model;

import java.util.HashMap;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.teeplay.exception.TeeplayException;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Teeplay {
	

	/**
	 * 结果
	 */
	private boolean result;
	/**
	 * 成功的消息
	 */
	private String msg;

	/**
	 * 具体每个输入错误的消息
	 */
	private HashMap<String, String> errors = new HashMap<String, String>();


	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public HashMap<String, String> getErrors() {
		return errors;
	}

	public void setErrors(HashMap<String, String> errors) {
		this.errors = errors;
	}


	public void check() throws TeeplayException {
		if (this.getErrors().size() > 0) {
			this.setResult(false);
			throw new TeeplayException("有错误发生");
		} else {
			this.setResult(true);
		}
	}

	@Override
	public String toString() {
		return "Teeplay [result=" + result + ", msg=" + msg + "]";
	}


}
