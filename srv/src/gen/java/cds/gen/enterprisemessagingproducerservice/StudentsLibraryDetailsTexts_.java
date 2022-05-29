package cds.gen.enterprisemessagingproducerservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;

@CdsName("EnterpriseMessagingProducerService.StudentsLibraryDetails.texts")
public interface StudentsLibraryDetailsTexts_ extends StructuredType<StudentsLibraryDetailsTexts_> {
  String CDS_NAME = "EnterpriseMessagingProducerService.StudentsLibraryDetails.texts";

  ElementRef<String> locale();

  ElementRef<String> ID();

  ElementRef<String> firstName();

  ElementRef<String> lastName();
}
