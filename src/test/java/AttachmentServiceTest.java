
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.annotation.DirtiesContext;

import org.springframework.test.context.junit4.SpringRunner;


import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.NONE, classes = {AttachmentService.class})
@AutoConfigureStubRunner(ids = {"com.financing-platform:consolidated-request-services:+:8080"}, workOffline = true)
@DirtiesContext
@Ignore
public class AttachmentServiceTest {

    @Autowired
    AttachmentService attachmentService;


    @Test
    public void shouldQueryStub() throws Exception {

        String attachmentTypes=attachmentService.findAttachmentTypes();

        assertThat(attachmentTypes).contains("\"code\":\"type1\"");
        assertThat(attachmentTypes).contains("\"code\":\"type2\"");
    }



    public static final String MAVEN_LOCAL_REPO="maven.repo.local";

    @BeforeClass
    public static void setMavenLocalRepo(){

        assertThat(System.getProperty(MAVEN_LOCAL_REPO)).isNotNull();

    }

}
