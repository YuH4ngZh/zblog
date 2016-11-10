package com.spring.server;

import org.springframework.stereotype.Service;
import com.spring.model.MySelf;

@Service
public class MySelfService extends BaseService {

	@SuppressWarnings("static-access")
	public static MySelf getMySelf() {
		return getMySelfDaoImp().selectMyself();
	}
}
