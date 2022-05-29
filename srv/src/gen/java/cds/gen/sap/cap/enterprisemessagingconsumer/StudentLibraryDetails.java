package cds.gen.sap.cap.enterprisemessagingconsumer;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;

@CdsName("sap.cap.enterpriseMessagingConsumer.studentLibraryDetails")
public interface StudentLibraryDetails extends CdsData {
  String ID = "ID";

  String FIRST_NAME = "firstName";

  String LAST_NAME = "lastName";

  String CURRENT_CLASS = "currentClass";

  String LIBRARY_NUMBER = "libraryNumber";

  String TEXTS = "texts";

  String LOCALIZED = "localized";

  @CdsName(ID)
  String getId();

  @CdsName(ID)
  void setId(String id);

  String getFirstName();

  void setFirstName(String firstName);

  String getLastName();

  void setLastName(String lastName);

  String getCurrentClass();

  void setCurrentClass(String currentClass);

  Integer getLibraryNumber();

  void setLibraryNumber(Integer libraryNumber);

  List<StudentLibraryDetailsTexts> getTexts();

  void setTexts(List<? extends Map<String, ?>> texts);

  StudentLibraryDetailsTexts getLocalized();

  void setLocalized(Map<String, ?> localized);

  StudentLibraryDetails_ ref();

  static StudentLibraryDetails create() {
    return Struct.create(StudentLibraryDetails.class);
  }
}
