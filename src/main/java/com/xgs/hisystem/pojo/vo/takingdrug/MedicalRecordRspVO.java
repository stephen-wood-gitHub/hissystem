package com.xgs.hisystem.pojo.vo.takingdrug;

/**
 *  @author更多免费资料获取请加公众号“前劲科技”，车联网，物联网，医院HIS，OA等高端代码获取或者代码有疑问，软件定制开发加微信17725354261，Q技术群：25686021
 * @date 2019-5-15
 * @description:
 */
public class MedicalRecordRspVO {

    private String nowDate;

    private String createDate;

    private String name;

    private String sex;

    private String nationality;

    private int age;

    private String diagnosisResult;

    private double drugCost;

    private String prescription;

    private String medicalOrder;

    private String doctorName;

    private String department;

    private double examinationCost;

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNowDate() {
        return nowDate;
    }

    public void setNowDate(String nowDate) {
        this.nowDate = nowDate;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiagnosisResult() {
        return diagnosisResult;
    }

    public void setDiagnosisResult(String diagnosisResult) {
        this.diagnosisResult = diagnosisResult;
    }

    public double getDrugCost() {
        return drugCost;
    }

    public void setDrugCost(double drugCost) {
        this.drugCost = drugCost;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public String getMedicalOrder() {
        return medicalOrder;
    }

    public void setMedicalOrder(String medicalOrder) {
        this.medicalOrder = medicalOrder;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getExaminationCost() {
        return examinationCost;
    }

    public void setExaminationCost(double examinationCost) {
        this.examinationCost = examinationCost;
    }
}
