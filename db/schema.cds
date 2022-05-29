namespace sap.cap.enterpriseMessagingConsumer;


using {  cuid, managed } from '@sap/cds/common';




entity studentLibraryDetails : cuid {

    firstName : localized String(100);
    lastName : localized String(100);
    currentClass : String(10);
    libraryNumber : Integer;
       
}