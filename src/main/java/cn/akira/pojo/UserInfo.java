package cn.akira.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable {
    /**
     * 用户id
     */
    private Integer id;

    /**
     * 用户头像
     */
    private String headIcon = "default_head_icon.png";

    /**
     * 性别(0或null:未设置, 1:男, 2:女, 3:其他性别, 4:保密)
     */
    private String gender;

    /**
     * 出生日期
     */
    @JSONField(format = "yyyy-MM-dd")
    private Date birthday;

    /**
     * 联系手机(默认为绑定手机)
     */
    private String phone;

    /**
     * 联系电话
     */
    private String tel;

    /**
     * 联系邮箱
     */
    private String email;

    /**
     * 联系地址
     */
    private String addr;

    /**
     * 注册时间(不可修改)
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date regDate;

    private static final long serialVersionUID = 1L;

    public String getHeadIcon() {
        return headIcon;
    }

    public void setHeadIcon(String headIcon) {
        this.headIcon = headIcon;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone.replace(" ", "").equals("")?null:phone;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel.replace(" ", "").equals("")?null:tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email.replace(" ", "").equals("")?null:email;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr.replace(" ", "").equals("")?null:addr;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", phone='" + phone + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", addr='" + addr + '\'' +
                ", regDate=" + regDate +
                '}';
    }
}