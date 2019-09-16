package cn.itcast.ssm.service;

import java.util.List;

import cn.itcast.ssm.pojo.Item;
import cn.itcast.ssm.pojo.User;

public interface ItemService {

	List<Item> queryItemList();
	Item selectItemEdit(int id);
	void updateItem(Item item);
	int selectUserAndPassword(User uer);
}
