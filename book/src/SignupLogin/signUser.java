package SignupLogin;

import java.sql.SQLException;

import textSQL.addUserPassword;

public class signUser {
	public static void main(String[] args)throws ClassNotFoundException, SQLException  {
		addUserPassword adduser = new addUserPassword();
		adduser.adduserpassword("1111111", "11111111");
	}

}
