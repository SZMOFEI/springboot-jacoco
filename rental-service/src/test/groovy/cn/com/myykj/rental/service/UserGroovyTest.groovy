package cn.com.myykj.rental.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification;

/**
 * @author mof01* @date 2021/9/16 21:15
 */
@SpringBootTest
class UserGroovyTest extends Specification {
    @Autowired
    private UserService userService;

    def "first_spock_test"() {
        expect:
        userService != null
    }
}