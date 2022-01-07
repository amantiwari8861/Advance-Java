package filters;

import java.io.IOException;
import java.util.StringTokenizer;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class Fil implements Filter {
	private FilterConfig config;
	public final static String IP_RANGE = "192.168";

	public Fil() {
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		this.config = filterConfig;
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String ip = request.getRemoteAddr();
		HttpServletResponse httpResp = null;
		if (response instanceof HttpServletResponse)
			httpResp = (HttpServletResponse) response;
		// Break up the IP address into chunks representing each byte
		StringTokenizer toke = new StringTokenizer(ip, ".");
		int dots = 0;
		String byte1 = "";
		String byte2 = "";
		String client = "";
		while (toke.hasMoreTokens()) {
			++dots;
			// This token is the first number series or byte
			if (dots == 1) {
				byte1 = toke.nextToken();
			} else {
				// This token is the second number series or byte
				byte2 = toke.nextToken();
				break;// only interested in first two bytes
			}
		} // while
		// Piece together half of the client IP address so it can be
		// compared with the forbidden range represented by
		// IPFilter.IP_RANGE
		client = byte1 + "." + byte2;
		// if the client IP fits the forbidden range...
		if (IP_RANGE.equals(client)) {
			httpResp.sendError(HttpServletResponse.SC_FORBIDDEN, "That means goodbye forever!");
		} else {
			// Client is okay; send them on their merry way
			chain.doFilter(request, response);
		}
	}// doFilter

	public void destroy() {}
}
