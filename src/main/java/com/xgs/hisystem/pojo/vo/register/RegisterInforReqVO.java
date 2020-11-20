package com.xgs.hisystem.pojo.vo.register;

import javax.validation.constraints.NotBlank;

/**
 *  @author更多免费资料获取请加公众号“前劲科技”，车联网，物联网，医院HIS，OA等高端代码获取或者代码有疑问，软件定制开发加微信17725354261，Q技术群：25686021
 * @date 2019-5-2
 * @description:
 */
public class RegisterInforReqVO {

    @NotBlank(message = "请读取就诊卡！")
    private String cardId;

    @NotBlank(message = "请先选择挂号医生！")
    private String doctorId;

    @NotBlank(message = "请先选择挂号医生！")
    private String department;

    @NotBlank(message = "请先选择挂号医生！")
    private String registerType;

    @NotBlank(message = "请先选择挂号医生！")
    private String doctor;

    @NotBlank(message = "请先选择挂号医生！")
    private String treatmentPrice;

    @NotBlank(message = "请先支付诊查费！")
    private String payType;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRegisterType() {
        return registerType;
    }

    public void setRegisterType(String registerType) {
        this.registerType = registerType;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getTreatmentPrice() {
        return treatmentPrice;
    }

    public void setTreatmentPrice(String treatmentPrice) {
        this.treatmentPrice = treatmentPrice;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }
}
