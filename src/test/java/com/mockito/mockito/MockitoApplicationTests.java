package com.mockito.mockito;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
class MockitoApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test public void testHello() {
        ResponseEntity<String> respEntity = restTemplate.getForEntity("/hello", String.class);
        assertThat(respEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(respEntity.getBody()).isEqualTo("Hello");
    }
}
