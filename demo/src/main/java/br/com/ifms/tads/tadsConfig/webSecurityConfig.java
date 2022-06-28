package br.com.ifms.tads.tadsConfig;
/* 
import org.apache.catalina.authenticator.SpnegoAuthenticator.AuthenticateAction;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class webSecurityConfig  extends WebSecurityConfigurerAdapter {
    
     
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

         auth.inMemoryAuthentication()
         .withUser("aluno").password("123").roles("USER", "ADMIN")
         .and()
         .withUser("tecnico").password("123").roles("ADMIN");
         

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
       
         http.authorizeRequests().anyRequest().authenticated()
         .and()
         .httpBasic()
         .and()
         .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
         
    }
}
*/