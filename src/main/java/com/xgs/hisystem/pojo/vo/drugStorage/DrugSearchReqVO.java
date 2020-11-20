package com.xgs.hisystem.pojo.vo.drugStorage;

import com.xgs.hisystem.pojo.vo.BasePageReqVO;

/**
 *  @author更多免费资料获取请加公众号“前劲科技”，车联网，物联网，医院HIS，OA等高端代码获取或者代码有疑问，软件定制开发加微信17725354261，Q技术群：25686021
 * @date 2019-6-5
 * @description:
 */
public class DrugSearchReqVO extends BasePageReqVO {

    private String drug;

    private String drugType_search;

    private String efficacyClassification_search;

    private String limitStatus_search;

    public String getDrug() {
        return drug;
    }

    public void setDrug(String drug) {
        this.drug = drug;
    }

    public String getDrugType_search() {
        return drugType_search;
    }

    public void setDrugType_search(String drugType_search) {
        this.drugType_search = drugType_search;
    }

    public String getEfficacyClassification_search() {
        return efficacyClassification_search;
    }

    public void setEfficacyClassification_search(String efficacyClassification_search) {
        this.efficacyClassification_search = efficacyClassification_search;
    }

    public String getLimitStatus_search() {
        return limitStatus_search;
    }

    public void setLimitStatus_search(String limitStatus_search) {
        this.limitStatus_search = limitStatus_search;
    }
}
