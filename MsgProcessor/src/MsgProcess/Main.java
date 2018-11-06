package MsgProcess;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "Hello:),<script>,√Ù∏–¥ £¨show";
		MsgProcessor p = new MsgProcessor();
		p.setMsg(msg);
		filterChain fc = new filterChain();
		fc.addFilter(new HTMLfilter())
		  .addFilter(new sensitiveReplace());
		filterChain fc2 = new filterChain();
		fc2.addFilter(new faceFilter());
		fc.addFilter(fc2);
		p.setFc(fc);
		String result = p.Process();
        System.out.println(result);
	}

}
