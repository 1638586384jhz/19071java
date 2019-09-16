package cn.itcast.ssm.mapper;

import java.util.List;

import cn.itcast.ssm.pojo.Item;
import cn.itcast.ssm.pojo.User;

public interface ItemMapper {

	
	List<Item> selectItemAll();

	Item selectItemOne(int id);

	void updateItem(Item item);

	

	int selectByUserPassword(User uer);

}
