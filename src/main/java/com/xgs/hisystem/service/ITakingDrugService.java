package com.xgs.hisystem.service;

import com.xgs.hisystem.pojo.bo.BaseResponse;
import com.xgs.hisystem.pojo.vo.takingdrug.MedicalRecordRspVO;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *  @author更多免费资料获取请加公众号“前劲科技”，车联网，物联网，医院HIS，OA等高端代码获取或者代码有疑问，软件定制开发加微信17725354261，Q技术群：25686021
 * @date 2019-5-15
 * @description:
 */
public interface ITakingDrugService {

    MedicalRecordRspVO getMedicalRecord(@RequestParam String prescriptionNum) throws Exception;

    BaseResponse<String> saveTakingDrugInfo(String prescriptionNum);
}
