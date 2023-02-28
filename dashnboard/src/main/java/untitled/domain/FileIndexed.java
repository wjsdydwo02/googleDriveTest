package untitled.domain;

import untitled.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class FileIndexed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private List<String> keywords;
}
