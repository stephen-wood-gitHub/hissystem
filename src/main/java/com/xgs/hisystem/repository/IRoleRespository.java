package com.xgs.hisystem.repository;

import com.xgs.hisystem.pojo.entity.RoleEntity;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 *  @author更多免费资料获取请加公众号“前劲科技”，车联网，物联网，医院HIS，OA等高端代码获取或者代码有疑问，软件定制开发加微信17725354261，Q技术群：25686021
 * @Description:
 * @date 2019/3/20
 */
public interface IRoleRespository extends BaseRepository<RoleEntity> {

    RoleEntity findByRole(String role);

    RoleEntity findByRoleValue(Integer value);

    RoleEntity findByDescription(String roleName);

    @Query(nativeQuery = true,value = "SELECT c.* FROM his_user a RIGHT JOIN his_user_role b ON a.id = b.uid LEFT JOIN his_role c ON b.role_id = c.id WHERE a.id = ?1 AND b.role_status = 1")
    List<RoleEntity> findByUserIdAndRoleStatus(String userId);
}
