package spring.core.session05.aop_lab;

import spring.core.session05.aop_lab.Singer;

public class BackSinger implements Singer {

	@Override
	public void sing() {
		System.out.println("唱歌:啦啦啦~~~");
	}

}
