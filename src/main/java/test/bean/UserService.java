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

    private String name;

    public UserService(String name)
    {
        this.name = name;
    }

    public void queryUserInfo()
    {
        System.out.println("查询用户信息：" + name);
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("");
        sb.append("").append(name);
        return sb.toString();
    }
}
