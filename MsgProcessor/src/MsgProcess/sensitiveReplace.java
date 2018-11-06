package MsgProcess;

public class sensitiveReplace implements Filter {

	@Override
	public String doFilter(String str) {
		// TODO Auto-generated method stub
		String r = str.replace("√Ù∏–", "**");
		return r;
	}

}
