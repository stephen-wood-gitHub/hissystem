package com.xgs.hisystem.service;

import com.xgs.hisystem.pojo.bo.BaseResponse;
import com.xgs.hisystem.pojo.vo.medicalExamination.medicalExaminationInfoReqVO;
import com.xgs.hisystem.pojo.vo.medicalExamination.PatientInforRspVO;
import com.xgs.hisystem.pojo.vo.register.GetCardIdInforReqVO;

/**
 *  @author更多免费资料获取请加公众号“前劲科技”，车联网，物联网，医院HIS，OA等高端代码获取或者代码有疑问，软件定制开发加微信17725354261，Q技术群：25686021
 * @date 2019-5-18
 * @description:
 */
public interface IMedicalExaminationService {

    PatientInforRspVO getCardIdInfor(GetCardIdInforReqVO reqVO) throws Exception;

    BaseResponse<String> saveMedicalExaminationInfo(medicalExaminationInfoReqVO reqVO);
}
