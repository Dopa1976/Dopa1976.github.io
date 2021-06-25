package com.gcxy.dao;

import java.util.List;

import com.gcxy.domain.Menu;
import com.gcxy.domain.Role;
import com.gcxy.domain.RoleControl;
import com.gcxy.domain.UserInfo;
import com.gcxy.vo.UserManagerVo;

public interface UserManagerDao {
List<UserManagerVo> queryAll();
List<UserManagerVo> queryByCondition(String name);
void delete(int ids);
List<Menu> queryByUserId(int id);
List<UserInfo> queryUserAll();
List<Role> queryAllRole();
List<Menu> queryCanById(int id);
void addUserManager(Integer roleId, Integer ids);
}
