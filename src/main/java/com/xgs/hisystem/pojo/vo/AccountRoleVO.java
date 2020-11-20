package com.xgs.hisystem.pojo.vo;

import javax.validation.constraints.Min;

/**
 *  @author更多免费资料获取请加公众号“前劲科技”，车联网，物联网，医院HIS，OA等高端代码获取或者代码有疑问，软件定制开发加微信17725354261，Q技术群：25686021
 * @date 2019-4-30
 * @description:
 */
public class AccountRoleVO {

    @Min(1)
    private String roleValue;

    public String getRoleValue() {
        return roleValue;
    }

    public void setRoleValue(String roleValue) {
        this.roleValue = roleValue;
    }
}
