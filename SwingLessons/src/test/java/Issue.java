import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

import static org.hamcrest.Matchers.equalTo;

public class Issue {

    @Test
    public void testIssue () {
        String name = "Izergil";
        ValidatableResponse withCorrectName = getValidatableResponse(name);
            System.out.println(withCorrectName + "verify name");

    }

    private ValidatableResponse getValidatableResponse (String name) {
        return RestAssured.get(" some_domain.com/company/888/users?name=" + name)
                    .then().assertThat().statusCode(200).assertThat().body(equalTo("users"));
    }
}
