public class UserDetailsModel {
  String uname, address, contactno, loginid, password;

  public UserDetailsModel(){
      
  }
    public UserDetailsModel(String uname, String address, String contactno, String loginid, String password) {
        this.uname = uname;
        this.address = address;
        this.contactno = contactno;
        this.loginid = loginid;
        this.password = password;
        System.out.println("Constructor");
    }

    public String getUname() {
        return uname;
    }

    public String getAddress() {
        return address;
    }

    public String getContactno() {
        return contactno;
    }

    public String getLoginid() {
        return loginid;
    }

    public String getPassword() {
        return password;
    }
 
    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
