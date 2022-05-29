using { sap.cap.enterpriseMessagingConsumer as db}  from '../db/schema';

service EnterpriseMessagingProducerService {

    entity StudentsLibraryDetails as projection on db.studentLibraryDetails;


}
