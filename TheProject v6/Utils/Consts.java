package Utils;

import java.net.URLDecoder;

public class Consts {
	
	protected static final String DB_FILEPATH = getDBPath();
	public static final String CONN_STR = "jdbc:ucanaccess://" + DB_FILEPATH + ";COLUMNORDER=DISPLAY";
	public static final String SQL_SEL_USERS = "SELECT * FROM tblUser";
	public static final String SQL_SEL_PAYTRANSACTIONS = "SELECT * FROM tblTransactionPay";
	public static final String SQL_SEL_CONFIRMTRANSACTIONS = "SELECT * FROM tblTransactionConfirm";
	public static final String SQL_SEL_SPACEWALLRT = "SELECT * FROM tblWalletSpace";
	public static final String SQL_SEL_KNOTSWALLRT = "SELECT * FROM tblWalletKnots";
	public static final String SQL_SEL_ADVICE= "SELECT * FROM tblAdvice";
	public static final String SQL_INS_NEWADVICE = "{ call addAdvice(?,?,?,?) }";
	public static final String SQL_INS_NEWPAY = "{ call addPay(?,?,?,?,?,?,?,?,?,?,?,?,?) }";
	public static final String SQL_INS_NEWCONFIRM = "{ call addConfirm(?,?,?,?,?,?,?,?,?,?,?,?,?,?) }";
	

	
	
	
	
	
	
	
	
	
	private static String getDBPath() {
		try {
			String path = Consts.class.getProtectionDomain().getCodeSource().getLocation().getPath();
			String decoded = URLDecoder.decode(path, "UTF-8");
			if (decoded.contains(".jar")) {
				decoded = decoded.substring(0, decoded.lastIndexOf('/'));
				return decoded + "/Model/DataBase_Hw1_319412094_312181605.accdb";
			} else {
				decoded = decoded.substring(0, decoded.lastIndexOf("/"));
				return decoded + "/Model/DataBase_Hw1_319412094_312181605.accdb";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
