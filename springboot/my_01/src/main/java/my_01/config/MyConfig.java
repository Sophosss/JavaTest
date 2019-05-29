package my_01.config;

import my_01.component.LoginHandlerInterceptor;
import my_01.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class MyConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry){
		registry.addViewController("/jiuzi").setViewName("success");
	}

    @Bean
	public WebMvcConfigurer webMvcConfigurer(){
		WebMvcConfigurer webMvcConfigurer = new WebMvcConfigurer() {
			@Override
			public void addViewControllers(ViewControllerRegistry registry) {
				registry.addViewController("/").setViewName("login");
				registry.addViewController("/index.html").setViewName("login");
				registry.addViewController("/main.html").setViewName("dashboard");
			}

			@Override
			public void addInterceptors(InterceptorRegistry registry) {
				registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
						.excludePathPatterns("/index.html","/","/user/login");

			}
		};
		return webMvcConfigurer;
	}

	@Bean
	public LocaleResolver localeResolver(){
		return new MyLocaleResolver();
	}
}


