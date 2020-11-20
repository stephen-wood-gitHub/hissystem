package com.xgs.hisystem.service;

import com.xgs.hisystem.pojo.bo.BaseResponse;
import com.xgs.hisystem.pojo.bo.PageRspBO;
import com.xgs.hisystem.pojo.vo.*;

import java.util.List;

/**
 *  @author更多免费资料获取请加公众号“前劲科技”，车联网，物联网，医院HIS，OA等高端代码获取或者代码有疑问，软件定制开发加微信17725354261，Q技术群：25686021
 * @date 2019/4/3
 * @description:
 */
public interface IAdminService {

    BaseResponse<String> createRole(RoleVO roleVO);

    BaseResponse<String> addRole(AddRoleVO addRoleVO);

    PageRspBO<applyRspVO> getRoleApply(BasePageReqVO reqVO);

    BaseResponse<String> saveUserAndSendEmailTemp(UserRegisterReqVO reqVO);

    List<applyRspVO> getRoleNotice();

    BaseResponse<?> changeRoleStatus(String status, String email);

    BaseResponse<String> addAnnouncement(AnnouncementVO reqVO);

    PageRspBO<AnnouncementVO> getAnnouncement(BasePageReqVO reqVO);

    BaseResponse<String> changeAnnouncement(AnnouncementVO announcementVO);

    BaseResponse<String> deleteAnnouncement(String id);

    BaseResponse<String> showAnnouncement(String id);

    BaseResponse<String> hiddenAnnouncement(String id);

    BaseResponse<String> addDepartment(AddDepartmentReqVO reqVO);

    List<GetDepartmentRspVO> getDepartment();
}
