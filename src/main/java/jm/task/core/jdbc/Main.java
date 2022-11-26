package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;


public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        Util.getConnectionToDB();
        UserServiceImpl userDao = new UserServiceImpl() {};

        userDao.createUsersTable();

        userDao.saveUser("name1", "LastName1", (byte) 22);
        userDao.saveUser("name2", "LastName2", (byte) 32);
        userDao.saveUser("name3", "LastName3", (byte) 21);
        userDao.saveUser("name4", "LastName4", (byte) 18);

        userDao.removeUserById(1);
        System.out.println(userDao.getAllUsers());
        userDao.cleanUsersTable();
        userDao.dropUsersTable();

    }
}
