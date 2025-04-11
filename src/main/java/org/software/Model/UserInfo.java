package org.software.Model;

import java.util.ArrayList;
import java.util.*;
public class UserInfo {
    private String userName;
    private int userId;
    private String userMobileNo;
    private String userLocation;
    private List<Books>borrowedBooks;

    public UserInfo()
    {
        this.userName=null;
        this.userId=0;
        this.userMobileNo=null;
        this.userLocation=null;
        this.borrowedBooks=new ArrayList<>();
    }

    public UserInfo(String uname, int uid,String mobileno,String location)
    {
        this.userName=uname;
        this.userId=uid;
        this.userMobileNo=mobileno;
        this.userLocation=location;
        this.borrowedBooks=new ArrayList<>();

    }

    //Setters Starting...
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserMobileNo(String userMobileNo) {
        this.userMobileNo = userMobileNo;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }
    public void setBorrowedBooks(Books bk)
    {
        this.borrowedBooks.add(bk);
    }


    //Getter starting....


    public String getUserName() {
        return userName;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserMobileNo() {
        return userMobileNo;
    }

    public String getUserLocation() {
        return userLocation;
    }
    public List getUserborrowList()
    {
        return borrowedBooks;
    }
}
