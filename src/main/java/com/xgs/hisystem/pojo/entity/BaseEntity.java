package com.xgs.hisystem.pojo.entity;

import com.xgs.hisystem.util.DateUtil;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 *  @author更多免费资料获取请加公众号“前劲科技”，车联网，物联网，医院HIS，OA等高端代码获取或者代码有疑问，软件定制开发加微信17725354261，Q技术群：25686021
 * @Description:
 * @date 2019/2/14
 */
@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(generator = "paymentableGenerator")
    @GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
    private String id;

    @Column(name = "create_datetime", length = 20, nullable = false)
    private String createDatetime = DateUtil.getCurrentDateToString();// 创建时间 yyyy-MM-dd hh:mm:ss

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(String createDatetime) {
        this.createDatetime = createDatetime;
    }

}