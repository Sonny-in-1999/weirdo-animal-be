package kr.co.neighbor21.weirdoanimalbe.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        Info info = new Info()
                .version("v1.0.0")
                .title("이상한 동물 갤러리 API Docs")
                .description("요청사항은 옆자리에 문의하세요.");

        return new OpenAPI()
                .info(info);
    }
}
