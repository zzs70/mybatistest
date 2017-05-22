package cn.bdqn.tangcco.entity;


import java.sql.Date;

/**
 * Created by hasee on 2017/5/17.
 */
public class Tbuser {
    private Integer userid;
    private String username,password,userroles,nickname;
    private Date registrationtime,systemtime,dateofbirth;

    public Date getSystemtime() {
        return systemtime;
    }

    public void setSystemtime(Date systemtime) {
        this.systemtime = systemtime;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public Date getRegistrationtime() {
        return registrationtime;
    }

    public void setRegistrationtime(Date registrationtime) {
        this.registrationtime = registrationtime;
    }

    public Tbuser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Tbuser() {
    }

    public Tbuser(Integer userid, String username, String password, String userroles, String nickname) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.userroles = userroles;
        this.nickname = nickname;
    }

    public Tbuser(String username, String password, String userroles, String nickname) {
        this.username = username;
        this.password = password;
        this.userroles = userroles;
        this.nickname = nickname;
    }

    public Tbuser(String username, String password, String userroles, String nickname, Date registrationtime, Date systemtime, Date dateofbirth) {
        this.username = username;
        this.password = password;
        this.userroles = userroles;
        this.nickname = nickname;
        this.registrationtime = registrationtime;
        this.systemtime = systemtime;
        this.dateofbirth = dateofbirth;
    }






    @Override
    public String toString() {
        return "Tbuser{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userroles='" + userroles + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserroles() {
        return userroles;
    }

    public void setUserroles(String userroles) {
        this.userroles = userroles;
    }

    public String getNickname() {
        return nickname;
    }


    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
