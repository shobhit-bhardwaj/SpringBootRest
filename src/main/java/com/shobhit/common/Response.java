package com.shobhit.common;

public class Response<T> {
	private int responseCode;
	private String responseMessage;
	private T responseData;

	public Response(int responseCode, String responseMessage, T responseData) {
		this.responseCode = responseCode;
		this.responseMessage = responseMessage;
		this.responseData = responseData;
	}

	public Response(ResponseType responseType, T responseData) {
		this.responseCode = responseType.getResponseCode();
		this.responseMessage = responseType.getResponseMessage();
		this.responseData = responseData;
	}

	public Response(ResponseType responseType) {
		this.responseCode = responseType.getResponseCode();
		this.responseMessage = responseType.getResponseMessage();
	}

	public int getResponseCode() {
		return responseCode;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public T getResponseData() {
		return responseData;
	}

	@Override
	public String toString() {
		return "Response [responseCode=" + responseCode + ", responseMessage=" + responseMessage + ", responseData=" + responseData + "]";
	}
}