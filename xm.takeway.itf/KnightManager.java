package xm.takeway.itf;

import xm.takeway.model.BeanKnight;
import xm.takeway.util.BaseException;

public interface KnightManager {
	/**
	 * 骑手注册
	 * 要求骑手不能为空，不能重复
	 * 两次输入密码需一致，密码不能为空
	 * @param pwd  密码
	 * @param pwd2 重复输入密码
	 * @return
	 * @throws BaseException
	 */
	public BeanKnight reg(String knight_name,String pwd,String pwd2) throws BaseException;
	//骑手登陆
	public BeanKnight login(String knight_name,String pwd) throws BaseException; 
	
}
