package com.xgs.hisystem.pojo.entity;

import javax.persistence.*;

/**
 *  @author更多免费资料获取请加公众号“前劲科技”，车联网，物联网，医院HIS，OA等高端代码获取或者代码有疑问，软件定制开发加微信17725354261，Q技术群：25686021
 * @date 2019/4/22
 * @description: 挂号记录表
 */
@Entity
@Table(name = "his_register",indexes = {@Index(name = "his_register_index",columnList = "patient_id")})
public class RegisterEntity extends BaseEntity {

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
    @JoinColumn(name = "patient_id")
    private PatientEntity patient;

    @Column(name = "department", nullable = false, length = 32)
    private String department;

    @Column(name = "registerType", nullable = false, length = 10)
    private String registerType;

    @Column(name = "doctor", nullable = false, length = 32)
    private String doctor;

    @Column(name = "doctorId", nullable = false, length = 255)
    private String doctorId;

    @Column(name = "treatmentPrice", nullable = false, length = 10)
    private String treatmentPrice;

    @Column(name = "payType", nullable = false, length = 10)
    private String payType;

    @Column(name = "operatorName", nullable = false, length = 10)
    private String operatorName;   //操作员

    @Column(name = "operatorEmail", nullable = false, length = 50)
    private String operatorEmail;   //操作员

    /**
     * 挂号状态。-1:过期，1:挂号成功
     */
    @Column(name = "registerStatus", nullable = false, length = 2)
    private int registerStatus;

    /**
     * 就诊状态,包括门诊，体检。0:未就诊，1:已就诊
     */
    @Column(name = "treatmentStatus", nullable = false, length = 2)
    private int treatmentStatus;

    /**
     * 收费状态。0:未收费，1:已收费
     */
    @Column(name = "chargeStatus", nullable = false, length = 2)
    private int chargeStatus;

    @Column(name = "registeredNum", nullable = false, length = 50)
    private String registeredNum;  //挂号编号

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public PatientEntity getPatient() {
        return patient;
    }

    public void setPatient(PatientEntity patient) {
        this.patient = patient;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getRegisterType() {
        return registerType;
    }

    public void setRegisterType(String registerType) {
        this.registerType = registerType;
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

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperatorEmail() {
        return operatorEmail;
    }

    public void setOperatorEmail(String operatorEmail) {
        this.operatorEmail = operatorEmail;
    }

    public int getRegisterStatus() {
        return registerStatus;
    }

    public void setRegisterStatus(int registerStatus) {
        this.registerStatus = registerStatus;
    }

    public int getTreatmentStatus() {
        return treatmentStatus;
    }

    public void setTreatmentStatus(int treatmentStatus) {
        this.treatmentStatus = treatmentStatus;
    }

    public int getChargeStatus() {
        return chargeStatus;
    }

    public void setChargeStatus(int chargeStatus) {
        this.chargeStatus = chargeStatus;
    }

    public String getRegisteredNum() {
        return registeredNum;
    }

    public void setRegisteredNum(String registeredNum) {
        this.registeredNum = registeredNum;
    }
}
