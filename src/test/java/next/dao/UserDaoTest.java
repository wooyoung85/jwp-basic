package next.dao;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;
import org.junit.Test;
import next.model.User;

public class UserDaoTest {

	@Test
	public void crud() throws SQLException {
		User expected = new User("userId", "password", "name", "javajigi@email.com");
		UserDao userDao = new UserDao();
		userDao.insert(expected);

		User actual = userDao.findByUserId(expected.getUserId());
		assertEquals(expected, actual);
	}
}
