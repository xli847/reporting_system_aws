package com.antra.evaluation.reporting_system.pojo.report;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
public class ExcelFile {
    @Id
    private String fileId;
    private String fileName;
    private String fileLocation;
    private String submitter;
    private Long fileSize;
    private String description;
    private LocalDateTime generatedTime;

    public ExcelFile () {}

    public ExcelFile(String fileId, String fileName, String fileLocation, String submitter, Long fileSize, String description, LocalDateTime generatedTime) {
        this.fileId = fileId;
        this.fileName = fileName;
        this.fileLocation = fileLocation;
        this.submitter = submitter;
        this.fileSize = fileSize;
        this.description = description;
        this.generatedTime = generatedTime;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public String getSubmitter() {
        return submitter;
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }

    public LocalDateTime getGeneratedTime() {
        return generatedTime;
    }

    public void setGeneratedTime(LocalDateTime generatedTime) {
        this.generatedTime = generatedTime;
    }

    @Override
    public String toString() {
        return "ExcelFile{" +
                "fileId='" + fileId + '\'' +
                ", fileName='" + fileName + '\'' +
                ", fileLocation='" + fileLocation + '\'' +
                ", submitter='" + submitter + '\'' +
                ", fileSize=" + fileSize +
                ", generatedTime=" + generatedTime +
                '}';
    }
}
