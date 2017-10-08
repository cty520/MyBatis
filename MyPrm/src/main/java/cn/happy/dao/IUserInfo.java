package cn.happy.dao;

        import cn.happy.entity.UserInfo;

        import java.util.List;

/**
 * Created by adminastrator on 2017/9/21.
 */
public interface IUserInfo {
    public UserInfo isLogin(UserInfo info);

    public List<UserInfo> findAll();
}
