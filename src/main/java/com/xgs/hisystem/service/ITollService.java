package com.xgs.hisystem.service;

import com.xgs.hisystem.pojo.bo.BaseResponse;
import com.xgs.hisystem.pojo.vo.register.GetCardIdInforReqVO;
import com.xgs.hisystem.pojo.vo.toll.*;

import java.util.List;

/**
 *  @author更多免费资料获取请加公众号“前劲科技”，车联网，物联网，医院HIS，OA等高端代码获取或者代码有疑问，软件定制开发加微信17725354261，Q技术群：25686021
 * @date 2019-5-14
 * @description:
 */
public interface ITollService {

    cardRspVO getCardIdInfor();

    List<TollRspVO> getAllMedicalRecord(String cardId, String tollStatus);

    TollMedicalRecordRspVO getMedicalRecord(String cardId, String registerId) throws Exception;

    BaseResponse<String> saveTollInfo(SaveTollInfoReqVO reqVO);

    BaseResponse<GetExaminationTollInfoRspVO> getExaminationTollInfo(GetCardIdInforReqVO reqVO);

    BaseResponse<String> saveExaminationTollInfo(String registerId);
}