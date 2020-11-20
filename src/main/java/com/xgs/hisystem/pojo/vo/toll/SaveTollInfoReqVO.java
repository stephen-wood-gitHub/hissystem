package com.xgs.hisystem.pojo.vo.toll;

import javax.validation.constraints.NotBlank;

/**
 *  @author更多免费资料获取请加公众号“前劲科技”，车联网，物联网，医院HIS，OA等高端代码获取或者代码有疑问，软件定制开发加微信17725354261，Q技术群：25686021
 * @date 2019-5-15
 * @description:
 */
public class SaveTollInfoReqVO {

    @NotBlank(message = "请先读取就诊卡！")
    private String registerId;

    @NotBlank(message = "请先选择收费处方！")
    private String prescriptionNum;

    public String getRegisterId() {
        return registerId;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    public String getPrescriptionNum() {
        return prescriptionNum;
    }

    public void setPrescriptionNum(String prescriptionNum) {
        this.prescriptionNum = prescriptionNum;
    }
}
