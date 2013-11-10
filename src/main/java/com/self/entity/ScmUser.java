package com.self.entity;

import java.util.Date;

/**
 * User: shaojieyue
 * Date: 10/21/13
 * Time: 6:43 PM
 */
public class ScmUser {
    private String userCode;
    private String nick;
    private int status;
    private Date createDate;

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
