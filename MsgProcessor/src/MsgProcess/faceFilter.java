package MsgProcess;

public class faceFilter implements Filter {

	@Override
	public String doFilter(String str) {
		// TODO Auto-generated method stub
		String r = str.replace(":)", "^V^");
		return r;
	}

}
