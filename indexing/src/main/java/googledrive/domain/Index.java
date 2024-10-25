package googledrive.domain;

import googledrive.IndexingApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Index_table")
@Data
//<<< DDD / Aggregate Root
public class Index {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fileId;

    private String userId;

    private String indexResult;

    public static IndexRepository repository() {
        IndexRepository indexRepository = IndexingApplication.applicationContext.getBean(
            IndexRepository.class
        );
        return indexRepository;
    }

    //<<< Clean Arch / Port Method
    public static void filelocationindexing(FileUploaded fileUploaded) {
        //implement business logic here:

        /** Example 1:  new item 
        Index index = new Index();
        repository().save(index);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(index->{
            
            index // do something
            repository().save(index);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
