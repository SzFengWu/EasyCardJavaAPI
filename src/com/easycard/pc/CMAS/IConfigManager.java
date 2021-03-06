package com.easycard.pc.CMAS;

public interface IConfigManager {
	
	public static final String ROOT_DIR="config/";
	public static final String CARD_NUMBER_BLACKLIST = ROOT_DIR + "CardNumber.black";
	public static final String CARD_NUMBER_BLACKLIST_TEMP = ROOT_DIR + "CardNumber.temp";
	public static final String CARD_NUMBER_BLACKLIST_PREVER = ROOT_DIR + "CardNumber.prever";
	public static final String CA_CERT = ROOT_DIR + "CA.cer";
	public static final String API_JAR = ROOT_DIR + "EasyCardApi.jar";
	public static final String LOG4J_CONFIG_FILE = ROOT_DIR+"log4j.properties";
	
	public boolean initial();
	public boolean finish();
	
	public String getApiName();
	public void setApiName(String apiName);
	
	public String getApiVersion();
	public void setApiVersion(String verName);
	
	public String getBlackListVersion();
	public void setBlackListVersion(String verName);
	
	public String getBlackListType();
	public void setBlackListType(String type);
	
	public String getNewLocationID();
	public void setNewLocationID(String id);
	
	public String getReaderID();
	public void setReaderID(String id);
	
	public String getHostUrl();
	public void setHostUrl(String url);
			
	public String getHostIP();
	public void setHostIP(String ip);
			
	public String getHostPort();
	public void setHostPort(String port);
			
	public String getFtpUrl();
	public void setFtpUrl(String url);
			
	public String getFtpIP();
	public void setFtpIP(String ip);
	
	public int getFtpPort();
	public void setFtpPort(int port);
	
	public String getFtpLoginID();
	public void setFtpLoginID(String id);
	
	public String getFtpLoginPwd();
	public void setFtpLoginPwd(String pwd);
	
	public String getTMSerialNo();
	public void setTMSerialNo(String no);
			
	public String getBatchNo();
	public void setBatchNo(String no);
	
	
	public String getReaderPort();
	public void setReaderPort(String port);
	
	public String getTMLocationID();
	public void setTMLocationID(String id);

	public String getTMID();
	public void setTMID(String id);

	public String getTMAgentNo();
	public void setTMAgentNo(String no);

	public String getHostEnvironment();
	public void setHostEnvironment(String e);
	
	public String getNewDeviceID();
	public void setNewDeviceID(String id);
	
	public String getApiParaVer();
	public void setApiParaVer(String ver);
	

	
	
	public int getAdviceLimit();
	public void setAdviceLimit(int limit);
	
	public int getAdviceLimitLock();
	public void setAdviceLimitLock(int limit);

	public String getTxnSwitch();
	public void setTxnSwitch(String s);

	public int getCashAddUnit();
	public void setCashAddUnit(int unit);
	
	public int getAutoloadAmtLimit();
	public void setAutoloadAmtLimit(int limit);
}
