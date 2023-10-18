package kr.centero.common.auth.mapstruct;

import kr.centero.common.auth.domain.dto.UserAuthDto;
import kr.centero.common.auth.domain.model.SignupUser;
import kr.centero.common.common.config.MapStructMapperConfig;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = MapStructMapperConfig.class)
public interface UserAuthMapstruct {
    UserAuthMapstruct INSTANCE = Mappers.getMapper(UserAuthMapstruct.class);

    SignupUser toUserModel(UserAuthDto.SignupRequest signupRequest);
}