package com.alpha.taskmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    private String taskName = "新規タスク";
    private String overview = "";
    // 0: NEW, 1: START, 2: COMPLETION
    private int taskStatus = 0;
    private Date fromDate;
    private Date toDate;
}
