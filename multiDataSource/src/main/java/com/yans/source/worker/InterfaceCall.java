package com.yans.source.worker;

import java.util.concurrent.Callable;

import com.yans.source.domain.DataSourceConfig;
import com.yans.source.util.HttpUtil;

/**
 * 多线程请求接口
 * @author yansheng
 *
 */
public class InterfaceCall implements Callable<String> {

	private DataSourceConfig dsc;
	
	public DataSourceConfig getDsc() {
		return dsc;
	}

	public void setDsc(DataSourceConfig dsc) {
		this.dsc = dsc;
	}
	
	@Override
	public String call() throws Exception {
		
		
		return null;
	}

}
