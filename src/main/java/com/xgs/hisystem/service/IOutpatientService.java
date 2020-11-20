package com.xgs.hisystem.service;

import com.xgs.hisystem.pojo.bo.BaseResponse;
import com.xgs.hisystem.pojo.vo.outpatient.*;
import com.xgs.hisystem.pojo.vo.register.GetCardIdInforReqVO;

import java.util.List;

/**
 *  @author更多免费资料获取请加公众号“前劲科技”，车联网，物联网，医院HIS，OA等高端代码获取或者代码有疑问，软件定制开发加微信17725354261，Q技术群：25686021
 * @date 2019-5-6
 * @description:
 */
public interface IOutpatientService {

    PatientInforRspVO getCardIdInfor(GetCardIdInforReqVO reqVO) throws Exception;

    BaseResponse<String> changePatientInfor(OtherPatientInforReqVO reqVO);

    BaseResponse<String> processLaterMedicalRecord(MedicalRecordReqVO reqVO);

    PatientInforRspVO restorePatientInfor(String registerId) throws Exception;

    List<String> getAllDrug();

    DrugRspVO getDrugInfor(String drug);

    BaseResponse<String> addMedicalRecord(MedicalRecordReqVO reqVO);

    medicalExaminationInfoRspVO getMedicalExamination(String prescriptionNum);

    List<GetAllOutpatientQueueRspVO> getAllOutpatientQueue();

}
