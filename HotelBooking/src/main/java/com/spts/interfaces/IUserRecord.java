package com.spts.interfaces;

import java.util.List;

import com.spts.signup.User;

/**
 *  @author Teja Ganapati Jaddipal - 015957526
 */

public interface IUserRecord {
	
	public abstract int addNewUserRecord(User user);
	public abstract List<User> getUserRecords();

}
