package com.xgs.hisystem.pojo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *  @author更多免费资料获取请加公众号“前劲科技”，车联网，物联网，医院HIS，OA等高端代码获取或者代码有疑问，软件定制开发加微信17725354261，Q技术群：25686021
 * @date 2019-5-23
 * @description: 药物类型：注射剂、片剂、胶囊、、、
 */
@Entity
@Table(name = "his_drugType")
public class DrugTypeEntity extends BaseEntity {

    @Column(name = "drugType", nullable = false, length = 50)
    private String drugType;

    public String getDrugType() {
        return drugType;
    }

    public void setDrugType(String drugType) {
        this.drugType = drugType;
    }
}
