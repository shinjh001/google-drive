package googledrive.domain;

import googledrive.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class Streamingprocessed extends AbstractEvent {

    private Long id;
    private String fileId;
    private String videoURL;
    private String userId;
    private String fileDetails;
}
