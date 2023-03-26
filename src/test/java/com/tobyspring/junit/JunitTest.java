package com.tobyspring.junit;

import com.tobyspring.config.TestConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = TestConfig.class)
public class JunitTest {

    @Autowired
    ApplicationContext context;

    static Set<JunitTest> testObjects = new HashSet<JunitTest>();
    static ApplicationContext contextObject = null;

    @Test
    void test1() {
        assertThat(testObjects).doesNotContain(this);
        testObjects.add(this);
        assertThat(contextObject == null || contextObject == this.context).isTrue();
    }

    @Test
    void test2() {
        assertThat(testObjects).doesNotContain(this);
        testObjects.add(this);
        assertThat(contextObject == null || contextObject == this.context).isTrue();
    }

    @Test
    void test3() {
        assertThat(testObjects).doesNotContain(this);
        testObjects.add(this);
        assertThat(contextObject == null || contextObject == this.context).isTrue();
    }
}
