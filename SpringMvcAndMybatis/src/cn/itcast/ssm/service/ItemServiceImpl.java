package cn.itcast.ssm.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import cn.itcast.ssm.mapper.ItemMapper;
import cn.itcast.ssm.pojo.Item;
import cn.itcast.ssm.pojo.User;
@Service("ItemServiceImpl")
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemMapper itemMapper;
	public List<Item> queryItemList() {
		List<Item> list = itemMapper.selectItemAll();

		return list;
	}
	public Item selectItemEdit(int id) {
		Item item=itemMapper.selectItemOne(id);
		return item;
	}

	@Test
	public void testName() {
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml","spring/applicationContext-service.xml");
		ItemServiceImpl bean=(ItemServiceImpl) applicationContext.getBean(ItemServiceImpl.class);
		bean.queryItemList();
	}
	public void updateItem(Item item) {
		itemMapper.updateItem(item);
		
	}

	public int selectUserAndPassword(String username, String password) {
		
		return 0;
	}
	public int selectUserAndPassword(User uer) {
		int id=itemMapper.selectByUserPassword(uer);
		return id;
	}



	

}
