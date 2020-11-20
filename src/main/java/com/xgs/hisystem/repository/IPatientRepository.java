package com.xgs.hisystem.repository;

import com.xgs.hisystem.pojo.entity.PatientEntity;

/**
 *  @author更多免费资料获取请加公众号“前劲科技”，车联网，物联网，医院HIS，OA等高端代码获取或者代码有疑问，软件定制开发加微信17725354261，Q技术群：25686021
 * @date 2019/4/27
 * @description:
 */
public interface IPatientRepository extends BaseRepository<PatientEntity> {

    PatientEntity findByCardId(String cardID);

    PatientEntity findByIdCard(String IDcard);
}
