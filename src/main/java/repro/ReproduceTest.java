package repro;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;

public class ReproduceTest {

    public static void main(String[] args) {

        String xmlString = "<ClientResponseData><responseCode>0</responseCode><number>123</number>";

        try {

            ClientResponseData responseData = new XmlMapper().readValue(xmlString, ClientResponseData.class);

            System.out.println(responseData);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
