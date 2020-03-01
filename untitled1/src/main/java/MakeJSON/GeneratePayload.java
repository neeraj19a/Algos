package MakeJSON;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;

public class GeneratePayload {

    public static void main(String[] args) throws IOException {
        getRequestBody();
    }

    private static void getRequestBody() throws IOException {

        //Using Jackson Mapper
        ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);

        //Setting Personal Details and creating JSON Object for PersonalDetails
        PersonalDetails personalDetails = new PersonalDetails();
        personalDetails.setDob("12JUL64");
        personalDetails.setName("Lorem ipsum");

        //Setting PassportDetails and creating JSON Object for PassportDetails
        PassportDetails passportDetails = new PassportDetails();
        passportDetails.setNationality("IN");
        passportDetails.setExpirationDate("25JAN2023");

        //Setting ContactDetails and creating JSON Object for ContactDetails
        ContactDetails contactDetails = new ContactDetails();
        contactDetails.setEmail("test@test.com");
        contactDetails.setPhoneNumber("12345678");

        //Setting CommunicationDetails and creating JSON Object for CommunicationDetails
        CommunicationDetails communicationDetails = new CommunicationDetails();
        communicationDetails.setAddress("123 block C");
        communicationDetails.setCountry("IN");
        communicationDetails.setState("Haryana");
        communicationDetails.setContactDetails(contactDetails);

        //Using simple json now to Combining all Json Objects Created above to Make single JSON
        JSONObject requestPayload = new JSONObject();
        requestPayload.put("personalDetails", personalDetails);
        requestPayload.put("passportDetails", passportDetails);
        requestPayload.put("communicationDetails", communicationDetails);
        mapper.writeValue(new File("./samplepayload.json"), requestPayload);

        String jsonInString = mapper.writeValueAsString(requestPayload);
        System.out.println("Example JSON from Simple JSON-->" + jsonInString);

        CombineAllJsonObjectsPersonalPassportCommunicationDetails exampleMakeJson = new CombineAllJsonObjectsPersonalPassportCommunicationDetails();
        exampleMakeJson.setPersonalDetails(personalDetails);
        exampleMakeJson.setPassportDetails(passportDetails);
        exampleMakeJson.setCommunicationDetails(communicationDetails);

        jsonInString = mapper.writeValueAsString(exampleMakeJson);
        System.out.println("Example JSON from Personalised Class-->" + jsonInString);

        LinkedHashMap requestPayload1 = new LinkedHashMap();
        requestPayload1.put("personalDetails", personalDetails);
        requestPayload1.put("passportDetails", passportDetails);
        requestPayload1.put("communicationDetails", communicationDetails);

        String jsonInString1 = mapper.writeValueAsString(requestPayload1);
        System.out.println("Example JSON from LinkedHashMap In Order-->" + jsonInString1);

    }
}
