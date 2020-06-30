package com.aha.smallmall.result;

public class ResponseBuilder {

	private static final String META_KEY = "meta";

	// 是否显示响应信息
	private boolean showMeta = true;

	// 返回值信息 key-value方式存储
	private Response entity;

	private Status status;

	/**
	 * 私有构造器防止实例化
	 */
	private ResponseBuilder() {
		entity = new Response();
	}

	/**
	 * 创建一个正常响应码的SimpleResponseBuilder
	 * 
	 * @return 新创建的SimpleResponseBuilder
	 */
	public static ResponseBuilder ok() {
		return status(Status.OK);
	}
	
	/**
	 * 创建一个正常响应码的SimpleResponseBuilder
	 * 
	 * @return 新创建的SimpleResponseBuilder
	 */
	public static ResponseBuilder failure() {
		return status(Status.FAILURE);
	}

	/**
	 * 创建一个正常响应码的SimpleResponseBuilder
	 * 
	 * @param key
	 *            返回值json key
	 * @param entity
	 *            返回值json value
	 * @return 新创建的SimpleResponseBuilder
	 */
	public static ResponseBuilder ok(String key, Object entity) {
		ResponseBuilder b = status(Status.OK);
		b.put(key, entity);
		return b;
	}

	/**
	 * 创建一个运行时异常的响应码的SimpleResponseBuilder
	 * 
	 * @return 新创建的SimpleResponseBuilder
	 */
	public static ResponseBuilder unknow() {
		return status(Status.SYSTEM_UNKNOW);
	}
	
	public static ResponseBuilder paramError() {
		return status(Status.PARAM_UNKNOW);
	}
	
	public static ResponseBuilder paramError(String columName) {
		return status(Status.PARAM_UNKNOW).put("参数名称", columName);
	}

	/**
	 * 根据给定状态码创建SimpleResponseBuilder
	 * 
	 * @param statusCode
	 *            响应信息
	 * @return SimpleResponseBuilder
	 */
	public static ResponseBuilder status(Status statusCode) {
		ResponseBuilder b = new ResponseBuilder();
		b.status = statusCode;
		Meta meta = new Meta();
		meta.setMsg(statusCode.toString());
		meta.setStatus(statusCode.getStatusCode());
		b.put(META_KEY, meta);
		return b;
	}

	public Status getStatus() {
		return status;
	}

	public ResponseBuilder set(Status statusCode) {
		status = statusCode;
		Meta meta = new Meta();
		meta.setMsg(statusCode.toString());
		meta.setStatus(statusCode.getStatusCode());
		this.put(META_KEY, meta);
		return this;
	}

	/**
	 * 是否显示响应信息
	 * 
	 * @param isShow
	 *            true显示 false不显示
	 * @return SimpleResponseBuilder
	 */
	public ResponseBuilder showMsg(boolean isShow) {
		this.showMeta = isShow;
		return this;
	}

	/**
	 * 添加响应信息 key-value方式添加
	 * 
	 * @param key
	 *            响应信息key
	 * @param value
	 *            响应信息value
	 * @return SimpleResponseBuilder
	 */
	public ResponseBuilder put(String key, Object value) {
		entity.put(key, value);
		return this;
	}
	
	public ResponseBuilder putMessage(Object value) {
		entity.put("message", value);
		return this;
	}

	public ResponseBuilder putError(Object value) {
		entity.put("errorMessage", value);
		return this;
	}

	public ResponseBuilder append(MapObject<String, Object> entity) {
		if (entity == null)
			throw new IllegalArgumentException();
		for (String key : entity.keySet()) {
			this.entity.put(key, entity.get(key));
		}
		return this;
	}

	/**
	 * 创建Response响应信息对象
	 * @return Response响应
	 */
	public Response build() {
		if (!showMeta) {
			entity.remove(META_KEY);
		}
		return entity;
	}

	/**
	 * 设置状态码说明信息
	 * 
	 * @param msg
	 *            响应码说明
	 * @return SimpleResponseBuilder
	 */
	public ResponseBuilder msg(String msg) {
		Meta meta = (Meta) entity.get(META_KEY);
		meta.setMsg(msg);
		put(META_KEY, meta);
		return this;
	}
	
	/**
	 * 获取消息
	 * @return meta.msg
	 */
	public String getMsg(){
		return ((Meta)entity.get(META_KEY)).getMsg();
	}
}
