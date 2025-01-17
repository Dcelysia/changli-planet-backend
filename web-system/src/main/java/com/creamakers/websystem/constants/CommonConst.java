package com.creamakers.websystem.constants;

public class CommonConst {

    public final static String RESULT_SUCCESS_CODE = "200";
    public final static String RESULT_SUCCESS_MSG = "success";

    public final static String RESULT_FAILURE_CODE = "500";

    public final static String BAD_REQUEST_CODE = "400";

    public final static String RESULT_FAILURE_MSG = "failure";

    public static final String CRYPOT_KEY = "changli-planetchangli-planet";

    public final static String PASSWORD_ERROR = "密码错误，请重新输入";

    public final static String ACCOUNT_NOT_FOUND = "用户不存在，请重新登陆";

    public final static String TOKEN_NOT_FOUND = "token不存在，请重新登陆";

    public final static String TOKEN_INVALID = "无效token，请重新登陆";
    //Insufficient permissions
    public final static String INSUFFICIENT_PERMISSION = "权限不足，无法访问";

    public final static String ACCOUNT_DISABLED_OR_BANNED = "账号异常，已被删除或封禁";

    public final static String BAD_USERINFO_QUERY = "查询用户ID无效，请重新输入";

    public final static String BAD_UPDATE_USER = "更新用户信息失败";

    public final static String REFRESH_TOKEN_PREFIX = "web:refresh_token:";

    public final static String ACCESS_TOKEN_PREFIX = "web:access_token:";

    public final static String BLACKLIST_TOKEN_PREFIX = "web:blacklist:token:";

    public final static String TOKEN_EXPIRATION_TIME = "7200";

    public final static Integer REGULAR_USER = 0;

    public final static Integer OPERATIONS_TEAM = 1;

    public final static Integer DEVELOPMENT_TEAM = 2;

}
