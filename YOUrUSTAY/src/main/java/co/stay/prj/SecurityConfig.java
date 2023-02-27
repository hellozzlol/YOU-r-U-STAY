package co.stay.prj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.AccessDeniedHandler;

import co.stay.prj.login.service.UService;



@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public UService userService() {
		return new UService();
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	

	@Bean
	public AccessDeniedHandler accessDeniedHandler() {
		return new WebAccessDenyHandler();
	}
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((requests) -> 
							requests
							.antMatchers("/usersboardList","/login","/loginForm","/static/**"
									,"/templates/**","/boardList","/joinForm","/marketList","/myhomeList","/qnaList").permitAll()
							.anyRequest().authenticated())
				.formLogin().loginPage("/loginForm")
							.usernameParameter("userId")
							.usernameParameter("userPw")
							.defaultSuccessUrl("/main")
							.and()
				.logout().logoutUrl("/logout")
					      .logoutSuccessUrl("/index")
						 .invalidateHttpSession(true)
						 .deleteCookies("JSESSIONID")
						 .and()
				.exceptionHandling()
					     .accessDeniedHandler(accessDeniedHandler())
					     .and()
				.csrf().disable()
				.userDetailsService(userService());
		http.headers().frameOptions().disable();
		return http.build();
	}
	
	
	
	@Bean
	public WebSecurityCustomizer webSecurityCustomizer() {
		return (web) -> web.ignoring().antMatchers("/dist/**", "/admin/**", "/fullcalendar/**","/js/**");
	}
	
	
}