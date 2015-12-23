package com.shijing.serviceImp;

import com.shijing.bean.Myuser;
import com.shijing.dao.UserBaseDao;
import com.shijing.service.UserManager;

public class UserManagerImp implements UserManager {

	private UserBaseDao baseDao;
	public void setBaseDao(UserBaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public boolean userLogin(Myuser user) {
		// TODO Auto-generated method stub
		if(baseDao.checkUserLogin(user))
		    return true;
		else {
			return false;
		}
	}

}
