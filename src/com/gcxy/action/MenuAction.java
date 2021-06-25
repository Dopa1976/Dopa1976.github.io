package com.gcxy.action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.gcxy.domain.Menu;
import com.gcxy.service.MenuService;
import com.opensymphony.xwork2.ActionSupport;

@Controller("MenuAction")
@Scope("prototype")
public class MenuAction extends ActionSupport {

	@Autowired
	private MenuService menuService;

	private List<Menu> menuList;
	private Integer ids;
	private String menuName;
	private Menu menu;
    private String name;
	
	// 查询所有菜单信息
	public String menuQueryAll() {
		menuList = menuService.queryAll();
		return SUCCESS;
	}

	// 删除菜单
	public String menuDelete() {
		menuService.DeleteMenuById(ids);
		return SUCCESS;
	}

	// 模糊查询
	public String menuQueryName() {
		String name = null;
		try {
			name = java.net.URLDecoder.decode(menuName, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		menuList = menuService.queryMenuByName(name);
		return SUCCESS;
	}

	// 修改插训
	public String menuQuMo() {
        menu = menuService.menuQuMo(ids);
		return SUCCESS;
	}
	//菜单修改
	public String menuUpdate() {
		menuService.updateMenu(menu);	
		return SUCCESS;
	}
 //添加查询
	public String menuAddQuery() {
		menuList = menuService.queryAll();
		return SUCCESS;
	}
	//菜单添加
	public String menuAdd() {
	  menuService.menuAdd(menu,ids);
	return SUCCESS;
	}
	
	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public List<Menu> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<Menu> menuList) {
		this.menuList = menuList;
	}

	public Integer getIds() {
		return ids;
	}

	public void setIds(Integer ids) {
		this.ids = ids;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
