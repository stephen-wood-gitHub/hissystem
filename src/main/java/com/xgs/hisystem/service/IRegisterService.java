package com.xgs.hisystem.service;

import com.xgs.hisystem.pojo.bo.BaseResponse;
import com.xgs.hisystem.pojo.bo.PageRspBO;
import com.xgs.hisystem.pojo.vo.register.*;

import java.util.List;

/**
 *  @author更多免费资料获取请加公众号“前劲科技”，车联网，物联网，医院HIS，OA等高端代码获取或者代码有疑问，软件定制开发加微信17725354261，Q技术群：25686021
 * @date 2019/4/19
 * @description:
 */
public interface IRegisterService {

    PatientInforRspVO getCardIdInfor(GetCardIdInforReqVO reqVO) throws Exception;

    IDcardRspVO getIDcardInfor();

    BaseResponse<String> getDefaultGetCardId();

    BaseResponse<String> addPatientInfor(PatientInforReqVO reqVO) throws Exception;

    BaseResponse<String> coverCardId(PatientInforReqVO reqVO);

    List<RegisterDoctorRspVO> getAllRegisterDoctor(RegisterTypeReqVO reqVO);

    /* BaseResponse<?> changeRegisterNum(String id, String cardId);*/

    BaseResponse<String> addRegisterInfor(RegisterInforReqVO reqVO);

    PageRspBO<RegisterRecordRspVO> getRegisterRecord(RegisterRecordSearchReqVO reqVO);
}
