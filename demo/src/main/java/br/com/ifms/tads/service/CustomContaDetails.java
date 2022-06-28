package br.com.ifms.tads.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import br.com.ifms.tads.javabeans.Conta;
import br.com.ifms.tads.repository.ContaRepository;

/* 
@Component
public class CustomContaDetails implements UserDetailsService {

 //   private final ContaRepository contaRepository;

   // public CustomContaDetails(ContaRepository contaRepository) {
    //    this.contaRepository = contaRepository;
  ///  }
/*     
 
        
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Conta user = Optional.ofNullable(contaRepository.findByUsername(username))
                .orElseThrow(() -> new UsernameNotFoundException("Conta nao encontrada!!!"));
        List<GrantedAuthority> authorityListAdmin = AuthorityUtils.createAuthorityList("ROLE_USER", "ROLE_ADMIN");
        List<GrantedAuthority> authorityListUser = AuthorityUtils.createAuthorityList("ROLE_USER");
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
                true ? authorityListAdmin : authorityListUser);

    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        return null;
    }
}
*/