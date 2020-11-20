package com.xgs.hisystem.pojo.vo.getAddress;

import com.xgs.hisystem.pojo.vo.getAddress.ContentVO;

import java.util.List;

/**
 *  @author更多免费资料获取请加公众号“前劲科技”，车联网，物联网，医院HIS，OA等高端代码获取或者代码有疑问，软件定制开发加微信17725354261，Q技术群：25686021
 * @Description:
 * @date 2019/3/23
 */
public class GetAddressRspVO {

    private String address;

    private ContentVO content;

    private int status;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ContentVO getContent() {
        return content;
    }

    public void setContent(ContentVO content) {
        this.content = content;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
