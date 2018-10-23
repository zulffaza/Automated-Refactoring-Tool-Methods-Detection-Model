package com.finalproject.automated.refactoring.tool.methods.detection.model.service;

import com.finalproject.automated.refactoring.tool.files.detection.model.FileModel;
import com.finalproject.automated.refactoring.tool.methods.detection.model.IndexModel;
import com.finalproject.automated.refactoring.tool.model.MethodModel;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/**
 * @author fazazulfikapp
 * @version 1.0.0
 * @since 22 October 2018
 */

@Data
@Builder
public class AnalysisMethodRequest {

    private FileModel fileModel;

    @Builder.Default
    private List<IndexModel> indexOfMethods = new ArrayList<>();

    @Builder.Default
    private List<Future> futures = new ArrayList<>();

    @Builder.Default
    private Map<String, java.util.List<MethodModel>> result = new HashMap<>();
}
