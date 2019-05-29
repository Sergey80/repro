package repro;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Builder;
import lombok.Getter;

@JacksonXmlRootElement(localName = "ClientResponseData")
@Builder
@Getter
public class ClientResponseData {

    @JacksonXmlProperty(localName = "responseCode")
    private String responseCode;

    @JacksonXmlProperty(localName = "number")
    private String number;

}
