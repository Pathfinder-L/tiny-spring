package test.bean;



/*
 * TODO
 *  @version 1.0
 *  @author Administrator
 *  @date   2023/3/4 12:58
 *
 * */
public class UserService
{

    private String uId;

    private UserDao userDao;

    public String queryUserInfo()
    {
        return "查询用户信息：" + userDao.queryUserName(uId);
    }

    public String getuId()
    {
        return uId;
    }

    public void setuId(String uId)
    {
        this.uId = uId;
    }

    public UserDao getUserDao()
    {
        return userDao;
    }

    public void setUserDao(UserDao userDao)
    {
        this.userDao = userDao;
    }
}
