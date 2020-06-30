 
package com.aha.smallmall.result;

/**
 * 
 * @author lzp
 */
public enum Status implements StatusType {
	/**
	 * 0 表示正常
	 */
	OK(200, "success"),
	
	FAILURE(0,"failure"),

	/**
	 * 10000  错误代码
	 */
	NOT_FIND_OBJECT(404, "没有找到对象"),
	
	/**
	 * 10000  错误代码
	 */
	SYSTEM_UNKNOW(10000, "未知错误"),
 
	
	PARAM_UNKNOW(10001, "亲,参数不正确!"),
	
	PARAM_NO(10002, "亲,参数不能为空!"),
	
	USER_UNLOGIN_ERROR(10003, "亲，请先登录！"),
	
	USER_CHECK_FAILURE(10004, "非法的访问对象！用户id不匹配！"),
	
	DELETE_FAILURE(10005, "删除失败，请联系管理员！"),
	
	UPDATE_FAILURE(10006, "修改失败，请联系管理员！"),
	
	INSERT_FAILURE(10007, "新增失败，请联系管理员！"),
	
	LOGIN_TIMEOUT(10008, "登录超时，请重新登录！"),

	
	/**
	 * 用户信息1001-2000
	 */
	USER_NAME_NO(1001, "用户名不能为空！"),
	PASS_WORD_NO(1002, "密码不能为空！"),
	PHONE_NO(1003, "手机不能为空！"),
	USER_NAME_EXIST(1004, "此用户名已存在！"),
	PHONE_EXIST(1005, "手机号码已被使用，请重新填写！"),
	USER_LOGIN_FAILURE(1006, "账号或密码错误！"),
	USER_EDIT_FAILURE(1007, "编辑用户信息失败，请联系管理员！"),
	ID_NO(1008, "ID不能为空！"),
	BLACK_USER(1009, "您被列入黑名单，详情请联系管理员！"),
	OPEN_ID_EXIST(1010, "该微信已绑定用户！"),
	REGIST_FAILURE(1011, "注册失败，请联系管理员！"),
	USER_ID_NO(1012, "用户id不能为空！"),
	OLD_PWD_NO(1013, "原密码不能为空！"),
	NEW_PWD_NO(1014, "新密码不能为空！"),
	OLD_PWD_ERROR(1015, "原密码错误！"),
	USER_NOT_FOUND(1016, "用户不存在！"),
	
	OPERATION_FAILURE(1017, "操作失败，请联系管理员！"),
	
	NICK_NAME_NO(1018, "昵称不能为空！"),
	SMS_CODE_FAILURE(1019, "验证码保存失败！"),
	USER_KAPTCHA_UNVALIDATE(1020, "验证码失效，请重新获取！"),
	USER_KAPTCHA_MOBILE_ERROR(1021, "验证码错误！"),
	NOT_YOUR_ORDER(1022, "不是您的订单，您不能支付！"),
	ORDER_PAY_FAILURE(1023, "订单支付失败！请联系管理员！"),
	BONUS_EDIT_FAILURE(1024, "推荐人奖励金额修改失败！请联系管理员！"),
	AWARD_ADD_FAILURE(1025, "奖励记录增加失败！请联系管理员！"),
	AWARD_EDIT_FAILURE(1026, "奖励记录修改失败！请联系管理员！"),
	EDIT_IDENTITY_FAILURE(1027, "修改用户身份失败！请联系管理员！"),
	MERIT_EIDT_FAILURE(1028, "业绩修改失败！请联系管理员！"),
	TARGET_NUM_ERROR(1029, "请选择正确的商品数量！"),
	
	USER_ADDRESS_EDIT_FAILURE(1030, "收货地址修改失败，请联系管理员！"),
	SHNAME_NO(1031, "收货人不能为空！"),
	ZONE_NO(1032, "所在地区不能为空！"),
	ADDRESS_NO(1033, "详细地址不能为空！"),
	
	FLAG_NO(1034, "平台标识不能为空！"),
	TOTAL_FEE_ERROR(1035, "支付金额出错，请联系管理员！"),
	MENU_ID_NO(1036, "菜单id不能为空！"),
	FIND_MENU_NO(1037, "查询菜单信息为空，请检查数据是否正常！"),
	TYPE_ID_NO(1038, "typeId不能为空！"),
	PAGENO_NO(1039, "页码不能为空！"),
	PAGESIZE_NO(1040, "每页记录数不能为空！"),
	KEY_WORD_NO(1041, "搜索关键字不能为空 ！"),
	ORDER_CREATE_FAILURE(1042, "订单创建失败，请联系管理员！"),
	XINGMING_NO(1043, "名字不能为空！"),
	
	BIND_FAILURE(1044, "绑定信息失败，请联系管理员！"),
	
	FEEDBACK_CONTENT_NO(1045, "反馈内容不能为空！"),
	
	IDENTITY_NO(1046, "角色身份编号不能为空！"),
	IDENTITY_EXIST(1047, "身份编号已存在！"),
	ROLE_NAME_NO(1048, "角色名称不能为空！"),
	ROLE_NAME_EXIST(1049, "角色名称已存在！"),
	VAILD_CODE_NO(1050, "验证码不能为空！"),
	NON_AUTHORITY(1051, "您没有操作权限！"),
	
	PER_ACTION_NO(1052, "操作对应的字段不能为空！"),
	PER_NAME_NO(1053, "对应字段的名称不能为空！"),
	PER_TYPE_NO(1054, "类型不能为空！"),
	PER_ID_NO(1055, "权限id不能为空！"),
	PER_THE_SAME(1056, "检测到有相同权限，请管理员修复"),
	PER_ACTION_EXIST(1057, "相关字段已存在！"),
	PER_NAME_EXIST(1058, "字段名称已存在！"),
	ROLE_PER_EXIST(1059, "角色权限已存在！"),
	


	/**
	 * 商品信息2001-2500
	 */
	COMMODITY_EDIT_FAILURE(2001, "编辑商品信息失败！"),
	JOB_NOT_EXIST(2002, "未找到此兼职信息，可能信息已过期！"),
	MER_CODE_NO(2003, "商品编号不能为空！"),
	MER_STATE_NO(2004, "商品状态码不能为空！"),
	PRO_CODE_NO(2005, "清单编号不能为空！"),
	PRO_CONTENT_NOT_EXIST(2006, "此清单详情不存在，请联系管理员!"),
	
	/**
	 * 微信开发信息2501-3000
	 */
	GET_OPENID_FAILURE(2501, "获取openid失败！"),
	OPENID_NO(2502, "openid不能为空！"),
	GET_WECHAT_FAILURE(2503, "读取此微信用户信息失败"),
	
	/**
	 * 教务系统开发信息3001-3500
	 */
	UNSUPPORTED_SCHOOL(3001, "暂不支持该学校的信息查询，请联系客服添加该学校！"),
	EDUNO_EXIT(3002, "您已绑定过教务账号，请勿重复绑定！"),
	SCHOOL_ID_NO(3003, "请选择学校！"),
	JW_USERNAME_NO(3004, "教务网账号（学号）不能为空！"),
	JW_PASS_NO(3005, "教务网密码不能为空！"),
	XN_NO(3006, "学年不能为空！"),
	XQ_NO(3007, "学期不能为空！"),
	EDUNO_UNBIND(3008, "对不起，您未绑定教务信息，不能进行此操作！"),
	JW_CLASSES_FAILURE(3009, "添加课表失败！"),
	
	/**
	 * 菜单管理3501-4000
	 */
	MENU_TITLE_NO(3501, "菜单标题不能为空！"),
	MENU_SORT_NO(3502, "菜单排序不能为空！"),
	MENU_HREF_NO(3503, "菜单链接不能为空！"),
	MENU_ICON_ID_NO(3504, "菜单图标id不能为空！"),
	MENU_TYPE_NO(3505, "菜单类型不能为空！"),
	MENU_CHILD_NO(3506, "子菜单内容不能为空！"),
	MENU_LEVEL_NO(3507, "菜单等级不能为空！"),
	
	;
	private final int code;
	private final String reason;
	 

	Status(final int statusCode, final String reasonPhrase) {
		this.code = statusCode;
		this.reason = reasonPhrase;
	}

	 
	public int getStatusCode() {
		return code;
	}

	public String getReasonPhrase() {
		return toString();
	}

	@Override
	public String toString() {
		return reason;
	}

	public String toString(Object... parms) {
		if (parms == null)
			return String.format(reason, "");
		return String.format(reason, parms);
	}

	public static Status fromStatusCode(final int statusCode) {
		for (Status s : Status.values()) {
			if (s.code == statusCode) {
				return s;
			}
		}
		return null;
	}

}
