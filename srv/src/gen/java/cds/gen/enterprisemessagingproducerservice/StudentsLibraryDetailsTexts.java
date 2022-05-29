package cds.gen.enterprisemessagingproducerservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;

@CdsName("EnterpriseMessagingProducerService.StudentsLibraryDetails.texts")
public interface StudentsLibraryDetailsTexts extends CdsData {
  String LOCALE = "locale";

  String ID = "ID";

  String FIRST_NAME = "firstName";

  String LAST_NAME = "lastName";

  String getLocale();

  void setLocale(String locale);

  @CdsName(ID)
  String getId();

  @CdsName(ID)
  void setId(String id);

  String getFirstName();

  void setFirstName(String firstName);

  String getLastName();

  void setLastName(String lastName);

  StudentsLibraryDetailsTexts_ ref();

  static StudentsLibraryDetailsTexts create() {
    return Struct.create(StudentsLibraryDetailsTexts.class);
  }
}
