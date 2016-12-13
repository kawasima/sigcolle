package net.unit8.sigcolle.model;

import lombok.Data;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;

import java.io.Serializable;

/**
 * @author kawasima
 */
@Entity
@Data
public class Campaign implements Serializable {
    @Id
    private Long campaignId;

    private String title;

    // Markdown description
    private String statement;

    private Long goal;

    private String createdBy;
}
