package cn.hacklike.fo.config;

import cn.hacklike.fo.service.impl.CustomUserService;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    UserDetailsService customUserService(){
        //注册UserDetailsService 的bean
        return new CustomUserService();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        //关闭防止网站攻击
        http.csrf().disable();

        http.authorizeRequests()
                .antMatchers("/go/login")
                .permitAll()//放行注册页
                .antMatchers("/**/public/**","/js/**","/static/**","/css/**","/file/**","/img/**","/layui/**")
                .permitAll()//放行静态资源
                .anyRequest().authenticated()  // 其他地址的访问均需验证权限
                .and()
                .formLogin()
                .loginPage("/go/login")  //  登录页
                .loginProcessingUrl("/login") //处理表单的路径
                .defaultSuccessUrl("/go/index")
                .failureUrl("/error").permitAll()
                .and()
                .logout()
                .logoutSuccessUrl("/go/login").and().csrf().disable();
        ;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        //验证service
        //security的密码需要指定加密格式
        auth.userDetailsService(customUserService()).passwordEncoder(new BCryptPasswordEncoder());

    }
}
