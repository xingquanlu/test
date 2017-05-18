import java.io.Serializable;

public class UserInfo implements Serializable {

    public static void main(String[] args){ 
        String userName = "Andy";
        String age = "24";
        String job = "Developer";
        String info = userName + age + job;
        System.out.println(info);
        System.out.println("HelloWorld"); 
    } 

    // private static final long serialVersionUID = 1L;
    public String uname = "";
    public String uuid = "";
    public String prenum = "";
    public String phone = "";
    public String email = "";
    public int isactive = 0;
    public String pwd = "";
    public int status = -1;
    public int verifyStatus = -1;
    public int isObtainVerifyCode = 0;
    public String modifyPhone = "";
    public String exptime = "";
    public int loginStatus = -1;
    public int avOrOrderdetailFlag = 0;
    public int loginT = 0;
    public String paramData = "";
    public String verifyOrCheckCode = "";
    public String userid = "";
    public String displayName;
    public String imageurl;

    public UserInfo() {
      new A(){
        public void b(){
          int c;
        }
      };
    }
    
    interface A{
       public void b();
    }
}
