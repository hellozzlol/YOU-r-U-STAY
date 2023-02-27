package co.stay.prj.login.mapper;

import co.stay.prj.login.service.LoginVO;
import co.stay.prj.users.service.UsersVO;

public interface LoginMapper {
LoginVO login(UsersVO vo);
LoginVO login(LoginVO vo);
}
