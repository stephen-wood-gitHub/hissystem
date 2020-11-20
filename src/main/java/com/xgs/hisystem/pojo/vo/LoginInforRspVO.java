package com.xgs.hisystem.pojo.vo;

/**
 *  @author更多免费资料获取请加公众号“前劲科技”，车联网，物联网，医院HIS，OA等高端代码获取或者代码有疑问，软件定制开发加微信17725354261，Q技术群：25686021
 * @date 2019/4/4
 * @description:
 */
public class LoginInforRspVO {

    private String loginAddress;

    private String loginBroswer;

    private String loginIp;

    private String createDatetime;

    public String getLoginAddress() {
        return loginAddress;
    }

    public void setLoginAddress(String loginAddress) {
        this.loginAddress = loginAddress;
    }

    public String getLoginBroswer() {
        return loginBroswer;
    }

    public void setLoginBroswer(String loginBroswer) {
        this.loginBroswer = loginBroswer;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(String createDatetime) {
        this.createDatetime = createDatetime;
    }
}
