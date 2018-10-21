package com.finalproject.automated.refactoring.tool.methods.detection.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author fazazulfikapp
 * @version 1.0.0
 * @since 22 October 2018
 */

@Data
@Builder
public class IndexModel {

    private Integer start;

    private Integer end;
}
