package br.com.ifms.tads.tadsConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class webSecurityConfig  extends WebSecurityConfigurerAdapter {
    
     
    @Override
    protected void configure(HttpSecurity http) throws Exception {

      http.authorizeRequests().anyRequest().authenticated().and()
      .httpBasic();

    }
    

  @Autowired
  public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
       auth.inMemoryAuthentication()
       .withUser("Deivison").password("pass06").roles("USER")
       .and()
       .withUser("kayblack").password("negrones").roles("USER", "ADMIN");
  }

}
