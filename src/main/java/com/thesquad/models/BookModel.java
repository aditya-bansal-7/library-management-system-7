package com.thesquad.models;

import java.time.LocalDateTime;

public class BookModel {

    private int bookId;
    private int numPages, editionNum, releaseYear;
    private String isbn, name;
    private int publisherId, categoryId, locationId, statusId;
    private LocalDateTime creationDate;

    public BookModel() {
    }

    public BookModel(int bookId, int publisherId, int numPages, int editionNum, int releaseYear, String isbn, String name, LocalDateTime creationDate) {
        this.bookId = bookId;
        this.publisherId = publisherId;
        this.numPages = numPages;
        this.editionNum = editionNum;
        this.releaseYear = releaseYear;
        this.isbn = isbn;
        this.name = name;
        this.creationDate = creationDate;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public int getEditionNum() {
        return editionNum;
    }

    public void setEditionNum(int editionNum) {
        this.editionNum = editionNum;
    }
}
