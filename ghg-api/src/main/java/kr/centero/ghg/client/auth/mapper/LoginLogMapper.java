package kr.centero.ghg.client.auth.mapper;

import kr.centero.ghg.client.auth.domain.model.LoginLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LoginLogMapper {
    // 로그인 로그를 추가
    void insertLoginLog(LoginLog loginLog);

    // 로그인 실패 횟수를 조회
    Integer findRecentFailureCount(@Param("username") String username);
}
