package googledrive.domain;

import googledrive.NotificationApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Notify_table")
@Data
//<<< DDD / Aggregate Root
public class Notify {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userId;

    private String sendMsg;

    private String sendDt;

    public static NotifyRepository repository() {
        NotifyRepository notifyRepository = NotificationApplication.applicationContext.getBean(
            NotifyRepository.class
        );
        return notifyRepository;
    }

    //<<< Clean Arch / Port Method
    public static void notify(FileUploaded fileUploaded) {
        //implement business logic here:

        /** Example 1:  new item 
        Notify notify = new Notify();
        repository().save(notify);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(notify->{
            
            notify // do something
            repository().save(notify);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
