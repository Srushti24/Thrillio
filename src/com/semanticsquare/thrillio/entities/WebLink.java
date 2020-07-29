package com.semanticsquare.thrillio.entities;
import java.util.*;

import com.semanticsquare.thrillio.partner.Shareable;

public class WebLink extends Bookmark implements Shareable {
	private String url;
	private String host;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getHost() {
		return host;
	}
	public String toString() {
		return "WebLink [url=" + url + ", host=" + host + "]";
	}
	public void setHost(String host) {
		this.host = host;
	}
	@Override
	public boolean isKidFriendlyEligible() {
		// TODO Auto-generated method stub
		if (url.equals("porn") || getTitle().equals("porn") || host.equals("adult")) {
			return false;
		}
		return true;
	}
	@Override
	public String getItemData() {
		StringBuilder builder = new StringBuilder();

		builder.append("<item");
		builder.append("<type>WebLink</type>");
		builder.append("<title>").append(getTitle()).append("</title>");
		builder.append("<url>").append(url).append("</url>");
		builder.append("<host>").append(host).append("</host>");
		builder.append("</item>");
		
		return builder.toString();
	}
}
