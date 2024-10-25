package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class Streamingprocessed extends AbstractEvent {

    private Long id;
    private String fileId;
    private String videoUrl;
    private String userId;
    private String fileDetails;

    public Streamingprocessed(Video aggregate) {
        super(aggregate);
    }

    public Streamingprocessed() {
        super();
    }
}
//>>> DDD / Domain Event
