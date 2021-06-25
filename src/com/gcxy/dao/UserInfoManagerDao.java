/**
 * 
 */
package com.gcxy.dao;

import java.util.List;

import com.gcxy.vo.UserInfoManagerVo;
import com.gcxy.vo.UserManagerVo;

/**
 * @author chengliang
 *
 */
public interface UserInfoManagerDao {
List<UserInfoManagerVo> queryUserInfo();
List<UserInfoManagerVo> queryByCondition(String name);
void delete(int ids);
}
