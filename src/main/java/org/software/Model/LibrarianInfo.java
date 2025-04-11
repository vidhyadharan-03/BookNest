package org.software.Model;

public class LibrarianInfo {
    private String libName;
    private int libId;
    private String libMobileNo;
    private String libLocation;


    public LibrarianInfo()
    {
        this.libName=null;
        this.libId=0;
        this.libMobileNo=null;
        this.libLocation=null;
    }
    public LibrarianInfo(String lbname,int lbid,String lbmobile,String lblocation)
    {
        this.libName=lbname;
        this.libId=lbid;
        this.libMobileNo=lbmobile;
        this.libLocation=lblocation;
    }


    public void setLibName(String libName) {
        this.libName = libName;
    }

    public void setLibId(int libId) {
        this.libId = libId;
    }

    public void setLibMobileNo(String libMobileNo) {
        this.libMobileNo = libMobileNo;
    }

    public void setLibLocation(String libLocation) {
        this.libLocation = libLocation;
    }


    public String getLibName() {
        return libName;
    }

    public int getLibId() {
        return libId;
    }

    public String getLibMobileNo() {
        return libMobileNo;
    }

    public String getLibLocation() {
        return libLocation;
    }
}
