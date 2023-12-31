package kr.centero.ghg.client.auth.mapper;

import kr.centero.ghg.client.auth.domain.model.UserToken;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserTokenMapper {
    void save(UserToken userToken);

    UserToken findByUsername(@Param("username") String username);

    void deleteByUsername(@Param("username") String username);
}
