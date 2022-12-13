package co.stay.prj.login.service;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import lombok.Getter;

@Getter
public class CustomUser extends User {
	private LoginVO login;   
	   public CustomUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
	      super(username, password, authorities);
	   }   
	   public CustomUser(LoginVO vo) {
	      super(vo.getUserId(), 
	            vo.getUserPw(), 
	            Collections.singletonList(new SimpleGrantedAuthority(vo.getUserAuthor())));
	      this.login = vo;
	   }
	
	
}
