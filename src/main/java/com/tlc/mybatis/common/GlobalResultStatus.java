package com.tlc.mybatis.common;

public class GlobalResultStatus {

    public static final ResultStatus SUCCESS = new ResultStatus(0, "成功");
    public static final ResultStatus ERROR = new ResultStatus(1000, "失败");
    public static final ResultStatus PARAM_MISSING = new ResultStatus(1001, "缺少参数[%s]");
    public static final ResultStatus PARAM_ERROR = new ResultStatus(1002, "参数错误 [%s]");
    public static final ResultStatus PARAM_LENGTH_ERROR = new ResultStatus(1003, "参数长度错误");
    public static final ResultStatus LOGIN_ERROR = new ResultStatus(1004, "用户登录失败,帐号或密码错误");
    public static final ResultStatus USER_LOGIN_SESSION_TIME_OUT = new ResultStatus(1005, "用户未登录");
    public static final ResultStatus USER_NOT_EXIST = new ResultStatus(1006, "用户不存在或被禁用");
    public static final ResultStatus NO_PRIVILEGES = new ResultStatus(1007, "没有操作权限");
    public static final ResultStatus TOKEN_CANNOT_NULL = new ResultStatus(1008, "token不能为空");
    public static final ResultStatus TOKEN_INVALID = new ResultStatus(1009, "token已经失效");
    public static final ResultStatus VERI_CODE_ERROR = new ResultStatus(1010, "验证码错误");
    public static final ResultStatus ACCOUNT_REGISTERED = new ResultStatus(1011, "帐号已注册");
    public static final ResultStatus RANDOM_CODE_ERROR = new ResultStatus(1012, "随机码错误");
}
