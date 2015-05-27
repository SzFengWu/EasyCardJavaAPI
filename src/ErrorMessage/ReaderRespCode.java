package ErrorMessage;





public enum ReaderRespCode implements IRespCode{
	_9970("9970","讀卡機無回應請檢查讀卡機",1),
	_9969("9969","讀卡機發送錯誤請檢查讀卡機",1),
	_9968("9968","讀卡機連線錯誤請檢查讀卡機",1),
	_9000("9000","執行成功",1),
	_6001("6001","CLA, INS ERROR",1),
	_6002("6002","P1, P2 ERROR",1),
	_6003("6003","LC, LE ERROR",1),
	_6004("6004","CHECK SUM ERROR",1),
	_6005("6005","DATA ERROR",1),
	_6088("6088","線路不良／Time Out",1),
	_6101("6101","票卡不適用(AID Error)",1),
	_6102("6102","Issuer Code Error",1),
	_6103("6103","CPD Error",1),
	_6104("6104","未開卡之票卡票卡狀態不符",1),
	_6105("6105","主要票值格式錯誤",1),
	_6106("6106","備份票值格式錯誤",1),
	_6107("6107","電子票值格式錯誤",1),
	_6108("6108","票卡過期",1),
	_6109("6109","票卡已鎖卡",1),
	_610A("610A","票卡內檢核碼錯誤",1),
	_610B("610B","Two FAT Error",1),
	_610C("610C","FAT Content Error",1),
	_610D("610D","票卡起始日期未到",1),
	_610E("610E","CTC或TSQN超出限制",1),
	_610F("610F"," Mifare Locked(6999)",1),
	_6111("6111","未先正確執行CPU卡上一步驟或CPU卡驗證失敗",1),
	_6201("6201","找不到卡片",1),
	_6202("6202","讀卡失敗",1),
	_6203("6203","寫卡失敗",1),
	_6204("6204","多張卡",1),
	_6205("6205","RC531 load key失敗",1),
	_6206("6206","RC531 Auth失敗",1),
	_6207("6207","CPU卡Record not found超出範圍",1),
	_6208("6208","CPU卡Record不支援MAC或MAC錯誤",1),
	_6301("6301","SAM認證失敗",1),
	_6302("6302","未先正確執行SAM上一步驟",1),
	_6303("6303","無SAM卡",1),
	_6304("6304","請重試登入動作",1),
	_6305("6305","請重試登入動作",1),
	_6306("6306","SAM卡加值額度(CA)不足 ",1),
	_6307("6307","舊SAM卡異常",1),
	_6308("6308","需再執行端末驗證以更新SAM參數",1),
	_6309("6309","新SAM卡異常",1),
	_630A("630A","新舊SAM卡皆異常",1),
	_630B("630B","STC超出限制",1),
	_630C("630C","SAM卡不支援該功能",1),
	_6401("6401","取消交易與上一筆交易不符",1),
	_6402("6402","交易金額超過額度",1),
	_6403("6403","餘額不足",1),
	_6404("6404","卡號錯誤",1),
	_6405("6405","H-TAC內容認證錯誤 load key失敗",1),
	_6406("6406","禁用名單展期異動名單票卡",1),
	_6407("6407","非社福卡不需展期",1),
	_6408("6408","HOST判斷不需展期",1),
	_6409("6409","自動加值旗標未啟用",1),
	_640A("640A","票卡自動加值金額為零",1),
	_640B("640B","所查詢的該筆扣值Log資料不存在",1),
	_640C("640C","累計小額消費(購貨)金額超出日限額",1),
	_640D("640D","單次小額消費(購貨)金額超出次限額",1),
	_640E("640E","卡片異常請冾悠遊卡客服",1),
	_640F("640F","Reader累計加值金額超出額度管控限制",1),
	_6410("6410","票卡不適用（非普通卡）",1),
	_6411("6411","票卡押金不符（押金非100）",1),
	_6412("6412","超過通路退卡交易額度(餘額>1000)",1),
	_6413("6413","製卡日未滿三個月",1),
	_6414("6414","卡片使用次數未滿五次",1),
	_6415("6415","需執行交易合法驗證",1),
	_6416("6416","自動加值旗標已啟用",1),
	_6417("6417","票卡已開卡",1),
	_6418("6418","票卡於此通路限制使用",1),
	_6419("6419","CPU卡票卡狀態不適用此交易",1),
	_641A("641A","PPR_SignOn檢核碼(EDC)錯誤",1),
	_641B("641B","交易欄位資料不適用此交易(CPU卡)",1),
	_641C("641C","交易欄位資料不適用此交易(SAM卡)",1),
	_641D("641D","超出離線自動加值日限次",1),
	_641E("641E","VAR-押碼檢查失敗",1),
	_6501("6501","Key Locked",1),
	_6502("6502","Key No Initial",1),
	_6503("6503","RAM Error",1),
	_6504("6504","Flash Failed",1),
	_6505("6505","SAM使用次數已達上限",1),
	_6506("6506","SAM使用次數異常有誤(CA)不足 ",1),
	_6507("6507","CPU卡TXNKey Selection Error",1),
	_6508("6508","讀卡機故障Key Selection Error",1),
	_6509("6509","讀卡機故障Key Selection Error",1),
	_65FF("65FF","線路遭到攻擊破壞",1),
	_6608("6608","讀卡機故障請報修!!",1),
	_6602("6602","讀卡機故障請報修!!",1),	
	UNKNOWN_ERROR_CODE("XXXX","Unknowen ErrCode", 1);

	
	
	private final String id;
	private final String msg;
	private final int actionId;  
	  
	//private static Map<String, ReaderRespCode> codeToEnumMap;
	ReaderRespCode(String id, String msg, int actionId)
	{
		this.id = id;
		this.msg = msg;
		this.actionId = actionId;
	}
	
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public String getMsg() {
		// TODO Auto-generated method stub
		return this.msg;
	}

	@Override
	public int getActionId() {
		// TODO Auto-generated method stub
		return this.actionId;
	}

}