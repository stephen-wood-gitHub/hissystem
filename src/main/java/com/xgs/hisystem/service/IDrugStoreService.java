package com.xgs.hisystem.service;

import com.xgs.hisystem.pojo.bo.BaseResponse;
import com.xgs.hisystem.pojo.bo.PageRspBO;
import com.xgs.hisystem.pojo.vo.drugStorage.DrugReqVO;
import com.xgs.hisystem.pojo.vo.drugStorage.DrugRspVO;
import com.xgs.hisystem.pojo.vo.drugStorage.DrugSearchReqVO;

import java.util.List;

/**
 *  @author更多免费资料获取请加公众号“前劲科技”，车联网，物联网，医院HIS，OA等高端代码获取或者代码有疑问，软件定制开发加微信17725354261，Q技术群：25686021
 * @date 2019-5-12
 * @description:
 */
public interface IDrugStoreService {

    BaseResponse<String> addNewDrug(DrugReqVO reqVO);

    BaseResponse<String> addDrugType(String drugType);

    BaseResponse<String> addEfficacyClassification(String efficacyClassification);

    List<String> getAllDrugType();

    List<String> getAllEfficacyClassification();

    DrugRspVO getDrugInfor(String drug);

    BaseResponse<String> addStorageQuantity(String drug, String addStorageQuantity);

    PageRspBO<DrugRspVO> getAllDrug(DrugSearchReqVO reqVO);

    BaseResponse<String> updateDrug(DrugReqVO reqVO);

    BaseResponse<String> deleteDrug(String drugName);
}
