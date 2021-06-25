/**
 * 
 */
package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;



/**
 * @author asus
 *
 */
public class HTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 第一步:加载hibernate的配置文件
				Configuration cfg = new Configuration();
				cfg.configure("hibernate.cfg.xml");
				ServiceRegistryBuilder serviceRegistryBuilder = new ServiceRegistryBuilder().applySettings(cfg.getProperties());
				ServiceRegistry serviceRegistry = serviceRegistryBuilder.buildServiceRegistry();
				// 第二步：创建session工厂
				SessionFactory sessionFactory = cfg.buildSessionFactory(serviceRegistry);
				Session session = null;
				Transaction tx = null;
				try {
					// 第三步:创建session
					session = sessionFactory.getCurrentSession();
					// 第四步:打开事务
					tx = session.beginTransaction();
					// 第五步:…你的代码save,delete,update,get…
					
					// 第六步：提交事务
					tx.commit();
				} catch (Exception e) {
					if (tx != null) {
						tx.rollback();
					} else {
						e.printStackTrace();
					}

				}
			}

	}


