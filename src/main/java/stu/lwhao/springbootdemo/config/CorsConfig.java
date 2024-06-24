package stu.lwhao.springbootdemo.config;

/**
 * @author : Luowenhao221
 * @date : 2024/6/23 下午5:03
 * @Project : springbootdemo
 */
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:5173") // Vue应用的地址
                .allowedMethods("*")
                .allowedHeaders("*");
    }
}