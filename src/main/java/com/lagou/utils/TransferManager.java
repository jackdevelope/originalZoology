package com.lagou.utils;
/*
    事务管理器工具类：包含：开启事务、提交事务、回滚事务、释放资源
     通知类
 */

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

/**
 * @author jack
 */
public class TransferManager {
      /*
      开启事务
       */

      public static void beginTransaction(ConnectionUtils connectionUtils){
          //获取连接
          Connection connection=connectionUtils.getThreadConnection();
            try {
               //手动开启事务
               connection.setAutoCommit(false);
            } catch (SQLException e) {
                  e.printStackTrace();
            }

      }
      /*
      提交事务
       */

      public static void commit(ConnectionUtils connectionUtils){
          //获取连接
         Connection connection=connectionUtils.getThreadConnection();
            try {
                  connection.commit();
            } catch (SQLException e) {
                  e.printStackTrace();
            }
      }
      /*
      回滚事务
       */

      public static void rollback(ConnectionUtils connectionUtils){
            //获取连接
            Connection connection=connectionUtils.getThreadConnection();
            try {
                  connection.rollback();
            } catch (SQLException e) {
                  e.printStackTrace();
            }
      }
      /*
      释放资源
       */

      public static void release(ConnectionUtils connectionUtils){
          //获取连接
          Connection connection = connectionUtils.getThreadConnection();

            try {
                  //将手动事务改回成自动提交事务
                  connection.setAutoCommit(true);
                  //将连接归还连接池
                  connection.close();
                  //解除线程绑定
                  connectionUtils.removeThreadConnection();
            } catch (SQLException e) {
                  e.printStackTrace();
            }
      }
}
