package MsgProcess;

public class MsgProcessor {
	private String msg;
	filterChain fc;
	public filterChain getFc() {
		return fc;
	}

	public void setFc(filterChain fc) {
		this.fc = fc;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String Process(){
		return fc.doFilter(msg);
	}	
	
}
