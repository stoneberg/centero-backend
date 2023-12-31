package kr.centero.netzero.client.auth.feign;

import kr.centero.netzero.client.auth.domain.entity.CenteroUserTokenEntity;
import kr.centero.netzero.client.auth.domain.model.CenteroUserToken;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "common-server", url = "http://common-api.centero.kr:8080")
public interface UserAuthFeignClient {
    @GetMapping("/api/common/v1/auth/access-token")
    CenteroUserTokenEntity findByAccessToken(@RequestParam String accessToken);

    @PostMapping("/refresh-token")
    String refreshUserToken(@RequestBody CenteroUserToken oldUserTokenInfo);
}
