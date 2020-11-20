package com.xgs.hisystem.pojo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *  @author更多免费资料获取请加公众号“前劲科技”，车联网，物联网，医院HIS，OA等高端代码获取或者代码有疑问，软件定制开发加微信17725354261，Q技术群：25686021
 * @date 2019-5-23
 * @description: 药物功效分类表
 */
@Entity
@Table(name = "his_efficacyClassification")
public class EfficacyClassificationEntity extends BaseEntity {

    @Column(name = "efficacyClassification", nullable = false, length = 50)
    private String efficacyClassification;

    public String getEfficacyClassification() {
        return efficacyClassification;
    }

    public void setEfficacyClassification(String efficacyClassification) {
        this.efficacyClassification = efficacyClassification;
    }
}
