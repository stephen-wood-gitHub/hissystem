package com.xgs.hisystem.pojo.vo.register;

/**
 *  @author更多免费资料获取请加公众号“前劲科技”，车联网，物联网，医院HIS，OA等高端代码获取或者代码有疑问，软件定制开发加微信17725354261，Q技术群：25686021
 * @date 2019-4-29
 * @description:
 */
public class RegisterDoctorRspVO {
    private String doctorName;

    private String workDateTime;

    private int allowNum;

    private int nowNum;

    private String price;

    private String id;

    private String workAddress;

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getWorkDateTime() {
        return workDateTime;
    }

    public void setWorkDateTime(String workDateTime) {
        this.workDateTime = workDateTime;
    }

    public int getAllowNum() {
        return allowNum;
    }

    public void setAllowNum(int allowNum) {
        this.allowNum = allowNum;
    }

    public int getNowNum() {
        return nowNum;
    }

    public void setNowNum(int nowNum) {
        this.nowNum = nowNum;
    }


    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }
}
