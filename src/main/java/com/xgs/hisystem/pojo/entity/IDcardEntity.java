package com.xgs.hisystem.pojo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *  @author更多免费资料获取请加公众号“前劲科技”，车联网，物联网，医院HIS，OA等高端代码获取或者代码有疑问，软件定制开发加微信17725354261，Q技术群：25686021
 * @date 2019/4/26
 * @description: 身份证信息表：将IC卡作为身份证使用
 */
@Entity
@Table(name = "his_idcard")
public class IDcardEntity {

    @Id
    @Column(name = "cardId", unique = true, nullable = false, length = 20)
    private String cardId;

    @Column(name = "name", nullable = false, length = 20)
    private String name;

    @Column(name = "sex", nullable = false, length = 4)
    private String sex;

    @Column(name = "birthday", nullable = false, length = 20)
    private String birthday;

    @Column(name = "nationality", nullable = false, length = 4)
    private String nationality;

    @Column(name = "address", nullable = false, length = 20)
    private String address;

    @Column(name = "idCard", nullable = false, length = 20)
    private String idCard;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
}
