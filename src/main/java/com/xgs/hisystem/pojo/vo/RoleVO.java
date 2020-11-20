package com.xgs.hisystem.pojo.vo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 *  @author更多免费资料获取请加公众号“前劲科技”，车联网，物联网，医院HIS，OA等高端代码获取或者代码有疑问，软件定制开发加微信17725354261，Q技术群：25686021
 * @Description:
 * @date 2019/3/20
 */
public class RoleVO {

    @NotBlank(message = "角色名不能为空")
    private String rolename;

    @NotNull(message = "角色编码不能为空")
    private Integer roleValue;

    @NotBlank(message = "描述不能为空")
    private String desciption;

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Integer getRoleValue() {
        return roleValue;
    }

    public void setRoleValue(Integer roleValue) {
        this.roleValue = roleValue;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }
}
