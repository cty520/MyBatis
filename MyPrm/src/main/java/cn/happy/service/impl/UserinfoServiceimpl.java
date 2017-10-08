package cn.happy.service.impl;

import cn.happy.Util.MybatisUtil;
import cn.happy.entity.UserInfo;
import cn.happy.service.IUserInfoService;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by adminastrator on 2017/9/21.
 */
public class UserinfoServiceimpl implements IUserInfoService {
    UserInfoDAO dao;
    SqlSession session;
    public UserinfoServiceimpl() {
        session = MybatisUtil.getSession();
        dao= session.getMapper(UserInfoDAO.class);
    }

    public UserInfo isLogin(UserInfo info) {
        return  null;
    }

    public List<UserInfo> findAll() {
        return null;
    }
}