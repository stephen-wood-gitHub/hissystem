package com.xgs.hisystem.pojo.vo;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

/**
 *  @author更多免费资料获取请加公众号“前劲科技”，车联网，物联网，医院HIS，OA等高端代码获取或者代码有疑问，软件定制开发加微信17725354261，Q技术群：25686021
 * @date 2019/4/5
 * @description:
 */
public class ChangePasswordReqVO {

    @NotBlank(message = "原始密码不能为空!")
    private String oldPassword;

    @Length(max = 20, message = "密码不超过20个字符")
    @NotBlank(message = "新密码不能为空!")
    private String newPassword;

    @Length(max = 20, message = "密码不超过20个字符")
    @NotBlank(message = "确认密码不能为空!")
    private String okPassword;

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getOkPassword() {
        return okPassword;
    }

    public void setOkPassword(String okPassword) {
        this.okPassword = okPassword;
    }
}
