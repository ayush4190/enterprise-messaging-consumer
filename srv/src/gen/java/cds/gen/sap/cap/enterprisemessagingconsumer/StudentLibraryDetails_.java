package cds.gen.sap.cap.enterprisemessagingconsumer;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Integer;
import java.lang.String;
import java.util.function.Function;

@CdsName("sap.cap.enterpriseMessagingConsumer.studentLibraryDetails")
public interface StudentLibraryDetails_ extends StructuredType<StudentLibraryDetails_> {
  String CDS_NAME = "sap.cap.enterpriseMessagingConsumer.studentLibraryDetails";

  ElementRef<String> ID();

  ElementRef<String> firstName();

  ElementRef<String> lastName();

  ElementRef<String> currentClass();

  ElementRef<Integer> libraryNumber();

  StudentLibraryDetailsTexts_ texts();

  StudentLibraryDetailsTexts_ texts(Function<StudentLibraryDetailsTexts_, CqnPredicate> filter);

  StudentLibraryDetailsTexts_ localized();

  StudentLibraryDetailsTexts_ localized(Function<StudentLibraryDetailsTexts_, CqnPredicate> filter);
}
