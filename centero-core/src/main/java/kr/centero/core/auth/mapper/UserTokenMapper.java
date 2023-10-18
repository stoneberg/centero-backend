package kr.centero.core.auth.mapper;

import kr.centero.core.auth.domain.model.UserToken;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserTokenMapper {
    void save(UserToken userToken);

    UserToken findByUsername(@Param("username") String username);

    void deleteByUsername(@Param("username") String username);
}
