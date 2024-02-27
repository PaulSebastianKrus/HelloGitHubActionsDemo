package org.example.hellogithubactionsdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import static java.nio.file.Paths.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(Controller.class)

@SpringBootTest
class HelloGitHubActionsDemoApplicationTests {
    private MockMvc mockMvc;

    @Test
    void index() throws Exception {
        mockMvc.perform((RequestBuilder) get(""))
                .andExpect(status().isOk())
                .andExpect(view().name("welcome"));
    }

}
