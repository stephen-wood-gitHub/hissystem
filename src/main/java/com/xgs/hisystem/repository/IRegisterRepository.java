package com.xgs.hisystem.repository;

import com.xgs.hisystem.pojo.entity.RegisterEntity;

import java.util.List;

/**
 *  @author更多免费资料获取请加公众号“前劲科技”，车联网，物联网，医院HIS，OA等高端代码获取或者代码有疑问，软件定制开发加微信17725354261，Q技术群：25686021
 * @date 2019/4/26
 * @description:
 */
public interface IRegisterRepository extends BaseRepository<RegisterEntity> {

    List<RegisterEntity> findByPatientId(String id);

    RegisterEntity findByRegisteredNum(String registerNum);

}
