package com.xgs.hisystem.repository;

import com.xgs.hisystem.pojo.entity.AnnouncementEntity;

import java.util.List;

/**
 *  @author更多免费资料获取请加公众号“前劲科技”，车联网，物联网，医院HIS，OA等高端代码获取或者代码有疑问，软件定制开发加微信17725354261，Q技术群：25686021
 * @date 2019/4/11
 * @description:
 */
public interface IAnnouncementRepository extends BaseRepository<AnnouncementEntity> {

    AnnouncementEntity findByTitle(String title);

    List<AnnouncementEntity> findByAnnStatus(int annStatus);
}
