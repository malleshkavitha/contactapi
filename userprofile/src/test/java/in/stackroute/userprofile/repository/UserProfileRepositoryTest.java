//package in.stackroute.userprofile.repository;
//
//import in.stackroute.userprofile.model.User;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@ExtendWith(SpringExtension.class)
//@DataJpaTest
//class UserProfileRepositoryTest {
//
//    @Autowired
//    private UserProfileRepository repository;
//
//    @BeforeEach
//    public void setup(){
//        User user1 = new User(10, "Charlie", "charlie@gmail.com", "1234");
//        repository.save(user1);
//    }
//
//    @Test
//    public void givenUserExixtsinDBThenShouldReturnTrue(){
//        assertTrue(repository.existsByEmail("charlie@gmail.com"),"User does not exist in DB");
//    }
//
//    @Test
//    public void givenUserDoesNotExixtsinDBThenShouldReturnFalse(){
//        assertFalse(repository.existsByEmail("john@gmail.com"),"User available");
//    }
//
//    @Test
//    public void givenUserEmailWhenUserExistsThenReturnOptionalWithUser(){
//        Optional<User> optionalUser = repository.getUserByEmail("charlie@gmail.com");
//
//        assertTrue(optionalUser.isPresent());
//        User user = optionalUser.get();
//        assertEquals("Charlie",user.getName());
//
//    }
//
//    //Configure H2 Database
//    //write the test case for empty optional
//
//}