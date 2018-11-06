package MsgProcess;

import java.util.List;
import java.util.ArrayList;

public class filterChain implements Filter {

	List<Filter> filters = new ArrayList<Filter>();
	
	public filterChain addFilter(Filter f){
		this.filters.add(f);
		return this;
	}
	
	public List<Filter> getFilters() {
		return filters;
	}

	public void setFilters(List<Filter> filters) {
		this.filters = filters;
	}

	public String doFilter(String str){
		String r = str;
		for(Filter f:filters){
			r = f.doFilter(r);
		}
		return r;
	}
	
}
