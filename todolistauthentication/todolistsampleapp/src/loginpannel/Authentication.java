package loginpannel;

import module.AppFrame;
import user.GetUserDetails;
import user.UserPasswordContainer;

public class Authentication {
	static String loginpanelusermail;
	String loginpanelpassword;

	public Authentication(LoginUserData userinfo)throws NullPointerException {
		
		//Data from login dilog box
		loginpanelusermail=userinfo.getUsermail();
		loginpanelpassword=userinfo.getPassword();
		
		//Test case
		//System.out.println(loginpanelusermail);
		//System.out.println(loginpanelpassword);
		
		GetUserDetails user=new GetUserDetails();
		UserPasswordContainer container=user.getUserDetails();
		
		//Password from Database
		String pass=container.getPassvalue();
		//Test case
		//System.out.println(pass);
		
		if(pass!=null && pass.equals(loginpanelpassword)) {
			new AppFrame();
		}
		else {
			(new LoginForm()).label3.setText("Invlid cridentials");;
		}
	}
	public static String getUserMailFromLoginPannel() {
		return loginpanelusermail;
	}

}
