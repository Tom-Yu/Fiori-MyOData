package core;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.apache.olingo.odata2.jpa.processor.api.ODataJPAContext;
import org.apache.olingo.odata2.jpa.processor.api.ODataJPAServiceFactory; 
import org.apache.olingo.odata2.jpa.processor.api.exception.ODataJPARuntimeException;

public   class MyODataServiceFactory  extends ODataJPAServiceFactory {
     private  static  final  String persistenceUnitName  =  "MyOData";
    @ Override
     public ODataJPAContext initializeODataJPAContext()
             throws ODataJPARuntimeException {
          ODataJPAContext oDataJPAContext  =  this.getODataJPAContext();  
             try {  
                EntityManagerFactory emf  = Persistence  
                        .createEntityManagerFactory(persistenceUnitName);  
                oDataJPAContext.setEntityManagerFactory(emf);  
                oDataJPAContext.setPersistenceUnitName(persistenceUnitName);  
                 return oDataJPAContext;  
            }  catch ( Exception e) {  
                 System.out.println(e.getMessage());
            }
			return oDataJPAContext;  
    }
}

