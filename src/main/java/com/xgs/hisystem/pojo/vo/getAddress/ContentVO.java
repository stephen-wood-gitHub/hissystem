package com.xgs.hisystem.pojo.vo.getAddress;

import java.util.List;

/**
 *  @author更多免费资料获取请加公众号“前劲科技”，车联网，物联网，医院HIS，OA等高端代码获取或者代码有疑问，软件定制开发加微信17725354261，Q技术群：25686021
 * @Description:
 * @date 2019/3/23
 */
public class ContentVO {

    private String address;

    private AddressDetailVO address_detail;

    private PointVO point;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public AddressDetailVO getAddress_detail() {
        return address_detail;
    }

    public void setAddress_detail(AddressDetailVO address_detail) {
        this.address_detail = address_detail;
    }

    public PointVO getPoint() {
        return point;
    }

    public void setPoint(PointVO point) {
        this.point = point;
    }
}
