package vn.iotstar.demo_02.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserDetailService {

	UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

}
