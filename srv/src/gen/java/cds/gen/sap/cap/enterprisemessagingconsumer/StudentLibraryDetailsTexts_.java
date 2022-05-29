package cds.gen.sap.cap.enterprisemessagingconsumer;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;

@CdsName("sap.cap.enterpriseMessagingConsumer.studentLibraryDetails.texts")
public interface StudentLibraryDetailsTexts_ extends StructuredType<StudentLibraryDetailsTexts_> {
  String CDS_NAME = "sap.cap.enterpriseMessagingConsumer.studentLibraryDetails.texts";

  ElementRef<String> locale();

  ElementRef<String> ID();

  ElementRef<String> firstName();

  ElementRef<String> lastName();
}
