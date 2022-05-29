package cds.gen.enterprisemessagingproducerservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Integer;
import java.lang.String;
import java.util.function.Function;

@CdsName("EnterpriseMessagingProducerService.StudentsLibraryDetails")
public interface StudentsLibraryDetails_ extends StructuredType<StudentsLibraryDetails_> {
  String CDS_NAME = "EnterpriseMessagingProducerService.StudentsLibraryDetails";

  ElementRef<String> ID();

  ElementRef<String> firstName();

  ElementRef<String> lastName();

  ElementRef<String> currentClass();

  ElementRef<Integer> libraryNumber();

  StudentsLibraryDetailsTexts_ texts();

  StudentsLibraryDetailsTexts_ texts(Function<StudentsLibraryDetailsTexts_, CqnPredicate> filter);

  StudentsLibraryDetailsTexts_ localized();

  StudentsLibraryDetailsTexts_ localized(
      Function<StudentsLibraryDetailsTexts_, CqnPredicate> filter);
}
