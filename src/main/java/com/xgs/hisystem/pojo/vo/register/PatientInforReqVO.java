package com.xgs.hisystem.pojo.vo.register;

import javax.validation.constraints.NotBlank;

/**
 *  @author更多免费资料获取请加公众号“前劲科技”，车联网，物联网，医院HIS，OA等高端代码获取或者代码有疑问，软件定制开发加微信17725354261，Q技术群：25686021
 * @date 2019/4/27
 * @description:
 */
public class PatientInforReqVO {

    @NotBlank(message = "请读取就诊卡号！")
    private String cardId;

    @NotBlank(message = "请读取二代身份证！")
    private String address;

    @NotBlank(message = "请读取二代身份证！")
    private String name;

    @NotBlank(message = "请读取二代身份证！")
    private String nationality;

    @NotBlank(message = "请读取二代身份证！")
    private String idcard;

    @NotBlank(message = "请读取二代身份证！")
    private String sex;

    @NotBlank(message = "请读取二代身份证！")
    private String birth;

    private String telphone;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }
}
