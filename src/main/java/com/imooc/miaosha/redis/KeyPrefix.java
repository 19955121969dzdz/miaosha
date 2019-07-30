package com.imooc.miaosha.redis;

//接口方法定义前缀,redis的一个前缀
public interface KeyPrefix {

	//设置过期时间
	public int expireSeconds();

	//得到前缀的方法
	public String getPrefix();
	
}
