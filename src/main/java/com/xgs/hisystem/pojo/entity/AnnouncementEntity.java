package com.xgs.hisystem.pojo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *  @author更多免费资料获取请加公众号“前劲科技”，车联网，物联网，医院HIS，OA等高端代码获取或者代码有疑问，软件定制开发加微信17725354261，Q技术群：25686021
 * @date 2019/4/11
 * @description: 公告表
 */
@Entity
@Table(name = "his_announcement")
public class AnnouncementEntity extends BaseEntity {

    @Column(name = "title")
    private String title;

    @Column(name = "contents")
    private String contents;

    @Column(name = "ann_status")
    private Integer annStatus;

    @Column(name = "ann_date")
    private String annDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Integer getAnnStatus() {
        return annStatus;
    }

    public void setAnnStatus(Integer annStatus) {
        this.annStatus = annStatus;
    }

    public String getAnnDate() {
        return annDate;
    }

    public void setAnnDate(String annDate) {
        this.annDate = annDate;
    }
}
