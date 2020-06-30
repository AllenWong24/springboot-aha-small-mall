 
package com.aha.smallmall.result;

/**
 * 
 * 用于响应状态接口。
 * 
 * @author zjh
 * @version V1.0
 *
 */
public interface StatusType {
	/**
	 * 把相关的状态码
	 * @return 状态码
	 */
	public int getStatusCode();

	/**
	 * 状态说明短语
	 * @return 状态说明
	 */
	public String getReasonPhrase();
}
