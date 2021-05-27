import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class HelloTest {
    Hello sut;

    @BeforeEach
    public void beforeEach() {
        sut = new Hello();    //sut = system under test
//        System.out.println("test");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, -2, 100})
    public void incrementTest(int n){
        //4phase test
        //prepare
        int actual;
        int expected = n+1;

        //execute
//        System.out.println(n);
        actual = sut.increment(n);

        //verify
        assertThat(actual, is(expected));

        //tear down 環境を元に戻る

    }
}