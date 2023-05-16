package com.detention.detentioncenter;
import com.detention.detentioncenter.user.userReppository;
import org.apache.catalina.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class userReppositoryTest {
    @Autowired private userReppository repo;
    @Test

    public  void testaddnew(){
        User user=new User();
        user.setUsername("munezero");
        user.setFullName("munezerohubert");
        user.setPassword("mh");

        User savedUser =repo.save(user);
        Assertions.assertTrue(savedUser).isNotNull();
        Assertions.assertThat(SavedUser.getId);
    }
}
