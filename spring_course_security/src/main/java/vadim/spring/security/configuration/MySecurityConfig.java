package vadim.spring.security.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

import static org.springframework.security.config.Customizer.withDefaults;


@EnableWebSecurity
public class MySecurityConfig // extends WebSecurityConfigurerAdapter

 {

     @Autowired
     DataSource dataSource;



//    public void configure(AuthenticationManagerBuilder auth) throws Exception {

     //DB
     //auth.jdbcAuthentication().datasource(dataSource);

//        User.UserBuilder userBuilder = User.withDefaultPasswordEncoder();
//        auth.inMemoryAuthentication()
//                .withUser(userBuilder.username("vadim").password("vadim").roles("EMPLOYEE"))
//                .withUser(userBuilder.username("ramina").password("ramina").roles("HR"))
//                .withUser(userBuilder.username("max").password("max").roles("MANAGER", "HR"));
//    }

//    public void configure (HttpSecurity http) throws Exception {
//        http.authorizeRequests().antMatchers
//    }


}
