package com.xgs.hisystem.pojo.entity;

import javax.persistence.*;

/**
 *  @author更多免费资料获取请加公众号“前劲科技”，车联网，物联网，医院HIS，OA等高端代码获取或者代码有疑问，软件定制开发加微信17725354261，Q技术群：25686021
 * @date 2019-5-18
 * @description: 体检信息表
 */
@Entity
@Table(name = "his_medicalExamination")
public class MedicalExaminationEntity extends BaseEntity {

    @Column(name = "bodyTemperature", nullable = true, length = 10)
    private String bodyTemperature; //体温

    @Column(name = "pulse", nullable = true, length = 10)
    private String pulse;   //脉搏

    @Column(name = "heartRate", nullable = true, length = 10)
    private String heartRate;  //心率

    @Column(name = "bloodPressure", nullable = true, length = 10)
    private String bloodPressure;  //血压

    @Column(name = "examinationCost", nullable = true, length = 10)
    private double examinationCost; //费用

    @Column(name = "prescriptionNum", nullable = true, length = 64)
    private String prescriptionNum; //处方号

    @OneToOne
    @JoinColumn(name = "registerId", referencedColumnName = "id")
    private RegisterEntity register;


    public String getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(String bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public String getPulse() {
        return pulse;
    }

    public void setPulse(String pulse) {
        this.pulse = pulse;
    }

    public String getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(String heartRate) {
        this.heartRate = heartRate;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getExaminationCost() {
        return examinationCost;
    }

    public void setExaminationCost(double examinationCost) {
        this.examinationCost = examinationCost;
    }

    public String getPrescriptionNum() {
        return prescriptionNum;
    }

    public void setPrescriptionNum(String prescriptionNum) {
        this.prescriptionNum = prescriptionNum;
    }

    public RegisterEntity getRegister() {
        return register;
    }

    public void setRegister(RegisterEntity register) {
        this.register = register;
    }
}
