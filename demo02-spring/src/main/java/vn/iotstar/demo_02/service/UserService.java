package vn.iotstar.demo_02.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import vn.iotstar.demo_02.entity.UserInfo;
import vn.iotstar.demo_02.repository.UserInfoRepository;
@Service
public record UserService(UserInfoRepository repository, 
		PasswordEncoder passwordEncoder) {
	public String addUser(UserInfo userInfo)
	{
		userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
		repository.save(userInfo);
		return "Thêm user thành công!";
	}

}
